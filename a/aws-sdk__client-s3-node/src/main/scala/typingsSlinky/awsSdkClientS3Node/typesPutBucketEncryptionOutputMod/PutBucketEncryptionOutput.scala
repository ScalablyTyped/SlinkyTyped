package typingsSlinky.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketEncryptionOutput
  extends MetadataBearer
     with _OutputTypesUnion
object PutBucketEncryptionOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketEncryptionOutput]
  }
}
