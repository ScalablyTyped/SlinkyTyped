package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.AnonNotebookGuid
import typingsSlinky.evernote.mod.Types.Contact
import typingsSlinky.evernote.mod.Types.Guid
import typingsSlinky.evernote.mod.Types.MessageThreadID
import typingsSlinky.evernote.mod.Types.SharedNotebookPrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NotebookShareTemplate")
@js.native
class NotebookShareTemplate () extends js.Object {
  def this(args: AnonNotebookGuid) = this()
  var notebookGuid: js.UndefOr[Guid] = js.native
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}

