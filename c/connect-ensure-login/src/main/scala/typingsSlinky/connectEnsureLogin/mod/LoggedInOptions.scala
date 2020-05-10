package typingsSlinky.connectEnsureLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggedInOptions extends js.Object {
  /**
    * URL to redirect to for login, defaults to _/login_
    */
  var redirectTo: js.UndefOr[String] = js.native
  /**
    * set redirectTo in session, defaults to _true_
    */
  var setRedirectTo: js.UndefOr[Boolean] = js.native
}

object LoggedInOptions {
  @scala.inline
  def apply(): LoggedInOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggedInOptions]
  }
  @scala.inline
  implicit class LoggedInOptionsOps[Self <: LoggedInOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirectTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRedirectTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRedirectTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetRedirectTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRedirectTo")(js.undefined)
        ret
    }
  }
  
}

