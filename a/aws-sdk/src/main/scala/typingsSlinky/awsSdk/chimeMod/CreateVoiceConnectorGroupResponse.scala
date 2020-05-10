package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVoiceConnectorGroupResponse extends js.Object {
  /**
    * The Amazon Chime Voice Connector group details.
    */
  var VoiceConnectorGroup: js.UndefOr[typingsSlinky.awsSdk.chimeMod.VoiceConnectorGroup] = js.native
}

object CreateVoiceConnectorGroupResponse {
  @scala.inline
  def apply(): CreateVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVoiceConnectorGroupResponse]
  }
  @scala.inline
  implicit class CreateVoiceConnectorGroupResponseOps[Self <: CreateVoiceConnectorGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoiceConnectorGroup(value: VoiceConnectorGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceConnectorGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorGroup")(js.undefined)
        ret
    }
  }
  
}

