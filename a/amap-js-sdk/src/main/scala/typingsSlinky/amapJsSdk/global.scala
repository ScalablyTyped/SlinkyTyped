package typingsSlinky.amapJsSdk

import typingsSlinky.amapJsSdk.AMap.CircleOptions
import typingsSlinky.amapJsSdk.AMap.ConvertorResult
import typingsSlinky.amapJsSdk.AMap.DistrictSearchOptions
import typingsSlinky.amapJsSdk.AMap.EventCallback
import typingsSlinky.amapJsSdk.AMap.MapOptions
import typingsSlinky.amapJsSdk.AMap.MarkerClustererOptions
import typingsSlinky.amapJsSdk.AMap.MarkerOptions
import typingsSlinky.amapJsSdk.AMap.PolygonOptions
import typingsSlinky.amapJsSdk.AMap.PolylineOptions
import typingsSlinky.amapJsSdk.anon.AlwaysShow
import typingsSlinky.amapJsSdk.anon.AsDestination
import typingsSlinky.amapJsSdk.anon.AutoFitView
import typingsSlinky.amapJsSdk.anon.AutoMove
import typingsSlinky.amapJsSdk.anon.AutoPosition
import typingsSlinky.amapJsSdk.anon.AutoRefresh
import typingsSlinky.amapJsSdk.anon.Batch
import typingsSlinky.amapJsSdk.anon.ButtonDom
import typingsSlinky.amapJsSdk.anon.Center
import typingsSlinky.amapJsSdk.anon.Citylimit
import typingsSlinky.amapJsSdk.anon.Coords
import typingsSlinky.amapJsSdk.anon.DefaultType
import typingsSlinky.amapJsSdk.anon.DetectRetina
import typingsSlinky.amapJsSdk.anon.Extensions
import typingsSlinky.amapJsSdk.anon.Image
import typingsSlinky.amapJsSdk.anon.IsOpen
import typingsSlinky.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.AdvancedInfoWindow")
    @js.native
    class AdvancedInfoWindow ()
      extends typingsSlinky.amapJsSdk.AMap.AdvancedInfoWindow {
      def this(options: AsDestination) = this()
    }
    
    @JSGlobal("AMap.Autocomplete")
    @js.native
    class Autocomplete protected ()
      extends typingsSlinky.amapJsSdk.AMap.Autocomplete {
      def this(opts: Citylimit) = this()
    }
    
    /**
      * 地物对象的经纬度矩形范围
      */
    @JSGlobal("AMap.Bounds")
    @js.native
    class Bounds protected ()
      extends typingsSlinky.amapJsSdk.AMap.Bounds {
      /**
        * 构造一个矩形范围
        * @param southWest 西南角经纬度坐标
        * @param northEast 东北角经纬度坐标
        */
      def this(southWest: typingsSlinky.amapJsSdk.AMap.LngLat, northEast: typingsSlinky.amapJsSdk.AMap.LngLat) = this()
    }
    
    @JSGlobal("AMap.Circle")
    @js.native
    class Circle ()
      extends typingsSlinky.amapJsSdk.AMap.Circle {
      def this(options: CircleOptions) = this()
    }
    
    @JSGlobal("AMap.CitySearch")
    @js.native
    class CitySearch ()
      extends typingsSlinky.amapJsSdk.AMap.CitySearch
    
    @JSGlobal("AMap.DistrictSearch")
    @js.native
    class DistrictSearch protected ()
      extends typingsSlinky.amapJsSdk.AMap.DistrictSearch {
      def this(opts: DistrictSearchOptions) = this()
    }
    
    @JSGlobal("AMap.Driving")
    @js.native
    class Driving ()
      extends typingsSlinky.amapJsSdk.AMap.Driving {
      def this(options: Extensions) = this()
    }
    
    @JSGlobal("AMap.DrivingPolicy")
    @js.native
    object DrivingPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.amapJsSdk.AMap.DrivingPolicy with Double] = js.native
      
      /* 2 */ val LEAST_DISTANCE: typingsSlinky.amapJsSdk.AMap.DrivingPolicy.LEAST_DISTANCE with Double = js.native
      
      /* 1 */ val LEAST_FEE: typingsSlinky.amapJsSdk.AMap.DrivingPolicy.LEAST_FEE with Double = js.native
      
      /* 0 */ val LEAST_TIME: typingsSlinky.amapJsSdk.AMap.DrivingPolicy.LEAST_TIME with Double = js.native
      
      /* 3 */ val REAL_TRAFFIC: typingsSlinky.amapJsSdk.AMap.DrivingPolicy.REAL_TRAFFIC with Double = js.native
    }
    
    @JSGlobal("AMap.EventBindable")
    @js.native
    abstract class EventBindable ()
      extends typingsSlinky.amapJsSdk.AMap.EventBindable
    
    @JSGlobal("AMap.Geocoder")
    @js.native
    class Geocoder ()
      extends typingsSlinky.amapJsSdk.AMap.Geocoder {
      def this(opts: Batch) = this()
    }
    
    @JSGlobal("AMap.Geolocation")
    @js.native
    class Geolocation protected ()
      extends typingsSlinky.amapJsSdk.AMap.Geolocation {
      def this(options: ButtonDom) = this()
    }
    
    @JSGlobal("AMap.Icon")
    @js.native
    class Icon ()
      extends typingsSlinky.amapJsSdk.AMap.Icon {
      def this(options: Image) = this()
    }
    
    @JSGlobal("AMap.IndoorMap")
    @js.native
    class IndoorMap protected ()
      extends typingsSlinky.amapJsSdk.AMap.IndoorMap {
      def this(opts: AlwaysShow) = this()
    }
    
    @JSGlobal("AMap.InfoWindow")
    @js.native
    class InfoWindow ()
      extends typingsSlinky.amapJsSdk.AMap.InfoWindow {
      def this(options: AutoMove) = this()
    }
    
    @JSGlobal("AMap.Layer")
    @js.native
    abstract class Layer ()
      extends typingsSlinky.amapJsSdk.AMap.Layer
    
    /**
      * 经纬度坐标，确定地图上的一个点
      */
    @JSGlobal("AMap.LngLat")
    @js.native
    class LngLat protected ()
      extends typingsSlinky.amapJsSdk.AMap.LngLat {
      /**
        * 构造一个地理坐标对象
        * @param lng 经度
        * @param lat 纬度
        */
      def this(lng: Double, lat: Double) = this()
    }
    
    @JSGlobal("AMap.Map")
    @js.native
    class Map protected ()
      extends typingsSlinky.amapJsSdk.AMap.Map {
      def this(mapDiv: String) = this()
      def this(mapDiv: String, opts: MapOptions) = this()
    }
    
    @JSGlobal("AMap.MapType")
    @js.native
    class MapType ()
      extends typingsSlinky.amapJsSdk.AMap.MapType {
      def this(options: DefaultType) = this()
    }
    
    /**
      * 点标记。
      */
    @JSGlobal("AMap.Marker")
    @js.native
    class Marker ()
      extends typingsSlinky.amapJsSdk.AMap.Marker {
      def this(options: MarkerOptions) = this()
    }
    
    /**
      * 用于地图上加载大量点标记，提高地图的绘制和显示性能。
      */
    @JSGlobal("AMap.MarkerClusterer")
    @js.native
    class MarkerClusterer protected ()
      extends typingsSlinky.amapJsSdk.AMap.MarkerClusterer {
      def this(map: typingsSlinky.amapJsSdk.AMap.Map, markers: js.Array[typingsSlinky.amapJsSdk.AMap.Marker]) = this()
      def this(
        map: typingsSlinky.amapJsSdk.AMap.Map,
        markers: js.Array[typingsSlinky.amapJsSdk.AMap.Marker],
        opt: MarkerClustererOptions
      ) = this()
    }
    
    /**
      * MarkerShape用于划定Marker的可点击区域范围。需要注意的是，在IE浏览器中图标透明区域默认为不触发事件，因此MarkerShape在IE中不起作用。
      */
    @JSGlobal("AMap.MarkerShape")
    @js.native
    class MarkerShape protected ()
      extends typingsSlinky.amapJsSdk.AMap.MarkerShape {
      def this(options: Coords) = this()
    }
    
    @JSGlobal("AMap.OverView")
    @js.native
    class OverView ()
      extends typingsSlinky.amapJsSdk.AMap.OverView {
      def this(options: IsOpen) = this()
    }
    
    /* --------------------------- 基础类 --------------------------- */
    /* 参考地址:http://lbs.amap.com/api/javascript-api/reference/core */
    /**
      * 像素坐标，确定地图上的一个像素点。
      */
    @JSGlobal("AMap.Pixel")
    @js.native
    class Pixel protected ()
      extends typingsSlinky.amapJsSdk.AMap.Pixel {
      /**
        * 构造一个像素坐标对象。
        */
      def this(x: Double, y: Double) = this()
    }
    
    @JSGlobal("AMap.PlaceSearch")
    @js.native
    class PlaceSearch protected ()
      extends typingsSlinky.amapJsSdk.AMap.PlaceSearch {
      def this(opts: AutoFitView) = this()
    }
    
    @JSGlobal("AMap.Polygon")
    @js.native
    class Polygon ()
      extends typingsSlinky.amapJsSdk.AMap.Polygon {
      def this(options: PolygonOptions) = this()
    }
    
    @JSGlobal("AMap.Polyline")
    @js.native
    class Polyline ()
      extends typingsSlinky.amapJsSdk.AMap.Polyline {
      def this(options: PolylineOptions) = this()
    }
    
    @JSGlobal("AMap.Scale")
    @js.native
    class Scale ()
      extends typingsSlinky.amapJsSdk.AMap.Scale
    
    /**
      * 地物对象的像素尺寸
      */
    @JSGlobal("AMap.Size")
    @js.native
    class Size protected ()
      extends typingsSlinky.amapJsSdk.AMap.Size {
      /**
        * 构造尺寸对象
        * @param width 宽度，单位：像素
        * @param height 高度，单位：像素
        */
      def this(width: Double, height: Double) = this()
    }
    
    @JSGlobal("AMap.TileLayer")
    @js.native
    class TileLayer ()
      extends typingsSlinky.amapJsSdk.AMap.Layer {
      def this(tileOpt: DetectRetina) = this()
    }
    object TileLayer {
      
      @JSGlobal("AMap.TileLayer.MapTypeLayer")
      @js.native
      abstract class MapTypeLayer ()
        extends typingsSlinky.amapJsSdk.AMap.Layer {
        def this(options: typingsSlinky.amapJsSdk.anon.Map) = this()
      }
      
      @JSGlobal("AMap.TileLayer.RoadNet")
      @js.native
      class RoadNet ()
        extends typingsSlinky.amapJsSdk.AMap.Layer
      
      @JSGlobal("AMap.TileLayer.Satellite")
      @js.native
      class Satellite ()
        extends typingsSlinky.amapJsSdk.AMap.Layer
      
      @JSGlobal("AMap.TileLayer.Traffic")
      @js.native
      class Traffic ()
        extends typingsSlinky.amapJsSdk.AMap.TileLayer.Traffic {
        def this(options: AutoRefresh) = this()
      }
    }
    
    @JSGlobal("AMap.ToolBar")
    @js.native
    class ToolBar ()
      extends typingsSlinky.amapJsSdk.AMap.ToolBar {
      def this(options: AutoPosition) = this()
    }
    
    @JSGlobal("AMap.View2D")
    @js.native
    class View2D protected ()
      extends typingsSlinky.amapJsSdk.AMap.View2D {
      def this(opt: Center) = this()
    }
    
    @JSGlobal("AMap.Weather")
    @js.native
    class Weather ()
      extends typingsSlinky.amapJsSdk.AMap.Weather
    
    @JSGlobal("AMap.convertFrom")
    @js.native
    def convertFrom(
      lnglat: js.Array[typingsSlinky.amapJsSdk.AMap.LngLat],
      `type`: String,
      result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
    ): Unit = js.native
    @JSGlobal("AMap.convertFrom")
    @js.native
    def convertFrom(
      lnglat: js.Tuple2[Double, Double],
      `type`: String,
      result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
    ): Unit = js.native
    /**
      * 坐标转换
      */
    @JSGlobal("AMap.convertFrom")
    @js.native
    def convertFrom(
      lnglat: typingsSlinky.amapJsSdk.AMap.LngLat,
      `type`: String,
      result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
    ): Unit = js.native
    
    object event {
      
      /**
        * 注册DOM对象事件：给DOM对象注册事件，并返回eventListener。运行AMap.event.removeListener(eventListener)可以删除该事件的监听器。
        * @param instance：需注册事件的DOM对象（必填）
        * @param eventName：事件名称（必填）
        * @param handler：事件功能函数（必填）
        * @param context：事件上下文（可选，缺省时，handler中this指向参数instance引用的对象，否则this指向context引用的对象）
        */
      @JSGlobal("AMap.event.addDomListener")
      @js.native
      def addDomListener(instance: js.Any, eventName: String, handler: EventCallback): EventListener = js.native
      @JSGlobal("AMap.event.addDomListener")
      @js.native
      def addDomListener(instance: js.Any, eventName: String, handler: EventCallback, context: js.Any): EventListener = js.native
      
      /**
        * 注册对象事件：给对象注册事件，并返回eventListener。运行AMap.event.removeListener(eventListener)可以删除该事件的监听器。
        * @param instance：需注册事件的对象（必填）
        * @param eventName：事件名称（必填）
        * @param handler：事件功能函数（必填）
        * @param context：事件上下文（可选，缺省时，handler中this指向参数instance引用的对象，否则this指向context引用的对象）
        */
      @JSGlobal("AMap.event.addListener")
      @js.native
      def addListener(instance: js.Any, eventName: String, handler: EventCallback): EventListener = js.native
      @JSGlobal("AMap.event.addListener")
      @js.native
      def addListener(instance: js.Any, eventName: String, handler: EventCallback, context: js.Any): EventListener = js.native
      
      /**
        * 类似于addListener，但处理程序会在处理完第一个事件后将自已移除。
        */
      @JSGlobal("AMap.event.addListenerOnce")
      @js.native
      def addListenerOnce(instance: js.Any, eventName: String, handler: EventCallback): EventListener = js.native
      @JSGlobal("AMap.event.addListenerOnce")
      @js.native
      def addListenerOnce(instance: js.Any, eventName: String, handler: EventCallback, context: js.Any): EventListener = js.native
      
      /**
        * 删除由上述 event.addDomListener 和 event.addListener 传回的指定侦听器。
        */
      @JSGlobal("AMap.event.removeListener")
      @js.native
      def removeListener(listener: EventListener): Unit = js.native
      
      /**
        * 触发非DOM事件：触发非DOM事件eventName，extArgs将扩展到事件监听函数（handler）接受到的event参数中。如:在extArgs内写入{m:10,p:2}，eventName监听函数（handler）可以接收到包含m,p两个key值的event对象。
        */
      @JSGlobal("AMap.event.trigger")
      @js.native
      def trigger(instance: js.Any, eventName: String, extArgs: js.Any): Unit = js.native
    }
    
    /**
      * 加载插件
      * @param pluginNames
      * @param ready
      */
    @JSGlobal("AMap.plugin")
    @js.native
    def plugin(pluginNames: js.Array[String]): Unit = js.native
    @JSGlobal("AMap.plugin")
    @js.native
    def plugin(pluginNames: js.Array[String], ready: js.Function0[Unit]): Unit = js.native
    
    /**
      * 加载服务
      * @param serviceName
      * @param ready
      */
    @JSGlobal("AMap.service")
    @js.native
    def service(serviceName: String): Unit = js.native
    @JSGlobal("AMap.service")
    @js.native
    def service(serviceName: String, ready: js.Function0[Unit]): Unit = js.native
  }
}
