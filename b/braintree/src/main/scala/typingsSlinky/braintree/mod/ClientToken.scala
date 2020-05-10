package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientToken extends js.Object {
  var clientToken: String = js.native
}

object ClientToken {
  @scala.inline
  def apply(clientToken: String): ClientToken = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientToken]
  }
  @scala.inline
  implicit class ClientTokenOps[Self <: ClientToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

