package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.SharedNotebookPrivilegeLevel
import typingsSlinky.evernote.mod.Types.SharedNotebookRecipientSettings
import typingsSlinky.evernote.mod.Types.Timestamp
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  var email: js.UndefOr[String] = js.native
  var globalId: js.UndefOr[String] = js.native
  var id: js.UndefOr[Double] = js.native
  var notebookGuid: js.UndefOr[typingsSlinky.evernote.mod.Types.Guid] = js.native
  var notebookModifiable: js.UndefOr[Boolean] = js.native
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  var recipientIdentityId: js.UndefOr[typingsSlinky.evernote.mod.Types.IdentityID] = js.native
  var recipientSettings: js.UndefOr[SharedNotebookRecipientSettings] = js.native
  var recipientUserId: js.UndefOr[UserID] = js.native
  var recipientUsername: js.UndefOr[String] = js.native
  var serviceAssigned: js.UndefOr[Timestamp] = js.native
  var serviceCreated: js.UndefOr[Timestamp] = js.native
  var serviceUpdated: js.UndefOr[Timestamp] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
  var userId: js.UndefOr[UserID] = js.native
  var username: js.UndefOr[String] = js.native
}

object Email {
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
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
    def withNotebookModifiable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookModifiable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookModifiable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookModifiable")(js.undefined)
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
    def withRecipientIdentityId(value: typingsSlinky.evernote.mod.Types.IdentityID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientIdentityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientIdentityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientIdentityId")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientSettings(value: SharedNotebookRecipientSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSettings")(js.undefined)
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
    def withRecipientUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAssigned(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAssigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAssigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAssigned")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCreated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUpdated")(js.undefined)
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
    @scala.inline
    def withUserId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

