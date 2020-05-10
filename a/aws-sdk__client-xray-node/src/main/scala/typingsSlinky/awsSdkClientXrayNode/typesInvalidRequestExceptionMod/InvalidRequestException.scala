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

@js.native
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
  var name_InvalidRequestException: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException = js.native
}

object InvalidRequestException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRequestExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException
  ): InvalidRequestException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRequestException]
  }
  @scala.inline
  implicit class InvalidRequestExceptionOps[Self <: InvalidRequestException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

