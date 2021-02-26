package typingsSlinky.amapJsApi.AMap

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.amapJsApi.AMap.TileLayer.WMS.Params
import typingsSlinky.amapJsApi.amapJsApiStrings.FALSE
import typingsSlinky.amapJsApi.amapJsApiStrings.TRUE
import typingsSlinky.amapJsApi.amapJsApiStrings.complete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayer extends Layer {
  
  /**
    * 获取当前图层所有切片号
    */
  def getTiles(): js.Array[String] = js.native
  
  /**
    * 重新加载此图层
    */
  def reload(): Unit = js.native
  
  /**
    * 设置图层的取图地址
    * @param url 取图地址
    */
  def setTileUrl(url: String): Unit = js.native
  def setTileUrl(url: js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String]): Unit = js.native
}
object TileLayer {
  
  @js.native
  trait EventMap extends StObject {
    
    var complete: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.complete, js.UndefOr[scala.Nothing]] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply(complete: Event_[complete, js.UndefOr[scala.Nothing]]): EventMap = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Event_[complete, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    }
  }
  
  object Flexible {
    
    @js.native
    trait Options
      extends typingsSlinky.amapJsApi.AMap.TileLayer.Options {
      
      /**
        * 内存中缓存的切片的数量上限
        */
      var cacheSize: js.UndefOr[Double] = js.native
      
      /**
        * 创建切片回调
        * @param x 横坐标
        * @param y 纵坐标
        * @param z 层级
        * @param success 成功回调
        * @param fail 失败回调
        */
      var createTile: js.UndefOr[
            js.Function5[
              /* x */ Double, 
              /* y */ Double, 
              /* z */ Double, 
              /* success */ js.Function1[/* tile */ HTMLImageElement | HTMLCanvasElement, Unit], 
              /* fail */ js.Function0[Unit], 
              Unit
            ]
          ] = js.native
      
      /**
        * 是否显示
        */
      var visible: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): typingsSlinky.amapJsApi.AMap.TileLayer.Flexible.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.amapJsApi.AMap.TileLayer.Flexible.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.amapJsApi.AMap.TileLayer.Flexible.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
        
        @scala.inline
        def setCreateTile(
          value: (/* x */ Double, /* y */ Double, /* z */ Double, /* success */ js.Function1[/* tile */ HTMLImageElement | HTMLCanvasElement, Unit], /* fail */ js.Function0[Unit]) => Unit
        ): Self = StObject.set(x, "createTile", js.Any.fromFunction5(value))
        
        @scala.inline
        def setCreateTileUndefined: Self = StObject.set(x, "createTile", js.undefined)
        
        @scala.inline
        def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      }
    }
  }
  type Flexible = TileLayer
  
  @js.native
  trait Options
    extends typingsSlinky.amapJsApi.AMap.Layer.Options {
    
    /**
      * 是否在高清屏下进行清晰度适配
      */
    var detectRetina: js.UndefOr[Boolean] = js.native
    
    /**
      * 取图错误时的代替地址
      */
    var errorUrl: js.UndefOr[String] = js.native
    
    /**
      * 获取图块取图地址
      */
    var getTileUrl: js.UndefOr[
        String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String])
      ] = js.native
    
    /**
      * 图层的透明度
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /**
      * 切片大小
      */
    var tileSize: js.UndefOr[Double] = js.native
    
    /**
      * 切片取图地址(自1.3版本起，该属性与getTileUrl属性合并)
      */
    var tileUrl: js.UndefOr[String] = js.native
    
    /**
      * 图层叠加的顺序值
      */
    var zIndex: js.UndefOr[Double] = js.native
    
    /**
      * 支持的缩放级别范围
      */
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectRetinaUndefined: Self = StObject.set(x, "detectRetina", js.undefined)
      
      @scala.inline
      def setErrorUrl(value: String): Self = StObject.set(x, "errorUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUrlUndefined: Self = StObject.set(x, "errorUrl", js.undefined)
      
      @scala.inline
      def setGetTileUrl(value: String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String])): Self = StObject.set(x, "getTileUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTileUrlFunction3(value: (/* x */ Double, /* y */ Double, /* level */ Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetTileUrlUndefined: Self = StObject.set(x, "getTileUrl", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      @scala.inline
      def setTileUrl(value: String): Self = StObject.set(x, "tileUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileUrlUndefined: Self = StObject.set(x, "tileUrl", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      @scala.inline
      def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
  
  /**
    * 路网图层
    */
  type RoadNet = TileLayer
  
  /**
    * 卫星图层
    */
  type Satellite = TileLayer
  
  object Traffic {
    
    @js.native
    trait Options
      extends typingsSlinky.amapJsApi.AMap.TileLayer.Options {
      
      /**
        * 是否设置可以自动刷新实时路况信息
        */
      var autoRefresh: js.UndefOr[Boolean] = js.native
      
      /**
        * 设置刷新间隔时长
        */
      var interval: js.UndefOr[Double] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): typingsSlinky.amapJsApi.AMap.TileLayer.Traffic.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.amapJsApi.AMap.TileLayer.Traffic.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.amapJsApi.AMap.TileLayer.Traffic.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoRefresh(value: Boolean): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoRefreshUndefined: Self = StObject.set(x, "autoRefresh", js.undefined)
        
        @scala.inline
        def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      }
    }
  }
  type Traffic = TileLayer
  
  @js.native
  trait WMS extends TileLayer {
    
    /**
      * 返回OGC标准的WMS getMap接口的参数
      */
    def getParams(): Params = js.native
    
    /**
      * 返回wms服务地址
      */
    def getUrl(): String = js.native
    
    /**
      * 设置OGC标准的WMS getMap接口的参数
      * @param params 接口参数
      */
    def setParams(params: Params): Unit = js.native
    
    /**
      * 设置wms服务地址
      * @param url 服务地址
      */
    def setUrl(url: String): Unit = js.native
  }
  object WMS {
    
    @js.native
    trait Options
      extends typingsSlinky.amapJsApi.AMap.TileLayer.Flexible.Options {
      
      /**
        * 地图级别切换时，不同级别的图片是否进行混合
        */
      var blend: js.UndefOr[Boolean] = js.native
      
      /**
        * OGC标准的WMS地图服务的GetMap接口的参数
        */
      var params: Params = js.native
      
      /**
        * wms服务的url地址
        */
      var url: String = js.native
    }
    object Options {
      
      @scala.inline
      def apply(params: Params, url: String): typingsSlinky.amapJsApi.AMap.TileLayer.WMS.Options = {
        val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.amapJsApi.AMap.TileLayer.WMS.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.amapJsApi.AMap.TileLayer.WMS.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlend(value: Boolean): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
        
        @scala.inline
        def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Params extends StObject {
      
      var BGCOLOR: js.UndefOr[String] = js.native
      
      var ELEVATION: js.UndefOr[String] = js.native
      
      var EXCEPTIONS: js.UndefOr[String] = js.native
      
      var FORMAT: js.UndefOr[String] = js.native
      
      var LAYERS: js.UndefOr[String] = js.native
      
      var STYLES: js.UndefOr[String] = js.native
      
      var TIME: js.UndefOr[String] = js.native
      
      var TRANSPARENT: js.UndefOr[TRUE | FALSE] = js.native
      
      var VERSION: js.UndefOr[String] = js.native
    }
    object Params {
      
      @scala.inline
      def apply(): Params = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Params]
      }
      
      @scala.inline
      implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBGCOLOR(value: String): Self = StObject.set(x, "BGCOLOR", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBGCOLORUndefined: Self = StObject.set(x, "BGCOLOR", js.undefined)
        
        @scala.inline
        def setELEVATION(value: String): Self = StObject.set(x, "ELEVATION", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setELEVATIONUndefined: Self = StObject.set(x, "ELEVATION", js.undefined)
        
        @scala.inline
        def setEXCEPTIONS(value: String): Self = StObject.set(x, "EXCEPTIONS", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEXCEPTIONSUndefined: Self = StObject.set(x, "EXCEPTIONS", js.undefined)
        
        @scala.inline
        def setFORMAT(value: String): Self = StObject.set(x, "FORMAT", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFORMATUndefined: Self = StObject.set(x, "FORMAT", js.undefined)
        
        @scala.inline
        def setLAYERS(value: String): Self = StObject.set(x, "LAYERS", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLAYERSUndefined: Self = StObject.set(x, "LAYERS", js.undefined)
        
        @scala.inline
        def setSTYLES(value: String): Self = StObject.set(x, "STYLES", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSTYLESUndefined: Self = StObject.set(x, "STYLES", js.undefined)
        
        @scala.inline
        def setTIME(value: String): Self = StObject.set(x, "TIME", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTIMEUndefined: Self = StObject.set(x, "TIME", js.undefined)
        
        @scala.inline
        def setTRANSPARENT(value: TRUE | FALSE): Self = StObject.set(x, "TRANSPARENT", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTRANSPARENTUndefined: Self = StObject.set(x, "TRANSPARENT", js.undefined)
        
        @scala.inline
        def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVERSIONUndefined: Self = StObject.set(x, "VERSION", js.undefined)
      }
    }
  }
  
  @js.native
  trait WMTS extends TileLayer {
    
    /**
      * 返回OGC标准的WMTS getTile接口的参数
      */
    def getParams(): typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Params = js.native
    
    /**
      * 返回wmts服务地址
      */
    def getUrl(): String = js.native
    
    /**
      * 设置OGC标准的WMTS getTile接口的参数
      * @param params 接口参数
      */
    def setParams(params: typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Params): Unit = js.native
    
    /**
      * 设置wmts服务地址
      * @param url 服务地址
      */
    def setUrl(url: String): Unit = js.native
  }
  object WMTS {
    
    @js.native
    trait Options
      extends typingsSlinky.amapJsApi.AMap.TileLayer.Flexible.Options {
      
      /**
        * 地图级别切换时，不同级别的图片是否进行混合
        */
      var blend: js.UndefOr[Boolean] = js.native
      
      /**
        * OGC标准的WMTS地图服务的GetTile接口的参数
        */
      var params: typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Params = js.native
      
      /**
        * wmts服务的url地址
        */
      var url: String = js.native
    }
    object Options {
      
      @scala.inline
      def apply(params: typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Params, url: String): typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Options = {
        val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlend(value: Boolean): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
        
        @scala.inline
        def setParams(value: typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Params extends StObject {
      
      var Format: js.UndefOr[String] = js.native
      
      var Layer: js.UndefOr[String] = js.native
      
      var Style: js.UndefOr[String] = js.native
      
      var Version: js.UndefOr[String] = js.native
    }
    object Params {
      
      @scala.inline
      def apply(): typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Params = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Params]
      }
      
      @scala.inline
      implicit class ParamsMutableBuilder[Self <: typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Params] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
        
        @scala.inline
        def setLayer(value: String): Self = StObject.set(x, "Layer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayerUndefined: Self = StObject.set(x, "Layer", js.undefined)
        
        @scala.inline
        def setStyle(value: String): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "Style", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
      }
    }
  }
}
