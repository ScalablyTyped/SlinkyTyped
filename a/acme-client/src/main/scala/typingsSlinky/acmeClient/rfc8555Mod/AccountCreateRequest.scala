package typingsSlinky.acmeClient.rfc8555Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountCreateRequest extends StObject {
  
  var contact: js.UndefOr[js.Array[String]] = js.native
  
  var externalAccountBinding: js.UndefOr[js.Object] = js.native
  
  var onlyReturnExisting: js.UndefOr[Boolean] = js.native
  
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
}
object AccountCreateRequest {
  
  @scala.inline
  def apply(): AccountCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCreateRequest]
  }
  
  @scala.inline
  implicit class AccountCreateRequestMutableBuilder[Self <: AccountCreateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: js.Array[String]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: String*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setExternalAccountBinding(value: js.Object): Self = StObject.set(x, "externalAccountBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalAccountBindingUndefined: Self = StObject.set(x, "externalAccountBinding", js.undefined)
    
    @scala.inline
    def setOnlyReturnExisting(value: Boolean): Self = StObject.set(x, "onlyReturnExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyReturnExistingUndefined: Self = StObject.set(x, "onlyReturnExisting", js.undefined)
    
    @scala.inline
    def setTermsOfServiceAgreed(value: Boolean): Self = StObject.set(x, "termsOfServiceAgreed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsOfServiceAgreedUndefined: Self = StObject.set(x, "termsOfServiceAgreed", js.undefined)
  }
}
