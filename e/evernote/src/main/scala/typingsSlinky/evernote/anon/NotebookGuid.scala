package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Contact
import typingsSlinky.evernote.mod.Types.MessageThreadID
import typingsSlinky.evernote.mod.Types.SharedNotebookPrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookGuid extends js.Object {
  var notebookGuid: js.UndefOr[typingsSlinky.evernote.mod.Types.Guid] = js.undefined
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.undefined
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.undefined
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.undefined
}

object NotebookGuid {
  @scala.inline
  def apply(
    notebookGuid: typingsSlinky.evernote.mod.Types.Guid = null,
    privilege: SharedNotebookPrivilegeLevel = null,
    recipientContacts: js.Array[Contact] = null,
    recipientThreadId: js.UndefOr[MessageThreadID] = js.undefined
  ): NotebookGuid = {
    val __obj = js.Dynamic.literal()
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientContacts != null) __obj.updateDynamic("recipientContacts")(recipientContacts.asInstanceOf[js.Any])
    if (!js.isUndefined(recipientThreadId)) __obj.updateDynamic("recipientThreadId")(recipientThreadId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookGuid]
  }
}

