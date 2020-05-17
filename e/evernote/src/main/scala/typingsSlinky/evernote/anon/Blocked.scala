package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Contact
import typingsSlinky.evernote.mod.Types.MessageEventID
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blocked extends js.Object {
  var blocked: js.UndefOr[Boolean] = js.native
  var contact: js.UndefOr[Contact] = js.native
  var deactivated: js.UndefOr[Boolean] = js.native
  var eventId: js.UndefOr[MessageEventID] = js.native
  var id: js.UndefOr[typingsSlinky.evernote.mod.Types.IdentityID] = js.native
  var sameBusiness: js.UndefOr[Boolean] = js.native
  var userConnected: js.UndefOr[Boolean] = js.native
  var userId: js.UndefOr[UserID] = js.native
}

object Blocked {
  @scala.inline
  def apply(): Blocked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blocked]
  }
  @scala.inline
  implicit class BlockedOps[Self <: Blocked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(js.undefined)
        ret
    }
    @scala.inline
    def withContact(value: Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeactivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivated")(js.undefined)
        ret
    }
    @scala.inline
    def withEventId(value: MessageEventID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: typingsSlinky.evernote.mod.Types.IdentityID): Self = {
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
    def withSameBusiness(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameBusiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameBusiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameBusiness")(js.undefined)
        ret
    }
    @scala.inline
    def withUserConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userConnected")(js.undefined)
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
  }
  
}

