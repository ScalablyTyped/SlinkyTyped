package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketRequestPaymentOutputMod {
  
  @js.native
  trait PutBucketRequestPaymentOutput
    extends MetadataBearer
       with _OutputTypesUnion
  object PutBucketRequestPaymentOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketRequestPaymentOutput]
    }
  }
}
