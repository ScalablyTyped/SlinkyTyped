package typingsSlinky.amapDashJsDashApi.AMap.Circle

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
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.setCenter
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.setRadius
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.show
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I]
  extends typingsSlinky.amapDashJsDashApi.AMap.ShapeOverlay.EventMap[I] {
  var setCenter: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.setCenter, 
    js.UndefOr[scala.Nothing]
  ]
  var setRadius: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.setRadius, 
    js.UndefOr[scala.Nothing]
  ]
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
    setCenter: Event[setCenter, js.UndefOr[scala.Nothing]],
    setRadius: Event[setRadius, js.UndefOr[scala.Nothing]],
    show: Event[show, Anon_TargetI[I]],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], setCenter = setCenter.asInstanceOf[js.Any], setRadius = setRadius.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

