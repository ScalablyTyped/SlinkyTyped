package typingsSlinky.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutScalingPolicyResponse extends js.Object {
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typingsSlinky.awsSdk.applicationautoscalingMod.Alarms] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resulting scaling policy.
    */
  var PolicyARN: ResourceIdMaxLen1600 = js.native
}

object PutScalingPolicyResponse {
  @scala.inline
  def apply(PolicyARN: ResourceIdMaxLen1600): PutScalingPolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyARN = PolicyARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyResponse]
  }
  @scala.inline
  implicit class PutScalingPolicyResponseOps[Self <: PutScalingPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyARN(value: ResourceIdMaxLen1600): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlarms(value: Alarms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alarms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alarms")(js.undefined)
        ret
    }
  }
  
}

