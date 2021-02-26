package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketNotificationOutputMod {
  
  @js.native
  trait PutBucketNotificationOutput
    extends MetadataBearer
       with _OutputTypesUnion
  object PutBucketNotificationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketNotificationOutput]
    }
  }
}
