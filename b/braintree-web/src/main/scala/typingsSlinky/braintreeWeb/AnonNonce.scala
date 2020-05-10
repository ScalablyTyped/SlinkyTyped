package typingsSlinky.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNonce extends js.Object {
  var nonce: String = js.native
}

object AnonNonce {
  @scala.inline
  def apply(nonce: String): AnonNonce = {
    val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNonce]
  }
  @scala.inline
  implicit class AnonNonceOps[Self <: AnonNonce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

