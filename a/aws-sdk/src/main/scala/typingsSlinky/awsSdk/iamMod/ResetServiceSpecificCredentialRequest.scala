package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetServiceSpecificCredentialRequest extends StObject {
  
  /**
    * The unique identifier of the service-specific credential. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId = js.native
  
  /**
    * The name of the IAM user associated with the service-specific credential. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[userNameType] = js.native
}
object ResetServiceSpecificCredentialRequest {
  
  @scala.inline
  def apply(ServiceSpecificCredentialId: serviceSpecificCredentialId): ResetServiceSpecificCredentialRequest = {
    val __obj = js.Dynamic.literal(ServiceSpecificCredentialId = ServiceSpecificCredentialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetServiceSpecificCredentialRequest]
  }
  
  @scala.inline
  implicit class ResetServiceSpecificCredentialRequestMutableBuilder[Self <: ResetServiceSpecificCredentialRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceSpecificCredentialId(value: serviceSpecificCredentialId): Self = StObject.set(x, "ServiceSpecificCredentialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
