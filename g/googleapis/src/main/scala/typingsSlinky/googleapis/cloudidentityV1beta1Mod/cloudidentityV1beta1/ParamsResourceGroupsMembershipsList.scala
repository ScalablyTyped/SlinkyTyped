package typingsSlinky.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceGroupsMembershipsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The default page size is 200 (max 1000) for the BASIC view, and 50 (max
    * 500) for the FULL view.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token value returned from a previous list request, if any
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group to list Memberships within.  Format: `groups/{group_id}`, where
    * `group_id` is the unique id assigned to the Group.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Membership resource view to be returned. Defaults to
    * MembershipView.BASIC.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourceGroupsMembershipsList {
  
  @scala.inline
  def apply(): ParamsResourceGroupsMembershipsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsMembershipsList]
  }
  
  @scala.inline
  implicit class ParamsResourceGroupsMembershipsListMutableBuilder[Self <: ParamsResourceGroupsMembershipsList] (val x: Self) extends AnyVal {
    
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
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
