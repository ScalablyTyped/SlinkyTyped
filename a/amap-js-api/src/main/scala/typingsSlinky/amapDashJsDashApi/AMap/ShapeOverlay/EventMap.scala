package typingsSlinky.amapDashJsDashApi.AMap.ShapeOverlay

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApi.AMap.MapsEvent
import typingsSlinky.amapDashJsDashApi.Anon_TargetI
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.change
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.hide
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.options
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.show
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I]
  extends typingsSlinky.amapDashJsDashApi.AMap.Overlay.EventMap[I] {
  var change: Event[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.change, Anon_TargetI[I]]
  var hide: Event[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.hide, Anon_TargetI[I]]
  var options: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.options, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.show, Anon_TargetI[I]]
}

object EventMap {
  @scala.inline
  def apply[I](
    change: Event[change, Anon_TargetI[I]],
    click: MapsEvent[click, I],
    dblclick: MapsEvent[dblclick, I],
    hide: Event[hide, Anon_TargetI[I]],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    options: Event[options, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, I],
    show: Event[show, Anon_TargetI[I]],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

