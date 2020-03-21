package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketAnalyticsConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketAnalyticsConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketAnalyticsConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>The configuration and any analyses for the analytics filter.</p>
      */
    var AnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsConfiguration] = js.native
  }
  
}

