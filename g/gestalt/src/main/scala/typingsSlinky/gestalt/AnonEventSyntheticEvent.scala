package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEventSyntheticEvent extends js.Object {
  var event: SyntheticEvent[Event_, SyntheticMouseEvent[HTMLDivElement]] = js.native
}

object AnonEventSyntheticEvent {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, SyntheticMouseEvent[HTMLDivElement]]): AnonEventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventSyntheticEvent]
  }
  @scala.inline
  implicit class AnonEventSyntheticEventOps[Self <: AnonEventSyntheticEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: SyntheticEvent[Event_, SyntheticMouseEvent[HTMLDivElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

