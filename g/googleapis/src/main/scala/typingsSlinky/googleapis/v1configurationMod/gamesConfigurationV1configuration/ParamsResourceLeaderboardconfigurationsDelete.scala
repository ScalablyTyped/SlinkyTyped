package typingsSlinky.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceLeaderboardconfigurationsDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the leaderboard.
    */
  var leaderboardId: js.UndefOr[String] = js.native
}
object ParamsResourceLeaderboardconfigurationsDelete {
  
  @scala.inline
  def apply(): ParamsResourceLeaderboardconfigurationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLeaderboardconfigurationsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceLeaderboardconfigurationsDeleteMutableBuilder[Self <: ParamsResourceLeaderboardconfigurationsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLeaderboardId(value: String): Self = StObject.set(x, "leaderboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderboardIdUndefined: Self = StObject.set(x, "leaderboardId", js.undefined)
  }
}
