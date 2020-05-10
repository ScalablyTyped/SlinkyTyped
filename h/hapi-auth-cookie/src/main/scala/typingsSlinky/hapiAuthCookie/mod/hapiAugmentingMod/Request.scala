package typingsSlinky.hapiAuthCookie.mod.hapiAugmentingMod

import typingsSlinky.hapiAuthCookie.AnonClear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var cookieAuth: AnonClear = js.native
}

object Request {
  @scala.inline
  def apply(cookieAuth: AnonClear): Request = {
    val __obj = js.Dynamic.literal(cookieAuth = cookieAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookieAuth(value: AnonClear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieAuth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

