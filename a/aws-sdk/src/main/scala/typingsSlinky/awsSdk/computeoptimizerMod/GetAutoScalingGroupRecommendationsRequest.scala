package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoScalingGroupRecommendationsRequest extends js.Object {
  /**
    * The AWS account IDs for which to return Auto Scaling group recommendations. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
    */
  var autoScalingGroupArns: js.UndefOr[AutoScalingGroupArns] = js.native
  /**
    * An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * The maximum number of Auto Scaling group recommendations to return with a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to advance to the next page of Auto Scaling group recommendations.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetAutoScalingGroupRecommendationsRequest {
  @scala.inline
  def apply(): GetAutoScalingGroupRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoScalingGroupRecommendationsRequest]
  }
  @scala.inline
  implicit class GetAutoScalingGroupRecommendationsRequestOps[Self <: GetAutoScalingGroupRecommendationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountIds(value: AccountIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingGroupArns(value: AutoScalingGroupArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroupArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupArns")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

