package typingsSlinky.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClientAuthorization extends js.Object {
  var clientAuthorization: String = js.native
}

object AnonClientAuthorization {
  @scala.inline
  def apply(clientAuthorization: String): AnonClientAuthorization = {
    val __obj = js.Dynamic.literal(clientAuthorization = clientAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientAuthorization]
  }
  @scala.inline
  implicit class AnonClientAuthorizationOps[Self <: AnonClientAuthorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

