package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkProtocolHttp.httpHandlerMod.HttpHandler
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.Endpoint
import typingsSlinky.awsSdkTypes.loggerMod.Logger
import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RegionInfo
import typingsSlinky.awsSdkTypes.utilMod.RegionInfoProvider
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.browser", JSImport.Namespace)
@js.native
object runtimeConfigBrowserMod extends js.Object {
  
  @js.native
  object ClientDefaultValues extends js.Object {
    
    var apiVersion: String = js.native
    
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
    
    var defaultUserAgent: String = js.native
    
    var disableHostPrefix: Boolean = js.native
    
    var logger: Logger = js.native
    
    var maxAttempts: Double | Provider[Double] = js.native
    
    var region: String | Provider[String] = js.native
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = js.native
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider = js.native
    
    var requestHandler: HttpHandler = js.native
    
    var runtime: String = js.native
    
    var sha256: HashConstructor = js.native
    
    var signingName: String = js.native
    
    def streamCollector(stream: js.Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
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
}
