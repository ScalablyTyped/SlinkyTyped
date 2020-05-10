package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSMessage extends js.Object {
  /**
    * The body of the SMS message.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * The SMS program name that you provided to AWS Support when you requested your dedicated number.
    */
  var Keyword: js.UndefOr[string] = js.native
  /**
    * The SMS message type. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message is not critical or time-sensitive, such as a marketing message.
    */
  var MessageType: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.MessageType] = js.native
  /**
    * The number to send the SMS message from. This value should be one of the dedicated long or short codes that's assigned to your AWS account. If you don't specify a long or short code, Amazon Pinpoint assigns a random long code to the SMS message and sends the message from that code.
    */
  var OriginationNumber: js.UndefOr[string] = js.native
  /**
    * The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs varies by country or region.
    */
  var SenderId: js.UndefOr[string] = js.native
  /**
    * The message variables to use in the SMS message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
}

object SMSMessage {
  @scala.inline
  def apply(): SMSMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSMessage]
  }
  @scala.inline
  implicit class SMSMessageOps[Self <: SMSMessage] (val x: Self) extends AnyVal {
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
    def withKeyword(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keyword")(js.undefined)
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
    def withOriginationNumber(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginationNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginationNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginationNumber")(js.undefined)
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
    @scala.inline
    def withSubstitutions(value: MapOfListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(js.undefined)
        ret
    }
  }
  
}

