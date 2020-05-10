package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfiguration extends js.Object {
  /**
    * Describes the AWS Lambda functions to invoke and the events for which to invoke them.
    */
  var LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList] = js.native
  /**
    * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
    */
  var QueueConfigurations: js.UndefOr[QueueConfigurationList] = js.native
  /**
    * The topic to which notifications are sent and the events for which notifications are generated.
    */
  var TopicConfigurations: js.UndefOr[TopicConfigurationList] = js.native
}

object NotificationConfiguration {
  @scala.inline
  def apply(): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfiguration]
  }
  @scala.inline
  implicit class NotificationConfigurationOps[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLambdaFunctionConfigurations(value: LambdaFunctionConfigurationList): Self = {
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
    def withQueueConfigurations(value: QueueConfigurationList): Self = {
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
    def withTopicConfigurations(value: TopicConfigurationList): Self = {
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

