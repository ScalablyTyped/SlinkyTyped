package typingsSlinky.amapJsApi.AMap.Map

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.MapsEvent
import typingsSlinky.amapJsApi.amapJsApiStrings.click
import typingsSlinky.amapJsApi.amapJsApiStrings.complete
import typingsSlinky.amapJsApi.amapJsApiStrings.contextmenu
import typingsSlinky.amapJsApi.amapJsApiStrings.dblclick
import typingsSlinky.amapJsApi.amapJsApiStrings.dragend
import typingsSlinky.amapJsApi.amapJsApiStrings.dragging
import typingsSlinky.amapJsApi.amapJsApiStrings.dragstart
import typingsSlinky.amapJsApi.amapJsApiStrings.hotspotclick
import typingsSlinky.amapJsApi.amapJsApiStrings.hotspotout
import typingsSlinky.amapJsApi.amapJsApiStrings.hotspotover
import typingsSlinky.amapJsApi.amapJsApiStrings.mapmove
import typingsSlinky.amapJsApi.amapJsApiStrings.mousedown
import typingsSlinky.amapJsApi.amapJsApiStrings.mousemove
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseout
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseover
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseup
import typingsSlinky.amapJsApi.amapJsApiStrings.mousewheel
import typingsSlinky.amapJsApi.amapJsApiStrings.moveend
import typingsSlinky.amapJsApi.amapJsApiStrings.movestart
import typingsSlinky.amapJsApi.amapJsApiStrings.rdblclick
import typingsSlinky.amapJsApi.amapJsApiStrings.resize
import typingsSlinky.amapJsApi.amapJsApiStrings.rightclick
import typingsSlinky.amapJsApi.amapJsApiStrings.touchend
import typingsSlinky.amapJsApi.amapJsApiStrings.touchmove
import typingsSlinky.amapJsApi.amapJsApiStrings.touchstart
import typingsSlinky.amapJsApi.amapJsApiStrings.zoomchange
import typingsSlinky.amapJsApi.amapJsApiStrings.zoomend
import typingsSlinky.amapJsApi.amapJsApiStrings.zoomstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var click: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.click, typingsSlinky.amapJsApi.AMap.Map] = js.native
  var complete: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.complete, js.UndefOr[scala.Nothing]] = js.native
  var contextmenu: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.contextmenu, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var dblclick: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.dblclick, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var dragend: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.dragend, js.UndefOr[scala.Nothing]] = js.native
  var dragging: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.dragging, js.UndefOr[scala.Nothing]] = js.native
  var dragstart: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.dragstart, js.UndefOr[scala.Nothing]] = js.native
  var hotspotclick: HotspotEvent[typingsSlinky.amapJsApi.amapJsApiStrings.hotspotclick] = js.native
  var hotspotout: HotspotEvent[typingsSlinky.amapJsApi.amapJsApiStrings.hotspotout] = js.native
  var hotspotover: HotspotEvent[typingsSlinky.amapJsApi.amapJsApiStrings.hotspotover] = js.native
  var mapmove: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.mapmove, js.UndefOr[scala.Nothing]] = js.native
  var mousedown: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.mousedown, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var mousemove: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.mousemove, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var mouseout: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.mouseout, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var mouseover: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.mouseover, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var mouseup: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseup, typingsSlinky.amapJsApi.AMap.Map] = js.native
  var mousewheel: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.mousewheel, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var moveend: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.moveend, js.UndefOr[scala.Nothing]] = js.native
  var movestart: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.movestart, js.UndefOr[scala.Nothing]] = js.native
  var rdblclick: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.rdblclick, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var resize: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.resize, js.UndefOr[scala.Nothing]] = js.native
  var rightclick: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.rightclick, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var touchend: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.touchend, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var touchmove: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.touchmove, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var touchstart: MapsEvent[
    typingsSlinky.amapJsApi.amapJsApiStrings.touchstart, 
    typingsSlinky.amapJsApi.AMap.Map
  ] = js.native
  var zoomchange: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.zoomchange, js.UndefOr[scala.Nothing]] = js.native
  var zoomend: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.zoomend, js.UndefOr[scala.Nothing]] = js.native
  var zoomstart: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.zoomstart, js.UndefOr[scala.Nothing]] = js.native
}

object EventMap {
  @scala.inline
  def apply(
    click: MapsEvent[click, typingsSlinky.amapJsApi.AMap.Map],
    complete: Event_[complete, js.UndefOr[scala.Nothing]],
    contextmenu: MapsEvent[contextmenu, typingsSlinky.amapJsApi.AMap.Map],
    dblclick: MapsEvent[dblclick, typingsSlinky.amapJsApi.AMap.Map],
    dragend: Event_[dragend, js.UndefOr[scala.Nothing]],
    dragging: Event_[dragging, js.UndefOr[scala.Nothing]],
    dragstart: Event_[dragstart, js.UndefOr[scala.Nothing]],
    hotspotclick: HotspotEvent[hotspotclick],
    hotspotout: HotspotEvent[hotspotout],
    hotspotover: HotspotEvent[hotspotover],
    mapmove: Event_[mapmove, js.UndefOr[scala.Nothing]],
    mousedown: MapsEvent[mousedown, typingsSlinky.amapJsApi.AMap.Map],
    mousemove: MapsEvent[mousemove, typingsSlinky.amapJsApi.AMap.Map],
    mouseout: MapsEvent[mouseout, typingsSlinky.amapJsApi.AMap.Map],
    mouseover: MapsEvent[mouseover, typingsSlinky.amapJsApi.AMap.Map],
    mouseup: MapsEvent[mouseup, typingsSlinky.amapJsApi.AMap.Map],
    mousewheel: MapsEvent[mousewheel, typingsSlinky.amapJsApi.AMap.Map],
    moveend: Event_[moveend, js.UndefOr[scala.Nothing]],
    movestart: Event_[movestart, js.UndefOr[scala.Nothing]],
    rdblclick: MapsEvent[rdblclick, typingsSlinky.amapJsApi.AMap.Map],
    resize: Event_[resize, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, typingsSlinky.amapJsApi.AMap.Map],
    touchend: MapsEvent[touchend, typingsSlinky.amapJsApi.AMap.Map],
    touchmove: MapsEvent[touchmove, typingsSlinky.amapJsApi.AMap.Map],
    touchstart: MapsEvent[touchstart, typingsSlinky.amapJsApi.AMap.Map],
    zoomchange: Event_[zoomchange, js.UndefOr[scala.Nothing]],
    zoomend: Event_[zoomend, js.UndefOr[scala.Nothing]],
    zoomstart: Event_[zoomstart, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], hotspotclick = hotspotclick.asInstanceOf[js.Any], hotspotout = hotspotout.asInstanceOf[js.Any], hotspotover = hotspotover.asInstanceOf[js.Any], mapmove = mapmove.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mousewheel = mousewheel.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], movestart = movestart.asInstanceOf[js.Any], rdblclick = rdblclick.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], zoomchange = zoomchange.asInstanceOf[js.Any], zoomend = zoomend.asInstanceOf[js.Any], zoomstart = zoomstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClick(value: MapsEvent[click, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: Event_[complete, js.UndefOr[scala.Nothing]]): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextmenu(value: MapsEvent[contextmenu, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: MapsEvent[dblclick, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragend(value: Event_[dragend, js.UndefOr[scala.Nothing]]): Self = this.set("dragend", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragging(value: Event_[dragging, js.UndefOr[scala.Nothing]]): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragstart(value: Event_[dragstart, js.UndefOr[scala.Nothing]]): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setHotspotclick(value: HotspotEvent[hotspotclick]): Self = this.set("hotspotclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setHotspotout(value: HotspotEvent[hotspotout]): Self = this.set("hotspotout", value.asInstanceOf[js.Any])
    @scala.inline
    def setHotspotover(value: HotspotEvent[hotspotover]): Self = this.set("hotspotover", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapmove(value: Event_[mapmove, js.UndefOr[scala.Nothing]]): Self = this.set("mapmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousedown(value: MapsEvent[mousedown, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousemove(value: MapsEvent[mousemove, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseout(value: MapsEvent[mouseout, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseover(value: MapsEvent[mouseover, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseup(value: MapsEvent[mouseup, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousewheel(value: MapsEvent[mousewheel, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveend(value: Event_[moveend, js.UndefOr[scala.Nothing]]): Self = this.set("moveend", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovestart(value: Event_[movestart, js.UndefOr[scala.Nothing]]): Self = this.set("movestart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRdblclick(value: MapsEvent[rdblclick, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("rdblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setResize(value: Event_[resize, js.UndefOr[scala.Nothing]]): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightclick(value: MapsEvent[rightclick, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("rightclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: MapsEvent[touchend, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: MapsEvent[touchmove, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: MapsEvent[touchstart, typingsSlinky.amapJsApi.AMap.Map]): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomchange(value: Event_[zoomchange, js.UndefOr[scala.Nothing]]): Self = this.set("zoomchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomend(value: Event_[zoomend, js.UndefOr[scala.Nothing]]): Self = this.set("zoomend", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomstart(value: Event_[zoomstart, js.UndefOr[scala.Nothing]]): Self = this.set("zoomstart", value.asInstanceOf[js.Any])
  }
  
}

