package typingsSlinky.googleapis.resellerV1Mod.resellerV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceResellernotifyRegister extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The service account which will own the created Cloud-PubSub topic.
    */
  var serviceAccountEmailAddress: js.UndefOr[String] = js.native
}
object ParamsResourceResellernotifyRegister {
  
  @scala.inline
  def apply(): ParamsResourceResellernotifyRegister = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResellernotifyRegister]
  }
  
  @scala.inline
  implicit class ParamsResourceResellernotifyRegisterMutableBuilder[Self <: ParamsResourceResellernotifyRegister] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setServiceAccountEmailAddress(value: String): Self = StObject.set(x, "serviceAccountEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailAddressUndefined: Self = StObject.set(x, "serviceAccountEmailAddress", js.undefined)
  }
}
