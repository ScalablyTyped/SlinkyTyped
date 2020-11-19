package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Contact
import typingsSlinky.evernote.mod.Types.MessageThreadID
import typingsSlinky.evernote.mod.Types.SharedNotePrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoteGuid extends js.Object {
  
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
  implicit class NoteGuidOps[Self <: NoteGuid] (val x: Self) extends AnyVal {
    
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
    def setNoteGuid(value: typingsSlinky.evernote.mod.Types.Guid): Self = this.set("noteGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteGuid: Self = this.set("noteGuid", js.undefined)
    
    @scala.inline
    def setPrivilege(value: SharedNotePrivilegeLevel): Self = this.set("privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivilege: Self = this.set("privilege", js.undefined)
    
    @scala.inline
    def setRecipientContactsVarargs(value: Contact*): Self = this.set("recipientContacts", js.Array(value :_*))
    
    @scala.inline
    def setRecipientContacts(value: js.Array[Contact]): Self = this.set("recipientContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientContacts: Self = this.set("recipientContacts", js.undefined)
    
    @scala.inline
    def setRecipientThreadId(value: MessageThreadID): Self = this.set("recipientThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientThreadId: Self = this.set("recipientThreadId", js.undefined)
  }
}
