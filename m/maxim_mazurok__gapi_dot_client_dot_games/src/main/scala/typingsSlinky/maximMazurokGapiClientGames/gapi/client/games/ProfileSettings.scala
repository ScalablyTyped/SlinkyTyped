package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileSettings extends StObject {
  
  var friendsListVisibility: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#profileSettings`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Whether the player's profile is visible to the currently signed in player. */
  var profileVisible: js.UndefOr[Boolean] = js.native
}
object ProfileSettings {
  
  @scala.inline
  def apply(): ProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileSettings]
  }
  
  @scala.inline
  implicit class ProfileSettingsMutableBuilder[Self <: ProfileSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendsListVisibility(value: String): Self = StObject.set(x, "friendsListVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendsListVisibilityUndefined: Self = StObject.set(x, "friendsListVisibility", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProfileVisible(value: Boolean): Self = StObject.set(x, "profileVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileVisibleUndefined: Self = StObject.set(x, "profileVisible", js.undefined)
  }
}
