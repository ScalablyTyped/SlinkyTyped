package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.KMS
import typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.NONE
import typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule
import typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleUpdateMod.SamplingRuleUpdate
import typingsSlinky.awsSdkClientXrayNode.typesSamplingStatisticsDocumentMod.SamplingStatisticsDocument
import typingsSlinky.awsSdkClientXrayNode.typesTelemetryRecordMod.TelemetryRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
    - typingsSlinky.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
    - typingsSlinky.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
    - typingsSlinky.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
    - typingsSlinky.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput
    - typingsSlinky.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
    - typingsSlinky.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
    - typingsSlinky.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
    - typingsSlinky.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput
    - typingsSlinky.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
    - typingsSlinky.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
    - typingsSlinky.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
    - typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
    - typingsSlinky.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def BatchGetTracesInput(TraceIds: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput = {
      val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput]
    }
    
    @scala.inline
    def CreateSamplingRuleInput(SamplingRule: SamplingRule): typingsSlinky.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput = {
      val __obj = js.Dynamic.literal(SamplingRule = SamplingRule.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput]
    }
    
    @scala.inline
    def DeleteSamplingRuleInput(): typingsSlinky.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput]
    }
    
    @scala.inline
    def GetEncryptionConfigInput(): typingsSlinky.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput]
    }
    
    @scala.inline
    def GetSamplingRulesInput(): typingsSlinky.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput]
    }
    
    @scala.inline
    def GetSamplingStatisticSummariesInput(): typingsSlinky.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput]
    }
    
    @scala.inline
    def GetSamplingTargetsInput(
      SamplingStatisticsDocuments: js.Array[SamplingStatisticsDocument] | js.Iterable[SamplingStatisticsDocument]
    ): typingsSlinky.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput = {
      val __obj = js.Dynamic.literal(SamplingStatisticsDocuments = SamplingStatisticsDocuments.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput]
    }
    
    @scala.inline
    def GetServiceGraphInput(EndTime: js.Date | String | Double, StartTime: js.Date | String | Double): typingsSlinky.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput = {
      val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput]
    }
    
    @scala.inline
    def GetTraceGraphInput(TraceIds: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput = {
      val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput]
    }
    
    @scala.inline
    def GetTraceSummariesInput(EndTime: js.Date | String | Double, StartTime: js.Date | String | Double): typingsSlinky.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput = {
      val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput]
    }
    
    @scala.inline
    def PutEncryptionConfigInput(Type: NONE | KMS | String): typingsSlinky.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput]
    }
    
    @scala.inline
    def PutTelemetryRecordsInput(TelemetryRecords: js.Array[TelemetryRecord] | js.Iterable[TelemetryRecord]): typingsSlinky.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput = {
      val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput]
    }
    
    @scala.inline
    def PutTraceSegmentsInput(TraceSegmentDocuments: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput = {
      val __obj = js.Dynamic.literal(TraceSegmentDocuments = TraceSegmentDocuments.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput]
    }
    
    @scala.inline
    def UpdateSamplingRuleInput(SamplingRuleUpdate: SamplingRuleUpdate): typingsSlinky.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput = {
      val __obj = js.Dynamic.literal(SamplingRuleUpdate = SamplingRuleUpdate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput]
    }
  }
}
