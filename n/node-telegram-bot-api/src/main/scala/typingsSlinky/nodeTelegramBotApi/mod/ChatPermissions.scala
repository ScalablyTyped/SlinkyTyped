package typingsSlinky.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatPermissions extends StObject {
  
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.native
  
  var can_change_info: js.UndefOr[Boolean] = js.native
  
  var can_invite_users: js.UndefOr[Boolean] = js.native
  
  var can_pin_messages: js.UndefOr[Boolean] = js.native
  
  var can_send_media_messages: js.UndefOr[Boolean] = js.native
  
  var can_send_messages: js.UndefOr[Boolean] = js.native
  
  var can_send_other_messages: js.UndefOr[Boolean] = js.native
  
  var can_send_polls: js.UndefOr[Boolean] = js.native
}
object ChatPermissions {
  
  @scala.inline
  def apply(): ChatPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatPermissions]
  }
  
  @scala.inline
  implicit class ChatPermissionsMutableBuilder[Self <: ChatPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCan_add_web_page_previews(value: Boolean): Self = StObject.set(x, "can_add_web_page_previews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_add_web_page_previewsUndefined: Self = StObject.set(x, "can_add_web_page_previews", js.undefined)
    
    @scala.inline
    def setCan_change_info(value: Boolean): Self = StObject.set(x, "can_change_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_change_infoUndefined: Self = StObject.set(x, "can_change_info", js.undefined)
    
    @scala.inline
    def setCan_invite_users(value: Boolean): Self = StObject.set(x, "can_invite_users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_invite_usersUndefined: Self = StObject.set(x, "can_invite_users", js.undefined)
    
    @scala.inline
    def setCan_pin_messages(value: Boolean): Self = StObject.set(x, "can_pin_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_pin_messagesUndefined: Self = StObject.set(x, "can_pin_messages", js.undefined)
    
    @scala.inline
    def setCan_send_media_messages(value: Boolean): Self = StObject.set(x, "can_send_media_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_send_media_messagesUndefined: Self = StObject.set(x, "can_send_media_messages", js.undefined)
    
    @scala.inline
    def setCan_send_messages(value: Boolean): Self = StObject.set(x, "can_send_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_send_messagesUndefined: Self = StObject.set(x, "can_send_messages", js.undefined)
    
    @scala.inline
    def setCan_send_other_messages(value: Boolean): Self = StObject.set(x, "can_send_other_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_send_other_messagesUndefined: Self = StObject.set(x, "can_send_other_messages", js.undefined)
    
    @scala.inline
    def setCan_send_polls(value: Boolean): Self = StObject.set(x, "can_send_polls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_send_pollsUndefined: Self = StObject.set(x, "can_send_polls", js.undefined)
  }
}
