package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSipMediaApplicationLoggingConfigurationResponse extends StObject {
  
  /**
    * The actual logging configuration.
    */
  var SipMediaApplicationLoggingConfiguration: js.UndefOr[typingsSlinky.awsSdk.chimeMod.SipMediaApplicationLoggingConfiguration] = js.native
}
object GetSipMediaApplicationLoggingConfigurationResponse {
  
  @scala.inline
  def apply(): GetSipMediaApplicationLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSipMediaApplicationLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetSipMediaApplicationLoggingConfigurationResponseMutableBuilder[Self <: GetSipMediaApplicationLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipMediaApplicationLoggingConfiguration(value: SipMediaApplicationLoggingConfiguration): Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationLoggingConfigurationUndefined: Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", js.undefined)
  }
}
