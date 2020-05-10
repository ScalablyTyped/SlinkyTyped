package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCostAndUsageWithResourcesResponse extends js.Object {
  /**
    * The groups that are specified by the Filter or GroupBy parameters in the request.
    */
  var GroupDefinitions: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.GroupDefinitions] = js.native
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The time period that is covered by the results in the response.
    */
  var ResultsByTime: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ResultsByTime] = js.native
}

object GetCostAndUsageWithResourcesResponse {
  @scala.inline
  def apply(): GetCostAndUsageWithResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCostAndUsageWithResourcesResponse]
  }
  @scala.inline
  implicit class GetCostAndUsageWithResourcesResponseOps[Self <: GetCostAndUsageWithResourcesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupDefinitions(value: GroupDefinitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: NextPageToken): Self = {
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
    def withResultsByTime(value: ResultsByTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultsByTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultsByTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultsByTime")(js.undefined)
        ret
    }
  }
  
}

