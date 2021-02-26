package typingsSlinky.amapJsApi.AMap

import typingsSlinky.amapJsApi.amapJsApiStrings.click
import typingsSlinky.amapJsApi.amapJsApiStrings.mousedown
import typingsSlinky.amapJsApi.amapJsApiStrings.mousemove
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseout
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseover
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseup
import typingsSlinky.amapJsApi.amapJsApiStrings.touchend
import typingsSlinky.amapJsApi.amapJsApiStrings.touchstart
import typingsSlinky.amapJsApi.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelsLayer extends Layer {
  
  def add(labelMarker: js.Array[LabelMarker[_]]): Unit = js.native
  /**
    * 图层中添加LabelMarker
    * @param labelMarker 标注对象
    */
  def add(labelMarker: LabelMarker[_]): Unit = js.native
  
  /**
    * 清空图层
    */
  def clear(): Unit = js.native
  
  /**
    * 图层中移除LabelMarker
    * @param labelMarker 标注对象
    */
  def remove(labelMarker: LabelMarker[_]): Unit = js.native
}
object LabelsLayer {
  
  @js.native
  trait EventData extends StObject {
    
    var data: Id = js.native
    
    var opts: typingsSlinky.amapJsApi.anon.Icon = js.native
  }
  object EventData {
    
    @scala.inline
    def apply(data: Id, opts: typingsSlinky.amapJsApi.anon.Icon): EventData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    @scala.inline
    implicit class EventDataMutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Id): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpts(value: typingsSlinky.amapJsApi.anon.Icon): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventMap[I] extends StObject {
    
    var click: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.click, LabelsLayerEvent[I]] = js.native
    
    var mousedown: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mousedown, LabelsLayerEvent[I]] = js.native
    
    var mousemove: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mousemove, LabelsLayerEvent[I]] = js.native
    
    var mouseout: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mouseout, LabelsLayerEvent[I]] = js.native
    
    var mouseover: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mouseover, LabelsLayerEvent[I]] = js.native
    
    var mouseup: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mouseup, LabelsLayerEvent[I]] = js.native
    
    var touchend: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.touchend, LabelsLayerEvent[I]] = js.native
    
    var touchstart: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.touchstart, LabelsLayerEvent[I]] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply[I](
      click: Event_[click, LabelsLayerEvent[I]],
      mousedown: Event_[mousedown, LabelsLayerEvent[I]],
      mousemove: Event_[mousemove, LabelsLayerEvent[I]],
      mouseout: Event_[mouseout, LabelsLayerEvent[I]],
      mouseover: Event_[mouseover, LabelsLayerEvent[I]],
      mouseup: Event_[mouseup, LabelsLayerEvent[I]],
      touchend: Event_[touchend, LabelsLayerEvent[I]],
      touchstart: Event_[touchstart, LabelsLayerEvent[I]]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
      
      @scala.inline
      def setClick(value: Event_[click, LabelsLayerEvent[I]]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousedown(value: Event_[mousedown, LabelsLayerEvent[I]]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousemove(value: Event_[mousemove, LabelsLayerEvent[I]]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseout(value: Event_[mouseout, LabelsLayerEvent[I]]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseover(value: Event_[mouseover, LabelsLayerEvent[I]]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseup(value: Event_[mouseup, LabelsLayerEvent[I]]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchend(value: Event_[touchend, LabelsLayerEvent[I]]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchstart(value: Event_[touchstart, LabelsLayerEvent[I]]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LabelsLayerEvent[I] extends StObject {
    
    var data: EventData = js.native
    
    var lnglat: LngLat = js.native
    
    var pixel: Pixel = js.native
    
    var target: I = js.native
  }
  object LabelsLayerEvent {
    
    @scala.inline
    def apply[I](data: EventData, lnglat: LngLat, pixel: Pixel, target: I): LabelsLayerEvent[I] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelsLayerEvent[I]]
    }
    
    @scala.inline
    implicit class LabelsLayerEventMutableBuilder[Self <: LabelsLayerEvent[_], I] (val x: Self with LabelsLayerEvent[I]) extends AnyVal {
      
      @scala.inline
      def setData(value: EventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixel(value: Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: I): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options
    extends typingsSlinky.amapJsApi.AMap.Layer.Options {
    
    /**
      * 图层的透明度
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /**
      * 图层是否可见
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /**
      * 图层的层级
      */
    var zIndex: js.UndefOr[Double] = js.native
    
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
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
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
