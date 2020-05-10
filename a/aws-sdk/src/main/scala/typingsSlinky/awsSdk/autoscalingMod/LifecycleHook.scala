package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleHook extends js.Object {
  /**
    * The name of the Auto Scaling group for the lifecycle hook.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The possible values are CONTINUE and ABANDON.
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.native
  /**
    * The maximum time, in seconds, that an instance can remain in a Pending:Wait or Terminating:Wait state. The maximum is 172800 seconds (48 hours) or 100 times HeartbeatTimeout, whichever is smaller.
    */
  var GlobalTimeout: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.GlobalTimeout] = js.native
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult parameter.
    */
  var HeartbeatTimeout: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.HeartbeatTimeout] = js.native
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.native
  /**
    * The state of the EC2 instance to which to attach the lifecycle hook. The following are possible values:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
    */
  var LifecycleTransition: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.LifecycleTransition] = js.native
  /**
    * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.native
  /**
    * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
    */
  var NotificationTargetARN: js.UndefOr[ResourceName] = js.native
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
    */
  var RoleARN: js.UndefOr[ResourceName] = js.native
}

object LifecycleHook {
  @scala.inline
  def apply(): LifecycleHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleHook]
  }
  @scala.inline
  implicit class LifecycleHookOps[Self <: LifecycleHook] (val x: Self) extends AnyVal {
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
    def withoutAutoScalingGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultResult(value: LifecycleActionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultResult")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTimeout(value: GlobalTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatTimeout(value: HeartbeatTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeartbeatTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeartbeatTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleHookName(value: AsciiStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleHookName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleHookName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleHookName")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleTransition(value: LifecycleTransition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationMetadata(value: XmlStringMaxLen1023): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTargetARN(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationTargetARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTargetARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationTargetARN")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARN(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(js.undefined)
        ret
    }
  }
  
}

