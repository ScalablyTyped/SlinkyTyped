package typingsSlinky.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The PayPalPaymentDetails class defines optional amount details.
  *
  * @see https://developer.paypal.com/webapps/developer/docs/api/#details-object for more details.
  */
@js.native
trait PayPalPaymentDetails extends js.Object {
  /**
    * Amount charged for shipping. 10 characters max with support for 2 decimal places.
    */
  var shipping: String = js.native
  /**
    * Sub-total (amount) of items being paid for. 10 characters max with support for 2 decimal places.
    */
  var subtotal: String = js.native
  /**
    * Amount charged for tax. 10 characters max with support for 2 decimal places.
    */
  var tax: String = js.native
}

object PayPalPaymentDetails {
  @scala.inline
  def apply(shipping: String, subtotal: String, tax: String): PayPalPaymentDetails = {
    val __obj = js.Dynamic.literal(shipping = shipping.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], tax = tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalPaymentDetails]
  }
  @scala.inline
  implicit class PayPalPaymentDetailsOps[Self <: PayPalPaymentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShipping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

