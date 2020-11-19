package typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisResolvedConfiguration extends KinesisConfiguration {
  
  var _user_injected_http_handler: Boolean = js.native
  
  @JSName("base64Decoder")
  def base64Decoder_MKinesisResolvedConfiguration(input: String): js.typedarray.Uint8Array = js.native
  @JSName("base64Decoder")
  var base64Decoder_Original: Decoder = js.native
  
  @JSName("base64Encoder")
  def base64Encoder_MKinesisResolvedConfiguration(input: js.typedarray.Uint8Array): String = js.native
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  
  @JSName("credentials")
  def credentials_MKinesisResolvedConfiguration(): js.Promise[Credentials] = js.native
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  
  @JSName("endpoint")
  def endpoint_MKinesisResolvedConfiguration(): js.Promise[HttpEndpoint] = js.native
  @JSName("endpoint")
  var endpoint_Original: Provider[HttpEndpoint] = js.native
  
  @JSName("handler")
  def handler_MKinesisResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Any */](context: HandlerExecutionContext): FinalizeHandler[Input, Output, Blob] = js.native
  @JSName("handler")
  var handler_Original: Terminalware[_, Blob] = js.native
  
  @JSName("httpHandler")
  var httpHandler_KinesisResolvedConfiguration: HttpHandler[Blob, HttpOptions] = js.native
  
  @JSName("maxRedirects")
  var maxRedirects_KinesisResolvedConfiguration: Double = js.native
  
  @JSName("maxRetries")
  var maxRetries_KinesisResolvedConfiguration: Double = js.native
  
  var parser: ResponseParser[Blob] = js.native
  
  @JSName("region")
  def region_MKinesisResolvedConfiguration(): js.Promise[String] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
  
  def serializer(): js.Promise[RequestSerializer[Blob]] = js.native
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Blob]] = js.native
  
  @JSName("sha256")
  var sha256_KinesisResolvedConfiguration: HashConstructor = js.native
  
  @JSName("signer")
  var signer_KinesisResolvedConfiguration: RequestSigner = js.native
  
  @JSName("signingName")
  var signingName_KinesisResolvedConfiguration: String = js.native
  
  @JSName("sslEnabled")
  var sslEnabled_KinesisResolvedConfiguration: Boolean = js.native
  
  @JSName("streamCollector")
  def streamCollector_MKinesisResolvedConfiguration(stream: Blob): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector[Blob] = js.native
  
  @JSName("urlParser")
  def urlParser_MKinesisResolvedConfiguration(url: String): HttpEndpoint = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  
  @JSName("utf8Decoder")
  def utf8Decoder_MKinesisResolvedConfiguration(input: String): js.typedarray.Uint8Array = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  
  @JSName("utf8Encoder")
  def utf8Encoder_MKinesisResolvedConfiguration(input: js.typedarray.Uint8Array): String = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
}
