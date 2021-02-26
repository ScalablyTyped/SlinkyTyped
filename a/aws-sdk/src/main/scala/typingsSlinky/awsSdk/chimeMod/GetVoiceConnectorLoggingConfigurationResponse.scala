package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorLoggingConfigurationResponse extends StObject {
  
  /**
    * The logging configuration details.
    */
  var LoggingConfiguration: js.UndefOr[typingsSlinky.awsSdk.chimeMod.LoggingConfiguration] = js.native
}
object GetVoiceConnectorLoggingConfigurationResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorLoggingConfigurationResponseMutableBuilder[Self <: GetVoiceConnectorLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
  }
}
