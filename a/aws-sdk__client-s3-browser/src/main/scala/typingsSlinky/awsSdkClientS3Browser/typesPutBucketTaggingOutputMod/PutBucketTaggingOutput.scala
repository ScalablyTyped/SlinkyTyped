package typingsSlinky.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion
object PutBucketTaggingOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketTaggingOutput]
  }
}
