package typingsSlinky.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsLiteDialogResponse extends DialogResponse {
  var app_id: Double = js.native
  var developer_payload: js.UndefOr[String] = js.native
  var payment_id: Double = js.native
  var product_id: String = js.native
  var purchase_time: Double = js.native
  var purchase_token: String = js.native
  var signed_request: String = js.native
}

object PaymentsLiteDialogResponse {
  @scala.inline
  def apply(
    app_id: Double,
    payment_id: Double,
    product_id: String,
    purchase_time: Double,
    purchase_token: String,
    signed_request: String
  ): PaymentsLiteDialogResponse = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], payment_id = payment_id.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], purchase_time = purchase_time.asInstanceOf[js.Any], purchase_token = purchase_token.asInstanceOf[js.Any], signed_request = signed_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsLiteDialogResponse]
  }
  @scala.inline
  implicit class PaymentsLiteDialogResponseOps[Self <: PaymentsLiteDialogResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayment_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurchase_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchase_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurchase_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchase_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigned_request(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeveloper_payload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developer_payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloper_payload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developer_payload")(js.undefined)
        ret
    }
  }
  
}

