package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlDeleteCalendarEvent extends Generic {
  var calendar_id: String = js.native
  var event_id: String = js.native
}

object MlDeleteCalendarEvent {
  @scala.inline
  def apply(calendar_id: String, event_id: String): MlDeleteCalendarEvent = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteCalendarEvent]
  }
  @scala.inline
  implicit class MlDeleteCalendarEventOps[Self <: MlDeleteCalendarEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

