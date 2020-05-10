package typingsSlinky.asana.mod.auth

import typingsSlinky.asana.AnonPassword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicAuthenticatorRequest extends js.Object {
  var auth: AnonPassword = js.native
}

object BasicAuthenticatorRequest {
  @scala.inline
  def apply(auth: AnonPassword): BasicAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicAuthenticatorRequest]
  }
  @scala.inline
  implicit class BasicAuthenticatorRequestOps[Self <: BasicAuthenticatorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: AnonPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

