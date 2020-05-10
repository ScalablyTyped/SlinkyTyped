package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartyResetPasswordRequest extends js.Object {
  /** The email address of the user. */
  var email: js.UndefOr[String] = js.native
  /** The new password inputted by the user. */
  var newPassword: js.UndefOr[String] = js.native
  /** The old password inputted by the user. */
  var oldPassword: js.UndefOr[String] = js.native
  /** The confirmation code. */
  var oobCode: js.UndefOr[String] = js.native
}

object IdentitytoolkitRelyingpartyResetPasswordRequest {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyResetPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyResetPasswordRequest]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyResetPasswordRequestOps[Self <: IdentitytoolkitRelyingpartyResetPasswordRequest] (val x: Self) extends AnyVal {
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
    def withNewPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withOldPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withOobCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oobCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOobCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oobCode")(js.undefined)
        ret
    }
  }
  
}

