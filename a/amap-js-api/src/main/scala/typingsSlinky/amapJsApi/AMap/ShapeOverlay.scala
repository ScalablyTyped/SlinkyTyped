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
import typingsSlinky.amapJsApi.amapJsApiStrings.show
import typingsSlinky.amapJsApi.amapJsApiStrings.touchend
import typingsSlinky.amapJsApi.amapJsApiStrings.touchmove
import typingsSlinky.amapJsApi.amapJsApiStrings.touchstart
import typingsSlinky.amapJsApi.anon.TargetI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeOverlay[ExtraData] extends Overlay[ExtraData] {
  
  /**
    * 获得属性
    */
  def getOptions(): js.Object = js.native
  
  /**
    * 返回可见
    */
  def getVisible(): Boolean = js.native
  
  /**
    * 获得层级
    */
  def getzIndex(): Double = js.native
  
  /**
    * 设置是否可以拖拽
    */
  def setDraggable(draggable: Boolean): Unit = js.native
  
  /**
    * 设置覆盖物属性
    * @param options 属性
    */
  def setOptions(options: js.Object): Unit = js.native
  
  /**
    * 设置层级
    * @param zIndex 层级
    */
  def setzIndex(zIndex: Double): Unit = js.native
}
object ShapeOverlay {
  
  @js.native
  trait EventMap[I]
    extends typingsSlinky.amapJsApi.AMap.Overlay.EventMap[I] {
    
    var change: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.change, TargetI[I]] = js.native
    
    var hide: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.hide, TargetI[I]] = js.native
    
    var options: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.options, js.UndefOr[scala.Nothing]] = js.native
    
    var show: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.show, TargetI[I]] = js.native
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
      show: Event_[show, TargetI[I]],
      touchend: MapsEvent[touchend, I],
      touchmove: MapsEvent[touchmove, I],
      touchstart: MapsEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
      
      @scala.inline
      def setChange(value: Event_[change, TargetI[I]]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: Event_[hide, TargetI[I]]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Event_[options, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: Event_[show, TargetI[I]]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetOptionsResult[ExtraData] extends StObject {
    
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
      * 所属地图
      */
    var map: Map = js.native
    
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
    
    /**
      * 层级
      */
    var zIndex: Double = js.native
  }
  object GetOptionsResult {
    
    @scala.inline
    def apply[ExtraData](
      bubble: Boolean,
      clickable: Boolean,
      extData: ExtraData | js.Object,
      map: Map,
      strokeColor: String,
      strokeDasharray: js.Array[Double],
      strokeOpacity: Double,
      strokeStyle: StrokeStyle,
      strokeWeight: Double,
      zIndex: Double
    ): GetOptionsResult[ExtraData] = {
      val __obj = js.Dynamic.literal(bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOptionsResult[ExtraData]]
    }
    
    @scala.inline
    implicit class GetOptionsResultMutableBuilder[Self <: GetOptionsResult[_], ExtraData] (val x: Self with GetOptionsResult[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setBubble(value: Boolean): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtData(value: ExtraData | js.Object): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
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
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
}
