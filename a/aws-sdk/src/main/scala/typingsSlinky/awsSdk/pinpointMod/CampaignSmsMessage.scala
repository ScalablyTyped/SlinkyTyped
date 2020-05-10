package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignSmsMessage extends js.Object {
  /**
    * The body of the SMS message.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical or time-sensitive, such as a marketing message.
    */
  var MessageType: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.MessageType] = js.native
  /**
    * The sender ID to display on recipients' devices when they receive the SMS message.
    */
  var SenderId: js.UndefOr[string] = js.native
}

object CampaignSmsMessage {
  @scala.inline
  def apply(): CampaignSmsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignSmsMessage]
  }
  @scala.inline
  implicit class CampaignSmsMessageOps[Self <: CampaignSmsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageType(value: MessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageType")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderId")(js.undefined)
        ret
    }
  }
  
}

