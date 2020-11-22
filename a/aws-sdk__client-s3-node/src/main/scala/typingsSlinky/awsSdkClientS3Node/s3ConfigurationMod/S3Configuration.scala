package typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod

import typingsSlinky.awsSdkClientS3Node.anon.Instantiable
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.cryptoMod.StreamHasher
import typingsSlinky.awsSdkTypes.httpMod.Endpoint
import typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.middlewareMod.Terminalware
import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
import typingsSlinky.awsSdkTypes.signatureMod.RequestSigner
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Configuration extends js.Object {
  
  /**
    * The function that will be used to convert a base64-encoded string to a byte array
    */
  var base64Decoder: js.UndefOr[Decoder] = js.native
  
  /**
    * The function that will be used to convert binary data to a base64-encoded string
    */
  var base64Encoder: js.UndefOr[Encoder] = js.native
  
  /**
    * Whether the provided endpoint addresses an individual bucket.
    */
  var bucketEndpoint: js.UndefOr[Boolean] = js.native
  
  /**
    * The credentials used to sign requests.
    *
    * If no static credentials are supplied, the SDK will attempt to credentials from known environment variables, from shared configuration and credentials files, and from the EC2 Instance Metadata Service, in that order.
    */
  var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.native
  
  /**
    * A function that determines how long (in milliseconds) the SDK should wait before retrying a request
    */
  var delayDecider: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.DelayDecider */ js.Any
  ] = js.native
  
  /**
    * Whether body signing should be disabled. Body signing can only be disabled when using HTTPS
    */
  var disableBodySigning: js.UndefOr[Boolean] = js.native
  
  /**
    * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
    */
  var endpoint: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any) | (Provider[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
    ])
  ] = js.native
  
  /**
    * The endpoint provider to call if no endpoint is provided
    */
  var endpointProvider: js.UndefOr[js.Any] = js.native
  
  /**
    * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
    */
  var forcePathStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * The handler to use as the core of the client's middleware stack
    */
  var handler: js.UndefOr[Terminalware] = js.native
  
  /**
    * The HTTP handler to use
    */
  var httpHandler: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpHandler<_stream.Readable> */ js.Any
  ] = js.native
  
  /**
    * The maximum number of redirects to follow for a service request. Set to `0` to disable retries.
    */
  var maxRedirects: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of times requests that encounter potentially transient failures should be retried
    */
  var maxRetries: js.UndefOr[Double] = js.native
  
  /**
    * A constructor for a class implementing the @aws-sdk/types.Hash interface that computes the MD5 checksum of a string or binary buffer
    */
  var md5: js.UndefOr[Instantiable] = js.native
  
  /**
    * The configuration profile to use.
    */
  var profile: js.UndefOr[String] = js.native
  
  /**
    * The AWS region to which this client will send requests
    */
  var region: js.UndefOr[String | Provider[String]] = js.native
  
  /**
    * A function that determines whether an error is retryable
    */
  var retryDecider: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.RetryDecider */ js.Any
  ] = js.native
  
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
  var streamCollector: js.UndefOr[StreamCollector] = js.native
  
  /**
    * A function that, given a hash constructor and a stream, calculates the hash of the streamed value
    */
  var streamHasher: js.UndefOr[StreamHasher[Readable]] = js.native
  
  /**
    * The function that will be used to convert strings into HTTP endpoints
    */
  var urlParser: js.UndefOr[UrlParser] = js.native
  
  /**
    * Whether to use the S3 Transfer Acceleration endpoint by default
    */
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
    */
  var useDualstackEndpoint: js.UndefOr[Boolean] = js.native
  
  /**
    * The function that will be used to convert a UTF8-encoded string to a byte array
    */
  var utf8Decoder: js.UndefOr[Decoder] = js.native
  
  /**
    * The function that will be used to convert binary data to a UTF-8 encoded string
    */
  var utf8Encoder: js.UndefOr[Encoder] = js.native
}
object S3Configuration {
  
  @scala.inline
  def apply(): S3Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Configuration]
  }
  
  @scala.inline
  implicit class S3ConfigurationOps[Self <: S3Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = this.set("base64Decoder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBase64Decoder: Self = this.set("base64Decoder", js.undefined)
    
    @scala.inline
    def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = this.set("base64Encoder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBase64Encoder: Self = this.set("base64Encoder", js.undefined)
    
    @scala.inline
    def setBucketEndpoint(value: Boolean): Self = this.set("bucketEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketEndpoint: Self = this.set("bucketEndpoint", js.undefined)
    
    @scala.inline
    def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = this.set("credentials", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCredentials(value: Credentials | Provider[Credentials]): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setDelayDecider(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.DelayDecider */ js.Any
    ): Self = this.set("delayDecider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayDecider: Self = this.set("delayDecider", js.undefined)
    
    @scala.inline
    def setDisableBodySigning(value: Boolean): Self = this.set("disableBodySigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableBodySigning: Self = this.set("disableBodySigning", js.undefined)
    
    @scala.inline
    def setEndpointFunction0(
      value: () => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
        ]
    ): Self = this.set("endpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndpoint(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any) | (Provider[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
        ])
    ): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setEndpointProvider(value: js.Any): Self = this.set("endpointProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointProvider: Self = this.set("endpointProvider", js.undefined)
    
    @scala.inline
    def setForcePathStyle(value: Boolean): Self = this.set("forcePathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForcePathStyle: Self = this.set("forcePathStyle", js.undefined)
    
    @scala.inline
    def setHandler(value: /* context */ HandlerExecutionContext => DeserializeHandler[js.Object, js.Object]): Self = this.set("handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setHttpHandler(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpHandler<_stream.Readable> */ js.Any
    ): Self = this.set("httpHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpHandler: Self = this.set("httpHandler", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setMd5(value: Instantiable): Self = this.set("md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5: Self = this.set("md5", js.undefined)
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setRegionFunction0(value: () => js.Promise[String]): Self = this.set("region", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegion(value: String | Provider[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRetryDecider(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.RetryDecider */ js.Any
    ): Self = this.set("retryDecider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDecider: Self = this.set("retryDecider", js.undefined)
    
    @scala.inline
    def setSha256(value: HashConstructor): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
    
    @scala.inline
    def setSigner(value: RequestSigner): Self = this.set("signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigner: Self = this.set("signer", js.undefined)
    
    @scala.inline
    def setSigningName(value: String): Self = this.set("signingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningName: Self = this.set("signingName", js.undefined)
    
    @scala.inline
    def setSslEnabled(value: Boolean): Self = this.set("sslEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslEnabled: Self = this.set("sslEnabled", js.undefined)
    
    @scala.inline
    def setStreamCollector(value: /* stream */ js.Any => js.Promise[js.typedarray.Uint8Array]): Self = this.set("streamCollector", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStreamCollector: Self = this.set("streamCollector", js.undefined)
    
    @scala.inline
    def setStreamHasher(
      value: (/* hashCtor */ typingsSlinky.awsSdkTypes.anon.Instantiable, Readable) => js.Promise[js.typedarray.Uint8Array]
    ): Self = this.set("streamHasher", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStreamHasher: Self = this.set("streamHasher", js.undefined)
    
    @scala.inline
    def setUrlParser(value: /* url */ String => Endpoint): Self = this.set("urlParser", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUrlParser: Self = this.set("urlParser", js.undefined)
    
    @scala.inline
    def setUseAccelerateEndpoint(value: Boolean): Self = this.set("useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAccelerateEndpoint: Self = this.set("useAccelerateEndpoint", js.undefined)
    
    @scala.inline
    def setUseDualstackEndpoint(value: Boolean): Self = this.set("useDualstackEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDualstackEndpoint: Self = this.set("useDualstackEndpoint", js.undefined)
    
    @scala.inline
    def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = this.set("utf8Decoder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUtf8Decoder: Self = this.set("utf8Decoder", js.undefined)
    
    @scala.inline
    def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = this.set("utf8Encoder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUtf8Encoder: Self = this.set("utf8Encoder", js.undefined)
  }
}
