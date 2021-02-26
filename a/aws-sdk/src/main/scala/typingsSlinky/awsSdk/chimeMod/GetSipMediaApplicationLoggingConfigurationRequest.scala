package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSipMediaApplicationLoggingConfigurationRequest extends StObject {
  
  /**
    * The ID of the SIP media application.
    */
  var SipMediaApplicationId: NonEmptyString = js.native
}
object GetSipMediaApplicationLoggingConfigurationRequest {
  
  @scala.inline
  def apply(SipMediaApplicationId: NonEmptyString): GetSipMediaApplicationLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSipMediaApplicationLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetSipMediaApplicationLoggingConfigurationRequestMutableBuilder[Self <: GetSipMediaApplicationLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
  }
}
