package typingsSlinky.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorization extends js.Object {
  var authorization: String = js.native
}

object Authorization {
  @scala.inline
  def apply(authorization: String): Authorization = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  @scala.inline
  implicit class AuthorizationOps[Self <: Authorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

