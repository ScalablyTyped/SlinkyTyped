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
  implicit class EventMapOps[Self[i] <: EventMap[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withClick(value: Event_[click, LabelsLayerEvent[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousedown(value: Event_[mousedown, LabelsLayerEvent[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousemove(value: Event_[mousemove, LabelsLayerEvent[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseout(value: Event_[mouseout, LabelsLayerEvent[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseover(value: Event_[mouseover, LabelsLayerEvent[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseup(value: Event_[mouseup, LabelsLayerEvent[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: Event_[touchend, LabelsLayerEvent[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: Event_[touchstart, LabelsLayerEvent[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

