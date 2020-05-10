package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCalendarStateRequest extends js.Object {
  /**
    * (Optional) The specific time for which you want to get calendar state information, in ISO 8601 format. If you do not add AtTime, the current time is assumed.
    */
  var AtTime: js.UndefOr[ISO8601String] = js.native
  /**
    * The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.
    */
  var CalendarNames: CalendarNameOrARNList = js.native
}

object GetCalendarStateRequest {
  @scala.inline
  def apply(CalendarNames: CalendarNameOrARNList): GetCalendarStateRequest = {
    val __obj = js.Dynamic.literal(CalendarNames = CalendarNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCalendarStateRequest]
  }
  @scala.inline
  implicit class GetCalendarStateRequestOps[Self <: GetCalendarStateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarNames(value: CalendarNameOrARNList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalendarNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtTime(value: ISO8601String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtTime")(js.undefined)
        ret
    }
  }
  
}

