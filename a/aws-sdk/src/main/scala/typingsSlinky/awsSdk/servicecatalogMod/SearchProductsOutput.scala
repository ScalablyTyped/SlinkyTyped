package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProductsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * The product view aggregations.
    */
  var ProductViewAggregations: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProductViewAggregations] = js.native
  /**
    * Information about the product views.
    */
  var ProductViewSummaries: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProductViewSummaries] = js.native
}

object SearchProductsOutput {
  @scala.inline
  def apply(): SearchProductsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProductsOutput]
  }
  @scala.inline
  implicit class SearchProductsOutputOps[Self <: SearchProductsOutput] (val x: Self) extends AnyVal {
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
    def withProductViewAggregations(value: ProductViewAggregations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewAggregations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductViewAggregations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewAggregations")(js.undefined)
        ret
    }
    @scala.inline
    def withProductViewSummaries(value: ProductViewSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductViewSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewSummaries")(js.undefined)
        ret
    }
  }
  
}

