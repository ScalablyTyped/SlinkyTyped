package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeetingResponse extends js.Object {
  /**
    * The meeting information, including the meeting ID and MediaPlacement.
    */
  var Meeting: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Meeting] = js.native
}

object CreateMeetingResponse {
  @scala.inline
  def apply(): CreateMeetingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMeetingResponse]
  }
  @scala.inline
  implicit class CreateMeetingResponseOps[Self <: CreateMeetingResponse] (val x: Self) extends AnyVal {
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

