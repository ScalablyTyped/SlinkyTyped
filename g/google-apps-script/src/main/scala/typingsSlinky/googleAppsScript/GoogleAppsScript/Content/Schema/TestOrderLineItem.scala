package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOrderLineItem extends js.Object {
  var product: js.UndefOr[TestOrderLineItemProduct] = js.native
  var quantityOrdered: js.UndefOr[Double] = js.native
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.native
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.native
  var unitTax: js.UndefOr[Price] = js.native
}

object TestOrderLineItem {
  @scala.inline
  def apply(): TestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderLineItem]
  }
  @scala.inline
  implicit class TestOrderLineItemOps[Self <: TestOrderLineItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProduct(value: TestOrderLineItemProduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantityOrdered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityOrdered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantityOrdered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityOrdered")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnInfo(value: OrderLineItemReturnInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingDetails(value: OrderLineItemShippingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitTax(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitTax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitTax")(js.undefined)
        ret
    }
  }
  
}

