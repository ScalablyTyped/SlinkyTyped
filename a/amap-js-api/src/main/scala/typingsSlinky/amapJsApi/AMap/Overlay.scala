package typingsSlinky.amapJsApi.AMap

import typingsSlinky.amapJsApi.amapJsApiStrings.click
import typingsSlinky.amapJsApi.amapJsApiStrings.dblclick
import typingsSlinky.amapJsApi.amapJsApiStrings.mousedown
import typingsSlinky.amapJsApi.amapJsApiStrings.mousemove
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseover
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseup
import typingsSlinky.amapJsApi.amapJsApiStrings.rightclick
import typingsSlinky.amapJsApi.amapJsApiStrings.touchend
import typingsSlinky.amapJsApi.amapJsApiStrings.touchmove
import typingsSlinky.amapJsApi.amapJsApiStrings.touchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overlay[ExtraData] extends EventEmitter {
  
  /**
    * 获取自定义数据
    */
  def getExtData(): ExtraData | js.Object = js.native
  
  def getHeight(): Double | String = js.native
  
  /**
    * 获取所属地图
    */
  def getMap(): js.UndefOr[Map | Null] = js.native
  
  /**
    * 隐藏覆盖物
    */
  def hide(): Unit = js.native
  
  /**
    * 设置自定义数据
    * @param extData 自定义数据
    */
  def setExtData(extData: ExtraData): Unit = js.native
  
  // internal
  def setHeight(): Unit = js.native
  def setHeight(height: String): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  
  /**
    * 设置所属地图
    * @param map 地图
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * 显示覆盖物
    */
  def show(): Unit = js.native
}
object Overlay {
  
  @js.native
  trait EventMap[I] extends StObject {
    
    var click: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.click, I] = js.native
    
    var dblclick: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.dblclick, I] = js.native
    
    var mousedown: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mousedown, I] = js.native
    
    var mousemove: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mousemove, I] = js.native
    
    var mouseover: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseover, I] = js.native
    
    var mouseup: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseup, I] = js.native
    
    var rightclick: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.rightclick, I] = js.native
    
    var touchend: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchend, I] = js.native
    
    var touchmove: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchmove, I] = js.native
    
    var touchstart: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchstart, I] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply[I](
      click: MapsEvent[click, I],
      dblclick: MapsEvent[dblclick, I],
      mousedown: MapsEvent[mousedown, I],
      mousemove: MapsEvent[mousemove, I],
      mouseover: MapsEvent[mouseover, I],
      mouseup: MapsEvent[mouseup, I],
      rightclick: MapsEvent[rightclick, I],
      touchend: MapsEvent[touchend, I],
      touchmove: MapsEvent[touchmove, I],
      touchstart: MapsEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
      
      @scala.inline
      def setClick(value: MapsEvent[click, I]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDblclick(value: MapsEvent[dblclick, I]): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousedown(value: MapsEvent[mousedown, I]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousemove(value: MapsEvent[mousemove, I]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseover(value: MapsEvent[mouseover, I]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseup(value: MapsEvent[mouseup, I]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightclick(value: MapsEvent[rightclick, I]): Self = StObject.set(x, "rightclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchend(value: MapsEvent[touchend, I]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchmove(value: MapsEvent[touchmove, I]): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchstart(value: MapsEvent[touchstart, I]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options[ExtraData] extends StObject {
    
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
      * 是否支持拖拽
      */
    var draggable: js.UndefOr[Boolean] = js.native
    
    /**
      * 自定义数据
      */
    var extData: js.UndefOr[ExtraData] = js.native
    
    /**
      * 所属地图
      */
    var map: js.UndefOr[Map] = js.native
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
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setExtData(value: ExtraData): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtDataUndefined: Self = StObject.set(x, "extData", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
}
