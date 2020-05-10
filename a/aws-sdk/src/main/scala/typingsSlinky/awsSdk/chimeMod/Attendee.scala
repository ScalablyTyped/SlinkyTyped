package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attendee extends js.Object {
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: js.UndefOr[GuidString] = js.native
  /**
    * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: js.UndefOr[ExternalUserIdType] = js.native
  /**
    * The join token used by the Amazon Chime SDK attendee.
    */
  var JoinToken: js.UndefOr[JoinTokenString] = js.native
}

object Attendee {
  @scala.inline
  def apply(): Attendee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attendee]
  }
  @scala.inline
  implicit class AttendeeOps[Self <: Attendee] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttendeeId(value: GuidString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttendeeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttendeeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttendeeId")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalUserId(value: ExternalUserIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinToken(value: JoinTokenString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JoinToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JoinToken")(js.undefined)
        ret
    }
  }
  
}

