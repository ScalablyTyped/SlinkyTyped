package typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typingsSlinky.awsSdkClientS3Node.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typingsSlinky.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketNotificationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CloudFunctionConfiguration shape
    */
  var CloudFunctionConfiguration: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.undefined
  /**
    * _QueueConfigurationDeprecated shape
    */
  var QueueConfiguration: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.undefined
  /**
    * _TopicConfigurationDeprecated shape
    */
  var TopicConfiguration: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.undefined
}

object GetBucketNotificationOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CloudFunctionConfiguration: UnmarshalledCloudFunctionConfiguration = null,
    QueueConfiguration: UnmarshalledQueueConfigurationDeprecated = null,
    TopicConfiguration: UnmarshalledTopicConfigurationDeprecated = null
  ): GetBucketNotificationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CloudFunctionConfiguration != null) __obj.updateDynamic("CloudFunctionConfiguration")(CloudFunctionConfiguration.asInstanceOf[js.Any])
    if (QueueConfiguration != null) __obj.updateDynamic("QueueConfiguration")(QueueConfiguration.asInstanceOf[js.Any])
    if (TopicConfiguration != null) __obj.updateDynamic("TopicConfiguration")(TopicConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketNotificationOutput]
  }
}

