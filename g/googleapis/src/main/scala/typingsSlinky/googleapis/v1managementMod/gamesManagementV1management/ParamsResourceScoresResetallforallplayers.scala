package typingsSlinky.googleapis.v1managementMod.gamesManagementV1management

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceScoresResetallforallplayers extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
}
object ParamsResourceScoresResetallforallplayers {
  
  @scala.inline
  def apply(): ParamsResourceScoresResetallforallplayers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceScoresResetallforallplayers]
  }
  
  @scala.inline
  implicit class ParamsResourceScoresResetallforallplayersMutableBuilder[Self <: ParamsResourceScoresResetallforallplayers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
