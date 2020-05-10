package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTerminationPolicyTypesAnswer extends js.Object {
  /**
    * The termination policies supported by Amazon EC2 Auto Scaling: OldestInstance, OldestLaunchConfiguration, NewestInstance, ClosestToNextInstanceHour, Default, OldestLaunchTemplate, and AllocationStrategy.
    */
  var TerminationPolicyTypes: js.UndefOr[TerminationPolicies] = js.native
}

object DescribeTerminationPolicyTypesAnswer {
  @scala.inline
  def apply(): DescribeTerminationPolicyTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTerminationPolicyTypesAnswer]
  }
  @scala.inline
  implicit class DescribeTerminationPolicyTypesAnswerOps[Self <: DescribeTerminationPolicyTypesAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerminationPolicyTypes(value: TerminationPolicies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationPolicyTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationPolicyTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationPolicyTypes")(js.undefined)
        ret
    }
  }
  
}

