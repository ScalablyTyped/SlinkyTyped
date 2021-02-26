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
trait ParamsResourceGroupsMembershipsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership to be retrieved.  Format:
    * `groups/{group_id}/memberships/{member_id}`, where `group_id` is the
    * unique id assigned to the Group to which Membership belongs to, and
    * `member_id` is the unique id assigned to the member.
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceGroupsMembershipsGet {
  
  @scala.inline
  def apply(): ParamsResourceGroupsMembershipsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsMembershipsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceGroupsMembershipsGetMutableBuilder[Self <: ParamsResourceGroupsMembershipsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
