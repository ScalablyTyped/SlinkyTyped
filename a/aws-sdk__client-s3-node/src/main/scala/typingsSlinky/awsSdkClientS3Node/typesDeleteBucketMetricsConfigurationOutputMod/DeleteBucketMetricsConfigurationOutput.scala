package typingsSlinky.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBucketMetricsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion
object DeleteBucketMetricsConfigurationOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketMetricsConfigurationOutput]
  }
}
