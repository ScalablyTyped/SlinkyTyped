package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductViewDetail extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the product.
    */
  var ProductARN: js.UndefOr[ResourceARN] = js.native
  /**
    * Summary information about the product view.
    */
  var ProductViewSummary: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  /**
    * The status of the product.    AVAILABLE - The product is ready for use.    CREATING - Product creation has started; the product is not ready for use.    FAILED - An action failed.  
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Status] = js.native
}

object ProductViewDetail {
  @scala.inline
  def apply(): ProductViewDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewDetail]
  }
  @scala.inline
  implicit class ProductViewDetailOps[Self <: ProductViewDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withProductARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductARN")(js.undefined)
        ret
    }
    @scala.inline
    def withProductViewSummary(value: ProductViewSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductViewSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

