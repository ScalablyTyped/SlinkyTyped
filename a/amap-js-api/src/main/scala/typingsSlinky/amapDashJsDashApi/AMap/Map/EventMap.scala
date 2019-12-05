package typingsSlinky.amapDashJsDashApi.AMap.Map

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApi.AMap.MapsEvent
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.complete
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.contextmenu
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragging
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragstart
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotclick
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotout
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotover
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mapmove
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousewheel
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.moveend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.movestart
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.rdblclick
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.resize
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.zoomchange
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.zoomend
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.zoomstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var click: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.click, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var complete: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.complete, 
    js.UndefOr[scala.Nothing]
  ]
  var contextmenu: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.contextmenu, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var dblclick: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var dragend: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragend, 
    js.UndefOr[scala.Nothing]
  ]
  var dragging: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragging, 
    js.UndefOr[scala.Nothing]
  ]
  var dragstart: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.dragstart, 
    js.UndefOr[scala.Nothing]
  ]
  var hotspotclick: HotspotEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotclick]
  var hotspotout: HotspotEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotout]
  var hotspotover: HotspotEvent[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.hotspotover]
  var mapmove: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mapmove, 
    js.UndefOr[scala.Nothing]
  ]
  var mousedown: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var mousemove: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousemove, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var mouseout: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var mouseover: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var mouseup: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var mousewheel: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.mousewheel, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var moveend: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.moveend, 
    js.UndefOr[scala.Nothing]
  ]
  var movestart: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.movestart, 
    js.UndefOr[scala.Nothing]
  ]
  var rdblclick: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.rdblclick, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var resize: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.resize, 
    js.UndefOr[scala.Nothing]
  ]
  var rightclick: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.rightclick, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var touchend: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchend, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var touchmove: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchmove, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var touchstart: MapsEvent[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart, 
    typingsSlinky.amapDashJsDashApi.AMap.Map
  ]
  var zoomchange: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.zoomchange, 
    js.UndefOr[scala.Nothing]
  ]
  var zoomend: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.zoomend, 
    js.UndefOr[scala.Nothing]
  ]
  var zoomstart: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.zoomstart, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(
    click: MapsEvent[click, typingsSlinky.amapDashJsDashApi.AMap.Map],
    complete: Event[complete, js.UndefOr[scala.Nothing]],
    contextmenu: MapsEvent[contextmenu, typingsSlinky.amapDashJsDashApi.AMap.Map],
    dblclick: MapsEvent[dblclick, typingsSlinky.amapDashJsDashApi.AMap.Map],
    dragend: Event[dragend, js.UndefOr[scala.Nothing]],
    dragging: Event[dragging, js.UndefOr[scala.Nothing]],
    dragstart: Event[dragstart, js.UndefOr[scala.Nothing]],
    hotspotclick: HotspotEvent[hotspotclick],
    hotspotout: HotspotEvent[hotspotout],
    hotspotover: HotspotEvent[hotspotover],
    mapmove: Event[mapmove, js.UndefOr[scala.Nothing]],
    mousedown: MapsEvent[mousedown, typingsSlinky.amapDashJsDashApi.AMap.Map],
    mousemove: MapsEvent[mousemove, typingsSlinky.amapDashJsDashApi.AMap.Map],
    mouseout: MapsEvent[mouseout, typingsSlinky.amapDashJsDashApi.AMap.Map],
    mouseover: MapsEvent[mouseover, typingsSlinky.amapDashJsDashApi.AMap.Map],
    mouseup: MapsEvent[mouseup, typingsSlinky.amapDashJsDashApi.AMap.Map],
    mousewheel: MapsEvent[mousewheel, typingsSlinky.amapDashJsDashApi.AMap.Map],
    moveend: Event[moveend, js.UndefOr[scala.Nothing]],
    movestart: Event[movestart, js.UndefOr[scala.Nothing]],
    rdblclick: MapsEvent[rdblclick, typingsSlinky.amapDashJsDashApi.AMap.Map],
    resize: Event[resize, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, typingsSlinky.amapDashJsDashApi.AMap.Map],
    touchend: MapsEvent[touchend, typingsSlinky.amapDashJsDashApi.AMap.Map],
    touchmove: MapsEvent[touchmove, typingsSlinky.amapDashJsDashApi.AMap.Map],
    touchstart: MapsEvent[touchstart, typingsSlinky.amapDashJsDashApi.AMap.Map],
    zoomchange: Event[zoomchange, js.UndefOr[scala.Nothing]],
    zoomend: Event[zoomend, js.UndefOr[scala.Nothing]],
    zoomstart: Event[zoomstart, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], hotspotclick = hotspotclick.asInstanceOf[js.Any], hotspotout = hotspotout.asInstanceOf[js.Any], hotspotover = hotspotover.asInstanceOf[js.Any], mapmove = mapmove.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mousewheel = mousewheel.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], movestart = movestart.asInstanceOf[js.Any], rdblclick = rdblclick.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], zoomchange = zoomchange.asInstanceOf[js.Any], zoomend = zoomend.asInstanceOf[js.Any], zoomstart = zoomstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

