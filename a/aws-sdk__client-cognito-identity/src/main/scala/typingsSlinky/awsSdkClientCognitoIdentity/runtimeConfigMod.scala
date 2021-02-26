package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkProtocolHttp.httpHandlerMod.HttpHandler
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.Hash
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import typingsSlinky.awsSdkTypes.httpMod.Endpoint
import typingsSlinky.awsSdkTypes.loggerMod.Logger
import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RegionInfo
import typingsSlinky.awsSdkTypes.utilMod.RegionInfoProvider
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeConfigMod {
  
  /* Inlined std.Required<@aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/types/CognitoIdentityClient.ClientDefaults> */
  object ClientDefaultValues {
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.apiVersion")
    @js.native
    def apiVersion: String = js.native
    @scala.inline
    def apiVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.base64Decoder")
    @js.native
    def base64Decoder: Decoder = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.base64Decoder")
    @js.native
    def base64Decoder(input: String): js.typedarray.Uint8Array = js.native
    @scala.inline
    def base64Decoder_=(x: Decoder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64Decoder")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.base64Encoder")
    @js.native
    def base64Encoder: Encoder = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.base64Encoder")
    @js.native
    def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
    @scala.inline
    def base64Encoder_=(x: Encoder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64Encoder")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.bodyLengthChecker")
    @js.native
    def bodyLengthChecker: js.Function1[/* body */ js.Any, js.UndefOr[Double]] = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.bodyLengthChecker")
    @js.native
    def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
    @scala.inline
    def bodyLengthChecker_=(x: js.Function1[/* body */ js.Any, js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodyLengthChecker")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.credentialDefaultProvider")
    @js.native
    def credentialDefaultProvider: js.Function1[/* input */ js.Any, Provider[Credentials]] = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.credentialDefaultProvider")
    @js.native
    def credentialDefaultProvider(input: js.Any): Provider[Credentials] = js.native
    @scala.inline
    def credentialDefaultProvider_=(x: js.Function1[/* input */ js.Any, Provider[Credentials]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialDefaultProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.defaultUserAgent")
    @js.native
    def defaultUserAgent: String = js.native
    @scala.inline
    def defaultUserAgent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultUserAgent")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.disableHostPrefix")
    @js.native
    def disableHostPrefix: Boolean = js.native
    @scala.inline
    def disableHostPrefix_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHostPrefix")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.logger")
    @js.native
    def logger: Logger = js.native
    @scala.inline
    def logger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.maxAttempts")
    @js.native
    def maxAttempts: Double | Provider[Double] = js.native
    @scala.inline
    def maxAttempts_=(x: Double | Provider[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.region")
    @js.native
    def region: String | Provider[String] = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.regionInfoProvider")
    @js.native
    def regionInfoProvider: RegionInfoProvider = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.regionInfoProvider")
    @js.native
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.regionInfoProvider")
    @js.native
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = js.native
    @scala.inline
    def regionInfoProvider_=(x: RegionInfoProvider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regionInfoProvider")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def region_=(x: String | Provider[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("region")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.requestHandler")
    @js.native
    def requestHandler: HttpHandler = js.native
    @scala.inline
    def requestHandler_=(x: HttpHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.runtime")
    @js.native
    def runtime: String = js.native
    @scala.inline
    def runtime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runtime")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.sha256")
    @js.native
    class sha256 () extends Hash {
      def this(secret: SourceData) = this()
    }
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.sha256")
    @js.native
    def sha256: HashConstructor = js.native
    @scala.inline
    def sha256_=(x: HashConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.signingName")
    @js.native
    def signingName: String = js.native
    @scala.inline
    def signingName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signingName")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.streamCollector")
    @js.native
    def streamCollector: StreamCollector = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.streamCollector")
    @js.native
    def streamCollector(stream: js.Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @scala.inline
    def streamCollector_=(x: StreamCollector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("streamCollector")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.urlParser")
    @js.native
    def urlParser: UrlParser = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.urlParser")
    @js.native
    def urlParser(url: String): Endpoint = js.native
    @scala.inline
    def urlParser_=(x: UrlParser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlParser")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.utf8Decoder")
    @js.native
    def utf8Decoder: Decoder = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.utf8Decoder")
    @js.native
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @scala.inline
    def utf8Decoder_=(x: Decoder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf8Decoder")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.utf8Encoder")
    @js.native
    def utf8Encoder: Encoder = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.utf8Encoder")
    @js.native
    def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
    @scala.inline
    def utf8Encoder_=(x: Encoder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf8Encoder")(x.asInstanceOf[js.Any])
  }
}
