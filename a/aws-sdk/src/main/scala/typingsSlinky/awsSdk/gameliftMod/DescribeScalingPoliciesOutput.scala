package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPoliciesOutput extends js.Object {
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A collection of objects containing the scaling policies matching the request.
    */
  var ScalingPolicies: js.UndefOr[ScalingPolicyList] = js.native
}

object DescribeScalingPoliciesOutput {
  @scala.inline
  def apply(): DescribeScalingPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPoliciesOutput]
  }
  @scala.inline
  implicit class DescribeScalingPoliciesOutputOps[Self <: DescribeScalingPoliciesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NonZeroAndMaxString): Self = {
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
    def withScalingPolicies(value: ScalingPolicyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPolicies")(js.undefined)
        ret
    }
  }
  
}

