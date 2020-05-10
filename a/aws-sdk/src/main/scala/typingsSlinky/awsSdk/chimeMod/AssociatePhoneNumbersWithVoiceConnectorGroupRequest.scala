package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatePhoneNumbersWithVoiceConnectorGroupRequest extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.native
  /**
    * If true, associates the provided phone numbers with the provided Amazon Chime Voice Connector Group and removes any previously existing associations. If false, does not associate any phone numbers that have previously existing associations.
    */
  var ForceAssociate: js.UndefOr[NullableBoolean] = js.native
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
}

object AssociatePhoneNumbersWithVoiceConnectorGroupRequest {
  @scala.inline
  def apply(VoiceConnectorGroupId: NonEmptyString): AssociatePhoneNumbersWithVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorGroupRequest]
  }
  @scala.inline
  implicit class AssociatePhoneNumbersWithVoiceConnectorGroupRequestOps[Self <: AssociatePhoneNumbersWithVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withForceAssociate(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceAssociate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceAssociate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceAssociate")(js.undefined)
        ret
    }
  }
  
}

