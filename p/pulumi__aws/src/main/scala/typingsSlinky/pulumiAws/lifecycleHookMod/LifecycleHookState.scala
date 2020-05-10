package typingsSlinky.pulumiAws.lifecycleHookMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleHookState extends js.Object {
  /**
    * The name of the Auto Scaling group to which you want to assign the lifecycle hook
    */
  val autoscalingGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
    */
  val defaultResult: js.UndefOr[Input[String]] = js.native
  /**
    * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
    */
  val heartbeatTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
    */
  val lifecycleTransition: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the lifecycle hook.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
    */
  val notificationMetadata: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
    */
  val notificationTargetArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object LifecycleHookState {
  @scala.inline
  def apply(): LifecycleHookState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleHookState]
  }
  @scala.inline
  implicit class LifecycleHookStateOps[Self <: LifecycleHookState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscalingGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultResult(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResult")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleTransition(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationMetadata(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTargetArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTargetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTargetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTargetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
  }
  
}

