package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVoiceConnector(value: VoiceConnector): Self = this.set("VoiceConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceConnector: Self = this.set("VoiceConnector", js.undefined)
  }
}
