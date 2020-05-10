package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordProfile extends js.Object {
  // true if the user must change her password on the next login; otherwise false.
  var forceChangePasswordNextSignIn: js.UndefOr[Boolean] = js.native
  /**
    * If true, at next sign-in, the user must perform a multi-factor authentication (MFA) before being forced to change their
    * password. The behavior is identical to forceChangePasswordNextSignIn except that the user is required to first perform
    * a multi-factor authentication before password change. After a password change, this property will be automatically
    * reset to false. If not set, default is false.
    */
  var forceChangePasswordNextSignInWithMfa: js.UndefOr[Boolean] = js.native
  /**
    * The password for the user. This property is required when a user is created. It can be updated, but the user will be
    * required to change the password on the next login. The password must satisfy minimum requirements as specified by the
    * user’s passwordPolicies property. By default, a strong password is required.
    */
  var password: js.UndefOr[String] = js.native
}

object PasswordProfile {
  @scala.inline
  def apply(): PasswordProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordProfile]
  }
  @scala.inline
  implicit class PasswordProfileOps[Self <: PasswordProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceChangePasswordNextSignIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceChangePasswordNextSignIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceChangePasswordNextSignIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceChangePasswordNextSignIn")(js.undefined)
        ret
    }
    @scala.inline
    def withForceChangePasswordNextSignInWithMfa(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceChangePasswordNextSignInWithMfa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceChangePasswordNextSignInWithMfa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceChangePasswordNextSignInWithMfa")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
  }
  
}

