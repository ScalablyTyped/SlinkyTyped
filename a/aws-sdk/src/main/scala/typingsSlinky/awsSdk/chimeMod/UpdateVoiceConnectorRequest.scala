package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVoiceConnectorRequest extends js.Object {
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: VoiceConnectorName = js.native
  /**
    * When enabled, requires encryption for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: Boolean = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object UpdateVoiceConnectorRequest {
  @scala.inline
  def apply(Name: VoiceConnectorName, RequireEncryption: Boolean, VoiceConnectorId: NonEmptyString): UpdateVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequireEncryption = RequireEncryption.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceConnectorRequest]
  }
  @scala.inline
  implicit class UpdateVoiceConnectorRequestOps[Self <: UpdateVoiceConnectorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: VoiceConnectorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoiceConnectorId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

