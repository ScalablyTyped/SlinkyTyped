package typingsSlinky.passportWindowsauth

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passportWindowsauth.passportWindowsauthBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined passport-windowsauth.passport-windowsauth.Options & {  passReqToCallback  :true} */
@js.native
trait OptionspassReqToCallbackt extends js.Object {
  var getUserNameFromHeader: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.native
  var integrated: js.UndefOr[Boolean] = js.native
  var ldap: js.UndefOr[AnonBase] = js.native
  var passReqToCallback: js.UndefOr[Boolean with `true`] = js.native
  var passwordField: js.UndefOr[String] = js.native
  var usernameField: js.UndefOr[String] = js.native
}

object OptionspassReqToCallbackt {
  @scala.inline
  def apply(): OptionspassReqToCallbackt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionspassReqToCallbackt]
  }
  @scala.inline
  implicit class OptionspassReqToCallbacktOps[Self <: OptionspassReqToCallbackt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUserNameFromHeader(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserNameFromHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetUserNameFromHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserNameFromHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrated")(js.undefined)
        ret
    }
    @scala.inline
    def withLdap(value: AnonBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ldap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLdap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ldap")(js.undefined)
        ret
    }
    @scala.inline
    def withPassReqToCallback(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassReqToCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordField")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameField")(js.undefined)
        ret
    }
  }
  
}

