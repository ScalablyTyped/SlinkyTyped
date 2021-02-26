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
trait ParamsResourceUsersUpdate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUser] = js.native
  
  /**
    * Email or immutable ID of the user. If ID, it should match with id of user
    * object
    */
  var userKey: js.UndefOr[String] = js.native
}
object ParamsResourceUsersUpdate {
  
  @scala.inline
  def apply(): ParamsResourceUsersUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersUpdateMutableBuilder[Self <: ParamsResourceUsersUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaUser): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
