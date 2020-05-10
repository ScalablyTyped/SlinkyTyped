package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfig extends js.Object {
  /**
    * An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.
    */
  var NotificationArn: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NotificationArn] = js.native
  /**
    * The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see Configuring Amazon SNS Notifications for AWS Systems Manager in the AWS Systems Manager User Guide.
    */
  var NotificationEvents: js.UndefOr[NotificationEventList] = js.native
  /**
    * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. 
    */
  var NotificationType: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NotificationType] = js.native
}

object NotificationConfig {
  @scala.inline
  def apply(): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfig]
  }
  @scala.inline
  implicit class NotificationConfigOps[Self <: NotificationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotificationArn(value: NotificationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationEvents(value: NotificationEventList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationType(value: NotificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationType")(js.undefined)
        ret
    }
  }
  
}

