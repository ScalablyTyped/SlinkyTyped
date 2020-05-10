package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpsSummaryRequest extends js.Object {
  /**
    * Optional aggregators that return counts of OpsItems based on one or more expressions.
    */
  var Aggregators: js.UndefOr[OpsAggregatorList] = js.native
  /**
    * Optional filters used to scope down the returned OpsItems. 
    */
  var Filters: js.UndefOr[OpsFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The OpsItem data type to return.
    */
  var ResultAttributes: js.UndefOr[OpsResultAttributeList] = js.native
  /**
    * Specify the name of a resource data sync to get.
    */
  var SyncName: js.UndefOr[ResourceDataSyncName] = js.native
}

object GetOpsSummaryRequest {
  @scala.inline
  def apply(): GetOpsSummaryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpsSummaryRequest]
  }
  @scala.inline
  implicit class GetOpsSummaryRequestOps[Self <: GetOpsSummaryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregators(value: OpsAggregatorList): Self = {
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
    def withFilters(value: OpsFilterList): Self = {
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
    def withResultAttributes(value: OpsResultAttributeList): Self = {
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
    @scala.inline
    def withSyncName(value: ResourceDataSyncName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncName")(js.undefined)
        ret
    }
  }
  
}

