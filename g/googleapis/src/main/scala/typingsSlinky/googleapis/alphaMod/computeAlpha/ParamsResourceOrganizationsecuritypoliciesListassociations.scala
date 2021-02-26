package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrganizationsecuritypoliciesListassociations extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The target resource to list associations. It is an organization, or a
    * folder.
    */
  var targetResource: js.UndefOr[String] = js.native
}
object ParamsResourceOrganizationsecuritypoliciesListassociations {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsecuritypoliciesListassociations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsecuritypoliciesListassociations]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsecuritypoliciesListassociationsMutableBuilder[Self <: ParamsResourceOrganizationsecuritypoliciesListassociations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setTargetResource(value: String): Self = StObject.set(x, "targetResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetResourceUndefined: Self = StObject.set(x, "targetResource", js.undefined)
  }
}
