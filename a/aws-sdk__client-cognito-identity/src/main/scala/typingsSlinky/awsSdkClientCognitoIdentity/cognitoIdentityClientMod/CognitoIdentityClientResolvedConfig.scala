package typingsSlinky.awsSdkClientCognitoIdentity.cognitoIdentityClientMod

import typingsSlinky.awsSdkProtocolHttp.httpHandlerMod.HttpHandler
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.Endpoint
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.loggerMod.Logger
import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
import typingsSlinky.awsSdkTypes.signatureMod.RequestSigner
import typingsSlinky.awsSdkTypes.transferMod.RequestHandler
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RegionInfo
import typingsSlinky.awsSdkTypes.utilMod.RegionInfoProvider
import typingsSlinky.awsSdkTypes.utilMod.RetryStrategy
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyResolvedConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions> & std.Required<@aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/types/CognitoIdentityClient.ClientDefaults> & @aws-sdk/config-resolver.@aws-sdk/config-resolver.RegionResolvedConfig & @aws-sdk/config-resolver.@aws-sdk/config-resolver.EndpointsResolvedConfig & @aws-sdk/middleware-signing.@aws-sdk/middleware-signing.AwsAuthResolvedConfig & @aws-sdk/middleware-retry.@aws-sdk/middleware-retry.RetryResolvedConfig & @aws-sdk/middleware-user-agent.@aws-sdk/middleware-user-agent.UserAgentResolvedConfig & @aws-sdk/middleware-host-header.@aws-sdk/middleware-host-header.HostHeaderResolvedConfig */
@js.native
trait CognitoIdentityClientResolvedConfig extends js.Object {
  
  val apiVersion: String = js.native
  
  def base64Decoder(input: String): js.typedarray.Uint8Array = js.native
  @JSName("base64Decoder")
  var base64Decoder_Original: Decoder = js.native
  
  def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  @JSName("bodyLengthChecker")
  var bodyLengthChecker_Original: js.Function1[/* body */ js.Any, js.UndefOr[Double]] = js.native
  
  def credentialDefaultProvider(input: js.Any): Provider[Credentials] = js.native
  @JSName("credentialDefaultProvider")
  var credentialDefaultProvider_Original: js.Function1[/* input */ js.Any, Provider[Credentials]] = js.native
  
  def credentials(): js.Promise[Credentials] = js.native
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  
  var customUserAgent: js.UndefOr[String] = js.native
  
  var defaultUserAgent: String = js.native
  
  var disableHostPrefix: Boolean = js.native
  
  def endpoint(): js.Promise[Endpoint] = js.native
  @JSName("endpoint")
  var endpoint_Original: Provider[Endpoint] = js.native
  
  var isCustomEndpoint: Boolean = js.native
  
  var logger: Logger = js.native
  
  def maxAttempts(): js.Promise[Double] = js.native
  @JSName("maxAttempts")
  var maxAttempts_Original: (Double | Provider[Double]) with Provider[Double] = js.native
  
  def region(): js.Promise[String] = js.native
  
  def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
  def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = js.native
  @JSName("regionInfoProvider")
  var regionInfoProvider_Original: RegionInfoProvider = js.native
  
  @JSName("region")
  var region_Original: (String | Provider[String]) with Provider[String] = js.native
  
  var requestHandler: (RequestHandler[_, _, HttpHandlerOptions]) with HttpHandler with (RequestHandler[_, _, js.Object]) = js.native
  
  var retryStrategy: RetryStrategy = js.native
  
  var runtime: String = js.native
  
  var sha256: HashConstructor = js.native
  
  def signer(): js.Promise[RequestSigner] = js.native
  @JSName("signer")
  var signer_Original: Provider[RequestSigner] = js.native
  
  var signingEscapePath: Boolean = js.native
  
  var signingName: String = js.native
  
  def streamCollector(stream: js.Any): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector = js.native
  
  var systemClockOffset: Double = js.native
  
  var tls: Boolean = js.native
  
  def urlParser(url: String): Endpoint = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  
  def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  
  def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
}
