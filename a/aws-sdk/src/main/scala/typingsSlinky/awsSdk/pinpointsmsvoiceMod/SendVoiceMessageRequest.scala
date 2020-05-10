package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendVoiceMessageRequest extends js.Object {
  /**
    * The phone number that appears on recipients' devices when they receive the message.
    */
  var CallerId: js.UndefOr[String] = js.native
  /**
    * The name of the configuration set that you want to use to send the message.
    */
  var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.native
  var Content: js.UndefOr[VoiceMessageContent] = js.native
  /**
    * The phone number that you want to send the voice message to.
    */
  var DestinationPhoneNumber: js.UndefOr[NonEmptyString] = js.native
  /**
    * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone number that appears on recipients' devices when they receive the message, because you can specify a CallerId parameter in the request.
    */
  var OriginationPhoneNumber: js.UndefOr[NonEmptyString] = js.native
}

object SendVoiceMessageRequest {
  @scala.inline
  def apply(): SendVoiceMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVoiceMessageRequest]
  }
  @scala.inline
  implicit class SendVoiceMessageRequestOps[Self <: SendVoiceMessageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationSetName(value: WordCharactersWithDelimiters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: VoiceMessageContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationPhoneNumber(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginationPhoneNumber(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginationPhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginationPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginationPhoneNumber")(js.undefined)
        ret
    }
  }
  
}

