package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetServiceSpecificCredentialResponse extends StObject {
  
  /**
    * A structure with details about the updated service-specific credential, including the new password.  This is the only time that you can access the password. You cannot recover the password later, but you can reset it again. 
    */
  var ServiceSpecificCredential: js.UndefOr[typingsSlinky.awsSdk.iamMod.ServiceSpecificCredential] = js.native
}
object ResetServiceSpecificCredentialResponse {
  
  @scala.inline
  def apply(): ResetServiceSpecificCredentialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetServiceSpecificCredentialResponse]
  }
  
  @scala.inline
  implicit class ResetServiceSpecificCredentialResponseMutableBuilder[Self <: ResetServiceSpecificCredentialResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceSpecificCredential(value: ServiceSpecificCredential): Self = StObject.set(x, "ServiceSpecificCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceSpecificCredentialUndefined: Self = StObject.set(x, "ServiceSpecificCredential", js.undefined)
  }
}
