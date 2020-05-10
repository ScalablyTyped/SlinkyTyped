package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateAttendeeResponse extends js.Object {
  /**
    * The attendee information, including attendees IDs and join tokens.
    */
  var Attendees: js.UndefOr[AttendeeList] = js.native
  /**
    * If the action fails for one or more of the attendees in the request, a list of the attendees is returned, along with error codes and error messages.
    */
  var Errors: js.UndefOr[BatchCreateAttendeeErrorList] = js.native
}

object BatchCreateAttendeeResponse {
  @scala.inline
  def apply(): BatchCreateAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateAttendeeResponse]
  }
  @scala.inline
  implicit class BatchCreateAttendeeResponseOps[Self <: BatchCreateAttendeeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttendees(value: AttendeeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attendees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttendees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attendees")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: BatchCreateAttendeeErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(js.undefined)
        ret
    }
  }
  
}

