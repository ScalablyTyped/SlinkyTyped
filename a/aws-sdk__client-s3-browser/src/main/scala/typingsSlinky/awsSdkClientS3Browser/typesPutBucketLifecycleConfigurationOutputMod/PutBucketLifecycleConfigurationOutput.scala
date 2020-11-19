package typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketLifecycleConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion
object PutBucketLifecycleConfigurationOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleConfigurationOutput]
  }
}
