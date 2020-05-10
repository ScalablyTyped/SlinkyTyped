package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociatePhoneNumbersFromVoiceConnectorRequest extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object DisassociatePhoneNumbersFromVoiceConnectorRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): DisassociatePhoneNumbersFromVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorRequest]
  }
  @scala.inline
  implicit class DisassociatePhoneNumbersFromVoiceConnectorRequestOps[Self <: DisassociatePhoneNumbersFromVoiceConnectorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoiceConnectorId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE164PhoneNumbers(value: E164PhoneNumberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E164PhoneNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE164PhoneNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E164PhoneNumbers")(js.undefined)
        ret
    }
  }
  
}

