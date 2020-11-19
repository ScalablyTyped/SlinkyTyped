package typingsSlinky.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketVersioningOutput
  extends MetadataBearer
     with _OutputTypesUnion
object PutBucketVersioningOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketVersioningOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketVersioningOutput]
  }
}
