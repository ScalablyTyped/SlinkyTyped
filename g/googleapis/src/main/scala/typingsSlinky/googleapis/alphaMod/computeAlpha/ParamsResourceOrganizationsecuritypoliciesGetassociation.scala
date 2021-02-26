package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrganizationsecuritypoliciesGetassociation extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The name of the association to get from the security policy.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Name of the security policy to which the queried rule belongs.
    */
  var securityPolicy: js.UndefOr[String] = js.native
}
object ParamsResourceOrganizationsecuritypoliciesGetassociation {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsecuritypoliciesGetassociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsecuritypoliciesGetassociation]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsecuritypoliciesGetassociationMutableBuilder[Self <: ParamsResourceOrganizationsecuritypoliciesGetassociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
  }
}
