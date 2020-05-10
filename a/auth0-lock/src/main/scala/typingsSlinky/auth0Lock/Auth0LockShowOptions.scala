package typingsSlinky.auth0Lock

import typingsSlinky.auth0Lock.auth0LockStrings.forgotPassword
import typingsSlinky.auth0Lock.auth0LockStrings.login
import typingsSlinky.auth0Lock.auth0LockStrings.signUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockShowOptions extends js.Object {
  var allowForgotPassword: js.UndefOr[Boolean] = js.native
  var allowLogin: js.UndefOr[Boolean] = js.native
  var allowSignUp: js.UndefOr[Boolean] = js.native
  var allowedConnections: js.UndefOr[js.Array[String]] = js.native
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.native
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.native
  var initialScreen: js.UndefOr[login | signUp | forgotPassword] = js.native
  var languageDictionary: js.UndefOr[js.Any] = js.native
  var rememberLastLogin: js.UndefOr[Boolean] = js.native
}

object Auth0LockShowOptions {
  @scala.inline
  def apply(): Auth0LockShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockShowOptions]
  }
  @scala.inline
  implicit class Auth0LockShowOptionsOps[Self <: Auth0LockShowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowForgotPassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowForgotPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowForgotPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowForgotPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLogin")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSignUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSignUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSignUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSignUp")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedConnections(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: Auth0LockAuthOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashMessage(value: Auth0LockFlashMessageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialScreen(value: login | signUp | forgotPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageDictionary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageDictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageDictionary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageDictionary")(js.undefined)
        ret
    }
    @scala.inline
    def withRememberLastLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberLastLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRememberLastLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberLastLogin")(js.undefined)
        ret
    }
  }
  
}

