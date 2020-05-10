package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines callback methods for handling payment data changed and payment
  * authorized events.
  *
  * If you set up Dynamic Price Updates in your integration, be sure to add
  * the following [[PaymentDataChangedHandler|`onPaymentDataChanged`]] and
  * [[PaymentAuthorizedHandler|`onPaymentAuthorized`]] callbacks.
  *
  * Example:
  *
  * The following example configuration uses the callbacks needed to set up
  * Dynamic Price Updates:
  *
  * ```js
  * {
  *   onPaymentDataChanged: onPaymentDataChanged,
  *   onPaymentAuthorized: onPaymentAuthorized
  * }
  * ```
  */
@js.native
trait PaymentDataCallbacks extends js.Object {
  /**
    * This method is called when a payment is authorized in the payment
    * sheet.
    */
  var onPaymentAuthorized: js.UndefOr[PaymentAuthorizedHandler] = js.native
  /**
    * This method handles payment data changes in the payment sheet such as
    * shipping address and shipping options.
    */
  var onPaymentDataChanged: js.UndefOr[PaymentDataChangedHandler] = js.native
}

object PaymentDataCallbacks {
  @scala.inline
  def apply(): PaymentDataCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDataCallbacks]
  }
  @scala.inline
  implicit class PaymentDataCallbacksOps[Self <: PaymentDataCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPaymentAuthorized(
      value: /* paymentData */ PaymentData => js.Promise[PaymentAuthorizationResult] | PaymentAuthorizationResult
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaymentAuthorized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaymentAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaymentAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaymentDataChanged(
      value: /* intermediatePaymentData */ IntermediatePaymentData => js.Promise[PaymentDataRequestUpdate] | PaymentDataRequestUpdate
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaymentDataChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaymentDataChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaymentDataChanged")(js.undefined)
        ret
    }
  }
  
}

