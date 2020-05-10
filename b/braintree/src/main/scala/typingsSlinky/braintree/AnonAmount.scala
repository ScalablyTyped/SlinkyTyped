package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmount extends js.Object {
  var amount: String = js.native
  var createdAt: js.Date = js.native
  var id: String = js.native
  var orderId: String = js.native
  var paymentInstrumentSubtype: String = js.native
  var purchaseOrderNumber: String = js.native
}

object AnonAmount {
  @scala.inline
  def apply(
    amount: String,
    createdAt: js.Date,
    id: String,
    orderId: String,
    paymentInstrumentSubtype: String,
    purchaseOrderNumber: String
  ): AnonAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], orderId = orderId.asInstanceOf[js.Any], paymentInstrumentSubtype = paymentInstrumentSubtype.asInstanceOf[js.Any], purchaseOrderNumber = purchaseOrderNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmount]
  }
  @scala.inline
  implicit class AnonAmountOps[Self <: AnonAmount] (val x: Self) extends AnyVal {
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
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentInstrumentSubtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentInstrumentSubtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurchaseOrderNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseOrderNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

