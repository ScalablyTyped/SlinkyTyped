package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingPolicyStatus extends js.Object {
  /**
    * Indicates the status of the automatic scaling policy.
    */
  var State: js.UndefOr[AutoScalingPolicyState] = js.native
  /**
    * The reason for a change in status.
    */
  var StateChangeReason: js.UndefOr[AutoScalingPolicyStateChangeReason] = js.native
}

object AutoScalingPolicyStatus {
  @scala.inline
  def apply(): AutoScalingPolicyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingPolicyStatus]
  }
  @scala.inline
  implicit class AutoScalingPolicyStatusOps[Self <: AutoScalingPolicyStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: AutoScalingPolicyState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangeReason(value: AutoScalingPolicyStateChangeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(js.undefined)
        ret
    }
  }
  
}

