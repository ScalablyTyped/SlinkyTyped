package typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint
import typingsSlinky.awsSdkTypes.httpMod.HttpHandler
import typingsSlinky.awsSdkTypes.httpMod.HttpOptions
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.middlewareMod.Terminalware
import typingsSlinky.awsSdkTypes.signatureMod.RequestSigner
import typingsSlinky.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.DelayDecider
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RetryDecider
import typingsSlinky.awsSdkTypes.utilMod.SdkError
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisConfiguration extends js.Object {
  /**
    * The function that will be used to convert a base64-encoded string to a byte array
    */
  var base64Decoder: js.UndefOr[Decoder] = js.native
  /**
    * The function that will be used to convert binary data to a base64-encoded string
    */
  var base64Encoder: js.UndefOr[Encoder] = js.native
  /**
    * The credentials used to sign requests.
    */
  var credentials: Credentials | Provider[Credentials] = js.native
  /**
    * A function that determines how long (in milliseconds) the SDK should wait before retrying a request
    */
  var delayDecider: js.UndefOr[DelayDecider] = js.native
  /**
    * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
    */
  var endpoint: js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]] = js.native
  /**
    * The endpoint provider to call if no endpoint is provided
    */
  var endpointProvider: js.UndefOr[js.Any] = js.native
  /**
    * The handler to use as the core of the client's middleware stack
    */
  var handler: js.UndefOr[Terminalware[_, Blob]] = js.native
  /**
    * The HTTP handler to use
    */
  var httpHandler: js.UndefOr[HttpHandler[Blob, HttpOptions]] = js.native
  /**
    * The maximum number of redirects to follow for a service request. Set to `0` to disable retries.
    */
  var maxRedirects: js.UndefOr[Double] = js.native
  /**
    * The maximum number of times requests that encounter potentially transient failures should be retried
    */
  var maxRetries: js.UndefOr[Double] = js.native
  /**
    * The configuration profile to use.
    */
  var profile: js.UndefOr[String] = js.native
  /**
    * The AWS region to which this client will send requests
    */
  var region: String | Provider[String] = js.native
  /**
    * A function that determines whether an error is retryable
    */
  var retryDecider: js.UndefOr[RetryDecider] = js.native
  /**
    * A constructor for a class implementing the @aws-sdk/types.Hash interface that computes the SHA-256 HMAC or checksum of a string or binary buffer
    */
  var sha256: js.UndefOr[HashConstructor] = js.native
  /**
    * The signer to use when signing requests.
    */
  var signer: js.UndefOr[RequestSigner] = js.native
  /**
    * The service name with which to sign requests.
    */
  var signingName: js.UndefOr[String] = js.native
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A function that converts a stream into an array of bytes.
    */
  var streamCollector: js.UndefOr[StreamCollector[Blob]] = js.native
  /**
    * The function that will be used to convert strings into HTTP endpoints
    */
  var urlParser: js.UndefOr[UrlParser] = js.native
  /**
    * The function that will be used to convert a UTF8-encoded string to a byte array
    */
  var utf8Decoder: js.UndefOr[Decoder] = js.native
  /**
    * The function that will be used to convert binary data to a UTF-8 encoded string
    */
  var utf8Encoder: js.UndefOr[Encoder] = js.native
}

object KinesisConfiguration {
  @scala.inline
  def apply(credentials: Credentials | Provider[Credentials], region: String | Provider[String]): KinesisConfiguration = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisConfiguration]
  }
  @scala.inline
  implicit class KinesisConfigurationOps[Self <: KinesisConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentialsFunction0(value: () => js.Promise[Credentials]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCredentials(value: Credentials | Provider[Credentials]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionFunction0(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegion(value: String | Provider[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64Decoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBase64Decoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64Decoder")(js.undefined)
        ret
    }
    @scala.inline
    def withBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64Encoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBase64Encoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64Encoder")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayDecider(value: (/* delayBase */ Double, /* attempts */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayDecider")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDelayDecider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayDecider")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointFunction0(value: () => js.Promise[HttpEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndpoint(value: String | HttpEndpoint | Provider[HttpEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointProvider(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withHandler(value: /* context */ HandlerExecutionContext => FinalizeHandler[js.Object, _, Blob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHandler(value: HttpHandler[Blob, HttpOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRedirects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDecider(value: /* error */ SdkError => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDecider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRetryDecider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDecider")(js.undefined)
        ret
    }
    @scala.inline
    def withSha256(value: HashConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(js.undefined)
        ret
    }
    @scala.inline
    def withSigner(value: RequestSigner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingName")(js.undefined)
        ret
    }
    @scala.inline
    def withSslEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamCollector(value: Blob => js.Promise[js.typedarray.Uint8Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamCollector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStreamCollector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamCollector")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlParser(value: /* url */ String => HttpEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlParser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUrlParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlParser")(js.undefined)
        ret
    }
    @scala.inline
    def withUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utf8Decoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUtf8Decoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utf8Decoder")(js.undefined)
        ret
    }
    @scala.inline
    def withUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utf8Encoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUtf8Encoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utf8Encoder")(js.undefined)
        ret
    }
  }
  
}

