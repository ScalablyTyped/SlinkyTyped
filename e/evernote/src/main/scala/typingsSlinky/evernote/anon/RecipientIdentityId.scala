package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.SharedNotePrivilegeLevel
import typingsSlinky.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientIdentityId extends StObject {
  
  var displayName: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientIdentityId: js.UndefOr[typingsSlinky.evernote.mod.Types.IdentityID] = js.native
  
  var sharerUserId: js.UndefOr[UserID] = js.native
}
object RecipientIdentityId {
  
  @scala.inline
  def apply(): RecipientIdentityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentityId]
  }
  
  @scala.inline
  implicit class RecipientIdentityIdMutableBuilder[Self <: RecipientIdentityId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setPrivilege(value: SharedNotePrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    @scala.inline
    def setRecipientIdentityId(value: typingsSlinky.evernote.mod.Types.IdentityID): Self = StObject.set(x, "recipientIdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdentityIdUndefined: Self = StObject.set(x, "recipientIdentityId", js.undefined)
    
    @scala.inline
    def setSharerUserId(value: UserID): Self = StObject.set(x, "sharerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharerUserIdUndefined: Self = StObject.set(x, "sharerUserId", js.undefined)
  }
}
