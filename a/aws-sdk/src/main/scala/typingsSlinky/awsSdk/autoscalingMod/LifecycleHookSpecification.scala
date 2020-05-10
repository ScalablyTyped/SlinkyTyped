package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleHookSpecification extends js.Object {
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The valid values are CONTINUE and ABANDON. The default value is ABANDON.
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.native
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult parameter. You can prevent the lifecycle hook from timing out by calling RecordLifecycleActionHeartbeat.
    */
  var HeartbeatTimeout: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.HeartbeatTimeout] = js.native
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255 = js.native
  /**
    * The state of the EC2 instance to which you want to attach the lifecycle hook. The valid values are:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
    */
  var LifecycleTransition: typingsSlinky.awsSdk.autoscalingMod.LifecycleTransition = js.native
  /**
    * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.native
  /**
    * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
    */
  var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.native
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for example, an Amazon SNS topic or an Amazon SQS queue.
    */
  var RoleARN: js.UndefOr[ResourceName] = js.native
}

object LifecycleHookSpecification {
  @scala.inline
  def apply(LifecycleHookName: AsciiStringMaxLen255, LifecycleTransition: LifecycleTransition): LifecycleHookSpecification = {
    val __obj = js.Dynamic.literal(LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any], LifecycleTransition = LifecycleTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleHookSpecification]
  }
  @scala.inline
  implicit class LifecycleHookSpecificationOps[Self <: LifecycleHookSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLifecycleHookName(value: AsciiStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleHookName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifecycleTransition(value: LifecycleTransition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleTransition")(value.asInstanceOf[js.Any])
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
    def withNotificationTargetARN(value: NotificationTargetResourceName): Self = {
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

