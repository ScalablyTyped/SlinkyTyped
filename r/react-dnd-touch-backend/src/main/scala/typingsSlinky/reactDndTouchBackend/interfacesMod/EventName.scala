package typingsSlinky.reactDndTouchBackend.interfacesMod

import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.keydown
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.mousedown
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.mousemove
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.mouseup
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.touchend
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.touchmove
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventName extends js.Object {
  var contextmenu: js.UndefOr[typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu] = js.native
  var end: js.UndefOr[mouseup | touchend] = js.native
  var keydown: js.UndefOr[typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.keydown] = js.native
  var move: js.UndefOr[mousemove | touchmove] = js.native
  var start: js.UndefOr[mousedown | touchstart] = js.native
}

object EventName {
  @scala.inline
  def apply(): EventName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventName]
  }
  @scala.inline
  implicit class EventNameOps[Self <: EventName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextmenu(value: contextmenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: mouseup | touchend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withKeydown(value: keydown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: mousemove | touchmove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: mousedown | touchstart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

