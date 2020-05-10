package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProvisionedProductsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the provisioned products.
    */
  var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.native
  /**
    * The number of provisioned products found.
    */
  var TotalResultsCount: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.TotalResultsCount] = js.native
}

object SearchProvisionedProductsOutput {
  @scala.inline
  def apply(): SearchProvisionedProductsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProvisionedProductsOutput]
  }
  @scala.inline
  implicit class SearchProvisionedProductsOutputOps[Self <: SearchProvisionedProductsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedProducts(value: ProvisionedProductAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProducts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProducts")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalResultsCount(value: TotalResultsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalResultsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResultsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalResultsCount")(js.undefined)
        ret
    }
  }
  
}

