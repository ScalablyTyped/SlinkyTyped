package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceSpecificCredentialsRequest extends StObject {
  
  /**
    * Filters the returned results to only those for the specified AWS service. If not specified, then AWS returns service-specific credentials for all services.
    */
  var ServiceName: js.UndefOr[serviceName] = js.native
  
  /**
    * The name of the user whose service-specific credentials you want information about. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[userNameType] = js.native
}
object ListServiceSpecificCredentialsRequest {
  
  @scala.inline
  def apply(): ListServiceSpecificCredentialsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceSpecificCredentialsRequest]
  }
  
  @scala.inline
  implicit class ListServiceSpecificCredentialsRequestMutableBuilder[Self <: ListServiceSpecificCredentialsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceName(value: serviceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
