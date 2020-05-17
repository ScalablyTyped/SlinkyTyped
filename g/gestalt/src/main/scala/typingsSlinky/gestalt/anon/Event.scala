package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]] = js.native
}

object Event {
  @scala.inline
  def apply(event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]]): Event = {
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
    def withEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

