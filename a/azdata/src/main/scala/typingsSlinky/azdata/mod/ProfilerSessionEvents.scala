package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilerSessionEvents extends js.Object {
  var events: js.Array[ProfilerEvent] = js.native
  var eventsLost: Boolean = js.native
  var sessionId: String = js.native
}

object ProfilerSessionEvents {
  @scala.inline
  def apply(events: js.Array[ProfilerEvent], eventsLost: Boolean, sessionId: String): ProfilerSessionEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], eventsLost = eventsLost.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionEvents]
  }
  @scala.inline
  implicit class ProfilerSessionEventsOps[Self <: ProfilerSessionEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[ProfilerEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsLost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

