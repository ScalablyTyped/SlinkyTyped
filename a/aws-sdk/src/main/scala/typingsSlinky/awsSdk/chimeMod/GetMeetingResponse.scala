package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMeetingResponse extends js.Object {
  /**
    * The Amazon Chime SDK meeting information.
    */
  var Meeting: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Meeting] = js.native
}

object GetMeetingResponse {
  @scala.inline
  def apply(): GetMeetingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMeetingResponse]
  }
  @scala.inline
  implicit class GetMeetingResponseOps[Self <: GetMeetingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeeting(value: Meeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Meeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Meeting")(js.undefined)
        ret
    }
  }
  
}

