package typingsSlinky.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod

import typingsSlinky.atAwsDashSdkTypes.buildCredentialsMod.Credentials
import typingsSlinky.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpHandler
import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpOptions
import typingsSlinky.atAwsDashSdkTypes.buildMarshallerMod.RequestSerializer
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.FinalizeHandler
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.HandlerExecutionContext
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Terminalware
import typingsSlinky.atAwsDashSdkTypes.buildSignatureMod.RequestSigner
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.ResponseParser
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Decoder
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Encoder
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Provider
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.UrlParser
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQSResolvedConfiguration extends SQSConfiguration {
  var _user_injected_http_handler: Boolean = js.native
  @JSName("base64Decoder")
  var base64Decoder_Original: Decoder = js.native
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  @JSName("endpoint")
  var endpoint_Original: Provider[HttpEndpoint] = js.native
  @JSName("handler")
  var handler_Original: Terminalware[_, Readable] = js.native
  @JSName("httpHandler")
  var httpHandler_SQSResolvedConfiguration: HttpHandler[Readable, HttpOptions] = js.native
  @JSName("maxRedirects")
  var maxRedirects_SQSResolvedConfiguration: Double = js.native
  @JSName("maxRetries")
  var maxRetries_SQSResolvedConfiguration: Double = js.native
  var parser: ResponseParser[Readable] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Readable]] = js.native
  @JSName("sha256")
  var sha256_SQSResolvedConfiguration: HashConstructor = js.native
  @JSName("signer")
  var signer_SQSResolvedConfiguration: RequestSigner = js.native
  @JSName("signingName")
  var signingName_SQSResolvedConfiguration: String = js.native
  @JSName("sslEnabled")
  var sslEnabled_SQSResolvedConfiguration: Boolean = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector[Readable] = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
  @JSName("base64Decoder")
  def base64Decoder_MSQSResolvedConfiguration(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  @JSName("base64Encoder")
  def base64Encoder_MSQSResolvedConfiguration(input: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  @JSName("credentials")
  def credentials_MSQSResolvedConfiguration(): js.Promise[Credentials] = js.native
  @JSName("endpoint")
  def endpoint_MSQSResolvedConfiguration(): js.Promise[HttpEndpoint] = js.native
  @JSName("handler")
  def handler_MSQSResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Any */](context: HandlerExecutionContext): FinalizeHandler[Input, Output, Readable] = js.native
  @JSName("region")
  def region_MSQSResolvedConfiguration(): js.Promise[String] = js.native
  def serializer(): js.Promise[RequestSerializer[Readable]] = js.native
  @JSName("streamCollector")
  def streamCollector_MSQSResolvedConfiguration(stream: Readable): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  @JSName("urlParser")
  def urlParser_MSQSResolvedConfiguration(url: String): HttpEndpoint = js.native
  @JSName("utf8Decoder")
  def utf8Decoder_MSQSResolvedConfiguration(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  @JSName("utf8Encoder")
  def utf8Encoder_MSQSResolvedConfiguration(input: scala.scalajs.js.typedarray.Uint8Array): String = js.native
}

