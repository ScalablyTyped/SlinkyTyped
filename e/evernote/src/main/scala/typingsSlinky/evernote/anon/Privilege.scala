package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.NoteShareRelationshipRestrictions
import typingsSlinky.evernote.mod.Types.SharedNotePrivilegeLevel
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Privilege extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientUserId: js.UndefOr[UserID] = js.native
  var restrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
}

object Privilege {
  @scala.inline
  def apply(): Privilege = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privilege]
  }
  @scala.inline
  implicit class PrivilegeOps[Self <: Privilege] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
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
    def withRecipientUserId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictions(value: NoteShareRelationshipRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withSharerUserId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharerUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharerUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharerUserId")(js.undefined)
        ret
    }
  }
  
}

