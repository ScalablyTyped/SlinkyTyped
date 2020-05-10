package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapEventType extends js.Object {
  var boxzoomcancel: MapBoxZoomEvent = js.native
  var boxzoomend: MapBoxZoomEvent = js.native
  var boxzoomstart: MapBoxZoomEvent = js.native
  var click: MapMouseEvent = js.native
  var contextmenu: MapMouseEvent = js.native
  var data: MapDataEvent = js.native
  var dataloading: MapDataEvent = js.native
  var dblclick: MapMouseEvent = js.native
  var drag: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var dragend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var dragstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var error: ErrorEvent = js.native
  var load: MapboxEvent[js.UndefOr[scala.Nothing]] = js.native
  var mousedown: MapMouseEvent = js.native
  var mousemove: MapMouseEvent = js.native
  var mouseout: MapMouseEvent = js.native
  var mouseover: MapMouseEvent = js.native
  var mouseup: MapMouseEvent = js.native
  var move: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
  var moveend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
  var movestart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
  var pitch: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var pitchend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var pitchstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var remove: MapboxEvent[js.UndefOr[scala.Nothing]] = js.native
  var render: MapboxEvent[js.UndefOr[scala.Nothing]] = js.native
  var resize: MapboxEvent[js.UndefOr[scala.Nothing]] = js.native
  var rotate: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var rotateend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var rotatestart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var sourcedata: MapSourceDataEvent = js.native
  var sourcedataloading: MapSourceDataEvent = js.native
  var styledata: MapStyleDataEvent = js.native
  var styledataloading: MapStyleDataEvent = js.native
  var tiledataloading: MapDataEvent = js.native
  var touchcancel: MapTouchEvent = js.native
  var touchend: MapTouchEvent = js.native
  var touchmove: MapTouchEvent = js.native
  var touchstart: MapTouchEvent = js.native
  var webglcontextlost: MapContextEvent = js.native
  var webglcontextrestored: MapContextEvent = js.native
  var wheel: MapWheelEvent = js.native
  var zoom: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
  var zoomend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
  var zoomstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
}

object MapEventType {
  @scala.inline
  def apply(
    boxzoomcancel: MapBoxZoomEvent,
    boxzoomend: MapBoxZoomEvent,
    boxzoomstart: MapBoxZoomEvent,
    click: MapMouseEvent,
    contextmenu: MapMouseEvent,
    data: MapDataEvent,
    dataloading: MapDataEvent,
    dblclick: MapMouseEvent,
    drag: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    dragend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    dragstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    error: ErrorEvent,
    load: MapboxEvent[js.UndefOr[scala.Nothing]],
    mousedown: MapMouseEvent,
    mousemove: MapMouseEvent,
    mouseout: MapMouseEvent,
    mouseover: MapMouseEvent,
    mouseup: MapMouseEvent,
    move: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    moveend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    movestart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    pitch: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    pitchend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    pitchstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    remove: MapboxEvent[js.UndefOr[scala.Nothing]],
    render: MapboxEvent[js.UndefOr[scala.Nothing]],
    resize: MapboxEvent[js.UndefOr[scala.Nothing]],
    rotate: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    rotateend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    rotatestart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    sourcedata: MapSourceDataEvent,
    sourcedataloading: MapSourceDataEvent,
    styledata: MapStyleDataEvent,
    styledataloading: MapStyleDataEvent,
    tiledataloading: MapDataEvent,
    touchcancel: MapTouchEvent,
    touchend: MapTouchEvent,
    touchmove: MapTouchEvent,
    touchstart: MapTouchEvent,
    webglcontextlost: MapContextEvent,
    webglcontextrestored: MapContextEvent,
    wheel: MapWheelEvent,
    zoom: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    zoomend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    zoomstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  ): MapEventType = {
    val __obj = js.Dynamic.literal(boxzoomcancel = boxzoomcancel.asInstanceOf[js.Any], boxzoomend = boxzoomend.asInstanceOf[js.Any], boxzoomstart = boxzoomstart.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataloading = dataloading.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], movestart = movestart.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], pitchend = pitchend.asInstanceOf[js.Any], pitchstart = pitchstart.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], rotateend = rotateend.asInstanceOf[js.Any], rotatestart = rotatestart.asInstanceOf[js.Any], sourcedata = sourcedata.asInstanceOf[js.Any], sourcedataloading = sourcedataloading.asInstanceOf[js.Any], styledata = styledata.asInstanceOf[js.Any], styledataloading = styledataloading.asInstanceOf[js.Any], tiledataloading = tiledataloading.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], webglcontextlost = webglcontextlost.asInstanceOf[js.Any], webglcontextrestored = webglcontextrestored.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomend = zoomend.asInstanceOf[js.Any], zoomstart = zoomstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEventType]
  }
  @scala.inline
  implicit class MapEventTypeOps[Self <: MapEventType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxzoomcancel(value: MapBoxZoomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxzoomcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoxzoomend(value: MapBoxZoomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxzoomend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoxzoomstart(value: MapBoxZoomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxzoomstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: MapMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextmenu(value: MapMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: MapDataEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataloading(value: MapDataEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataloading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: MapMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrag(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragend(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragstart(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: MapboxEvent[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousedown(value: MapMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousemove(value: MapMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseout(value: MapMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseover(value: MapMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseup(value: MapMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveend(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMovestart(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPitch(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPitchend(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPitchstart(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: MapboxEvent[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: MapboxEvent[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: MapboxEvent[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateend(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotatestart(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourcedata(value: MapSourceDataEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcedata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourcedataloading(value: MapSourceDataEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcedataloading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyledata(value: MapStyleDataEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styledata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyledataloading(value: MapStyleDataEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styledataloading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiledataloading(value: MapDataEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiledataloading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: MapTouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: MapTouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: MapTouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: MapTouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebglcontextlost(value: MapContextEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webglcontextlost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebglcontextrestored(value: MapContextEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webglcontextrestored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWheel(value: MapWheelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomend(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomstart(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomstart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

