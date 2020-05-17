package typingsSlinky.mendixmodelsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventId extends js.Object {
  var eventId: Double = js.native
  var problems: js.Array[_] = js.native
}

object EventId {
  @scala.inline
  def apply(eventId: Double, problems: js.Array[_]): EventId = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], problems = problems.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventId]
  }
  @scala.inline
  implicit class EventIdOps[Self <: EventId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProblems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("problems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

