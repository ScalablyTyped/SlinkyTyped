package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorEmergencyCallingConfigurationResponse extends StObject {
  
  /**
    * The emergency calling configuration details.
    */
  var EmergencyCallingConfiguration: js.UndefOr[typingsSlinky.awsSdk.chimeMod.EmergencyCallingConfiguration] = js.native
}
object GetVoiceConnectorEmergencyCallingConfigurationResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorEmergencyCallingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorEmergencyCallingConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorEmergencyCallingConfigurationResponseMutableBuilder[Self <: GetVoiceConnectorEmergencyCallingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmergencyCallingConfiguration(value: EmergencyCallingConfiguration): Self = StObject.set(x, "EmergencyCallingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmergencyCallingConfigurationUndefined: Self = StObject.set(x, "EmergencyCallingConfiguration", js.undefined)
  }
}
