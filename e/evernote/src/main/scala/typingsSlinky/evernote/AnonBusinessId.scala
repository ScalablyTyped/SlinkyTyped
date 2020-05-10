package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.BusinessInvitationStatus
import typingsSlinky.evernote.mod.Types.BusinessUserRole
import typingsSlinky.evernote.mod.Types.Timestamp
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBusinessId extends js.Object {
  var businessId: js.UndefOr[Double] = js.native
  var created: js.UndefOr[Timestamp] = js.native
  var email: js.UndefOr[String] = js.native
  var fromWorkChat: js.UndefOr[Boolean] = js.native
  var requesterId: js.UndefOr[UserID] = js.native
  var role: js.UndefOr[BusinessUserRole] = js.native
  var status: js.UndefOr[BusinessInvitationStatus] = js.native
}

object AnonBusinessId {
  @scala.inline
  def apply(): AnonBusinessId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBusinessId]
  }
  @scala.inline
  implicit class AnonBusinessIdOps[Self <: AnonBusinessId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusinessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
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
    def withFromWorkChat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromWorkChat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromWorkChat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromWorkChat")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterId")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: BusinessUserRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: BusinessInvitationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

