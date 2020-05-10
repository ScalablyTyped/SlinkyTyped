package typingsSlinky.googlepay.google.payments.api

import typingsSlinky.googlepay.googlepayBooleans.`false`
import typingsSlinky.googlepay.googlepayBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a user's ability to provide payment information
  * through the Google Pay payment sheet.
  *
  * @example
  * ```
  * // The current user is able to provide payment
  * // information through the Google Pay payment sheet.
  * {
  *   "result": true
  * }
  * ```
  */
@js.native
trait IsReadyToPayResponse extends js.Object {
  /**
    * The current user's ability to pay with one or more of the payment
    * methods specified in
    * [[IsReadyToPayRequest.allowedPaymentMethods|`IsReadyToPayRequest.allowedPaymentMethods`]]
    *
    * This property only exists if
    * [[IsReadyToPayRequest.existingPaymentMethodRequired|`IsReadyToPayRequest.existingPaymentMethodRequired`]]
    * was set to `true`. The property value will always be `true` if the
    * [[PaymentsClient|`PaymentsClient`]] is configured for a test
    * environment.
    */
  var paymentMethodPresent: js.UndefOr[`false` | `true`] = js.native
  /**
    * Whether the user is able to provide payment information through the
    * Google Pay payment sheet.
    *
    * A user's ability to pay may be tied to the capabilities of the
    * current context (browser/device) to display required components for
    * the specified payment methods including logging in to a Google
    * Account and providing one of the payment methods specified in
    * [[IsReadyToPayRequest.allowedPaymentMethods|`IsReadyToPayRequest.allowedPaymentMethods`]].
    */
  var result: Boolean = js.native
}

object IsReadyToPayResponse {
  @scala.inline
  def apply(result: Boolean): IsReadyToPayResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReadyToPayResponse]
  }
  @scala.inline
  implicit class IsReadyToPayResponseOps[Self <: IsReadyToPayResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentMethodPresent(value: `false` | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodPresent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentMethodPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodPresent")(js.undefined)
        ret
    }
  }
  
}

