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
trait ParamsResourceRoomsDismiss extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the room.
    */
  var roomId: js.UndefOr[String] = js.native
}
object ParamsResourceRoomsDismiss {
  
  @scala.inline
  def apply(): ParamsResourceRoomsDismiss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRoomsDismiss]
  }
  
  @scala.inline
  implicit class ParamsResourceRoomsDismissMutableBuilder[Self <: ParamsResourceRoomsDismiss] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomIdUndefined: Self = StObject.set(x, "roomId", js.undefined)
  }
}
