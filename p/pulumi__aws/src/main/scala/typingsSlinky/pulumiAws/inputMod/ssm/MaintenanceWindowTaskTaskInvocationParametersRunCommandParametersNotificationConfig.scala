package typingsSlinky.pulumiAws.inputMod.ssm

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig extends js.Object {
  /**
    * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications about command status changes to this topic.
    */
  var notificationArn: js.UndefOr[Input[String]] = js.native
  /**
    * The different events for which you can receive notifications. Valid values: `All`, `InProgress`, `Success`, `TimedOut`, `Cancelled`, and `Failed`
    */
  var notificationEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * When specified with `Command`, receive notification when the status of a command changes. When specified with `Invocation`, for commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. Valid values: `Command` and `Invocation`
    */
  var notificationType: js.UndefOr[Input[String]] = js.native
}

object MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig {
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigOps[Self <: MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotificationArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationEvents(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(js.undefined)
        ret
    }
  }
  
}

