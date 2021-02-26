package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGenerateRandomOutputMod {
  
  @js.native
  trait GenerateRandomOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The random byte string. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
      */
    var Plaintext: js.UndefOr[js.typedarray.Uint8Array] = js.native
  }
  object GenerateRandomOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GenerateRandomOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateRandomOutput]
    }
    
    @scala.inline
    implicit class GenerateRandomOutputMutableBuilder[Self <: GenerateRandomOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Plaintext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintextUndefined: Self = StObject.set(x, "Plaintext", js.undefined)
    }
  }
}
