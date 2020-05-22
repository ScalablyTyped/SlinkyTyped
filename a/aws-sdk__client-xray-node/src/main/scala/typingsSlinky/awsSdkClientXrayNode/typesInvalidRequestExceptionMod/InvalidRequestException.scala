package typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod

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
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRequestException
  extends ServiceException[InvalidRequestExceptionDetails]
     with BatchGetTracesExceptionsUnion
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
  @JSName("name")
  var name_InvalidRequestException: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException
}

object InvalidRequestException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRequestExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException,
    stack: String = null
  ): InvalidRequestException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRequestException]
  }
}

