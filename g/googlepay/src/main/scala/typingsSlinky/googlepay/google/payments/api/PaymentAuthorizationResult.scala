package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Callback result for a payment authorization update.
  */
@js.native
trait PaymentAuthorizationResult extends js.Object {
  /**
    * Error for the last PaymentData, will be displayed to the user.
    */
  var error: js.UndefOr[PaymentDataError] = js.native
  /**
    * Represents the state of the transaction after callback is performed.
    */
  var transactionState: TransactionState = js.native
}

object PaymentAuthorizationResult {
  @scala.inline
  def apply(transactionState: TransactionState): PaymentAuthorizationResult = {
    val __obj = js.Dynamic.literal(transactionState = transactionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentAuthorizationResult]
  }
  @scala.inline
  implicit class PaymentAuthorizationResultOps[Self <: PaymentAuthorizationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionState(value: TransactionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: PaymentDataError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

