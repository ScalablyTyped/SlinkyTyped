package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.pay
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.purchaseiap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsLiteDialogParams extends DialogParams {
  var action: purchaseiap = js.native
  var developer_payload: js.UndefOr[String] = js.native
  var method: pay = js.native
  var product_id: String = js.native
  var quantity: js.UndefOr[Double] = js.native
}

object PaymentsLiteDialogParams {
  @scala.inline
  def apply(action: purchaseiap, method: pay, product_id: String): PaymentsLiteDialogParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsLiteDialogParams]
  }
  @scala.inline
  implicit class PaymentsLiteDialogParamsOps[Self <: PaymentsLiteDialogParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: purchaseiap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: pay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_id")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
  }
  
}

