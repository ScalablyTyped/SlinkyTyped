package typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBucketLifecycleOutput
  extends MetadataBearer
     with _OutputTypesUnion
object DeleteBucketLifecycleOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketLifecycleOutput]
  }
}
