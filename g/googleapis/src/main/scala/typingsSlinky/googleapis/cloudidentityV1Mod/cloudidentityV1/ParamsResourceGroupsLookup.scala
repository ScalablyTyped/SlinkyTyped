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
trait ParamsResourceGroupsLookup extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the entity within the given namespace. The ID must be unique
    * within its namespace.
    */
  @JSName("groupKey.id")
  var groupKeyDotid: js.UndefOr[String] = js.native
  
  /**
    * Namespaces provide isolation for IDs, so an ID only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `"identitysources/{identity_source_id}"` is created corresponding to
    * every Identity Source `identity_source_id`.
    */
  @JSName("groupKey.namespace")
  var groupKeyDotnamespace: js.UndefOr[String] = js.native
}
object ParamsResourceGroupsLookup {
  
  @scala.inline
  def apply(): ParamsResourceGroupsLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsLookup]
  }
  
  @scala.inline
  implicit class ParamsResourceGroupsLookupMutableBuilder[Self <: ParamsResourceGroupsLookup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setGroupKeyDotid(value: String): Self = StObject.set(x, "groupKey.id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKeyDotidUndefined: Self = StObject.set(x, "groupKey.id", js.undefined)
    
    @scala.inline
    def setGroupKeyDotnamespace(value: String): Self = StObject.set(x, "groupKey.namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKeyDotnamespaceUndefined: Self = StObject.set(x, "groupKey.namespace", js.undefined)
  }
}
