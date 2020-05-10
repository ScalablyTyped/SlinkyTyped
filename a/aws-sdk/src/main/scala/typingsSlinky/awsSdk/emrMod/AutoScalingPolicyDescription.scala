package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingPolicyDescription extends js.Object {
  /**
    * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
    */
  var Constraints: js.UndefOr[ScalingConstraints] = js.native
  /**
    * The scale-in and scale-out rules that comprise the automatic scaling policy.
    */
  var Rules: js.UndefOr[ScalingRuleList] = js.native
  /**
    * The status of an automatic scaling policy. 
    */
  var Status: js.UndefOr[AutoScalingPolicyStatus] = js.native
}

object AutoScalingPolicyDescription {
  @scala.inline
  def apply(): AutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingPolicyDescription]
  }
  @scala.inline
  implicit class AutoScalingPolicyDescriptionOps[Self <: AutoScalingPolicyDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: ScalingConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: ScalingRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AutoScalingPolicyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

