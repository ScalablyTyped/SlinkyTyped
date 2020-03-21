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

trait EventMap[I] extends js.Object {
  var click: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.click, LabelsLayerEvent[I]]
  var mousedown: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mousedown, LabelsLayerEvent[I]]
  var mousemove: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mousemove, LabelsLayerEvent[I]]
  var mouseout: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mouseout, LabelsLayerEvent[I]]
  var mouseover: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mouseover, LabelsLayerEvent[I]]
  var mouseup: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mouseup, LabelsLayerEvent[I]]
  var touchend: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.touchend, LabelsLayerEvent[I]]
  var touchstart: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.touchstart, LabelsLayerEvent[I]]
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
}

