package typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketAnalyticsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketAnalyticsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketAnalyticsConfigurationOutput]
  }
}

