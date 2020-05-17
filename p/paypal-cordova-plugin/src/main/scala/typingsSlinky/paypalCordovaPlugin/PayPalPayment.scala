package typingsSlinky.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Convenience constructor. Returns a PayPalPayment with the specified amount, currency code, and short description.
  */
@js.native
trait PayPalPayment extends js.Object {
  /**
    * The amount of the payment.
    */
  var amount: String = js.native
  /**
    * Optional Build Notation code ("BN code"), obtained from partnerprogram@paypal.com, for your tracking purposes.
    */
  var bnCode: String = js.native
  /**
    * The ISO 4217 currency for the payment.
    */
  var currency: String = js.native
  /**
    * Optional text, for your tracking purposes. (up to 256 characters).
    */
  var custom: String = js.native
  /**
    * PayPalPaymentDetails object (optional).
    */
  var details: PayPalPaymentDetails = js.native
  /**
    * • "Sale" for an immediate payment.
    * • "Auth" for payment authorization only, to be captured separately at a later time.
    * • "Order" for taking an order, with authorization and capture to be done separately at a later time.
    */
  var intent: String = js.native
  /**
    * Optional invoice number, for your tracking purposes. (up to 256 characters).
    */
  var invoiceNumber: String = js.native
  /**
    * Optional array of PayPalItem objects.
    * @see PayPalItem
    * @note If you provide one or more items, be sure that the various prices correctly sum to the payment `amount` or to `paymentDetails.subtotal`.
    */
  var items: js.Array[PayPalItem] = js.native
  /**
    * Optional customer shipping address, if your app wishes to provide this to the SDK.
    * @note make sure to set `payPalShippingAddressOption` in PayPalConfiguration to 1 or 3.
    */
  var shippingAddress: PayPalShippingAddress = js.native
  /**
    * A short descripton of the payment.
    */
  var shortDescription: String = js.native
  /**
    * Optional text which will appear on the customer's credit card statement. (up to 22 characters).
    */
  var softDescriptor: String = js.native
}

object PayPalPayment {
  @scala.inline
  def apply(
    amount: String,
    bnCode: String,
    currency: String,
    custom: String,
    details: PayPalPaymentDetails,
    intent: String,
    invoiceNumber: String,
    items: js.Array[PayPalItem],
    shippingAddress: PayPalShippingAddress,
    shortDescription: String,
    softDescriptor: String
  ): PayPalPayment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], bnCode = bnCode.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], invoiceNumber = invoiceNumber.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any], shortDescription = shortDescription.asInstanceOf[js.Any], softDescriptor = softDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalPayment]
  }
  @scala.inline
  implicit class PayPalPaymentOps[Self <: PayPalPayment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBnCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bnCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: PayPalPaymentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoiceNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoiceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[PayPalItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShippingAddress(value: PayPalShippingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftDescriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

