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
trait ParamsResourceRolesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional limit on the number of roles to include in the response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional pagination token returned in an earlier ListRolesResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the parent resource in one of the following formats:
    * `` (empty string) -- this refers to curated roles.
    * `organizations/{ORGANIZATION_ID}` `projects/{PROJECT_ID}`
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Include Roles that have been deleted.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional view for the returned Role objects. When `FULL` is specified,
    * the `includedPermissions` field is returned, which includes a list of all
    * permissions in the role. The default value is `BASIC`, which does not
    * return the `includedPermissions` field.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourceRolesList {
  
  @scala.inline
  def apply(): ParamsResourceRolesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRolesList]
  }
  
  @scala.inline
  implicit class ParamsResourceRolesListMutableBuilder[Self <: ParamsResourceRolesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
