package typingsSlinky.pulumiAws.notificationMod

import typingsSlinky.pulumiAws.notificationTypeMod.NotificationType
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationArgs extends js.Object {
  /**
    * A list of AutoScaling Group Names
    */
  val groupNames: Input[js.Array[Input[String]]] = js.native
  /**
    * A list of Notification Types that trigger
    * notifications. Acceptable values are documented [in the AWS documentation here][1]
    */
  val notifications: Input[js.Array[Input[NotificationType]]] = js.native
  /**
    * The Topic ARN for notifications to be sent through
    */
  val topicArn: Input[String] = js.native
}

object NotificationArgs {
  @scala.inline
  def apply(
    groupNames: Input[js.Array[Input[String]]],
    notifications: Input[js.Array[Input[NotificationType]]],
    topicArn: Input[String]
  ): NotificationArgs = {
    val __obj = js.Dynamic.literal(groupNames = groupNames.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationArgs]
  }
  @scala.inline
  implicit class NotificationArgsOps[Self <: NotificationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupNames(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifications(value: Input[js.Array[Input[NotificationType]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

