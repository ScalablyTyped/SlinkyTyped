package typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccesspoliciesServiceperimetersList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Number of Service Perimeters to include in the list. Default 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Next page token for the next batch of Service Perimeter instances.
    * Defaults to the first page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. Resource name for the access policy to list Service Perimeters
    * from.  Format: `accessPolicies/{policy_id}`
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceAccesspoliciesServiceperimetersList {
  
  @scala.inline
  def apply(): ParamsResourceAccesspoliciesServiceperimetersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesServiceperimetersList]
  }
  
  @scala.inline
  implicit class ParamsResourceAccesspoliciesServiceperimetersListMutableBuilder[Self <: ParamsResourceAccesspoliciesServiceperimetersList] (val x: Self) extends AnyVal {
    
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
  }
}
