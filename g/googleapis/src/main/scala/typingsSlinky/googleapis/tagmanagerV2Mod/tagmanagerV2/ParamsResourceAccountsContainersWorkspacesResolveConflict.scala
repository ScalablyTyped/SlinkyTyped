package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsContainersWorkspacesResolveConflict extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * When provided, this fingerprint must match the fingerprint of the
    * entity_in_workspace in the merge conflict.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * GTM Workspace's API relative path. Example:
    * accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEntity] = js.native
}
object ParamsResourceAccountsContainersWorkspacesResolveConflict {
  
  @scala.inline
  def apply(): ParamsResourceAccountsContainersWorkspacesResolveConflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesResolveConflict]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsContainersWorkspacesResolveConflictMutableBuilder[Self <: ParamsResourceAccountsContainersWorkspacesResolveConflict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaEntity): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
