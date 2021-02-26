package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.batchGetTracesExceptionsUnionMod.BatchGetTracesExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.createSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.deleteSamplingRuleExceptionsUnionMod.DeleteSamplingRuleExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.getEncryptionConfigExceptionsUnionMod.GetEncryptionConfigExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.getSamplingRulesExceptionsUnionMod.GetSamplingRulesExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.getSamplingStatisticSummariesExceptionsUnionMod.GetSamplingStatisticSummariesExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.getSamplingTargetsExceptionsUnionMod.GetSamplingTargetsExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.getServiceGraphExceptionsUnionMod.GetServiceGraphExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.getTraceGraphExceptionsUnionMod.GetTraceGraphExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.getTraceSummariesExceptionsUnionMod.GetTraceSummariesExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.putEncryptionConfigExceptionsUnionMod.PutEncryptionConfigExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.putTelemetryRecordsExceptionsUnionMod.PutTelemetryRecordsExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.putTraceSegmentsExceptionsUnionMod.PutTraceSegmentsExceptionsUnion
import typingsSlinky.awsSdkClientXrayNode.updateSamplingRuleExceptionsUnionMod.UpdateSamplingRuleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesThrottledExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ThrottledExceptionDetails> * / any */ @js.native
  trait ThrottledException
    extends BatchGetTracesExceptionsUnion
       with CreateSamplingRuleExceptionsUnion
       with DeleteSamplingRuleExceptionsUnion
       with GetEncryptionConfigExceptionsUnion
       with GetSamplingRulesExceptionsUnion
       with GetSamplingStatisticSummariesExceptionsUnion
       with GetSamplingTargetsExceptionsUnion
       with GetServiceGraphExceptionsUnion
       with GetTraceGraphExceptionsUnion
       with GetTraceSummariesExceptionsUnion
       with PutEncryptionConfigExceptionsUnion
       with PutTelemetryRecordsExceptionsUnion
       with PutTraceSegmentsExceptionsUnion
       with UpdateSamplingRuleExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException = js.native
  }
  object ThrottledException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException): ThrottledException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottledException]
    }
    
    @scala.inline
    implicit class ThrottledExceptionMutableBuilder[Self <: ThrottledException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThrottledExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var Message: js.UndefOr[String] = js.native
  }
  object ThrottledExceptionDetails {
    
    @scala.inline
    def apply(): ThrottledExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottledExceptionDetails]
    }
    
    @scala.inline
    implicit class ThrottledExceptionDetailsMutableBuilder[Self <: ThrottledExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
}
