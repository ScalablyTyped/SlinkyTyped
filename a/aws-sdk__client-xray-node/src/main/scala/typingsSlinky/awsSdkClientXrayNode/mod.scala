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
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvableConfiguration
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.clientMod.ConfigurationPropertyDefinition
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint
import typingsSlinky.awsSdkTypes.httpMod.HttpHandler
import typingsSlinky.awsSdkTypes.httpMod.HttpOptions
import typingsSlinky.awsSdkTypes.marshallerMod.RequestSerializer
import typingsSlinky.awsSdkTypes.middlewareMod.Terminalware
import typingsSlinky.awsSdkTypes.signatureMod.RequestSigner
import typingsSlinky.awsSdkTypes.unmarshallerMod.ResponseParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.DelayDecider
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RetryDecider
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  
  @js.native
  object configurationProperties extends js.Object {
    val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val base64Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], Decoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val base64Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], Encoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val bodyLengthChecker: ConfigurationPropertyDefinition[
        js.Function1[/* body */ _, js.UndefOr[Double]], 
        js.Function1[/* body */ _, js.UndefOr[Double]], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val credentials: ConfigurationPropertyDefinition[
        js.UndefOr[Credentials | Provider[Credentials]], 
        Provider[Credentials], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val delayDecider: ConfigurationPropertyDefinition[
        js.UndefOr[DelayDecider], 
        js.UndefOr[DelayDecider], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val endpoint: ConfigurationPropertyDefinition[
        js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
        Provider[HttpEndpoint], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val handler: ConfigurationPropertyDefinition[
        js.UndefOr[Terminalware[_, Readable]], 
        Terminalware[_, Readable], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val httpHandler: ConfigurationPropertyDefinition[
        js.UndefOr[HttpHandler[Readable, HttpOptions]], 
        HttpHandler[Readable, HttpOptions], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val maxRedirects: ConfigurationPropertyDefinition[js.UndefOr[Double], Double, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val maxRetries: ConfigurationPropertyDefinition[js.UndefOr[Double], Double, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val parser: ConfigurationPropertyDefinition[
        ResponseParser[Readable], 
        ResponseParser[Readable], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val profile: ConfigurationPropertyDefinition[
        js.UndefOr[String], 
        js.UndefOr[String], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val region: ConfigurationPropertyDefinition[
        js.UndefOr[String | Provider[String]], 
        Provider[String], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val retryDecider: ConfigurationPropertyDefinition[
        js.UndefOr[RetryDecider], 
        js.UndefOr[RetryDecider], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val serializer: ConfigurationPropertyDefinition[
        Provider[RequestSerializer[Readable]], 
        Provider[RequestSerializer[Readable]], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val sha256: ConfigurationPropertyDefinition[
        js.UndefOr[HashConstructor], 
        HashConstructor, 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val signer: ConfigurationPropertyDefinition[
        js.UndefOr[RequestSigner], 
        RequestSigner, 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val signingName: ConfigurationPropertyDefinition[js.UndefOr[String], String, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val sslEnabled: ConfigurationPropertyDefinition[js.UndefOr[Boolean], Boolean, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val streamCollector: ConfigurationPropertyDefinition[
        js.UndefOr[StreamCollector[Readable]], 
        StreamCollector[Readable], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val urlParser: ConfigurationPropertyDefinition[
        js.UndefOr[UrlParser], 
        UrlParser, 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val utf8Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], Decoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val utf8Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], Encoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
  }
  
}

