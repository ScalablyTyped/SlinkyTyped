package typingsSlinky.googleapis.cloudidentityV1Mod.cloudidentityV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceGroupsMembershipsLookup extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the entity within the given namespace. The ID must be unique
    * within its namespace.
    */
  @JSName("memberKey.id")
  var memberKeyDotid: js.UndefOr[String] = js.native
  
  /**
    * Namespaces provide isolation for IDs, so an ID only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `"identitysources/{identity_source_id}"` is created corresponding to
    * every Identity Source `identity_source_id`.
    */
  @JSName("memberKey.namespace")
  var memberKeyDotnamespace: js.UndefOr[String] = js.native
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group to lookup Membership within.  Format: `groups/{group_id}`,
    * where `group_id` is the unique ID assigned to the Group.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceGroupsMembershipsLookup {
  
  @scala.inline
  def apply(): ParamsResourceGroupsMembershipsLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsMembershipsLookup]
  }
  
  @scala.inline
  implicit class ParamsResourceGroupsMembershipsLookupMutableBuilder[Self <: ParamsResourceGroupsMembershipsLookup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMemberKeyDotid(value: String): Self = StObject.set(x, "memberKey.id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberKeyDotidUndefined: Self = StObject.set(x, "memberKey.id", js.undefined)
    
    @scala.inline
    def setMemberKeyDotnamespace(value: String): Self = StObject.set(x, "memberKey.namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberKeyDotnamespaceUndefined: Self = StObject.set(x, "memberKey.namespace", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
