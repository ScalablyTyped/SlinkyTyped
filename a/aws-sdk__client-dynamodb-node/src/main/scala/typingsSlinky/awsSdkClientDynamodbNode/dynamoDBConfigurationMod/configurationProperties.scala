package typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod

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

@JSImport("@aws-sdk/client-dynamodb-node/DynamoDBConfiguration", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, DynamoDBResolvableConfiguration, DynamoDBResolvedConfiguration] = js.native
  
  val base64Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Decoder], 
      Decoder, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val base64Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Encoder], 
      Encoder, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  
  val credentials: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Credentials | Provider[Credentials]], 
      Provider[Credentials], 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val delayDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[DelayDecider], 
      js.UndefOr[DelayDecider], 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val endpoint: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
      Provider[HttpEndpoint], 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val endpointProvider: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[_], _, DynamoDBResolvableConfiguration, DynamoDBResolvedConfiguration]
  ] = js.native
  
  val handler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Terminalware[_, Readable]], 
      Terminalware[_, Readable], 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val httpHandler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HttpHandler[Readable, HttpOptions]], 
      HttpHandler[Readable, HttpOptions], 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val maxRedirects: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Double], 
      Double, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val maxRetries: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Double], 
      Double, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Readable], 
    ResponseParser[Readable], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  
  val profile: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String], 
      js.UndefOr[String], 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val region: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | Provider[String]], 
      Provider[String], 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val retryDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RetryDecider], 
      js.UndefOr[RetryDecider], 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Readable]], 
    Provider[RequestSerializer[Readable]], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  
  val sha256: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HashConstructor], 
      HashConstructor, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val signer: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RequestSigner], 
      RequestSigner, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val signingName: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String], 
      String, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val sslEnabled: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Boolean], 
      Boolean, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val streamCollector: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[StreamCollector[Readable]], 
      StreamCollector[Readable], 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val urlParser: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[UrlParser], 
      UrlParser, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val utf8Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Decoder], 
      Decoder, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
  
  val utf8Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Encoder], 
      Encoder, 
      DynamoDBResolvableConfiguration, 
      DynamoDBResolvedConfiguration
    ]
  ] = js.native
}
