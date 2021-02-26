package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreObjectOutputMod {
  
  @js.native
  trait RestoreObjectOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
    
    /**
      * <p>Indicates the path in the provided S3 output location where Select results will be restored to.</p>
      */
    var RestoreOutputPath: js.UndefOr[String] = js.native
  }
  object RestoreObjectOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): RestoreObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreObjectOutput]
    }
    
    @scala.inline
    implicit class RestoreObjectOutputMutableBuilder[Self <: RestoreObjectOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
      
      @scala.inline
      def setRestoreOutputPath(value: String): Self = StObject.set(x, "RestoreOutputPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreOutputPathUndefined: Self = StObject.set(x, "RestoreOutputPath", js.undefined)
    }
  }
}
