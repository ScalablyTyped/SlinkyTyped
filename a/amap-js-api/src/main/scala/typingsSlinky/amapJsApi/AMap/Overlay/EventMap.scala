package typingsSlinky.amapJsApi.AMap.Overlay

import typingsSlinky.amapJsApi.AMap.MapsEvent
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.click, I]
  var dblclick: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.dblclick, I]
  var mousedown: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mousedown, I]
  var mousemove: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mousemove, I]
  var mouseover: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseover, I]
  var mouseup: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseup, I]
  var rightclick: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.rightclick, I]
  var touchend: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchend, I]
  var touchmove: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchmove, I]
  var touchstart: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchstart, I]
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

