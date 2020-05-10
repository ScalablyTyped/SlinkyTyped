package typingsSlinky.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordlessStartAuthParams extends BaseAuthOptions {
  var responseMode: js.UndefOr[String] = js.native
}

object PasswordlessStartAuthParams {
  @scala.inline
  def apply(): PasswordlessStartAuthParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordlessStartAuthParams]
  }
  @scala.inline
  implicit class PasswordlessStartAuthParamsOps[Self <: PasswordlessStartAuthParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMode")(js.undefined)
        ret
    }
  }
  
}

