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
trait ParamsResourceGroupsAliasesDelete extends StandardParameters {
  
  /**
    * The alias to be removed
    */
  var alias: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Email or immutable ID of the group
    */
  var groupKey: js.UndefOr[String] = js.native
}
object ParamsResourceGroupsAliasesDelete {
  
  @scala.inline
  def apply(): ParamsResourceGroupsAliasesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsAliasesDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceGroupsAliasesDeleteMutableBuilder[Self <: ParamsResourceGroupsAliasesDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
  }
}
