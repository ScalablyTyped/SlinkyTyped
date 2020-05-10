package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPlanResourcesRequest extends js.Object {
  /**
    * The maximum number of scalable resources to return. The value must be between 1 and 50. The default value is 50.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.NextToken] = js.native
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
}

object DescribeScalingPlanResourcesRequest {
  @scala.inline
  def apply(ScalingPlanName: ScalingPlanName, ScalingPlanVersion: ScalingPlanVersion): DescribeScalingPlanResourcesRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPlanResourcesRequest]
  }
  @scala.inline
  implicit class DescribeScalingPlanResourcesRequestOps[Self <: DescribeScalingPlanResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScalingPlanName(value: ScalingPlanName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPlanName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalingPlanVersion(value: ScalingPlanVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPlanVersion")(value.asInstanceOf[js.Any])
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
  }
  
}

