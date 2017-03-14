package com.example.dominic.rxjavautil;

import java.util.List;

/**
 * Created by Dominic on 2017/3/14.
 */

public class WeatherData {

    /**
     * coord : {"lon":114.07,"lat":22.55}
     * weather : [{"id":500,"main":"Rain","description":"light rain","icon":"10d"},{"id":701,"main":"Mist","description":"mist","icon":"50d"}]
     * base : stations
     * main : {"temp":290.67,"pressure":1016,"humidity":93,"temp_min":290.15,"temp_max":291.15}
     * visibility : 2600
     * wind : {"speed":5.7,"deg":10}
     * clouds : {"all":75}
     * dt : 1489487400
     * sys : {"type":1,"id":7904,"message":0.3138,"country":"CN","sunrise":1489444392,"sunset":1489487562}
     * id : 1795565
     * name : Shenzhen
     * cod : 200
     */

    public CoordBean coord;
    public String base;
    public MainBean main;
    public int visibility;
    public WindBean wind;
    public CloudsBean clouds;
    public int dt;
    public SysBean sys;
    public int id;
    public String name;
    public int cod;
    public List<WeatherBean> weather;

    public static class CoordBean {
        /**
         * lon : 114.07
         * lat : 22.55
         */

        public double lon;
        public double lat;
    }

    public static class MainBean {
        /**
         * temp : 290.67
         * pressure : 1016
         * humidity : 93
         * temp_min : 290.15
         * temp_max : 291.15
         */

        public double temp;
        public int pressure;
        public int humidity;
        public double temp_min;
        public double temp_max;
    }

    public static class WindBean {
        /**
         * speed : 5.7
         * deg : 10
         */

        public double speed;
        public int deg;
    }

    public static class CloudsBean {
        /**
         * all : 75
         */

        public int all;
    }

    public static class SysBean {
        /**
         * type : 1
         * id : 7904
         * message : 0.3138
         * country : CN
         * sunrise : 1489444392
         * sunset : 1489487562
         */

        public int type;
        public int id;
        public double message;
        public String country;
        public int sunrise;
        public int sunset;
    }

    public static class WeatherBean {
        /**
         * id : 500
         * main : Rain
         * description : light rain
         * icon : 10d
         */

        public int id;
        public String main;
        public String description;
        public String icon;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "coord=" + coord +
                ", base='" + base + '\'' +
                ", main=" + main +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", clouds=" + clouds +
                ", dt=" + dt +
                ", sys=" + sys +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                ", weather=" + weather +
                '}';
    }
}
