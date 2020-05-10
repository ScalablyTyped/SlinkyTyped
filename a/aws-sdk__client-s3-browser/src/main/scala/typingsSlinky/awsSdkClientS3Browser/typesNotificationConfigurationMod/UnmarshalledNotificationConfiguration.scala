package typingsSlinky.awsSdkClientS3Browser.typesNotificationConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.typesLambdaFunctionConfigurationMod.UnmarshalledLambdaFunctionConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesQueueConfigurationMod.UnmarshalledQueueConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesTopicConfigurationMod.UnmarshalledTopicConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledNotificationConfiguration extends NotificationConfiguration {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  @JSName("LambdaFunctionConfigurations")
  var LambdaFunctionConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledLambdaFunctionConfiguration]] = js.native
  /**
    * _QueueConfigurationList shape
    */
  @JSName("QueueConfigurations")
  var QueueConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledQueueConfiguration]] = js.native
  /**
    * _TopicConfigurationList shape
    */
  @JSName("TopicConfigurations")
  var TopicConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledTopicConfiguration]] = js.native
}

object UnmarshalledNotificationConfiguration {
  @scala.inline
  def apply(): UnmarshalledNotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledNotificationConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledNotificationConfigurationOps[Self <: UnmarshalledNotificationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLambdaFunctionConfigurations(value: js.Array[UnmarshalledLambdaFunctionConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaFunctionConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaFunctionConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueConfigurations(value: js.Array[UnmarshalledQueueConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicConfigurations(value: js.Array[UnmarshalledTopicConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicConfigurations")(js.undefined)
        ret
    }
  }
  
}

