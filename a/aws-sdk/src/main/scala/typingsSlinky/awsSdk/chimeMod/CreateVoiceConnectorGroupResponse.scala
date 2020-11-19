package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVoiceConnectorGroup(value: VoiceConnectorGroup): Self = this.set("VoiceConnectorGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceConnectorGroup: Self = this.set("VoiceConnectorGroup", js.undefined)
  }
}
