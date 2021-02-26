package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceApplicationsPlayed extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Override used only by built-in games in Play Games application.
    */
  var builtinGameId: js.UndefOr[String] = js.native
}
object ParamsResourceApplicationsPlayed {
  
  @scala.inline
  def apply(): ParamsResourceApplicationsPlayed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceApplicationsPlayed]
  }
  
  @scala.inline
  implicit class ParamsResourceApplicationsPlayedMutableBuilder[Self <: ParamsResourceApplicationsPlayed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBuiltinGameId(value: String): Self = StObject.set(x, "builtinGameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltinGameIdUndefined: Self = StObject.set(x, "builtinGameId", js.undefined)
  }
}
