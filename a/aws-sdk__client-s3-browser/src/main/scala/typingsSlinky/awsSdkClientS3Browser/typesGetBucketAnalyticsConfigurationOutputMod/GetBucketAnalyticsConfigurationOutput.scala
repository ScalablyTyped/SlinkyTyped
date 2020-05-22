package typingsSlinky.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketAnalyticsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The configuration and any analyses for the analytics filter.</p>
    */
  var AnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsConfiguration] = js.undefined
}

object GetBucketAnalyticsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, AnalyticsConfiguration: UnmarshalledAnalyticsConfiguration = null): GetBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (AnalyticsConfiguration != null) __obj.updateDynamic("AnalyticsConfiguration")(AnalyticsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
  }
}

