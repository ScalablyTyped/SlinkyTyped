package typingsSlinky.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.awsSdkStrings.legacy_
import typingsSlinky.awsSdk.awsSdkStrings.regional_
import typingsSlinky.awsSdk.awsSdkStrings.v2_
import typingsSlinky.awsSdk.awsSdkStrings.v3
import typingsSlinky.awsSdk.awsSdkStrings.v4
import typingsSlinky.awsSdk.configMod.HTTPOptions
import typingsSlinky.awsSdk.configMod.Logger
import typingsSlinky.awsSdk.configMod.ParamValidation
import typingsSlinky.awsSdk.configMod.RetryDelayOptions
import typingsSlinky.awsSdk.credentialProviderChainMod.CredentialProviderChain
import typingsSlinky.awsSdk.credentialsMod.Credentials
import typingsSlinky.awsSdk.credentialsMod.CredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/lib/config.ConfigurationOptions & {[key: string] : any} */
@js.native
trait ConfigurationOptionskeyst
  extends /* key */ StringDictionary[js.Any] {
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
    *  whether to marshal request parameters to the prefix of hostname.
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
    * when region is set to 'us-east-1', whether to send s3 request to global endpoints
    * or 'us-east-1' regional endpoints. This config is only applicable to S3 client;
    * Defaults to 'legacy'
    */
  var s3UsEast1RegionalEndpoint: js.UndefOr[regional_ | legacy_] = js.native
  /**
    * whether to override the request region with the region inferred
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
    * whether to send sts request to global endpoints or
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

object ConfigurationOptionskeyst {
  @scala.inline
  def apply(): ConfigurationOptionskeyst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionskeyst]
  }
  @scala.inline
  implicit class ConfigurationOptionskeystOps[Self <: ConfigurationOptionskeyst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeChecksums(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeChecksums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeChecksums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeChecksums")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertResponseTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertResponseTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertResponseTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertResponseTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrectClockSkew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctClockSkew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrectClockSkew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctClockSkew")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentialProvider(value: CredentialProviderChain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentialProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: Credentials | CredentialsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentialsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(null)
        ret
    }
    @scala.inline
    def withCustomUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUserAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUserAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamoDbCrc32(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoDbCrc32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamoDbCrc32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoDbCrc32")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointCacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointCacheSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointDiscoveryEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointDiscoveryEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointDiscoveryEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointDiscoveryEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHostPrefixEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPrefixEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPrefixEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPrefixEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpOptions(value: HTTPOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
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
    def withParamValidation(value: ParamValidation | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelayOptions(value: RetryDelayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DisableBodySigning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3DisableBodySigning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DisableBodySigning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3DisableBodySigning")(js.undefined)
        ret
    }
    @scala.inline
    def withS3ForcePathStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ForcePathStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ForcePathStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ForcePathStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withS3UsEast1RegionalEndpoint(value: regional_ | legacy_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3UsEast1RegionalEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3UsEast1RegionalEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3UsEast1RegionalEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withS3UseArnRegion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3UseArnRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3UseArnRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3UseArnRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretAccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretAccessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureCache")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureVersion(value: v2_ | v3 | v4 | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureVersion")(js.undefined)
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
    def withStsRegionalEndpoints(value: legacy_ | regional_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stsRegionalEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStsRegionalEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stsRegionalEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemClockOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemClockOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemClockOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemClockOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAccelerateEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAccelerateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAccelerateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAccelerateEndpoint")(js.undefined)
        ret
    }
  }
  
}

