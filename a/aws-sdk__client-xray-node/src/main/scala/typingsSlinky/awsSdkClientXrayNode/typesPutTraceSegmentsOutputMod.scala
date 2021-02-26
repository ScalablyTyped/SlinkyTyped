package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesUnprocessedTraceSegmentMod.UnmarshalledUnprocessedTraceSegment
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutTraceSegmentsOutputMod {
  
  @js.native
  trait PutTraceSegmentsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Segments that failed processing.</p>
      */
    var UnprocessedTraceSegments: js.UndefOr[js.Array[UnmarshalledUnprocessedTraceSegment]] = js.native
  }
  object PutTraceSegmentsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutTraceSegmentsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutTraceSegmentsOutput]
    }
    
    @scala.inline
    implicit class PutTraceSegmentsOutputMutableBuilder[Self <: PutTraceSegmentsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedTraceSegments(value: js.Array[UnmarshalledUnprocessedTraceSegment]): Self = StObject.set(x, "UnprocessedTraceSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedTraceSegmentsUndefined: Self = StObject.set(x, "UnprocessedTraceSegments", js.undefined)
      
      @scala.inline
      def setUnprocessedTraceSegmentsVarargs(value: UnmarshalledUnprocessedTraceSegment*): Self = StObject.set(x, "UnprocessedTraceSegments", js.Array(value :_*))
    }
  }
}
