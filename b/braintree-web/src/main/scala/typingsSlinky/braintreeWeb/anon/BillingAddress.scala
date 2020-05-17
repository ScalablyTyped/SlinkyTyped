package typingsSlinky.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingAddress extends js.Object {
  var billingAddress: js.UndefOr[js.Any] = js.native
  var cardholderName: js.UndefOr[String] = js.native
  var vault: js.UndefOr[Boolean] = js.native
}

object BillingAddress {
  @scala.inline
  def apply(): BillingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingAddress]
  }
  @scala.inline
  implicit class BillingAddressOps[Self <: BillingAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingAddress(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withCardholderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardholderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(js.undefined)
        ret
    }
    @scala.inline
    def withVault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vault")(js.undefined)
        ret
    }
  }
  
}

