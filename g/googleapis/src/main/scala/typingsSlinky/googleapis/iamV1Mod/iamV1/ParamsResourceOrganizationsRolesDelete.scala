package typingsSlinky.googleapis.iamV1Mod.iamV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrganizationsRolesDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Used to perform a consistent read-modify-write.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the role in one of the following formats:
    * `organizations/{ORGANIZATION_ID}/roles/{ROLE_NAME}`
    * `projects/{PROJECT_ID}/roles/{ROLE_NAME}`
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceOrganizationsRolesDelete {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsRolesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsRolesDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsRolesDeleteMutableBuilder[Self <: ParamsResourceOrganizationsRolesDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
