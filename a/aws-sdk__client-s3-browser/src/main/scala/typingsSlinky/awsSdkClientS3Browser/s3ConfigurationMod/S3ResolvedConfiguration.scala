package typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.anon.Instantiable
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.cryptoMod.StreamHasher
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

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ClientResolvedConfigurationBase<OutputTypesUnion, Blob> * / any */ @js.native
trait S3ResolvedConfiguration extends S3Configuration {
  
  var _user_injected_http_handler: Boolean = js.native
  
  @JSName("base64Decoder")
  def base64Decoder_MS3ResolvedConfiguration(input: String): js.typedarray.Uint8Array = js.native
  @JSName("base64Decoder")
  var base64Decoder_Original: Decoder = js.native
  
  @JSName("base64Encoder")
  def base64Encoder_MS3ResolvedConfiguration(input: js.typedarray.Uint8Array): String = js.native
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  
  @JSName("bucketEndpoint")
  var bucketEndpoint_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("credentials")
  def credentials_MS3ResolvedConfiguration(): js.Promise[Credentials] = js.native
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  
  @JSName("disableBodySigning")
  var disableBodySigning_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("endpoint")
  def endpoint_MS3ResolvedConfiguration(): js.Promise[HttpEndpoint] = js.native
  @JSName("endpoint")
  var endpoint_Original: Provider[HttpEndpoint] = js.native
  
  @JSName("forcePathStyle")
  var forcePathStyle_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("handler")
  def handler_MS3ResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Any */](context: HandlerExecutionContext): FinalizeHandler[Input, Output, Blob] = js.native
  @JSName("handler")
  var handler_Original: Terminalware[_, Blob] = js.native
  
  @JSName("httpHandler")
  var httpHandler_S3ResolvedConfiguration: HttpHandler[Blob, HttpOptions] = js.native
  
  @JSName("maxRedirects")
  var maxRedirects_S3ResolvedConfiguration: Double = js.native
  
  @JSName("maxRetries")
  var maxRetries_S3ResolvedConfiguration: Double = js.native
  
  @JSName("md5")
  var md5_S3ResolvedConfiguration: Instantiable = js.native
  
  var parser: ResponseParser[Blob] = js.native
  
  @JSName("region")
  def region_MS3ResolvedConfiguration(): js.Promise[String] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
  
  def serializer(): js.Promise[RequestSerializer[Blob]] = js.native
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Blob]] = js.native
  
  @JSName("sha256")
  var sha256_S3ResolvedConfiguration: HashConstructor = js.native
  
  @JSName("signer")
  var signer_S3ResolvedConfiguration: RequestSigner = js.native
  
  @JSName("signingName")
  var signingName_S3ResolvedConfiguration: String = js.native
  
  @JSName("sslEnabled")
  var sslEnabled_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("streamCollector")
  def streamCollector_MS3ResolvedConfiguration(stream: Blob): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector[Blob] = js.native
  
  @JSName("streamHasher")
  def streamHasher_MS3ResolvedConfiguration(hashCtor: typingsSlinky.awsSdkTypes.anon.Instantiable, stream: Blob): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("streamHasher")
  var streamHasher_Original: StreamHasher[Blob] = js.native
  
  @JSName("urlParser")
  def urlParser_MS3ResolvedConfiguration(url: String): HttpEndpoint = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  
  @JSName("useAccelerateEndpoint")
  var useAccelerateEndpoint_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("useDualstackEndpoint")
  var useDualstackEndpoint_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("utf8Decoder")
  def utf8Decoder_MS3ResolvedConfiguration(input: String): js.typedarray.Uint8Array = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  
  @JSName("utf8Encoder")
  def utf8Encoder_MS3ResolvedConfiguration(input: js.typedarray.Uint8Array): String = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
}
