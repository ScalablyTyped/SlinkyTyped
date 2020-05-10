package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendUsersMessagesRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var SendUsersMessageRequest: typingsSlinky.awsSdk.pinpointMod.SendUsersMessageRequest = js.native
}

object SendUsersMessagesRequest {
  @scala.inline
  def apply(ApplicationId: string, SendUsersMessageRequest: SendUsersMessageRequest): SendUsersMessagesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendUsersMessageRequest = SendUsersMessageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessagesRequest]
  }
  @scala.inline
  implicit class SendUsersMessagesRequestOps[Self <: SendUsersMessagesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendUsersMessageRequest(value: SendUsersMessageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendUsersMessageRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

