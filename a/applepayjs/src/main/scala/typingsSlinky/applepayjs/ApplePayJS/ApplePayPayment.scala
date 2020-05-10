package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of authorizing a payment request and contains encrypted payment information.
  */
@js.native
trait ApplePayPayment extends js.Object {
  /**
    * The billing contact selected by the user for this transaction.
    */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.native
  /**
    * The shipping contact selected by the user for this transaction.
    */
  var shippingContact: js.UndefOr[ApplePayPaymentContact] = js.native
  /**
    * The encrypted information for an authorized payment.
    */
  var token: ApplePayPaymentToken = js.native
}

object ApplePayPayment {
  @scala.inline
  def apply(token: ApplePayPaymentToken): ApplePayPayment = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPayment]
  }
  @scala.inline
  implicit class ApplePayPaymentOps[Self <: ApplePayPayment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(value: ApplePayPaymentToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBillingContact(value: ApplePayPaymentContact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingContact")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingContact(value: ApplePayPaymentContact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingContact")(js.undefined)
        ret
    }
  }
  
}

