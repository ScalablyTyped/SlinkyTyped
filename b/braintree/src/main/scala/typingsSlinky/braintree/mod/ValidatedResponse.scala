package typingsSlinky.braintree.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatedResponse[T] extends js.Object {
  var address: Address = js.native
  var clientToken: String = js.native
  var credentials: OAuthToken = js.native
  var creditCard: CreditCard = js.native
  var customer: Customer = js.native
  var dispute: Dispute = js.native
  var errors: ValidationErrorsCollection = js.native
  var merchantAccount: MerchantAccount = js.native
  var message: String = js.native
  var params: Record[String, _] = js.native
  var paymentMethod: PaymentMethod = js.native
  var paymentMethodNonce: PaymentMethodNonce = js.native
  var settlementBatchSumary: SettlementBatchSummary = js.native
  var subscription: Subscription = js.native
  var success: Boolean = js.native
  var transaction: Transaction = js.native
}

object ValidatedResponse {
  @scala.inline
  def apply[T](
    address: Address,
    clientToken: String,
    credentials: OAuthToken,
    creditCard: CreditCard,
    customer: Customer,
    dispute: Dispute,
    errors: ValidationErrorsCollection,
    merchantAccount: MerchantAccount,
    message: String,
    params: Record[String, _],
    paymentMethod: PaymentMethod,
    paymentMethodNonce: PaymentMethodNonce,
    settlementBatchSumary: SettlementBatchSummary,
    subscription: Subscription,
    success: Boolean,
    transaction: Transaction
  ): ValidatedResponse[T] = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], creditCard = creditCard.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], dispute = dispute.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any], settlementBatchSumary = settlementBatchSumary.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatedResponse[T]]
  }
  @scala.inline
  implicit class ValidatedResponseOps[Self[t] <: ValidatedResponse[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAddress(value: Address): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentials(value: OAuthToken): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditCard(value: CreditCard): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer(value: Customer): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispute(value: Dispute): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: ValidationErrorsCollection): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchantAccount(value: MerchantAccount): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: Record[String, _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentMethod(value: PaymentMethod): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentMethodNonce(value: PaymentMethodNonce): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettlementBatchSumary(value: SettlementBatchSummary): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlementBatchSumary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: Subscription): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransaction(value: Transaction): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

