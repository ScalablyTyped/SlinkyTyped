package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typingsSlinky.awsSdkClientS3Node.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typingsSlinky.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketNotificationOutput", JSImport.Namespace)
@js.native
object typesGetBucketNotificationOutputMod extends js.Object {
  @js.native
  trait GetBucketNotificationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
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
  
}

