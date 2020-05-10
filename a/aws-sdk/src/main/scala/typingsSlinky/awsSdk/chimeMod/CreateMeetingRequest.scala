package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeetingRequest extends js.Object {
  /**
    * The unique identifier for the client request. Use a different token for different meetings.
    */
  var ClientRequestToken: typingsSlinky.awsSdk.chimeMod.ClientRequestToken = js.native
  /**
    * The Region in which to create the meeting. Available values: ap-northeast-1, ap-southeast-1, ap-southeast-2, ca-central-1, eu-central-1, eu-north-1, eu-west-1, eu-west-2, eu-west-3, sa-east-1, us-east-1, us-east-2, us-west-1, us-west-2.
    */
  var MediaRegion: js.UndefOr[String] = js.native
  /**
    * Reserved.
    */
  var MeetingHostId: js.UndefOr[ExternalUserIdType] = js.native
  /**
    * The configuration for resource targets to receive notifications when meeting and attendee events occur.
    */
  var NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration] = js.native
}

object CreateMeetingRequest {
  @scala.inline
  def apply(ClientRequestToken: ClientRequestToken): CreateMeetingRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingRequest]
  }
  @scala.inline
  implicit class CreateMeetingRequestOps[Self <: CreateMeetingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withMeetingHostId(value: ExternalUserIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingHostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeetingHostId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingHostId")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationsConfiguration(value: MeetingNotificationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationsConfiguration")(js.undefined)
        ret
    }
  }
  
}

