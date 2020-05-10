package typingsSlinky.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockThemeOptions extends js.Object {
  var authButtons: js.UndefOr[Auth0LockThemeButtonOptions] = js.native
  var hideMainScreenTitle: js.UndefOr[Boolean] = js.native
  var labeledSubmitButton: js.UndefOr[Boolean] = js.native
  var logo: js.UndefOr[String] = js.native
  var primaryColor: js.UndefOr[String] = js.native
}

object Auth0LockThemeOptions {
  @scala.inline
  def apply(): Auth0LockThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockThemeOptions]
  }
  @scala.inline
  implicit class Auth0LockThemeOptionsOps[Self <: Auth0LockThemeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthButtons(value: Auth0LockThemeButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMainScreenTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMainScreenTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideMainScreenTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMainScreenTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabeledSubmitButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labeledSubmitButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabeledSubmitButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labeledSubmitButton")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(js.undefined)
        ret
    }
  }
  
}

