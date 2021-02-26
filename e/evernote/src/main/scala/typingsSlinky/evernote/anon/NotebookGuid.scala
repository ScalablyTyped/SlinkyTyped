package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Contact
import typingsSlinky.evernote.mod.Types.MessageThreadID
import typingsSlinky.evernote.mod.Types.SharedNotebookPrivilegeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookGuid extends StObject {
  
  var notebookGuid: js.UndefOr[typingsSlinky.evernote.mod.Types.Guid] = js.native
  
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}
object NotebookGuid {
  
  @scala.inline
  def apply(): NotebookGuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookGuid]
  }
  
  @scala.inline
  implicit class NotebookGuidMutableBuilder[Self <: NotebookGuid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookGuid(value: typingsSlinky.evernote.mod.Types.Guid): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    @scala.inline
    def setPrivilege(value: SharedNotebookPrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
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
