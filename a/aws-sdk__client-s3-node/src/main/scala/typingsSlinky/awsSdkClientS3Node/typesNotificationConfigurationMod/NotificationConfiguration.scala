package typingsSlinky.awsSdkClientS3Node.typesNotificationConfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesLambdaFunctionConfigurationMod.LambdaFunctionConfiguration
import typingsSlinky.awsSdkClientS3Node.typesQueueConfigurationMod.QueueConfiguration
import typingsSlinky.awsSdkClientS3Node.typesTopicConfigurationMod.TopicConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfiguration extends js.Object {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  var LambdaFunctionConfigurations: js.UndefOr[js.Array[LambdaFunctionConfiguration] | js.Iterable[LambdaFunctionConfiguration]] = js.undefined
  /**
    * _QueueConfigurationList shape
    */
  var QueueConfigurations: js.UndefOr[js.Array[QueueConfiguration] | js.Iterable[QueueConfiguration]] = js.undefined
  /**
    * _TopicConfigurationList shape
    */
  var TopicConfigurations: js.UndefOr[js.Array[TopicConfiguration] | js.Iterable[TopicConfiguration]] = js.undefined
}

object NotificationConfiguration {
  @scala.inline
  def apply(
    LambdaFunctionConfigurations: js.Array[LambdaFunctionConfiguration] | js.Iterable[LambdaFunctionConfiguration] = null,
    QueueConfigurations: js.Array[QueueConfiguration] | js.Iterable[QueueConfiguration] = null,
    TopicConfigurations: js.Array[TopicConfiguration] | js.Iterable[TopicConfiguration] = null
  ): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (LambdaFunctionConfigurations != null) __obj.updateDynamic("LambdaFunctionConfigurations")(LambdaFunctionConfigurations.asInstanceOf[js.Any])
    if (QueueConfigurations != null) __obj.updateDynamic("QueueConfigurations")(QueueConfigurations.asInstanceOf[js.Any])
    if (TopicConfigurations != null) __obj.updateDynamic("TopicConfigurations")(TopicConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfiguration]
  }
}

