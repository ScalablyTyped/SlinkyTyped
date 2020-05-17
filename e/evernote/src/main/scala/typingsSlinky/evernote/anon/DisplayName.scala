package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel
import typingsSlinky.evernote.mod.Types.UserID
import typingsSlinky.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayName extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[ShareRelationshipPrivilegeLevel] = js.native
  var recipientUserIdentity: js.UndefOr[UserIdentity] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
}

object DisplayName {
  @scala.inline
  def apply(): DisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayName]
  }
  @scala.inline
  implicit class DisplayNameOps[Self <: DisplayName] (val x: Self) extends AnyVal {
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
    def withPrivilege(value: ShareRelationshipPrivilegeLevel): Self = {
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
    def withRecipientUserIdentity(value: UserIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientUserIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientUserIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientUserIdentity")(js.undefined)
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

