package typingsSlinky.passportSaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateOptions
  extends typingsSlinky.passport.mod.AuthenticateOptions {
  var additionalParams: js.UndefOr[js.Object] = js.native
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
    def withAdditionalParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalParams")(js.undefined)
        ret
    }
  }
  
}

