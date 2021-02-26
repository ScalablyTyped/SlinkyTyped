package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Comma-separated list of schema names. All fields from these schemas are
    * fetched. This should only be set when projection=custom.
    */
  var customFieldMask: js.UndefOr[String] = js.native
  
  /**
    * What subset of fields to fetch for this user.
    */
  var projection: js.UndefOr[String] = js.native
  
  /**
    * Email or immutable ID of the user
    */
  var userKey: js.UndefOr[String] = js.native
  
  /**
    * Whether to fetch the ADMIN_VIEW or DOMAIN_PUBLIC view of the user.
    */
  var viewType: js.UndefOr[String] = js.native
}
object ParamsResourceUsersGet {
  
  @scala.inline
  def apply(): ParamsResourceUsersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersGet]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersGetMutableBuilder[Self <: ParamsResourceUsersGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomFieldMask(value: String): Self = StObject.set(x, "customFieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldMaskUndefined: Self = StObject.set(x, "customFieldMask", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
    
    @scala.inline
    def setViewType(value: String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
  }
}
