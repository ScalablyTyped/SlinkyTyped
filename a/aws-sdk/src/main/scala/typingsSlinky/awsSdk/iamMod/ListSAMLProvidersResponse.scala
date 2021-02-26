package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSAMLProvidersResponse extends StObject {
  
  /**
    * The list of SAML provider resource objects defined in IAM for this AWS account.
    */
  var SAMLProviderList: js.UndefOr[SAMLProviderListType] = js.native
}
object ListSAMLProvidersResponse {
  
  @scala.inline
  def apply(): ListSAMLProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSAMLProvidersResponse]
  }
  
  @scala.inline
  implicit class ListSAMLProvidersResponseMutableBuilder[Self <: ListSAMLProvidersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSAMLProviderList(value: SAMLProviderListType): Self = StObject.set(x, "SAMLProviderList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAMLProviderListUndefined: Self = StObject.set(x, "SAMLProviderList", js.undefined)
    
    @scala.inline
    def setSAMLProviderListVarargs(value: SAMLProviderListEntry*): Self = StObject.set(x, "SAMLProviderList", js.Array(value :_*))
  }
}
