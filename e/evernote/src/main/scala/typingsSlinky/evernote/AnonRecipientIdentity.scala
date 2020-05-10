package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.Identity
import typingsSlinky.evernote.mod.Types.SharedNotePrivilegeLevel
import typingsSlinky.evernote.mod.Types.Timestamp
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRecipientIdentity extends js.Object {
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientIdentity: js.UndefOr[Identity] = js.native
  var serviceAssigned: js.UndefOr[Timestamp] = js.native
  var serviceCreated: js.UndefOr[Timestamp] = js.native
  var serviceUpdated: js.UndefOr[Timestamp] = js.native
  var sharerUserID: js.UndefOr[UserID] = js.native
}

object AnonRecipientIdentity {
  @scala.inline
  def apply(): AnonRecipientIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRecipientIdentity]
  }
  @scala.inline
  implicit class AnonRecipientIdentityOps[Self <: AnonRecipientIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRecipientIdentity(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientIdentity")(js.undefined)
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
    def withSharerUserID(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharerUserID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharerUserID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharerUserID")(js.undefined)
        ret
    }
  }
  
}

