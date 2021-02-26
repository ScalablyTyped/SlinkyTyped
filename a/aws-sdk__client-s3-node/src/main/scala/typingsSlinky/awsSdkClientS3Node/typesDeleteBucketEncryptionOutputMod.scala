package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteBucketEncryptionOutputMod {
  
  @js.native
  trait DeleteBucketEncryptionOutput
    extends MetadataBearer
       with _OutputTypesUnion
  object DeleteBucketEncryptionOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteBucketEncryptionOutput]
    }
  }
}
