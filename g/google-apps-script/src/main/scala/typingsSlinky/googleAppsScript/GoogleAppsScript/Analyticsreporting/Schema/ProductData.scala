package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductData extends js.Object {
  var itemRevenue: js.UndefOr[Double] = js.native
  var productName: js.UndefOr[String] = js.native
  var productQuantity: js.UndefOr[String] = js.native
  var productSku: js.UndefOr[String] = js.native
}

object ProductData {
  @scala.inline
  def apply(): ProductData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductData]
  }
  @scala.inline
  implicit class ProductDataOps[Self <: ProductData] (val x: Self) extends AnyVal {
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

