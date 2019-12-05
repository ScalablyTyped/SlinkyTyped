package typingsSlinky.amapDashJsDashApi.AMap.Marker

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApi.AMap.MapsEvent
import typingsSlinky.amapDashJsDashApi.Anon_PassedPath
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragging
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragstart
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.movealong
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.moveend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.moving
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
  var dragend: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragend, I]
  var dragging: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragging, I]
  var dragstart: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragstart, I]
  var mousedown: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, I]
  var mousemove: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove, I]
  var mouseout: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout, I]
  var mouseover: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, I]
  var mouseup: MapsEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, I]
  var movealong: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.movealong, 
    js.UndefOr[scala.Nothing]
  ]
  var moveend: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.moveend, 
    js.UndefOr[scala.Nothing]
  ]
  var moving: Event[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.moving, Anon_PassedPath]
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
    dragend: MapsEvent[dragend, I],
    dragging: MapsEvent[dragging, I],
    dragstart: MapsEvent[dragstart, I],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseout: MapsEvent[mouseout, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    movealong: Event[movealong, js.UndefOr[scala.Nothing]],
    moveend: Event[moveend, js.UndefOr[scala.Nothing]],
    moving: Event[moving, Anon_PassedPath],
    rightclick: MapsEvent[rightclick, I],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], movealong = movealong.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

