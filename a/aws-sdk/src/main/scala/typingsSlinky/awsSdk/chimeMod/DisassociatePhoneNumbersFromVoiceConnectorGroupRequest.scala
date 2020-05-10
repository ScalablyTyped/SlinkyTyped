package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociatePhoneNumbersFromVoiceConnectorGroupRequest extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.native
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
}

object DisassociatePhoneNumbersFromVoiceConnectorGroupRequest {
  @scala.inline
  def apply(VoiceConnectorGroupId: NonEmptyString): DisassociatePhoneNumbersFromVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorGroupRequest]
  }
  @scala.inline
  implicit class DisassociatePhoneNumbersFromVoiceConnectorGroupRequestOps[Self <: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoiceConnectorGroupId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorGroupId")(value.asInstanceOf[js.Any])
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

