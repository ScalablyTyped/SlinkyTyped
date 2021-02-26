package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Contact
import typingsSlinky.evernote.mod.Types.MessageThreadID
import typingsSlinky.evernote.mod.Types.SharedNotePrivilegeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoteGuid extends StObject {
  
  var noteGuid: js.UndefOr[typingsSlinky.evernote.mod.Types.Guid] = js.native
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}
object NoteGuid {
  
  @scala.inline
  def apply(): NoteGuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteGuid]
  }
  
  @scala.inline
  implicit class NoteGuidMutableBuilder[Self <: NoteGuid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoteGuid(value: typingsSlinky.evernote.mod.Types.Guid): Self = StObject.set(x, "noteGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteGuidUndefined: Self = StObject.set(x, "noteGuid", js.undefined)
    
    @scala.inline
    def setPrivilege(value: SharedNotePrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    @scala.inline
    def setRecipientContacts(value: js.Array[Contact]): Self = StObject.set(x, "recipientContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientContactsUndefined: Self = StObject.set(x, "recipientContacts", js.undefined)
    
    @scala.inline
    def setRecipientContactsVarargs(value: Contact*): Self = StObject.set(x, "recipientContacts", js.Array(value :_*))
    
    @scala.inline
    def setRecipientThreadId(value: MessageThreadID): Self = StObject.set(x, "recipientThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientThreadIdUndefined: Self = StObject.set(x, "recipientThreadId", js.undefined)
  }
}
