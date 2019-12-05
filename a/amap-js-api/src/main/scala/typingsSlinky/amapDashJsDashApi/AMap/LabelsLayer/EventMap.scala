package typingsSlinky.amapDashJsDashApi.AMap.LabelsLayer

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.click, 
    LabelsLayerEvent[I]
  ]
  var mousedown: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, 
    LabelsLayerEvent[I]
  ]
  var mousemove: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove, 
    LabelsLayerEvent[I]
  ]
  var mouseout: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout, 
    LabelsLayerEvent[I]
  ]
  var mouseover: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, 
    LabelsLayerEvent[I]
  ]
  var mouseup: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, 
    LabelsLayerEvent[I]
  ]
  var touchend: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchend, 
    LabelsLayerEvent[I]
  ]
  var touchstart: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart, 
    LabelsLayerEvent[I]
  ]
}

object EventMap {
  @scala.inline
  def apply[I](
    click: Event[click, LabelsLayerEvent[I]],
    mousedown: Event[mousedown, LabelsLayerEvent[I]],
    mousemove: Event[mousemove, LabelsLayerEvent[I]],
    mouseout: Event[mouseout, LabelsLayerEvent[I]],
    mouseover: Event[mouseover, LabelsLayerEvent[I]],
    mouseup: Event[mouseup, LabelsLayerEvent[I]],
    touchend: Event[touchend, LabelsLayerEvent[I]],
    touchstart: Event[touchstart, LabelsLayerEvent[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

