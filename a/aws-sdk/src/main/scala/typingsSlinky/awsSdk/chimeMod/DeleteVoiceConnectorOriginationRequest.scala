package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVoiceConnectorOriginationRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object DeleteVoiceConnectorOriginationRequest {
  
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): DeleteVoiceConnectorOriginationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorOriginationRequest]
  }
  
  @scala.inline
  implicit class DeleteVoiceConnectorOriginationRequestMutableBuilder[Self <: DeleteVoiceConnectorOriginationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
