package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutNotificationConfigurationType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The type of event that causes the notification to be sent. For more information about notification types supported by Amazon EC2 Auto Scaling, see DescribeAutoScalingNotificationTypes.
    */
  var NotificationTypes: AutoScalingNotificationTypes = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
    */
  var TopicARN: ResourceName = js.native
}

object PutNotificationConfigurationType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    NotificationTypes: AutoScalingNotificationTypes,
    TopicARN: ResourceName
  ): PutNotificationConfigurationType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], NotificationTypes = NotificationTypes.asInstanceOf[js.Any], TopicARN = TopicARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutNotificationConfigurationType]
  }
  @scala.inline
  implicit class PutNotificationConfigurationTypeOps[Self <: PutNotificationConfigurationType] (val x: Self) extends AnyVal {
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
    def withNotificationTypes(value: AutoScalingNotificationTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicARN(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

