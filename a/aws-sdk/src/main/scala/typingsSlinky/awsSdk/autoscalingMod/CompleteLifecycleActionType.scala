package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteLifecycleActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.native
  /**
    * The action for the group to take. This parameter can be either CONTINUE or ABANDON.
    */
  var LifecycleActionResult: typingsSlinky.awsSdk.autoscalingMod.LifecycleActionResult = js.native
  /**
    * A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an instance. Amazon EC2 Auto Scaling sends this token to the notification target you specified when you created the lifecycle hook.
    */
  var LifecycleActionToken: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.LifecycleActionToken] = js.native
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255 = js.native
}

object CompleteLifecycleActionType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    LifecycleActionResult: LifecycleActionResult,
    LifecycleHookName: AsciiStringMaxLen255
  ): CompleteLifecycleActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LifecycleActionResult = LifecycleActionResult.asInstanceOf[js.Any], LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteLifecycleActionType]
  }
  @scala.inline
  implicit class CompleteLifecycleActionTypeOps[Self <: CompleteLifecycleActionType] (val x: Self) extends AnyVal {
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
    def withLifecycleActionResult(value: LifecycleActionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleActionResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifecycleHookName(value: AsciiStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleHookName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: XmlStringMaxLen19): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleActionToken(value: LifecycleActionToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleActionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleActionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleActionToken")(js.undefined)
        ret
    }
  }
  
}

