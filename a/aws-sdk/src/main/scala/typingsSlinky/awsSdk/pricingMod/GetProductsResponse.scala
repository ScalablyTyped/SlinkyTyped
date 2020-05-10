package typingsSlinky.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProductsResponse extends js.Object {
  /**
    * The format version of the response. For example, aws_v1.
    */
  var FormatVersion: js.UndefOr[String] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The list of products that match your filters. The list contains both the product metadata and the price information.
    */
  var PriceList: js.UndefOr[typingsSlinky.awsSdk.pricingMod.PriceList] = js.native
}

object GetProductsResponse {
  @scala.inline
  def apply(): GetProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProductsResponse]
  }
  @scala.inline
  implicit class GetProductsResponseOps[Self <: GetProductsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormatVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormatVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceList(value: PriceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PriceList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PriceList")(js.undefined)
        ret
    }
  }
  
}

