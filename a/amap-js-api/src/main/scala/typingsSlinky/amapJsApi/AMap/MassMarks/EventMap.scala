package typingsSlinky.amapJsApi.AMap.MassMarks

import typingsSlinky.amapJsApi.amapJsApiStrings.click
import typingsSlinky.amapJsApi.amapJsApiStrings.dblclick
import typingsSlinky.amapJsApi.amapJsApiStrings.mousedown
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseout
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseover
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseup
import typingsSlinky.amapJsApi.amapJsApiStrings.touchend
import typingsSlinky.amapJsApi.amapJsApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.click, I]
  var dblclick: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.dblclick, I]
  var mousedown: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mousedown, I]
  var mouseout: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseout, I]
  var mouseover: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseover, I]
  var mouseup: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseup, I]
  var touchend: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchend, I]
  var touchstart: UIEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchstart, I]
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

