package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAggregationAuthorizationsResponse extends js.Object {
  /**
    * Returns a list of authorizations granted to various aggregator accounts and regions.
    */
  var AggregationAuthorizations: js.UndefOr[AggregationAuthorizationList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeAggregationAuthorizationsResponse {
  @scala.inline
  def apply(): DescribeAggregationAuthorizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregationAuthorizationsResponse]
  }
  @scala.inline
  implicit class DescribeAggregationAuthorizationsResponseOps[Self <: DescribeAggregationAuthorizationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationAuthorizations(value: AggregationAuthorizationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregationAuthorizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationAuthorizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregationAuthorizations")(js.undefined)
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
  }
  
}

