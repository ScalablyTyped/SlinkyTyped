package typingsSlinky.googleapis.v1alphaMod.appengineV1alpha

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAppsAuthorizeddomainsList extends StandardParameters {
  
  /**
    * Part of `parent`. Name of the parent Application resource. Example:
    * apps/myapp.
    */
  var appsId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Maximum results to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceAppsAuthorizeddomainsList {
  
  @scala.inline
  def apply(): ParamsResourceAppsAuthorizeddomainsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsAuthorizeddomainsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsAuthorizeddomainsListMutableBuilder[Self <: ParamsResourceAppsAuthorizeddomainsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
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
  }
}
