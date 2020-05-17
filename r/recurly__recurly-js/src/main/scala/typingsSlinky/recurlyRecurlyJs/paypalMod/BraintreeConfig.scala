package typingsSlinky.recurlyRecurlyJs.paypalMod

import typingsSlinky.recurlyRecurlyJs.anon.ClientAuthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BraintreeConfig extends PayPalConfig {
  var braintree: ClientAuthorization = js.native
}

object BraintreeConfig {
  @scala.inline
  def apply(braintree: ClientAuthorization): BraintreeConfig = {
    val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
    __obj.asInstanceOf[BraintreeConfig]
  }
  @scala.inline
  implicit class BraintreeConfigOps[Self <: BraintreeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBraintree(value: ClientAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braintree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

