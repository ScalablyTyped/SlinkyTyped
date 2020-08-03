package typingsSlinky.rcTabs.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element]
  var key: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(event: SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element]): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setEventKeyboardEvent(value: SyntheticKeyboardEvent[Element]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventMouseEvent(value: SyntheticMouseEvent[Element]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

