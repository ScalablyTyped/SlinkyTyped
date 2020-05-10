package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentDetail extends Detail {
  var method: String = js.native
  var transaction_type: String = js.native
}

object PaymentDetail {
  @scala.inline
  def apply(
    amount: Currency,
    date: String,
    method: String,
    transaction_id: String,
    transaction_type: String,
    `type`: String
  ): PaymentDetail = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any], transaction_type = transaction_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetail]
  }
  @scala.inline
  implicit class PaymentDetailOps[Self <: PaymentDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransaction_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

