package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAutoScalingPolicyInput extends js.Object {
  /**
    * Specifies the definition of the automatic scaling policy.
    */
  var AutoScalingPolicy: typingsSlinky.awsSdk.emrMod.AutoScalingPolicy = js.native
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: typingsSlinky.awsSdk.emrMod.ClusterId = js.native
  /**
    * Specifies the ID of the instance group to which the automatic scaling policy is applied.
    */
  var InstanceGroupId: typingsSlinky.awsSdk.emrMod.InstanceGroupId = js.native
}

object PutAutoScalingPolicyInput {
  @scala.inline
  def apply(AutoScalingPolicy: AutoScalingPolicy, ClusterId: ClusterId, InstanceGroupId: InstanceGroupId): PutAutoScalingPolicyInput = {
    val __obj = js.Dynamic.literal(AutoScalingPolicy = AutoScalingPolicy.asInstanceOf[js.Any], ClusterId = ClusterId.asInstanceOf[js.Any], InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAutoScalingPolicyInput]
  }
  @scala.inline
  implicit class PutAutoScalingPolicyInputOps[Self <: PutAutoScalingPolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingPolicy(value: AutoScalingPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceGroupId(value: InstanceGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

