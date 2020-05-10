package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoScalingGroupRecommendationsResponse extends js.Object {
  /**
    * An array of objects that describe Auto Scaling group recommendations.
    */
  var autoScalingGroupRecommendations: js.UndefOr[AutoScalingGroupRecommendations] = js.native
  /**
    * An array of objects that describe errors of the request. For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.
    */
  var errors: js.UndefOr[GetRecommendationErrors] = js.native
  /**
    * The token to use to advance to the next page of Auto Scaling group recommendations. This value is null when there are no more pages of Auto Scaling group recommendations to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetAutoScalingGroupRecommendationsResponse {
  @scala.inline
  def apply(): GetAutoScalingGroupRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoScalingGroupRecommendationsResponse]
  }
  @scala.inline
  implicit class GetAutoScalingGroupRecommendationsResponseOps[Self <: GetAutoScalingGroupRecommendationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupRecommendations(value: AutoScalingGroupRecommendations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupRecommendations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroupRecommendations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupRecommendations")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: GetRecommendationErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
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

