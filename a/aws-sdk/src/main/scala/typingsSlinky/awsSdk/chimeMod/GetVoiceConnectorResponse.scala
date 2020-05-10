package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorResponse extends js.Object {
  /**
    * The Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typingsSlinky.awsSdk.chimeMod.VoiceConnector] = js.native
}

object GetVoiceConnectorResponse {
  @scala.inline
  def apply(): GetVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorResponse]
  }
  @scala.inline
  implicit class GetVoiceConnectorResponseOps[Self <: GetVoiceConnectorResponse] (val x: Self) extends AnyVal {
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

