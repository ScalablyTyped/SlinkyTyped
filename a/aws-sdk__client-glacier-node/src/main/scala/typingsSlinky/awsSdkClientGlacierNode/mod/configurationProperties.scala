package typingsSlinky.awsSdkClientGlacierNode.mod

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvableConfiguration
import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
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

@JSImport("@aws-sdk/client-glacier-node", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, GlacierResolvableConfiguration, GlacierResolvedConfiguration] = js.native
  
  val base64Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Decoder], 
      Decoder, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val base64Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Encoder], 
      Encoder, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  
  val credentials: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Credentials | Provider[Credentials]], 
      Provider[Credentials], 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val delayDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[DelayDecider], 
      js.UndefOr[DelayDecider], 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val endpoint: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
      Provider[HttpEndpoint], 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val endpointProvider: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[_], _, GlacierResolvableConfiguration, GlacierResolvedConfiguration]
  ] = js.native
  
  val handler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Terminalware[_, Readable]], 
      Terminalware[_, Readable], 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val httpHandler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HttpHandler[Readable, HttpOptions]], 
      HttpHandler[Readable, HttpOptions], 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val maxRedirects: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Double], 
      Double, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val maxRetries: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Double], 
      Double, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Readable], 
    ResponseParser[Readable], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  
  val profile: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String], 
      js.UndefOr[String], 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val region: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | Provider[String]], 
      Provider[String], 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val retryDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RetryDecider], 
      js.UndefOr[RetryDecider], 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Readable]], 
    Provider[RequestSerializer[Readable]], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  
  val sha256: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HashConstructor], 
      HashConstructor, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val signer: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RequestSigner], 
      RequestSigner, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val signingName: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String], 
      String, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val sslEnabled: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Boolean], 
      Boolean, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val streamCollector: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[StreamCollector[Readable]], 
      StreamCollector[Readable], 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val urlParser: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[UrlParser], 
      UrlParser, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val utf8Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Decoder], 
      Decoder, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
  
  val utf8Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Encoder], 
      Encoder, 
      GlacierResolvableConfiguration, 
      GlacierResolvedConfiguration
    ]
  ] = js.native
}
