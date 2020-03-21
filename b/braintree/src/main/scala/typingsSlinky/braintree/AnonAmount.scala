package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmount extends js.Object {
  var amount: String
  var createdAt: js.Date
  var id: String
  var orderId: String
  var paymentInstrumentSubtype: String
  var purchaseOrderNumber: String
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
}

