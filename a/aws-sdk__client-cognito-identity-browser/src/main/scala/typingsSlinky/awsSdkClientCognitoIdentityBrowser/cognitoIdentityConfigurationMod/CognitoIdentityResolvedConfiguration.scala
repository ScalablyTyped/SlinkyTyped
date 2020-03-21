package typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint
import typingsSlinky.awsSdkTypes.httpMod.HttpHandler
import typingsSlinky.awsSdkTypes.httpMod.HttpOptions
import typingsSlinky.awsSdkTypes.marshallerMod.RequestSerializer
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.middlewareMod.Terminalware
import typingsSlinky.awsSdkTypes.signatureMod.RequestSigner
import typingsSlinky.awsSdkTypes.unmarshallerMod.ResponseParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoIdentityResolvedConfiguration extends CognitoIdentityConfiguration {
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
  var handler_Original: Terminalware[_, Blob] = js.native
  @JSName("httpHandler")
  var httpHandler_CognitoIdentityResolvedConfiguration: HttpHandler[Blob, HttpOptions] = js.native
  @JSName("maxRedirects")
  var maxRedirects_CognitoIdentityResolvedConfiguration: Double = js.native
  @JSName("maxRetries")
  var maxRetries_CognitoIdentityResolvedConfiguration: Double = js.native
  var parser: ResponseParser[Blob] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Blob]] = js.native
  @JSName("sha256")
  var sha256_CognitoIdentityResolvedConfiguration: HashConstructor = js.native
  @JSName("signer")
  var signer_CognitoIdentityResolvedConfiguration: RequestSigner = js.native
  @JSName("signingName")
  var signingName_CognitoIdentityResolvedConfiguration: String = js.native
  @JSName("sslEnabled")
  var sslEnabled_CognitoIdentityResolvedConfiguration: Boolean = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector[Blob] = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
  @JSName("base64Decoder")
  def base64Decoder_MCognitoIdentityResolvedConfiguration(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  @JSName("base64Encoder")
  def base64Encoder_MCognitoIdentityResolvedConfiguration(input: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  @JSName("credentials")
  def credentials_MCognitoIdentityResolvedConfiguration(): js.Promise[Credentials] = js.native
  @JSName("endpoint")
  def endpoint_MCognitoIdentityResolvedConfiguration(): js.Promise[HttpEndpoint] = js.native
  @JSName("handler")
  def handler_MCognitoIdentityResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Any */](context: HandlerExecutionContext): FinalizeHandler[Input, Output, Blob] = js.native
  @JSName("region")
  def region_MCognitoIdentityResolvedConfiguration(): js.Promise[String] = js.native
  def serializer(): js.Promise[RequestSerializer[Blob]] = js.native
  @JSName("streamCollector")
  def streamCollector_MCognitoIdentityResolvedConfiguration(stream: Blob): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  @JSName("urlParser")
  def urlParser_MCognitoIdentityResolvedConfiguration(url: String): HttpEndpoint = js.native
  @JSName("utf8Decoder")
  def utf8Decoder_MCognitoIdentityResolvedConfiguration(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  @JSName("utf8Encoder")
  def utf8Encoder_MCognitoIdentityResolvedConfiguration(input: scala.scalajs.js.typedarray.Uint8Array): String = js.native
}

