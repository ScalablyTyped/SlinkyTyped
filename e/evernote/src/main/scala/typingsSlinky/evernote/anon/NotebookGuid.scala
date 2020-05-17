package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Contact
import typingsSlinky.evernote.mod.Types.MessageThreadID
import typingsSlinky.evernote.mod.Types.SharedNotebookPrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookGuid extends js.Object {
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
  implicit class NotebookGuidOps[Self <: NotebookGuid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookGuid(value: typingsSlinky.evernote.mod.Types.Guid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivilege(value: SharedNotebookPrivilegeLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivilege: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientContacts(value: js.Array[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientContacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientContacts")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientThreadId(value: MessageThreadID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientThreadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientThreadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientThreadId")(js.undefined)
        ret
    }
  }
  
}

