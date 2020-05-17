package typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typingsSlinky.awsSdkClientS3Browser.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketNotificationOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * _CloudFunctionConfiguration shape
    */
  var CloudFunctionConfiguration: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.native
  /**
    * _QueueConfigurationDeprecated shape
    */
  var QueueConfiguration: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.native
  /**
    * _TopicConfigurationDeprecated shape
    */
  var TopicConfiguration: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.native
}

object GetBucketNotificationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketNotificationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketNotificationOutput]
  }
  @scala.inline
  implicit class GetBucketNotificationOutputOps[Self <: GetBucketNotificationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudFunctionConfiguration(value: UnmarshalledCloudFunctionConfiguration): Self = {
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
    def withQueueConfiguration(value: UnmarshalledQueueConfigurationDeprecated): Self = {
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
    def withTopicConfiguration(value: UnmarshalledTopicConfigurationDeprecated): Self = {
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

