package typingsSlinky.awsSdkClientS3Node.typesNotificationConfigurationDeprecatedMod

import typingsSlinky.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.CloudFunctionConfiguration
import typingsSlinky.awsSdkClientS3Node.typesQueueConfigurationDeprecatedMod.QueueConfigurationDeprecated
import typingsSlinky.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod.TopicConfigurationDeprecated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfigurationDeprecated extends js.Object {
  /**
    * _CloudFunctionConfiguration shape
    */
  var CloudFunctionConfiguration: js.UndefOr[
    typingsSlinky.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.CloudFunctionConfiguration
  ] = js.native
  /**
    * _QueueConfigurationDeprecated shape
    */
  var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.native
  /**
    * _TopicConfigurationDeprecated shape
    */
  var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.native
}

object NotificationConfigurationDeprecated {
  @scala.inline
  def apply(): NotificationConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfigurationDeprecated]
  }
  @scala.inline
  implicit class NotificationConfigurationDeprecatedOps[Self <: NotificationConfigurationDeprecated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudFunctionConfiguration(value: CloudFunctionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFunctionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudFunctionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFunctionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueConfiguration(value: QueueConfigurationDeprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicConfiguration(value: TopicConfigurationDeprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicConfiguration")(js.undefined)
        ret
    }
  }
  
}

