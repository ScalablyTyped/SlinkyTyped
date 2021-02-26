package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesTraceMod.UnmarshalledTrace
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchGetTracesOutputMod {
  
  @js.native
  trait BatchGetTracesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * <p>Full traces for the specified requests.</p>
      */
    var Traces: js.UndefOr[js.Array[UnmarshalledTrace]] = js.native
    
    /**
      * <p>Trace IDs of requests that haven't been processed.</p>
      */
    var UnprocessedTraceIds: js.UndefOr[js.Array[String]] = js.native
  }
  object BatchGetTracesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): BatchGetTracesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetTracesOutput]
    }
    
    @scala.inline
    implicit class BatchGetTracesOutputMutableBuilder[Self <: BatchGetTracesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setTraces(value: js.Array[UnmarshalledTrace]): Self = StObject.set(x, "Traces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracesUndefined: Self = StObject.set(x, "Traces", js.undefined)
      
      @scala.inline
      def setTracesVarargs(value: UnmarshalledTrace*): Self = StObject.set(x, "Traces", js.Array(value :_*))
      
      @scala.inline
      def setUnprocessedTraceIds(value: js.Array[String]): Self = StObject.set(x, "UnprocessedTraceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedTraceIdsUndefined: Self = StObject.set(x, "UnprocessedTraceIds", js.undefined)
      
      @scala.inline
      def setUnprocessedTraceIdsVarargs(value: String*): Self = StObject.set(x, "UnprocessedTraceIds", js.Array(value :_*))
    }
  }
}
