package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.pay
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.purchaseitem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayDialogParams extends DialogParams {
  var action: purchaseitem = js.native
  var method: pay = js.native
  var pricepoint_id: js.UndefOr[String] = js.native
  var product: String = js.native
  var quantity: js.UndefOr[Double] = js.native
  var quantity_max: js.UndefOr[Double] = js.native
  var quantity_min: js.UndefOr[Double] = js.native
  var request_id: js.UndefOr[String] = js.native
  var test_currency: js.UndefOr[String] = js.native
}

object PayDialogParams {
  @scala.inline
  def apply(action: purchaseitem, method: pay, product: String): PayDialogParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayDialogParams]
  }
  @scala.inline
  implicit class PayDialogParamsOps[Self <: PayDialogParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: purchaseitem): Self = {
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
    def withProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPricepoint_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricepoint_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricepoint_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricepoint_id")(js.undefined)
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
    @scala.inline
    def withQuantity_max(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity_max")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity_min(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity_min")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTest_currency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest_currency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_currency")(js.undefined)
        ret
    }
  }
  
}

