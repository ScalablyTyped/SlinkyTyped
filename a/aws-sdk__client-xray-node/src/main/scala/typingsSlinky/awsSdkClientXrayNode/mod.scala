package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
import typingsSlinky.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
import typingsSlinky.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
import typingsSlinky.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
import typingsSlinky.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typingsSlinky.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput
import typingsSlinky.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
import typingsSlinky.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
import typingsSlinky.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
import typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
import typingsSlinky.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<XRayResolvableConfiguration, XRayResolvedConfiguration> */ js.Any = js.native
  
  @js.native
  class BatchGetTracesCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.batchGetTracesCommandMod.BatchGetTracesCommand {
    def this(input: BatchGetTracesInput) = this()
  }
  
  @js.native
  class CreateSamplingRuleCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.createSamplingRuleCommandMod.CreateSamplingRuleCommand {
    def this(input: CreateSamplingRuleInput) = this()
  }
  
  @js.native
  class DeleteSamplingRuleCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.deleteSamplingRuleCommandMod.DeleteSamplingRuleCommand {
    def this(input: DeleteSamplingRuleInput) = this()
  }
  
  @js.native
  class GetEncryptionConfigCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.getEncryptionConfigCommandMod.GetEncryptionConfigCommand {
    def this(input: GetEncryptionConfigInput) = this()
  }
  
  @js.native
  class GetSamplingRulesCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.getSamplingRulesCommandMod.GetSamplingRulesCommand {
    def this(input: GetSamplingRulesInput) = this()
  }
  
  @js.native
  class GetSamplingStatisticSummariesCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.getSamplingStatisticSummariesCommandMod.GetSamplingStatisticSummariesCommand {
    def this(input: GetSamplingStatisticSummariesInput) = this()
  }
  
  @js.native
  class GetSamplingTargetsCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.getSamplingTargetsCommandMod.GetSamplingTargetsCommand {
    def this(input: GetSamplingTargetsInput) = this()
  }
  
  @js.native
  class GetServiceGraphCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.getServiceGraphCommandMod.GetServiceGraphCommand {
    def this(input: GetServiceGraphInput) = this()
  }
  
  @js.native
  class GetTraceGraphCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.getTraceGraphCommandMod.GetTraceGraphCommand {
    def this(input: GetTraceGraphInput) = this()
  }
  
  @js.native
  class GetTraceSummariesCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.getTraceSummariesCommandMod.GetTraceSummariesCommand {
    def this(input: GetTraceSummariesInput) = this()
  }
  
  @js.native
  class PutEncryptionConfigCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.putEncryptionConfigCommandMod.PutEncryptionConfigCommand {
    def this(input: PutEncryptionConfigInput) = this()
  }
  
  @js.native
  class PutTelemetryRecordsCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.putTelemetryRecordsCommandMod.PutTelemetryRecordsCommand {
    def this(input: PutTelemetryRecordsInput) = this()
  }
  
  @js.native
  class PutTraceSegmentsCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.putTraceSegmentsCommandMod.PutTraceSegmentsCommand {
    def this(input: PutTraceSegmentsInput) = this()
  }
  
  @js.native
  class UpdateSamplingRuleCommand protected ()
    extends typingsSlinky.awsSdkClientXrayNode.updateSamplingRuleCommandMod.UpdateSamplingRuleCommand {
    def this(input: UpdateSamplingRuleInput) = this()
  }
  
  @js.native
  class XRay ()
    extends typingsSlinky.awsSdkClientXrayNode.xrayMod.XRay
  
  @js.native
  class XRayClient protected ()
    extends typingsSlinky.awsSdkClientXrayNode.xrayclientMod.XRayClient {
    def this(configuration: XRayConfiguration) = this()
  }
}
