package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSetDataRetrievalPolicyOutputMod {
  
  @js.native
  trait SetDataRetrievalPolicyOutput extends _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
  }
  object SetDataRetrievalPolicyOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): SetDataRetrievalPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDataRetrievalPolicyOutput]
    }
    
    @scala.inline
    implicit class SetDataRetrievalPolicyOutputMutableBuilder[Self <: SetDataRetrievalPolicyOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    }
  }
}
