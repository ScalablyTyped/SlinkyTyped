package typingsSlinky.amapDashJsDashApi.AMap.Overlay

import typingsSlinky.amapDashJsDashApi.AMap.MapsEvent
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.click, I]
  var dblclick: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick, I]
  var mousedown: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, I]
  var mousemove: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove, I]
  var mouseover: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, I]
  var mouseup: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, I]
  var rightclick: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick, I]
  var touchend: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchend, I]
  var touchmove: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove, I]
  var touchstart: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart, I]
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
}

