package typingsSlinky.awsSdkClientS3Browser.typesNotificationConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.typesLambdaFunctionConfigurationMod.LambdaFunctionConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesQueueConfigurationMod.QueueConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesTopicConfigurationMod.TopicConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfiguration extends js.Object {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  var LambdaFunctionConfigurations: js.UndefOr[js.Array[LambdaFunctionConfiguration] | js.Iterable[LambdaFunctionConfiguration]] = js.native
  /**
    * _QueueConfigurationList shape
    */
  var QueueConfigurations: js.UndefOr[js.Array[QueueConfiguration] | js.Iterable[QueueConfiguration]] = js.native
  /**
    * _TopicConfigurationList shape
    */
  var TopicConfigurations: js.UndefOr[js.Array[TopicConfiguration] | js.Iterable[TopicConfiguration]] = js.native
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
    def withLambdaFunctionConfigurationsIterable(value: js.Iterable[LambdaFunctionConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaFunctionConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLambdaFunctionConfigurations(value: js.Array[LambdaFunctionConfiguration] | js.Iterable[LambdaFunctionConfiguration]): Self = {
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
    def withQueueConfigurationsIterable(value: js.Iterable[QueueConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueConfigurations(value: js.Array[QueueConfiguration] | js.Iterable[QueueConfiguration]): Self = {
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
    def withTopicConfigurationsIterable(value: js.Iterable[TopicConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicConfigurations(value: js.Array[TopicConfiguration] | js.Iterable[TopicConfiguration]): Self = {
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

