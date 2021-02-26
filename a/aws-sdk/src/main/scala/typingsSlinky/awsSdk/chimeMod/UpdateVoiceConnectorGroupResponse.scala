package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVoiceConnectorGroupResponse extends StObject {
  
  /**
    * The updated Amazon Chime Voice Connector group details.
    */
  var VoiceConnectorGroup: js.UndefOr[typingsSlinky.awsSdk.chimeMod.VoiceConnectorGroup] = js.native
}
object UpdateVoiceConnectorGroupResponse {
  
  @scala.inline
  def apply(): UpdateVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVoiceConnectorGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateVoiceConnectorGroupResponseMutableBuilder[Self <: UpdateVoiceConnectorGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorGroup(value: VoiceConnectorGroup): Self = StObject.set(x, "VoiceConnectorGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorGroupUndefined: Self = StObject.set(x, "VoiceConnectorGroup", js.undefined)
  }
}
