package typingsSlinky.amapJsApi.AMap

import typingsSlinky.amapJsApi.amapJsApiStrings.change
import typingsSlinky.amapJsApi.amapJsApiStrings.click
import typingsSlinky.amapJsApi.amapJsApiStrings.dblclick
import typingsSlinky.amapJsApi.amapJsApiStrings.hide
import typingsSlinky.amapJsApi.amapJsApiStrings.mousedown
import typingsSlinky.amapJsApi.amapJsApiStrings.mousemove
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseover
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseup
import typingsSlinky.amapJsApi.amapJsApiStrings.options
import typingsSlinky.amapJsApi.amapJsApiStrings.rightclick
import typingsSlinky.amapJsApi.amapJsApiStrings.setBounds
import typingsSlinky.amapJsApi.amapJsApiStrings.show
import typingsSlinky.amapJsApi.amapJsApiStrings.touchend
import typingsSlinky.amapJsApi.amapJsApiStrings.touchmove
import typingsSlinky.amapJsApi.amapJsApiStrings.touchstart
import typingsSlinky.amapJsApi.anon.PartialOptionsany
import typingsSlinky.amapJsApi.anon.TargetI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rectangle[ExtraData] extends Polygon[ExtraData] {
  
  /**
    * 获取矩形范围
    * @param bounds 矩形的范围
    * @param preventEvent 阻止触发事件
    */
  def setBounds(bounds: Bounds): Unit = js.native
  def setBounds(bounds: Bounds, preventEvent: Boolean): Unit = js.native
  
  /**
    *     修改矩形属性
    * @param options 属性
    */
  def setOptions(options: PartialOptionsany): Unit = js.native
}
object Rectangle {
  
  @js.native
  trait EventMap[I]
    extends typingsSlinky.amapJsApi.AMap.ShapeOverlay.EventMap[I] {
    
    var setBounds: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.setBounds, js.UndefOr[scala.Nothing]] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply[I](
      change: Event_[change, TargetI[I]],
      click: MapsEvent[click, I],
      dblclick: MapsEvent[dblclick, I],
      hide: Event_[hide, TargetI[I]],
      mousedown: MapsEvent[mousedown, I],
      mousemove: MapsEvent[mousemove, I],
      mouseover: MapsEvent[mouseover, I],
      mouseup: MapsEvent[mouseup, I],
      options: Event_[options, js.UndefOr[scala.Nothing]],
      rightclick: MapsEvent[rightclick, I],
      setBounds: Event_[setBounds, js.UndefOr[scala.Nothing]],
      show: Event_[show, TargetI[I]],
      touchend: MapsEvent[touchend, I],
      touchmove: MapsEvent[touchmove, I],
      touchstart: MapsEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], setBounds = setBounds.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
      
      @scala.inline
      def setSetBounds(value: Event_[setBounds, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "setBounds", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined amap-js-api.AMap.Merge<amap-js-api.AMap.Polygon.GetOptionsResult<ExtraData>, {  path :std.Array<amap-js-api.AMap.LngLat>,   bounds :amap-js-api.AMap.Bounds,   texture :string}> */
  @js.native
  trait GetOptionsResult[ExtraData] extends StObject {
    
    /**
      * 矩形的范围
      */
    var bounds: Bounds = js.native
    
    /**
      * 事件是否穿透到地图
      */
    var bubble: Boolean = js.native
    
    /**
      * 是否支持点击
      */
    var clickable: Boolean = js.native
    
    /**
      * 自定义属性
      */
    var extData: ExtraData | js.Object = js.native
    
    /**
      * 多边形填充颜色
      */
    var fillColor: String = js.native
    
    /**
      * 边形填充透明度
      */
    var fillOpacity: Double = js.native
    
    /**
      * 折线拐点的绘制样式
      */
    var lineJoin: StrokeLineJoin = js.native
    
    /**
      * 所属地图
      */
    var map: Map = js.native
    
    /**
      * 多边形轮廓线的节点坐标数组
      */
    /**
      * 路径节点数组
      */
    var path: (js.Array[js.Array[LngLat] | LngLat]) with js.Array[LngLat] = js.native
    
    /**
      * 线条颜色
      */
    var strokeColor: String = js.native
    
    /**
      * 虚线的分段
      */
    var strokeDasharray: js.Array[Double] = js.native
    
    /**
      * 线条透明度
      */
    var strokeOpacity: Double = js.native
    
    /**
      * 线条样式，虚线或者实线
      */
    var strokeStyle: StrokeStyle = js.native
    
    /**
      * 线条宽度
      */
    var strokeWeight: Double = js.native
    
    var texture: String = js.native
    
    /**
      * 层级
      */
    var zIndex: Double = js.native
  }
  object GetOptionsResult {
    
    @scala.inline
    def apply[ExtraData](
      bounds: Bounds,
      bubble: Boolean,
      clickable: Boolean,
      extData: ExtraData | js.Object,
      fillColor: String,
      fillOpacity: Double,
      lineJoin: StrokeLineJoin,
      map: Map,
      path: (js.Array[js.Array[LngLat] | LngLat]) with js.Array[LngLat],
      strokeColor: String,
      strokeDasharray: js.Array[Double],
      strokeOpacity: Double,
      strokeStyle: StrokeStyle,
      strokeWeight: Double,
      texture: String,
      zIndex: Double
    ): GetOptionsResult[ExtraData] = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOptionsResult[ExtraData]]
    }
    
    @scala.inline
    implicit class GetOptionsResultMutableBuilder[Self <: GetOptionsResult[_], ExtraData] (val x: Self with GetOptionsResult[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubble(value: Boolean): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtData(value: ExtraData | js.Object): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoin(value: StrokeLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: (js.Array[js.Array[LngLat] | LngLat]) with js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: js.Array[Double]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayVarargs(value: Double*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
      
      @scala.inline
      def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyle(value: StrokeStyle): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTexture(value: String): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options[ExtraData]
    extends typingsSlinky.amapJsApi.AMap.Polygon.Options[ExtraData] {
    
    /**
      * 矩形的范围
      */
    var bounds: js.UndefOr[Bounds] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], ExtraData] (val x: Self with Options[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    }
  }
}
