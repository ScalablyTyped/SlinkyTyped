package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationId extends js.Object {
  var authorizationId: String = js.native
  var captureId: String = js.native
  var customField: String = js.native
  var imageUrl: String = js.native
  var payerEmail: String = js.native
  var payerFirstName: String = js.native
  var payerId: String = js.native
  var payerLastName: String = js.native
  var payerStatus: String = js.native
  var paymentId: String = js.native
  var refundFromTransactionFeeAmount: String = js.native
  var refundFromTransactionFeeCurrencyIsoCode: String = js.native
  var refundId: String = js.native
  var sellerProtectionStatus: String = js.native
  var taxId: String = js.native
  var taxIdType: String = js.native
  var token: String = js.native
  var transactionFeeAmount: String = js.native
  var transactionFeeCurrencyIsoCode: String = js.native
}

object AuthorizationId {
  @scala.inline
  def apply(
    authorizationId: String,
    captureId: String,
    customField: String,
    imageUrl: String,
    payerEmail: String,
    payerFirstName: String,
    payerId: String,
    payerLastName: String,
    payerStatus: String,
    paymentId: String,
    refundFromTransactionFeeAmount: String,
    refundFromTransactionFeeCurrencyIsoCode: String,
    refundId: String,
    sellerProtectionStatus: String,
    taxId: String,
    taxIdType: String,
    token: String,
    transactionFeeAmount: String,
    transactionFeeCurrencyIsoCode: String
  ): AuthorizationId = {
    val __obj = js.Dynamic.literal(authorizationId = authorizationId.asInstanceOf[js.Any], captureId = captureId.asInstanceOf[js.Any], customField = customField.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], payerEmail = payerEmail.asInstanceOf[js.Any], payerFirstName = payerFirstName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any], payerLastName = payerLastName.asInstanceOf[js.Any], payerStatus = payerStatus.asInstanceOf[js.Any], paymentId = paymentId.asInstanceOf[js.Any], refundFromTransactionFeeAmount = refundFromTransactionFeeAmount.asInstanceOf[js.Any], refundFromTransactionFeeCurrencyIsoCode = refundFromTransactionFeeCurrencyIsoCode.asInstanceOf[js.Any], refundId = refundId.asInstanceOf[js.Any], sellerProtectionStatus = sellerProtectionStatus.asInstanceOf[js.Any], taxId = taxId.asInstanceOf[js.Any], taxIdType = taxIdType.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], transactionFeeAmount = transactionFeeAmount.asInstanceOf[js.Any], transactionFeeCurrencyIsoCode = transactionFeeCurrencyIsoCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationId]
  }
  @scala.inline
  implicit class AuthorizationIdOps[Self <: AuthorizationId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptureId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayerEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayerFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerFirstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayerLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerLastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayerStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefundFromTransactionFeeAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refundFromTransactionFeeAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefundFromTransactionFeeCurrencyIsoCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refundFromTransactionFeeCurrencyIsoCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefundId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refundId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSellerProtectionStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerProtectionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxIdType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxIdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionFeeAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionFeeAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionFeeCurrencyIsoCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionFeeCurrencyIsoCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

