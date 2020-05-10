package typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesLambdaFunctionConfigurationMod.UnmarshalledLambdaFunctionConfiguration
import typingsSlinky.awsSdkClientS3Node.typesQueueConfigurationMod.UnmarshalledQueueConfiguration
import typingsSlinky.awsSdkClientS3Node.typesTopicConfigurationMod.UnmarshalledTopicConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketNotificationConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  var LambdaFunctionConfigurations: js.UndefOr[js.Array[UnmarshalledLambdaFunctionConfiguration]] = js.native
  /**
    * _QueueConfigurationList shape
    */
  var QueueConfigurations: js.UndefOr[js.Array[UnmarshalledQueueConfiguration]] = js.native
  /**
    * _TopicConfigurationList shape
    */
  var TopicConfigurations: js.UndefOr[js.Array[UnmarshalledTopicConfiguration]] = js.native
}

object GetBucketNotificationConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketNotificationConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketNotificationConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketNotificationConfigurationOutputOps[Self <: GetBucketNotificationConfigurationOutput] (val x: Self) extends AnyVal {
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

