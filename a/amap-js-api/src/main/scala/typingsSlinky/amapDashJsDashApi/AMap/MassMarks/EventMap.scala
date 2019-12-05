package typingsSlinky.amapDashJsDashApi.AMap.MassMarks

import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: UIEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.click, I]
  var dblclick: UIEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick, I]
  var mousedown: UIEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, I]
  var mouseout: UIEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout, I]
  var mouseover: UIEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, I]
  var mouseup: UIEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, I]
  var touchend: UIEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchend, I]
  var touchstart: UIEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart, I]
}

object EventMap {
  @scala.inline
  def apply[I](
    click: UIEvent[click, I],
    dblclick: UIEvent[dblclick, I],
    mousedown: UIEvent[mousedown, I],
    mouseout: UIEvent[mouseout, I],
    mouseover: UIEvent[mouseover, I],
    mouseup: UIEvent[mouseup, I],
    touchend: UIEvent[touchend, I],
    touchstart: UIEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

