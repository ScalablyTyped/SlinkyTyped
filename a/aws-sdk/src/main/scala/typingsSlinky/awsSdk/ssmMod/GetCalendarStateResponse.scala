package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCalendarStateResponse extends js.Object {
  /**
    * The time, as an ISO 8601 string, that you specified in your command. If you did not specify a time, GetCalendarState uses the current time.
    */
  var AtTime: js.UndefOr[ISO8601String] = js.native
  /**
    * The time, as an ISO 8601 string, that the calendar state will change. If the current calendar state is OPEN, NextTransitionTime indicates when the calendar state changes to CLOSED, and vice-versa.
    */
  var NextTransitionTime: js.UndefOr[ISO8601String] = js.native
  /**
    * The state of the calendar. An OPEN calendar indicates that actions are allowed to proceed, and a CLOSED calendar indicates that actions are not allowed to proceed.
    */
  var State: js.UndefOr[CalendarState] = js.native
}

object GetCalendarStateResponse {
  @scala.inline
  def apply(): GetCalendarStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCalendarStateResponse]
  }
  @scala.inline
  implicit class GetCalendarStateResponseOps[Self <: GetCalendarStateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withNextTransitionTime(value: ISO8601String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextTransitionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextTransitionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextTransitionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: CalendarState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

