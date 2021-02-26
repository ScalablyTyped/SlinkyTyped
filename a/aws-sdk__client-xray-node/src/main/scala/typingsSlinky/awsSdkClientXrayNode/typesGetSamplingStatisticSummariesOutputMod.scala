package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod.UnmarshalledSamplingStatisticSummary
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSamplingStatisticSummariesOutputMod {
  
  @js.native
  trait GetSamplingStatisticSummariesOutput extends OutputTypesUnion {
    
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
      * <p>Information about the number of requests instrumented for each sampling rule.</p>
      */
    var SamplingStatisticSummaries: js.UndefOr[js.Array[UnmarshalledSamplingStatisticSummary]] = js.native
  }
  object GetSamplingStatisticSummariesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetSamplingStatisticSummariesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSamplingStatisticSummariesOutput]
    }
    
    @scala.inline
    implicit class GetSamplingStatisticSummariesOutputMutableBuilder[Self <: GetSamplingStatisticSummariesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setSamplingStatisticSummaries(value: js.Array[UnmarshalledSamplingStatisticSummary]): Self = StObject.set(x, "SamplingStatisticSummaries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingStatisticSummariesUndefined: Self = StObject.set(x, "SamplingStatisticSummaries", js.undefined)
      
      @scala.inline
      def setSamplingStatisticSummariesVarargs(value: UnmarshalledSamplingStatisticSummary*): Self = StObject.set(x, "SamplingStatisticSummaries", js.Array(value :_*))
    }
  }
}
