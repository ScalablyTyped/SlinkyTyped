package typingsSlinky.amapJsApiHeatmap

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApiHeatmap.AMap.Heatmap.DataSet
import typingsSlinky.amapJsApiHeatmap.AMap.Heatmap.Options
import typingsSlinky.amapJsApiHeatmap.anon.Data
import typingsSlinky.amapJsApiHeatmap.anon.DrawGridLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait Heatmap extends StObject {
    
    /**
      * 向热力图数据集中添加坐标点，count不填写时默认：1
      * @param lng 经度
      * @param lat 维度
      * @param count 权重
      */
    def addDataPoint(lng: Double, lat: Double): Unit = js.native
    def addDataPoint(lng: Double, lat: Double, count: Double): Unit = js.native
    
    /**
      * 输出热力图的数据集，数据结构同setDataSet中的数据集
      */
    def getDataSet(): DataSet = js.native
    
    /**
      * 获取热力图叠加地图对象
      */
    def getMap(): Map = js.native
    
    /**
      *     获取热力图的属性信息
      */
    def getOptions(): Options = js.native
    
    def getzIndex(): Double = js.native
    
    /**
      * 隐藏热力图
      */
    def hide(): Unit = js.native
    
    /**
      * 设置热力图展现的数据集，数据格式详见
      * https://lbs.amap.com/api/javascript-api/reference/layer#m_AMap.Heatmap
      * @param dataset 数据集
      */
    def setDataSet(dataset: DataSet): Unit = js.native
    def setDataSet(dataset: Data): Unit = js.native
    
    /**
      * 设置热力图要叠加的地图对象
      * @param map 地图对象
      */
    def setMap(map: Map): Unit = js.native
    
    /**
      * 设置热力图属性
      * @param opts 热力图属性
      */
    def setOptions(): Unit = js.native
    def setOptions(opts: Options): Unit = js.native
    
    // internal
    def setzIndex(zIndex: Double): Unit = js.native
    
    /**
      * 显示热力图
      */
    def show(): Unit = js.native
  }
  object Heatmap {
    
    @js.native
    trait Data extends StObject {
      
      /**
        * 权重
        */
      var count: Double = js.native
      
      /**
        * 维度
        */
      var lat: Double = js.native
      
      /**
        * 经度
        */
      var lng: Double = js.native
    }
    object Data {
      
      @scala.inline
      def apply(count: Double, lat: Double, lng: Double): typingsSlinky.amapJsApiHeatmap.AMap.Heatmap.Data = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.amapJsApiHeatmap.AMap.Heatmap.Data]
      }
      
      @scala.inline
      implicit class DataMutableBuilder[Self <: typingsSlinky.amapJsApiHeatmap.AMap.Heatmap.Data] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait DataSet extends StObject {
      
      /**
        * 坐标数据集
        */
      var data: js.Array[typingsSlinky.amapJsApiHeatmap.AMap.Heatmap.Data] = js.native
      
      /**
        * 权重的最大值
        */
      var max: js.UndefOr[Double] = js.native
    }
    object DataSet {
      
      @scala.inline
      def apply(data: js.Array[typingsSlinky.amapJsApiHeatmap.AMap.Heatmap.Data]): DataSet = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
        __obj.asInstanceOf[DataSet]
      }
      
      @scala.inline
      implicit class DataSetMutableBuilder[Self <: DataSet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: js.Array[typingsSlinky.amapJsApiHeatmap.AMap.Heatmap.Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataVarargs(value: typingsSlinky.amapJsApiHeatmap.AMap.Heatmap.Data*): Self = StObject.set(x, "data", js.Array(value :_*))
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      }
    }
    
    @js.native
    trait Options extends StObject {
      
      var `3d`: js.UndefOr[DrawGridLine] = js.native
      
      var blur: js.UndefOr[Double] = js.native
      
      /**
        * 热力图的渐变区间
        */
      var gradient: js.UndefOr[StringDictionary[String]] = js.native
      
      /**
        * 热力图透明度数组，取值范围[0,1]，0表示完全透明，1表示不透明
        * 默认：[0,1]
        */
      var opacity: js.UndefOr[js.Tuple2[Double, Double]] = js.native
      
      /**
        * 热力图中单个点的半径，默认：30，单位：pixel
        */
      var radius: js.UndefOr[Double] = js.native
      
      var radiusUnit: js.UndefOr[String] = js.native
      
      var rejectMapMask: js.UndefOr[Boolean] = js.native
      
      var renderOnZooming: js.UndefOr[Boolean] = js.native
      
      var visible: js.UndefOr[Boolean] = js.native
      
      var zIndex: js.UndefOr[Double] = js.native
      
      /**
        * 支持的缩放级别范围，取值范围[3-18]
        * 默认：[3,18]
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
        def set3d(value: DrawGridLine): Self = StObject.set(x, "3d", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set3dUndefined: Self = StObject.set(x, "3d", js.undefined)
        
        @scala.inline
        def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
        
        @scala.inline
        def setGradient(value: StringDictionary[String]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
        
        @scala.inline
        def setOpacity(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
        
        @scala.inline
        def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
        
        @scala.inline
        def setRadiusUnit(value: String): Self = StObject.set(x, "radiusUnit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRadiusUnitUndefined: Self = StObject.set(x, "radiusUnit", js.undefined)
        
        @scala.inline
        def setRejectMapMask(value: Boolean): Self = StObject.set(x, "rejectMapMask", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRejectMapMaskUndefined: Self = StObject.set(x, "rejectMapMask", js.undefined)
        
        @scala.inline
        def setRenderOnZooming(value: Boolean): Self = StObject.set(x, "renderOnZooming", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderOnZoomingUndefined: Self = StObject.set(x, "renderOnZooming", js.undefined)
        
        @scala.inline
        def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
        
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
  }
}
