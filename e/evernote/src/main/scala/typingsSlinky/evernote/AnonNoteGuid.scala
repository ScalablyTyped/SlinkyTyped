package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.Contact
import typingsSlinky.evernote.mod.Types.Guid
import typingsSlinky.evernote.mod.Types.MessageThreadID
import typingsSlinky.evernote.mod.Types.SharedNotePrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNoteGuid extends js.Object {
  var noteGuid: js.UndefOr[Guid] = js.native
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}

object AnonNoteGuid {
  @scala.inline
  def apply(): AnonNoteGuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNoteGuid]
  }
  @scala.inline
  implicit class AnonNoteGuidOps[Self <: AnonNoteGuid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoteGuid(value: Guid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivilege(value: SharedNotePrivilegeLevel): Self = {
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

