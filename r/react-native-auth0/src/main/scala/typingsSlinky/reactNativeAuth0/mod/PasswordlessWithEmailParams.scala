package typingsSlinky.reactNativeAuth0.mod

import typingsSlinky.reactNativeAuth0.reactNativeAuth0Strings.code
import typingsSlinky.reactNativeAuth0.reactNativeAuth0Strings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordlessWithEmailParams extends js.Object {
  var authParams: js.UndefOr[String] = js.native
  var email: String = js.native
  var send: js.UndefOr[link | code] = js.native
}

object PasswordlessWithEmailParams {
  @scala.inline
  def apply(email: String): PasswordlessWithEmailParams = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessWithEmailParams]
  }
  @scala.inline
  implicit class PasswordlessWithEmailParamsOps[Self <: PasswordlessWithEmailParams] (val x: Self) extends AnyVal {
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
    def withAuthParams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSend(value: link | code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.undefined)
        ret
    }
  }
  
}

