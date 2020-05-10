package typingsSlinky.reactFacebookLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactFacebookFailureResponse extends js.Object {
  var status: js.UndefOr[String] = js.native
}

object ReactFacebookFailureResponse {
  @scala.inline
  def apply(): ReactFacebookFailureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactFacebookFailureResponse]
  }
  @scala.inline
  implicit class ReactFacebookFailureResponseOps[Self <: ReactFacebookFailureResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

