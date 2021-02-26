package typingsSlinky.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromoteChatMemberOptions extends StObject {
  
  var can_change_info: js.UndefOr[Boolean] = js.native
  
  var can_delete_messages: js.UndefOr[Boolean] = js.native
  
  var can_edit_messages: js.UndefOr[Boolean] = js.native
  
  var can_invite_users: js.UndefOr[Boolean] = js.native
  
  var can_pin_messages: js.UndefOr[Boolean] = js.native
  
  var can_post_messages: js.UndefOr[Boolean] = js.native
  
  var can_promote_members: js.UndefOr[Boolean] = js.native
  
  var can_restrict_members: js.UndefOr[Boolean] = js.native
}
object PromoteChatMemberOptions {
  
  @scala.inline
  def apply(): PromoteChatMemberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromoteChatMemberOptions]
  }
  
  @scala.inline
  implicit class PromoteChatMemberOptionsMutableBuilder[Self <: PromoteChatMemberOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCan_change_info(value: Boolean): Self = StObject.set(x, "can_change_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_change_infoUndefined: Self = StObject.set(x, "can_change_info", js.undefined)
    
    @scala.inline
    def setCan_delete_messages(value: Boolean): Self = StObject.set(x, "can_delete_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_delete_messagesUndefined: Self = StObject.set(x, "can_delete_messages", js.undefined)
    
    @scala.inline
    def setCan_edit_messages(value: Boolean): Self = StObject.set(x, "can_edit_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_edit_messagesUndefined: Self = StObject.set(x, "can_edit_messages", js.undefined)
    
    @scala.inline
    def setCan_invite_users(value: Boolean): Self = StObject.set(x, "can_invite_users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_invite_usersUndefined: Self = StObject.set(x, "can_invite_users", js.undefined)
    
    @scala.inline
    def setCan_pin_messages(value: Boolean): Self = StObject.set(x, "can_pin_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_pin_messagesUndefined: Self = StObject.set(x, "can_pin_messages", js.undefined)
    
    @scala.inline
    def setCan_post_messages(value: Boolean): Self = StObject.set(x, "can_post_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_post_messagesUndefined: Self = StObject.set(x, "can_post_messages", js.undefined)
    
    @scala.inline
    def setCan_promote_members(value: Boolean): Self = StObject.set(x, "can_promote_members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_promote_membersUndefined: Self = StObject.set(x, "can_promote_members", js.undefined)
    
    @scala.inline
    def setCan_restrict_members(value: Boolean): Self = StObject.set(x, "can_restrict_members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_restrict_membersUndefined: Self = StObject.set(x, "can_restrict_members", js.undefined)
  }
}
