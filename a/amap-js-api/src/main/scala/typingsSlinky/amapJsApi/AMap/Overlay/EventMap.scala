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

@js.native
trait EventMap[I] extends js.Object {
  var click: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.click, I] = js.native
  var dblclick: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.dblclick, I] = js.native
  var mousedown: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mousedown, I] = js.native
  var mousemove: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mousemove, I] = js.native
  var mouseover: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseover, I] = js.native
  var mouseup: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.mouseup, I] = js.native
  var rightclick: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.rightclick, I] = js.native
  var touchend: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchend, I] = js.native
  var touchmove: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchmove, I] = js.native
  var touchstart: MapsEvent[typingsSlinky.amapJsApi.amapJsApiStrings.touchstart, I] = js.native
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
  @scala.inline
  implicit class EventMapOps[Self[i] <: EventMap[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withClick(value: MapsEvent[click, I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: MapsEvent[dblclick, I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousedown(value: MapsEvent[mousedown, I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousemove(value: MapsEvent[mousemove, I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseover(value: MapsEvent[mouseover, I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseup(value: MapsEvent[mouseup, I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightclick(value: MapsEvent[rightclick, I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: MapsEvent[touchend, I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: MapsEvent[touchmove, I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: MapsEvent[touchstart, I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

