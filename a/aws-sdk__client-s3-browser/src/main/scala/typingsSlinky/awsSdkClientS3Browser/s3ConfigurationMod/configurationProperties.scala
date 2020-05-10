package typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.AnonInstantiable
import typingsSlinky.awsSdkTypes.clientMod.ConfigurationPropertyDefinition
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.cryptoMod.StreamHasher
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/S3Configuration", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val base64Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val base64Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val bucketEndpoint: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val credentials: ConfigurationPropertyDefinition[
    Credentials | Provider[Credentials], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val delayDecider: ConfigurationPropertyDefinition[js.UndefOr[DelayDecider], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val disableBodySigning: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val endpoint: ConfigurationPropertyDefinition[
    js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val forcePathStyle: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val handler: ConfigurationPropertyDefinition[
    js.UndefOr[Terminalware[_, Blob]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val httpHandler: ConfigurationPropertyDefinition[
    js.UndefOr[HttpHandler[Blob, HttpOptions]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val maxRedirects: ConfigurationPropertyDefinition[js.UndefOr[Double], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val maxRetries: ConfigurationPropertyDefinition[js.UndefOr[Double], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val md5: ConfigurationPropertyDefinition[js.UndefOr[AnonInstantiable], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val parser: ConfigurationPropertyDefinition[ResponseParser[Blob], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val profile: ConfigurationPropertyDefinition[js.UndefOr[String], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val region: ConfigurationPropertyDefinition[String | Provider[String], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val retryDecider: ConfigurationPropertyDefinition[js.UndefOr[RetryDecider], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Blob]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val sha256: ConfigurationPropertyDefinition[js.UndefOr[HashConstructor], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val signer: ConfigurationPropertyDefinition[js.UndefOr[RequestSigner], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val signingName: ConfigurationPropertyDefinition[js.UndefOr[String], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val sslEnabled: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val streamCollector: ConfigurationPropertyDefinition[
    js.UndefOr[StreamCollector[Blob]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val streamHasher: ConfigurationPropertyDefinition[js.UndefOr[StreamHasher[Blob]], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val urlParser: ConfigurationPropertyDefinition[js.UndefOr[UrlParser], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val useAccelerateEndpoint: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val useDualstackEndpoint: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val utf8Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val utf8Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
}

