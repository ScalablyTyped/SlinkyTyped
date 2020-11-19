package typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/LambdaConfiguration", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, LambdaResolvableConfiguration, LambdaResolvedConfiguration] = js.native
  
  val base64Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Decoder], 
      Decoder, 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val base64Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Encoder], 
      Encoder, 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    LambdaResolvableConfiguration, 
    LambdaResolvedConfiguration
  ] = js.native
  
  val credentials: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Credentials | Provider[Credentials]], 
      Provider[Credentials], 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val delayDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[DelayDecider], 
      js.UndefOr[DelayDecider], 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val endpoint: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
      Provider[HttpEndpoint], 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val endpointProvider: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[_], _, LambdaResolvableConfiguration, LambdaResolvedConfiguration]
  ] = js.native
  
  val handler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Terminalware[_, Readable]], 
      Terminalware[_, Readable], 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val httpHandler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HttpHandler[Readable, HttpOptions]], 
      HttpHandler[Readable, HttpOptions], 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val maxRedirects: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Double], Double, LambdaResolvableConfiguration, LambdaResolvedConfiguration]
  ] = js.native
  
  val maxRetries: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Double], Double, LambdaResolvableConfiguration, LambdaResolvedConfiguration]
  ] = js.native
  
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Readable], 
    ResponseParser[Readable], 
    LambdaResolvableConfiguration, 
    LambdaResolvedConfiguration
  ] = js.native
  
  val profile: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String], 
      js.UndefOr[String], 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val region: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | Provider[String]], 
      Provider[String], 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val retryDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RetryDecider], 
      js.UndefOr[RetryDecider], 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Readable]], 
    Provider[RequestSerializer[Readable]], 
    LambdaResolvableConfiguration, 
    LambdaResolvedConfiguration
  ] = js.native
  
  val sha256: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HashConstructor], 
      HashConstructor, 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val signer: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RequestSigner], 
      RequestSigner, 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val signingName: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[String], String, LambdaResolvableConfiguration, LambdaResolvedConfiguration]
  ] = js.native
  
  val sslEnabled: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Boolean], 
      Boolean, 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val streamCollector: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[StreamCollector[Readable]], 
      StreamCollector[Readable], 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val urlParser: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[UrlParser], 
      UrlParser, 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val utf8Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Decoder], 
      Decoder, 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
  
  val utf8Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Encoder], 
      Encoder, 
      LambdaResolvableConfiguration, 
      LambdaResolvedConfiguration
    ]
  ] = js.native
}
