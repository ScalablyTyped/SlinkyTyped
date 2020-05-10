package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTestOrderLineItem extends js.Object {
  /**
    * Product data from the time of the order placement.
    */
  var product: js.UndefOr[SchemaTestOrderLineItemProduct] = js.native
  /**
    * Number of items ordered.
    */
  var quantityOrdered: js.UndefOr[Double] = js.native
  /**
    * Details of the return policy for the line item.
    */
  var returnInfo: js.UndefOr[SchemaOrderLineItemReturnInfo] = js.native
  /**
    * Details of the requested shipping for the line item.
    */
  var shippingDetails: js.UndefOr[SchemaOrderLineItemShippingDetails] = js.native
  /**
    * Deprecated. Ignored if provided.
    */
  var unitTax: js.UndefOr[SchemaPrice] = js.native
}

object SchemaTestOrderLineItem {
  @scala.inline
  def apply(): SchemaTestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderLineItem]
  }
  @scala.inline
  implicit class SchemaTestOrderLineItemOps[Self <: SchemaTestOrderLineItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProduct(value: SchemaTestOrderLineItemProduct): Self = {
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
    def withReturnInfo(value: SchemaOrderLineItemReturnInfo): Self = {
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
    def withShippingDetails(value: SchemaOrderLineItemShippingDetails): Self = {
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
    def withUnitTax(value: SchemaPrice): Self = {
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

