package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorResponse extends StObject {
  
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
  implicit class GetVoiceConnectorResponseMutableBuilder[Self <: GetVoiceConnectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnector(value: VoiceConnector): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
