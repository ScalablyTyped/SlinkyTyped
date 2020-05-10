package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPlanResourcesResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.NextToken] = js.native
  /**
    * Information about the scalable resources.
    */
  var ScalingPlanResources: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanResources] = js.native
}

object DescribeScalingPlanResourcesResponse {
  @scala.inline
  def apply(): DescribeScalingPlanResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPlanResourcesResponse]
  }
  @scala.inline
  implicit class DescribeScalingPlanResourcesResponseOps[Self <: DescribeScalingPlanResourcesResponse] (val x: Self) extends AnyVal {
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
    def withScalingPlanResources(value: ScalingPlanResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPlanResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingPlanResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPlanResources")(js.undefined)
        ret
    }
  }
  
}

