package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVoiceConnectorResponse extends js.Object {
  /**
    * The updated Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typingsSlinky.awsSdk.chimeMod.VoiceConnector] = js.native
}

object UpdateVoiceConnectorResponse {
  @scala.inline
  def apply(): UpdateVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVoiceConnectorResponse]
  }
  @scala.inline
  implicit class UpdateVoiceConnectorResponseOps[Self <: UpdateVoiceConnectorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoiceConnector(value: VoiceConnector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnector")(js.undefined)
        ret
    }
  }
  
}

