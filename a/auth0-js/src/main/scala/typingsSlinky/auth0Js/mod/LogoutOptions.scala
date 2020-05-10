package typingsSlinky.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogoutOptions extends js.Object {
  var clientID: js.UndefOr[String] = js.native
  var federated: js.UndefOr[Boolean] = js.native
  var returnTo: js.UndefOr[String] = js.native
}

object LogoutOptions {
  @scala.inline
  def apply(): LogoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogoutOptions]
  }
  @scala.inline
  implicit class LogoutOptionsOps[Self <: LogoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(js.undefined)
        ret
    }
    @scala.inline
    def withFederated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("federated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFederated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("federated")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnTo")(js.undefined)
        ret
    }
  }
  
}

