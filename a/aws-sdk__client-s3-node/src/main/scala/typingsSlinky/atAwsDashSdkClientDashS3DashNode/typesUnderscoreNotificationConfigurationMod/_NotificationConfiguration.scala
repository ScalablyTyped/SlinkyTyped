package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNotificationConfigurationMod

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLambdaFunctionConfigurationMod._LambdaFunctionConfiguration
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreQueueConfigurationMod._QueueConfiguration
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTopicConfigurationMod._TopicConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _NotificationConfiguration extends js.Object {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  var LambdaFunctionConfigurations: js.UndefOr[
    js.Array[_LambdaFunctionConfiguration] | js.Iterable[_LambdaFunctionConfiguration]
  ] = js.undefined
  /**
    * _QueueConfigurationList shape
    */
  var QueueConfigurations: js.UndefOr[js.Array[_QueueConfiguration] | js.Iterable[_QueueConfiguration]] = js.undefined
  /**
    * _TopicConfigurationList shape
    */
  var TopicConfigurations: js.UndefOr[js.Array[_TopicConfiguration] | js.Iterable[_TopicConfiguration]] = js.undefined
}

object _NotificationConfiguration {
  @scala.inline
  def apply(
    LambdaFunctionConfigurations: js.Array[_LambdaFunctionConfiguration] | js.Iterable[_LambdaFunctionConfiguration] = null,
    QueueConfigurations: js.Array[_QueueConfiguration] | js.Iterable[_QueueConfiguration] = null,
    TopicConfigurations: js.Array[_TopicConfiguration] | js.Iterable[_TopicConfiguration] = null
  ): _NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (LambdaFunctionConfigurations != null) __obj.updateDynamic("LambdaFunctionConfigurations")(LambdaFunctionConfigurations.asInstanceOf[js.Any])
    if (QueueConfigurations != null) __obj.updateDynamic("QueueConfigurations")(QueueConfigurations.asInstanceOf[js.Any])
    if (TopicConfigurations != null) __obj.updateDynamic("TopicConfigurations")(TopicConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NotificationConfiguration]
  }
}

