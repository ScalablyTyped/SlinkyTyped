package typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductAction extends js.Object {
  var action: ProductActionEnum = js.native
  var checkoutOption: js.UndefOr[String] = js.native
  var checkoutStep: js.UndefOr[Double] = js.native
  var productActionList: js.UndefOr[String] = js.native
  var productListSource: js.UndefOr[String] = js.native
  var transaction: js.UndefOr[Transaction] = js.native
}

object ProductAction {
  @scala.inline
  def apply(action: ProductActionEnum): ProductAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductAction]
  }
  @scala.inline
  implicit class ProductActionOps[Self <: ProductAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: ProductActionEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckoutOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckoutOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutOption")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckoutStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutStep")(js.undefined)
        ret
    }
    @scala.inline
    def withProductActionList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productActionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductActionList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productActionList")(js.undefined)
        ret
    }
    @scala.inline
    def withProductListSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productListSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductListSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productListSource")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: Transaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
  }
  
}

