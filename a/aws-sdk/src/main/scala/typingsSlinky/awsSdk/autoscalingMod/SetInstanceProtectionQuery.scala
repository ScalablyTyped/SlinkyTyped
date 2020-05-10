package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetInstanceProtectionQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * One or more instance IDs.
    */
  var InstanceIds: typingsSlinky.awsSdk.autoscalingMod.InstanceIds = js.native
  /**
    * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
    */
  var ProtectedFromScaleIn: typingsSlinky.awsSdk.autoscalingMod.ProtectedFromScaleIn = js.native
}

object SetInstanceProtectionQuery {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    InstanceIds: InstanceIds,
    ProtectedFromScaleIn: ProtectedFromScaleIn
  ): SetInstanceProtectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], InstanceIds = InstanceIds.asInstanceOf[js.Any], ProtectedFromScaleIn = ProtectedFromScaleIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstanceProtectionQuery]
  }
  @scala.inline
  implicit class SetInstanceProtectionQueryOps[Self <: SetInstanceProtectionQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceIds(value: InstanceIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectedFromScaleIn(value: ProtectedFromScaleIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtectedFromScaleIn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

