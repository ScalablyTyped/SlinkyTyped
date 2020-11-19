package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnonymousPlayer extends js.Object {
  
  /** The base URL for the image to display for the anonymous player. */
  var avatarImageUrl: js.UndefOr[String] = js.native
  
  /** The name to display for the anonymous player. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#anonymousPlayer. */
  var kind: js.UndefOr[String] = js.native
}
object AnonymousPlayer {
  
  @scala.inline
  def apply(): AnonymousPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonymousPlayer]
  }
  
  @scala.inline
  implicit class AnonymousPlayerOps[Self <: AnonymousPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvatarImageUrl(value: String): Self = this.set("avatarImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatarImageUrl: Self = this.set("avatarImageUrl", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
