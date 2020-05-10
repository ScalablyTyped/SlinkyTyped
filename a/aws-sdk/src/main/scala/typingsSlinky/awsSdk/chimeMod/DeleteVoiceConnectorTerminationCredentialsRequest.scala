package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVoiceConnectorTerminationCredentialsRequest extends js.Object {
  /**
    * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
    */
  var Usernames: js.UndefOr[SensitiveStringList] = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object DeleteVoiceConnectorTerminationCredentialsRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): DeleteVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorTerminationCredentialsRequest]
  }
  @scala.inline
  implicit class DeleteVoiceConnectorTerminationCredentialsRequestOps[Self <: DeleteVoiceConnectorTerminationCredentialsRequest] (val x: Self) extends AnyVal {
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
    def withUsernames(value: SensitiveStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Usernames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Usernames")(js.undefined)
        ret
    }
  }
  
}

