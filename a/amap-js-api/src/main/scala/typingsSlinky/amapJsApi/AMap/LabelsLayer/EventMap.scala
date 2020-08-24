package typingsSlinky.amapJsApi.AMap.LabelsLayer

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.amapJsApiStrings.click
import typingsSlinky.amapJsApi.amapJsApiStrings.mousedown
import typingsSlinky.amapJsApi.amapJsApiStrings.mousemove
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseout
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseover
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseup
import typingsSlinky.amapJsApi.amapJsApiStrings.touchend
import typingsSlinky.amapJsApi.amapJsApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap[I] extends js.Object {
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
  implicit class EventMapOps[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClick(value: Event_[click, LabelsLayerEvent[I]]): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousedown(value: Event_[mousedown, LabelsLayerEvent[I]]): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousemove(value: Event_[mousemove, LabelsLayerEvent[I]]): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseout(value: Event_[mouseout, LabelsLayerEvent[I]]): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseover(value: Event_[mouseover, LabelsLayerEvent[I]]): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseup(value: Event_[mouseup, LabelsLayerEvent[I]]): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: Event_[touchend, LabelsLayerEvent[I]]): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: Event_[touchstart, LabelsLayerEvent[I]]): Self = this.set("touchstart", value.asInstanceOf[js.Any])
  }
  
}

