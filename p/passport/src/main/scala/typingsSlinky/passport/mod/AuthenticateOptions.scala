package typingsSlinky.passport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateOptions extends js.Object {
  var assignProperty: js.UndefOr[String] = js.native
  var authInfo: js.UndefOr[Boolean] = js.native
  var failWithError: js.UndefOr[Boolean] = js.native
  var failureFlash: js.UndefOr[String | Boolean] = js.native
  var failureMessage: js.UndefOr[Boolean | String] = js.native
  var failureRedirect: js.UndefOr[String] = js.native
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  var pauseStream: js.UndefOr[Boolean] = js.native
  var prompt: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  var session: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[String] = js.native
  var successFlash: js.UndefOr[String | Boolean] = js.native
  var successMessage: js.UndefOr[Boolean | String] = js.native
  var successRedirect: js.UndefOr[String] = js.native
  var successReturnToOrRedirect: js.UndefOr[String] = js.native
  var userProperty: js.UndefOr[String] = js.native
}

object AuthenticateOptions {
  @scala.inline
  def apply(): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateOptions]
  }
  @scala.inline
  implicit class AuthenticateOptionsOps[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFailWithError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failWithError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailWithError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failWithError")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureFlash(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureFlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureFlash")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureMessage(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withPassReqToCallback(value: Boolean): Self = {
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
    def withPauseStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseStream")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessFlash(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successFlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successFlash")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessMessage(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessReturnToOrRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successReturnToOrRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessReturnToOrRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successReturnToOrRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperty")(js.undefined)
        ret
    }
  }
  
}

