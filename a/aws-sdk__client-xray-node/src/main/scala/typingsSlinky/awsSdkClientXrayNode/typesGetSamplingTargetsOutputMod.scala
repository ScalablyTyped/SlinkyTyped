package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesSamplingTargetDocumentMod.UnmarshalledSamplingTargetDocument
import typingsSlinky.awsSdkClientXrayNode.typesUnprocessedStatisticsMod.UnmarshalledUnprocessedStatistics
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSamplingTargetsOutputMod {
  
  @js.native
  trait GetSamplingTargetsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest version.</p>
      */
    var LastRuleModification: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>Updated rules that the service should use to sample requests.</p>
      */
    var SamplingTargetDocuments: js.UndefOr[js.Array[UnmarshalledSamplingTargetDocument]] = js.native
    
    /**
      * <p>Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.</p>
      */
    var UnprocessedStatistics: js.UndefOr[js.Array[UnmarshalledUnprocessedStatistics]] = js.native
  }
  object GetSamplingTargetsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetSamplingTargetsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSamplingTargetsOutput]
    }
    
    @scala.inline
    implicit class GetSamplingTargetsOutputMutableBuilder[Self <: GetSamplingTargetsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastRuleModification(value: js.Date): Self = StObject.set(x, "LastRuleModification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastRuleModificationUndefined: Self = StObject.set(x, "LastRuleModification", js.undefined)
      
      @scala.inline
      def setSamplingTargetDocuments(value: js.Array[UnmarshalledSamplingTargetDocument]): Self = StObject.set(x, "SamplingTargetDocuments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingTargetDocumentsUndefined: Self = StObject.set(x, "SamplingTargetDocuments", js.undefined)
      
      @scala.inline
      def setSamplingTargetDocumentsVarargs(value: UnmarshalledSamplingTargetDocument*): Self = StObject.set(x, "SamplingTargetDocuments", js.Array(value :_*))
      
      @scala.inline
      def setUnprocessedStatistics(value: js.Array[UnmarshalledUnprocessedStatistics]): Self = StObject.set(x, "UnprocessedStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedStatisticsUndefined: Self = StObject.set(x, "UnprocessedStatistics", js.undefined)
      
      @scala.inline
      def setUnprocessedStatisticsVarargs(value: UnmarshalledUnprocessedStatistics*): Self = StObject.set(x, "UnprocessedStatistics", js.Array(value :_*))
    }
  }
}
