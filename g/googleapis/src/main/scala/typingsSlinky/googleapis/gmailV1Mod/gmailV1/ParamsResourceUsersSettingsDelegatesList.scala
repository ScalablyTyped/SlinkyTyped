package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersSettingsDelegatesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * User's email address. The special value "me" can be used to indicate the
    * authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceUsersSettingsDelegatesList {
  
  @scala.inline
  def apply(): ParamsResourceUsersSettingsDelegatesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsDelegatesList]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersSettingsDelegatesListMutableBuilder[Self <: ParamsResourceUsersSettingsDelegatesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
