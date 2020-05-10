package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedElasticsearchInstanceOfferingsResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.esMod.NextToken] = js.native
  /**
    * List of reserved Elasticsearch instance offerings
    */
  var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList] = js.native
}

object DescribeReservedElasticsearchInstanceOfferingsResponse {
  @scala.inline
  def apply(): DescribeReservedElasticsearchInstanceOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsResponse]
  }
  @scala.inline
  implicit class DescribeReservedElasticsearchInstanceOfferingsResponseOps[Self <: DescribeReservedElasticsearchInstanceOfferingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withReservedElasticsearchInstanceOfferings(value: ReservedElasticsearchInstanceOfferingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstanceOfferings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedElasticsearchInstanceOfferings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstanceOfferings")(js.undefined)
        ret
    }
  }
  
}

