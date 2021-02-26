package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBlobOutputMod {
  
  @js.native
  trait GetBlobOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The content of the blob, usually a file.</p>
      */
    var content: js.typedarray.Uint8Array = js.native
  }
  object GetBlobOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, content: js.typedarray.Uint8Array): GetBlobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBlobOutput]
    }
    
    @scala.inline
    implicit class GetBlobOutputMutableBuilder[Self <: GetBlobOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
