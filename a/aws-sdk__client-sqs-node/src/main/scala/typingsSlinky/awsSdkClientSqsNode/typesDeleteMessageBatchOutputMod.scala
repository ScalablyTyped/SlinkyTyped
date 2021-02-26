package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchResultEntryMod.UnmarshalledDeleteMessageBatchResultEntry
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMessageBatchOutputMod {
  
  @js.native
  trait DeleteMessageBatchOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>A list of <code> <a>BatchResultErrorEntry</a> </code> items.</p>
      */
    var Failed: js.Array[UnmarshalledBatchResultErrorEntry] = js.native
    
    /**
      * <p>A list of <code> <a>DeleteMessageBatchResultEntry</a> </code> items.</p>
      */
    var Successful: js.Array[UnmarshalledDeleteMessageBatchResultEntry] = js.native
  }
  object DeleteMessageBatchOutput {
    
    @scala.inline
    def apply(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledDeleteMessageBatchResultEntry]
    ): DeleteMessageBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteMessageBatchOutput]
    }
    
    @scala.inline
    implicit class DeleteMessageBatchOutputMutableBuilder[Self <: DeleteMessageBatchOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailed(value: js.Array[UnmarshalledBatchResultErrorEntry]): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedVarargs(value: UnmarshalledBatchResultErrorEntry*): Self = StObject.set(x, "Failed", js.Array(value :_*))
      
      @scala.inline
      def setSuccessful(value: js.Array[UnmarshalledDeleteMessageBatchResultEntry]): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulVarargs(value: UnmarshalledDeleteMessageBatchResultEntry*): Self = StObject.set(x, "Successful", js.Array(value :_*))
    }
  }
}
