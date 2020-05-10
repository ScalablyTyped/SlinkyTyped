package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLayerEventType extends js.Object {
  var click: MapLayerMouseEvent = js.native
  var contextmenu: MapLayerMouseEvent = js.native
  var dblclick: MapLayerMouseEvent = js.native
  var mousedown: MapLayerMouseEvent = js.native
  var mouseenter: MapLayerMouseEvent = js.native
  var mouseleave: MapLayerMouseEvent = js.native
  var mousemove: MapLayerMouseEvent = js.native
  var mouseout: MapLayerMouseEvent = js.native
  var mouseover: MapLayerMouseEvent = js.native
  var mouseup: MapLayerMouseEvent = js.native
  var touchcancel: MapLayerTouchEvent = js.native
  var touchend: MapLayerTouchEvent = js.native
  var touchstart: MapLayerTouchEvent = js.native
}

object MapLayerEventType {
  @scala.inline
  def apply(
    click: MapLayerMouseEvent,
    contextmenu: MapLayerMouseEvent,
    dblclick: MapLayerMouseEvent,
    mousedown: MapLayerMouseEvent,
    mouseenter: MapLayerMouseEvent,
    mouseleave: MapLayerMouseEvent,
    mousemove: MapLayerMouseEvent,
    mouseout: MapLayerMouseEvent,
    mouseover: MapLayerMouseEvent,
    mouseup: MapLayerMouseEvent,
    touchcancel: MapLayerTouchEvent,
    touchend: MapLayerTouchEvent,
    touchstart: MapLayerTouchEvent
  ): MapLayerEventType = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerEventType]
  }
  @scala.inline
  implicit class MapLayerEventTypeOps[Self <: MapLayerEventType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: MapLayerMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextmenu(value: MapLayerMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: MapLayerMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousedown(value: MapLayerMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseenter(value: MapLayerMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseleave(value: MapLayerMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousemove(value: MapLayerMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseout(value: MapLayerMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseover(value: MapLayerMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseup(value: MapLayerMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: MapLayerTouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: MapLayerTouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: MapLayerTouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

