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

object typesInvalidRequestExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRequestExceptionDetails> * / any */ @js.native
  trait InvalidRequestException
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
    
    var name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException = js.native
  }
  object InvalidRequestException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException): InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidRequestException]
    }
    
    @scala.inline
    implicit class InvalidRequestExceptionMutableBuilder[Self <: InvalidRequestException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidRequestExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var Message: js.UndefOr[String] = js.native
  }
  object InvalidRequestExceptionDetails {
    
    @scala.inline
    def apply(): InvalidRequestExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidRequestExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidRequestExceptionDetailsMutableBuilder[Self <: InvalidRequestExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
}
