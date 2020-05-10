package typingsSlinky.braintree.mod

import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditCardVerificationGateway extends js.Object {
  def search(searchFn: js.Any): Readable = js.native
}

object CreditCardVerificationGateway {
  @scala.inline
  def apply(search: js.Any => Readable): CreditCardVerificationGateway = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[CreditCardVerificationGateway]
  }
  @scala.inline
  implicit class CreditCardVerificationGatewayOps[Self <: CreditCardVerificationGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearch(value: js.Any => Readable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

