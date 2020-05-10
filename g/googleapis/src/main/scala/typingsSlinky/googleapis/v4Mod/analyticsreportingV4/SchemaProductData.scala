package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of the products in an e-commerce transaction.
  */
@js.native
trait SchemaProductData extends js.Object {
  /**
    * The total revenue from purchased product items.
    */
  var itemRevenue: js.UndefOr[Double] = js.native
  /**
    * The product name, supplied by the e-commerce tracking application, for
    * the purchased items.
    */
  var productName: js.UndefOr[String] = js.native
  /**
    * Total number of this product units in the transaction.
    */
  var productQuantity: js.UndefOr[String] = js.native
  /**
    * Unique code that represents the product.
    */
  var productSku: js.UndefOr[String] = js.native
}

object SchemaProductData {
  @scala.inline
  def apply(): SchemaProductData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductData]
  }
  @scala.inline
  implicit class SchemaProductDataOps[Self <: SchemaProductData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemRevenue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRevenue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemRevenue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRevenue")(js.undefined)
        ret
    }
    @scala.inline
    def withProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(js.undefined)
        ret
    }
    @scala.inline
    def withProductQuantity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withProductSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductSku: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSku")(js.undefined)
        ret
    }
  }
  
}

