package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.eventMod.Event
import typingsSlinky.firebaseDatabase.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEvents extends js.Object {
  var events: js.Array[Event] = js.native
  var removed: js.Array[Query] = js.native
}

object AnonEvents {
  @scala.inline
  def apply(events: js.Array[Event], removed: js.Array[Query]): AnonEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvents]
  }
  @scala.inline
  implicit class AnonEventsOps[Self <: AnonEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[Query]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

