package typingsSlinky.rcMenu.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomEvent extends js.Object {
  var domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement] = js.native
  var key: typingsSlinky.react.mod.Key = js.native
}

object DomEvent {
  @scala.inline
  def apply(
    domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement],
    key: typingsSlinky.react.mod.Key
  ): DomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent]
  }
  @scala.inline
  implicit class DomEventOps[Self <: DomEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomEventKeyboardEvent(value: SyntheticKeyboardEvent[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomEventMouseEvent(value: SyntheticMouseEvent[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomEvent(value: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: typingsSlinky.react.mod.Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

