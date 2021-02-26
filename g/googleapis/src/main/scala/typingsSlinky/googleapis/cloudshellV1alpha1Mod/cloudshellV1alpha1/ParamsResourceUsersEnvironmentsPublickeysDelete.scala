package typingsSlinky.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersEnvironmentsPublickeysDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name of the resource to be deleted, e.g.
    * `users/me/environments/default/publicKeys/my-key`.
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceUsersEnvironmentsPublickeysDelete {
  
  @scala.inline
  def apply(): ParamsResourceUsersEnvironmentsPublickeysDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersEnvironmentsPublickeysDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersEnvironmentsPublickeysDeleteMutableBuilder[Self <: ParamsResourceUsersEnvironmentsPublickeysDelete] (val x: Self) extends AnyVal {
    
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
