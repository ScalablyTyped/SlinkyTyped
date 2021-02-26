package typingsSlinky.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BezierCurve[ExtraData] extends Polyline[ExtraData] {
  
  // internal
  def getInterpolateLngLats(): js.Array[LngLat] = js.native
  
  def getSerializedPath(): js.Array[js.Array[Double]] = js.native
}
object BezierCurve {
  
  type EventMap[I] = typingsSlinky.amapJsApi.AMap.Polyline.EventMap[I]
  
  @js.native
  trait GetOptionsResult[ExtraData]
    extends typingsSlinky.amapJsApi.AMap.Polyline.GetOptionsResult[ExtraData]
  object GetOptionsResult {
    
    @scala.inline
    def apply[ExtraData](
      borderWeight: Double,
      bubble: Boolean,
      clickable: Boolean,
      dirColor: String,
      dirImg: String,
      extData: ExtraData | js.Object,
      geodesic: Boolean,
      isOutline: Boolean,
      lineCap: StrokeLineCap,
      lineJoin: StrokeLineJoin,
      map: Map,
      outlineColor: String,
      path: js.Array[LngLat],
      showDir: Boolean,
      strokeColor: String,
      strokeDasharray: js.Array[Double],
      strokeOpacity: Double,
      strokeStyle: StrokeStyle,
      strokeWeight: Double,
      zIndex: Double
    ): GetOptionsResult[ExtraData] = {
      val __obj = js.Dynamic.literal(borderWeight = borderWeight.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], dirColor = dirColor.asInstanceOf[js.Any], dirImg = dirImg.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], geodesic = geodesic.asInstanceOf[js.Any], isOutline = isOutline.asInstanceOf[js.Any], lineCap = lineCap.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], showDir = showDir.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOptionsResult[ExtraData]]
    }
  }
  
  /* Inlined amap-js-api.AMap.Merge<amap-js-api.AMap.Polyline.Options<ExtraData>, {  path :std.Array<std.Array<number | string | std.Array<string | number>>>,   tolerance :number | undefined,   interpolateNumLimit :[number] | undefined}> */
  @js.native
  trait Options[ExtraData] extends StObject {
    
    /**
      * 描边的宽度
      */
    var borderWeight: js.UndefOr[Double] = js.native
    
    /**
      * 事件是否穿透到地图
      */
    var bubble: js.UndefOr[Boolean] = js.native
    
    /**
      * 是否支持点击
      */
    var clickable: js.UndefOr[Boolean] = js.native
    
    /**
      * 鼠标悬停时的鼠标样式
      */
    var cursor: js.UndefOr[String] = js.native
    
    /**
      * 方向箭头颜色
      */
    var dirColor: js.UndefOr[String] = js.native
    
    /**
      * 是否支持拖拽
      */
    var draggable: js.UndefOr[Boolean] = js.native
    
    /**
      * 自定义数据
      */
    var extData: js.UndefOr[ExtraData] = js.native
    
    /**
      * 是否绘制成大地线
      */
    var geodesic: js.UndefOr[Boolean] = js.native
    
    var interpolateNumLimit: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * 线条是否带描边
      */
    var isOutline: js.UndefOr[Boolean] = js.native
    
    /**
      * 折线两端线帽的绘制样式
      */
    var lineCap: js.UndefOr[StrokeLineCap] = js.native
    
    /**
      * 折线拐点的绘制样式
      */
    var lineJoin: js.UndefOr[StrokeLineJoin] = js.native
    
    /**
      * 所属地图
      */
    var map: js.UndefOr[Map] = js.native
    
    /**
      * 线条描边颜色
      */
    var outlineColor: js.UndefOr[String] = js.native
    
    // internal
    /**
      * 折线的节点数组
      */
    /**
      * 贝瑟尔曲线的路径
      */
    var path: js.UndefOr[js.Array[LocationValue]] with (js.Array[js.Array[Double | String | (js.Array[String | Double])]]) = js.native
    
    /**
      * 是否延路径显示方向箭头
      */
    var showDir: js.UndefOr[Boolean] = js.native
    
    /**
      * 描边线条颜色
      */
    var strokeColor: js.UndefOr[String] = js.native
    
    /**
      * 虚线间隔
      */
    var strokeDasharray: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * 描边线条透明度
      */
    var strokeOpacity: js.UndefOr[Double] = js.native
    
    /**
      * 描边样式
      */
    var strokeStyle: js.UndefOr[StrokeStyle] = js.native
    
    /**
      * 描边宽度
      */
    var strokeWeight: js.UndefOr[Double] = js.native
    
    // internal
    var tolerance: js.UndefOr[Double] = js.native
    
    /**
      * 是否可见
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /**
      * 覆盖物层级
      */
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[ExtraData](
      path: js.UndefOr[js.Array[LocationValue]] with (js.Array[js.Array[Double | String | (js.Array[String | Double])]])
    ): Options[ExtraData] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], ExtraData] (val x: Self with Options[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setBorderWeight(value: Double): Self = StObject.set(x, "borderWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWeightUndefined: Self = StObject.set(x, "borderWeight", js.undefined)
      
      @scala.inline
      def setBubble(value: Boolean): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDirColor(value: String): Self = StObject.set(x, "dirColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirColorUndefined: Self = StObject.set(x, "dirColor", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setExtData(value: ExtraData): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtDataUndefined: Self = StObject.set(x, "extData", js.undefined)
      
      @scala.inline
      def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
      
      @scala.inline
      def setInterpolateNumLimit(value: js.Array[Double]): Self = StObject.set(x, "interpolateNumLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolateNumLimitUndefined: Self = StObject.set(x, "interpolateNumLimit", js.undefined)
      
      @scala.inline
      def setInterpolateNumLimitVarargs(value: Double*): Self = StObject.set(x, "interpolateNumLimit", js.Array(value :_*))
      
      @scala.inline
      def setIsOutline(value: Boolean): Self = StObject.set(x, "isOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOutlineUndefined: Self = StObject.set(x, "isOutline", js.undefined)
      
      @scala.inline
      def setLineCap(value: StrokeLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      @scala.inline
      def setLineJoin(value: StrokeLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      @scala.inline
      def setPath(
        value: js.UndefOr[js.Array[LocationValue]] with (js.Array[js.Array[Double | String | (js.Array[String | Double])]])
      ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDir(value: Boolean): Self = StObject.set(x, "showDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDirUndefined: Self = StObject.set(x, "showDir", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeDasharray(value: js.Array[Double]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDasharrayVarargs(value: Double*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
      
      @scala.inline
      def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeStyle(value: StrokeStyle): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      @scala.inline
      def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
