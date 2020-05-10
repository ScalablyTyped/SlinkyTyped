package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateDiscoveredResourceCountsResponse extends js.Object {
  /**
    * The key passed into the request object. If GroupByKey is not provided, the result will be empty.
    */
  var GroupByKey: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * Returns a list of GroupedResourceCount objects.
    */
  var GroupedResourceCounts: js.UndefOr[GroupedResourceCountList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
  /**
    * The total number of resources that are present in an aggregator with the filters that you provide.
    */
  var TotalDiscoveredResources: Long = js.native
}

object GetAggregateDiscoveredResourceCountsResponse {
  @scala.inline
  def apply(TotalDiscoveredResources: Long): GetAggregateDiscoveredResourceCountsResponse = {
    val __obj = js.Dynamic.literal(TotalDiscoveredResources = TotalDiscoveredResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateDiscoveredResourceCountsResponse]
  }
  @scala.inline
  implicit class GetAggregateDiscoveredResourceCountsResponseOps[Self <: GetAggregateDiscoveredResourceCountsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalDiscoveredResources(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalDiscoveredResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupByKey(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupByKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupByKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedResourceCounts(value: GroupedResourceCountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupedResourceCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedResourceCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupedResourceCounts")(js.undefined)
        ret
    }
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
  }
  
}

