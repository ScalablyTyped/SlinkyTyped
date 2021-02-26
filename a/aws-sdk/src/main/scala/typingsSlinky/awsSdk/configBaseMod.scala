package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.anon.ConfigurationOptionskeyst
import typingsSlinky.awsSdk.awsSdkBooleans.`false`
import typingsSlinky.awsSdk.awsSdkBooleans.`true`
import typingsSlinky.awsSdk.awsSdkStrings.legacy_
import typingsSlinky.awsSdk.awsSdkStrings.regional_
import typingsSlinky.awsSdk.awsSdkStrings.v2_
import typingsSlinky.awsSdk.awsSdkStrings.v3
import typingsSlinky.awsSdk.awsSdkStrings.v4
import typingsSlinky.awsSdk.credentialProviderChainMod.CredentialProviderChain
import typingsSlinky.awsSdk.credentialsMod.Credentials
import typingsSlinky.awsSdk.credentialsMod.CredentialsOptions
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configBaseMod {
  
  @JSImport("aws-sdk/lib/config-base", "ConfigBase")
  @js.native
  class ConfigBase () extends ConfigurationOptions {
    def this(options: ConfigurationOptions) = this()
    
    /**
      * Loads credentials from the configuration object.
      */
    def getCredentials(
      callback: js.Function2[
          /* err */ AWSError | Null, 
          /* credentials */ Credentials | CredentialsOptions | Null, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Gets the promise dependency the SDK will use wherever Promises are returned.
      */
    def getPromisesDependency(): PromiseConstructor | Unit = js.native
    
    /**
      * Loads configuration data from a JSON file into this config object.
      * Loading configuration will reset all existing configuration on the object.
      * This feature is not supported in the browser environment of the SDK.
      *
      * @param {string} path - the path relative to your process's current working directory to load configuration from.
      */
    def loadFromPath(path: String): ConfigBase = js.native
    
    /**
      * Sets the promise dependency the SDK will use wherever Promises are returned.
      * @param {function} dep - a reference to a Promise constructor
      */
    def setPromisesDependency(dep: js.Any): Unit = js.native
    
    /**
      * Updates the current configuration object with new options.
      *
      * @param {ConfigurationOptions} options - a map of option keys and values.
      * @param {boolean} allowUnknownKeys - Defaults to false. Whether unknown keys can be set on the configuration object.
      */
    def update(options: ConfigurationOptions): Unit = js.native
    @JSName("update")
    def update_false(options: ConfigurationOptions, allowUnknownKeys: `false`): Unit = js.native
    /**
      * Updates the current configuration object with new options.
      *
      * @param {ConfigurationOptions} options - a map of option keys and values.
      * @param {boolean} allowUnknownKeys - Whether unknown keys can be set on the configuration object.
      */
    @JSName("update")
    def update_true(options: ConfigurationOptionskeyst, allowUnknownKeys: `true`): Unit = js.native
  }
  
  @JSImport("aws-sdk/lib/config-base", "ConfigurationOptions")
  @js.native
  abstract class ConfigurationOptions () extends StObject {
    
    /**
      * AWS access key ID.
      *
      * @deprecated
      */
    var accessKeyId: js.UndefOr[String] = js.native
    
    /**
      * Whether to compute checksums for payload bodies when the service accepts it.
      * Currently supported in S3 only.
      */
    var computeChecksums: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether types are converted when parsing response data.
      */
    var convertResponseTypes: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to apply a clock skew correction and retry requests that fail because of an skewed client clock.
      */
    var correctClockSkew: js.UndefOr[Boolean] = js.native
    
    /**
      * The provider chain used to resolve credentials if no static credentials property is set.
      */
    var credentialProvider: js.UndefOr[CredentialProviderChain] = js.native
    
    /**
      * The AWS credentials to sign requests with.
      */
    var credentials: js.UndefOr[Credentials | CredentialsOptions | Null] = js.native
    
    /**
      * Sets a custom User-Agent string.
      * In node environments this will set the User-Agent header, but
      * browser environments this will set the X-Amz-User-Agent header.
      */
    var customUserAgent: js.UndefOr[String] = js.native
    
    /**
      * Whether to validate the CRC32 checksum of HTTP response bodies returned
      * by DynamoDB.
      */
    var dynamoDbCrc32: js.UndefOr[Boolean] = js.native
    
    /**
      * The size of the global cache storing endpoints from endpoint
      * discovery operations. Once endpoint cache is created, updating this setting
      * cannot change existing cache size.
      */
    var endpointCacheSize: js.UndefOr[Double] = js.native
    
    /**
      * Whether to enable endpoint discovery for operations that allow optionally using an endpoint returned by 
      * the service.
      */
    var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to marshal request parameters to the prefix of hostname.
      */
    var hostPrefixEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * A set of options to pass to the low-level HTTP request.
      */
    var httpOptions: js.UndefOr[HTTPOptions] = js.native
    
    /**
      * An object that responds to .write() (like a stream) or .log() (like the console object) in order to log information about requests.
      */
    var logger: js.UndefOr[Logger] = js.native
    
    /**
      * The maximum amount of redirects to follow for a service request.
      */
    var maxRedirects: js.UndefOr[Double] = js.native
    
    /**
      * The maximum amount of retries to perform for a service request.
      */
    var maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * Returns whether input parameters should be validated against the operation description before sending the request.
      * Defaults to true.
      * Pass a map to enable any of the following specific validation features: min|max|pattern|enum
      */
    var paramValidation: js.UndefOr[ParamValidation | Boolean] = js.native
    
    /**
      * The region to send service requests to.
      */
    var region: js.UndefOr[String] = js.native
    
    /**
      * Returns A set of options to configure the retry delay on retryable errors.
      */
    var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.native
    
    /**
      * Whether the provided endpoint addresses an individual bucket.
      * false if it addresses the root API endpoint.
      */
    var s3BucketEndpoint: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to disable S3 body signing when using signature version v4.
      */
    var s3DisableBodySigning: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to force path style URLs for S3 objects.
      */
    var s3ForcePathStyle: js.UndefOr[Boolean] = js.native
    
    /**
      * When region is set to 'us-east-1', whether to send s3 request to global endpoints
      * or 'us-east-1' regional endpoints. This config is only applicable to S3 client;
      * Defaults to 'legacy'
      */
    var s3UsEast1RegionalEndpoint: js.UndefOr[regional_ | legacy_] = js.native
    
    /**
      * Whether to override the request region with the region inferred
      * from requested resource's ARN. Only available for S3 buckets
      * Defaults to `true`
      */
    var s3UseArnRegion: js.UndefOr[Boolean] = js.native
    
    /**
      * AWS secret access key.
      *
      * @deprecated
      */
    var secretAccessKey: js.UndefOr[String] = js.native
    
    /**
      * AWS session token.
      *
      * @deprecated
      */
    var sessionToken: js.UndefOr[String] = js.native
    
    /**
      * Whether the signature to sign requests with (overriding the API configuration) is cached.
      */
    var signatureCache: js.UndefOr[Boolean] = js.native
    
    /**
      * The signature version to sign requests with (overriding the API configuration).
      * Possible values: 'v2'|'v3'|'v4'
      */
    var signatureVersion: js.UndefOr[v2_ | v3 | v4 | String] = js.native
    
    /**
      * Whether SSL is enabled for requests.
      */
    var sslEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to send sts request to global endpoints or
      * regional endpoints. 
      */
    var stsRegionalEndpoints: js.UndefOr[legacy_ | regional_] = js.native
    
    /**
      * An offset value in milliseconds to apply to all signing times.
      */
    var systemClockOffset: js.UndefOr[Double] = js.native
    
    /**
      * Whether to use the Accelerate endpoint with the S3 service.
      */
    var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait HTTPOptions extends StObject {
    
    /**
      * the Agent object to perform HTTP requests with.
      * Used for connection pooling.
      * Defaults to the global agent (http.globalAgent) for non-SSL connections.
      */
    var agent: js.UndefOr[Agent | typingsSlinky.node.httpsMod.Agent] = js.native
    
    /**
      * The maximum time in milliseconds that the connection phase of the request
      * should be allowed to take. This only limits the connection phase and has
      * no impact once the socket has established a connection.
      * Used in node.js environments only.
      */
    var connectTimeout: js.UndefOr[Double] = js.native
    
    /**
      * the URL to proxy requests through.
      */
    var proxy: js.UndefOr[String] = js.native
    
    /**
      * The number of milliseconds a request can take before automatically being terminated.
      * Defaults to two minutes (120000).
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * Whether the SDK will send asynchronous HTTP requests.
      * Used in the browser environment only.
      * Set to false to send requests synchronously.
      * Defaults to true (async on).
      */
    var xhrAsync: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the 'withCredentials' property of an XMLHttpRequest object.
      * Used in the browser environment only.
      * Defaults to false.
      */
    var xhrWithCredentials: js.UndefOr[Boolean] = js.native
  }
  object HTTPOptions {
    
    @scala.inline
    def apply(): HTTPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTTPOptions]
    }
    
    @scala.inline
    implicit class HTTPOptionsMutableBuilder[Self <: HTTPOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | typingsSlinky.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setXhrAsync(value: Boolean): Self = StObject.set(x, "xhrAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrAsyncUndefined: Self = StObject.set(x, "xhrAsync", js.undefined)
      
      @scala.inline
      def setXhrWithCredentials(value: Boolean): Self = StObject.set(x, "xhrWithCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrWithCredentialsUndefined: Self = StObject.set(x, "xhrWithCredentials", js.undefined)
    }
  }
  
  @js.native
  trait Logger extends StObject {
    
    var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var write: js.UndefOr[
        js.Function3[
          /* chunk */ js.Any, 
          /* encoding */ js.UndefOr[String], 
          /* callback */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ]
      ] = js.native
  }
  object Logger {
    
    @scala.inline
    def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setWrite(
        value: (/* chunk */ js.Any, /* encoding */ js.UndefOr[String], /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit
      ): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  @js.native
  trait ParamValidation extends StObject {
    
    /**
      * Validates that a string value matches one of the allowable enum values.
      */
    var enum: js.UndefOr[Boolean] = js.native
    
    /**
      * Validates that a value meets the max constraint.
      */
    var max: js.UndefOr[Boolean] = js.native
    
    /**
      * Validates that a value meets the min constraint.
      * This is enabled by default when paramValidation is set to true.
      */
    var min: js.UndefOr[Boolean] = js.native
    
    /**
      * Validates that a string value matches a regular expression.
      */
    var pattern: js.UndefOr[Boolean] = js.native
  }
  object ParamValidation {
    
    @scala.inline
    def apply(): ParamValidation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamValidation]
    }
    
    @scala.inline
    implicit class ParamValidationMutableBuilder[Self <: ParamValidation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnum(value: Boolean): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setMax(value: Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPattern(value: Boolean): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  @js.native
  trait RetryDelayOptions extends StObject {
    
    /**
      * The base number of milliseconds to use in the exponential backoff for operation retries.
      * Defaults to 100 ms.
      */
    var base: js.UndefOr[Double] = js.native
    
    /**
      * A custom function that accepts a retry count and error and returns the amount of time to delay in milliseconds. If the result is a non-zero negative value, no further retry attempts will be made.
      * The base option will be ignored if this option is supplied.
      */
    var customBackoff: js.UndefOr[js.Function2[/* retryCount */ Double, /* err */ js.UndefOr[js.Error], Double]] = js.native
  }
  object RetryDelayOptions {
    
    @scala.inline
    def apply(): RetryDelayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryDelayOptions]
    }
    
    @scala.inline
    implicit class RetryDelayOptionsMutableBuilder[Self <: RetryDelayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setCustomBackoff(value: (/* retryCount */ Double, /* err */ js.UndefOr[js.Error]) => Double): Self = StObject.set(x, "customBackoff", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCustomBackoffUndefined: Self = StObject.set(x, "customBackoff", js.undefined)
    }
  }
}
