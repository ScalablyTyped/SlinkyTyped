package typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.Endpoint
import typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.middlewareMod.Terminalware
import typingsSlinky.awsSdkTypes.serdeMod.RequestSerializer
import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
import typingsSlinky.awsSdkTypes.signatureMod.RequestSigner
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinpointResolvedConfiguration extends PinpointConfiguration {
  
  var _user_injected_http_handler: Boolean = js.native
  
  @JSName("base64Decoder")
  def base64Decoder_MPinpointResolvedConfiguration(input: String): js.typedarray.Uint8Array = js.native
  @JSName("base64Decoder")
  var base64Decoder_Original: Decoder = js.native
  
  @JSName("base64Encoder")
  def base64Encoder_MPinpointResolvedConfiguration(input: js.typedarray.Uint8Array): String = js.native
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  
  @JSName("credentials")
  def credentials_MPinpointResolvedConfiguration(): js.Promise[Credentials] = js.native
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  
  @JSName("endpoint")
  def endpoint_MPinpointResolvedConfiguration(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
  ] = js.native
  @JSName("endpoint")
  var endpoint_Original: Provider[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
  ] = js.native
  
  @JSName("handler")
  def handler_MPinpointResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Object */](context: HandlerExecutionContext): DeserializeHandler[Input, Output] = js.native
  @JSName("handler")
  var handler_Original: Terminalware = js.native
  
  @JSName("maxRedirects")
  var maxRedirects_PinpointResolvedConfiguration: Double = js.native
  
  @JSName("maxRetries")
  var maxRetries_PinpointResolvedConfiguration: Double = js.native
  
  var parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<Blob> */ js.Any = js.native
  
  @JSName("region")
  def region_MPinpointResolvedConfiguration(): js.Promise[String] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
  
  def serializer(): js.Promise[RequestSerializer[Blob, _]] = js.native
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Blob, _]] = js.native
  
  @JSName("sha256")
  var sha256_PinpointResolvedConfiguration: HashConstructor = js.native
  
  @JSName("signer")
  var signer_PinpointResolvedConfiguration: RequestSigner = js.native
  
  @JSName("signingName")
  var signingName_PinpointResolvedConfiguration: String = js.native
  
  @JSName("sslEnabled")
  var sslEnabled_PinpointResolvedConfiguration: Boolean = js.native
  
  @JSName("streamCollector")
  def streamCollector_MPinpointResolvedConfiguration(stream: js.Any): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector = js.native
  
  @JSName("urlParser")
  def urlParser_MPinpointResolvedConfiguration(url: String): Endpoint = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  
  @JSName("utf8Decoder")
  def utf8Decoder_MPinpointResolvedConfiguration(input: String): js.typedarray.Uint8Array = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  
  @JSName("utf8Encoder")
  def utf8Encoder_MPinpointResolvedConfiguration(input: js.typedarray.Uint8Array): String = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
}
