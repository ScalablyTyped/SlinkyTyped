package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharingInvitation extends js.Object {
  // The email address provided for the recipient of the sharing invitation. Read-only.
  var email: js.UndefOr[String] = js.native
  /**
    * Provides information about who sent the invitation that created this permission, if that information is available.
    * Read-only.
    */
  var invitedBy: js.UndefOr[IdentitySet] = js.native
  var redeemedBy: js.UndefOr[String] = js.native
  // If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
  var signInRequired: js.UndefOr[Boolean] = js.native
}

object SharingInvitation {
  @scala.inline
  def apply(): SharingInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingInvitation]
  }
  @scala.inline
  implicit class SharingInvitationOps[Self <: SharingInvitation] (val x: Self) extends AnyVal {
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
    def withInvitedBy(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withRedeemedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeemedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedeemedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeemedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSignInRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signInRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignInRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signInRequired")(js.undefined)
        ret
    }
  }
  
}

