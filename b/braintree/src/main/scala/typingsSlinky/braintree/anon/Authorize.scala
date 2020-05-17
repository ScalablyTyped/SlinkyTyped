package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorize extends js.Object {
  var Authorize: String = js.native
  var Decline: String = js.native
  var Fail: String = js.native
}

object Authorize {
  @scala.inline
  def apply(Authorize: String, Decline: String, Fail: String): Authorize = {
    val __obj = js.Dynamic.literal(Authorize = Authorize.asInstanceOf[js.Any], Decline = Decline.asInstanceOf[js.Any], Fail = Fail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorize]
  }
  @scala.inline
  implicit class AuthorizeOps[Self <: Authorize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authorize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

