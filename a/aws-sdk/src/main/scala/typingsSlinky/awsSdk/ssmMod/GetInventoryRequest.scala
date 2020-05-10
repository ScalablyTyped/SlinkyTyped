package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInventoryRequest extends js.Object {
  /**
    * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the AWS:InstanceInformation.PlatformType type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.native
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[InventoryFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The list of inventory item types to return.
    */
  var ResultAttributes: js.UndefOr[ResultAttributeList] = js.native
}

object GetInventoryRequest {
  @scala.inline
  def apply(): GetInventoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInventoryRequest]
  }
  @scala.inline
  implicit class GetInventoryRequestOps[Self <: GetInventoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregators(value: InventoryAggregatorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregators")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: InventoryFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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
    @scala.inline
    def withResultAttributes(value: ResultAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultAttributes")(js.undefined)
        ret
    }
  }
  
}

