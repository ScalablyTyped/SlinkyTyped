package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.NoteGuid
import typingsSlinky.evernote.mod.Types.Contact
import typingsSlinky.evernote.mod.Types.Guid
import typingsSlinky.evernote.mod.Types.MessageThreadID
import typingsSlinky.evernote.mod.Types.SharedNotePrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.SharedNoteTemplate")
@js.native
class SharedNoteTemplate () extends js.Object {
  def this(args: NoteGuid) = this()
  
  var noteGuid: js.UndefOr[Guid] = js.native
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}
