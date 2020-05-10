package typingsSlinky.awsSdkClientS3Browser.typesPutObjectInputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`authenticated-read`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`aws-exec-read`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`bucket-owner-full-control`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`bucket-owner-read`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`private`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read-write`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import typingsSlinky.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectInput[StreamType] extends js.Object {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Whether to use the bucket name as the endpoint for this request. The bucket
    * name must be a domain name with a CNAME record alias to an appropriate virtual
    * hosted-style S3 hostname, e.g. a bucket of `images.johnsmith.net` and a DNS
    * record of:
    *
    * ```
    * images.johnsmith.net CNAME 			images.johnsmith.net.s3.amazonaws.com.
    * ```
    *
    * @see https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingCustomURLs
    */
  @JSName("$bucketEndpoint")
  var $bucketEndpoint: js.UndefOr[String] = js.native
  /**
    * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
    */
  @JSName("$forcePathStyle")
  var $forcePathStyle: js.UndefOr[Boolean] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the `SSECustomerAlgorithm` parameter
    */
  @JSName("$serverSideEncryptionKey")
  var $serverSideEncryptionKey: js.UndefOr[SourceData] = js.native
  /**
    * Whether to use the S3 Transfer Acceleration endpoint by default
    */
  @JSName("$useAccelerateEndpoint")
  var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
    */
  @JSName("$useDualstackEndpoint")
  var $useDualstackEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * <p>The canned ACL to apply to the object.</p>
    */
  var ACL: js.UndefOr[
    `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
  ] = js.native
  /**
    * <p>Object data.</p>
    */
  var Body: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String | StreamType] = js.native
  /**
    * <p>Name of the bucket to which the PUT operation was initiated.</p>
    */
  var Bucket: String = js.native
  /**
    * <p>Specifies caching behavior along the request/reply chain.</p>
    */
  var CacheControl: js.UndefOr[String] = js.native
  /**
    * <p>Specifies presentational information for the object.</p>
    */
  var ContentDisposition: js.UndefOr[String] = js.native
  /**
    * <p>Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.</p>
    */
  var ContentEncoding: js.UndefOr[String] = js.native
  /**
    * <p>The language the content is in.</p>
    */
  var ContentLanguage: js.UndefOr[String] = js.native
  /**
    * <p>Size of the body in bytes. This parameter is useful when the size of the body cannot be determined automatically.</p>
    */
  var ContentLength: js.UndefOr[Double] = js.native
  /**
    * <p>The base64-encoded 128-bit MD5 digest of the part data.</p>
    */
  var ContentMD5: js.UndefOr[String] = js.native
  /**
    * <p>A standard MIME type describing the format of the object data.</p>
    */
  var ContentType: js.UndefOr[String] = js.native
  /**
    * <p>The date and time at which the object is no longer cacheable.</p>
    */
  var Expires: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.</p>
    */
  var GrantFullControl: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to read the object data and its metadata.</p>
    */
  var GrantRead: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to read the object ACL.</p>
    */
  var GrantReadACP: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to write the ACL for the applicable object.</p>
    */
  var GrantWriteACP: js.UndefOr[String] = js.native
  /**
    * <p>Object key for which the PUT operation was initiated.</p>
    */
  var Key: String = js.native
  /**
    * <p>A map of metadata to store with the object in S3.</p>
    */
  var Metadata: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
  /**
    * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
    */
  var RequestPayer: js.UndefOr[requester_ | String] = js.native
  /**
    * <p>Specifies the algorithm to use to when encrypting the object (e.g., AES256).</p>
    */
  var SSECustomerAlgorithm: js.UndefOr[String] = js.native
  /**
    * <p>Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. Documentation on configuring any of the officially supported AWS SDKs and CLI can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version</p>
    */
  var SSEKMSKeyId: js.UndefOr[String] = js.native
  /**
    * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
    */
  var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.native
  /**
    * <p>The type of storage to use for the object. Defaults to 'STANDARD'.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
  /**
    * <p>The tag-set for the object. The tag-set must be encoded as URL Query parameters</p>
    */
  var Tagging: js.UndefOr[String] = js.native
  /**
    * <p>If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.</p>
    */
  var WebsiteRedirectLocation: js.UndefOr[String] = js.native
}

object PutObjectInput {
  @scala.inline
  def apply[StreamType](Bucket: String, Key: String): PutObjectInput[StreamType] = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectInput[StreamType]]
  }
  @scala.inline
  implicit class PutObjectInputOps[Self[streamtype] <: PutObjectInput[streamtype], StreamType] (val x: Self[StreamType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StreamType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StreamType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StreamType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StreamType] with Other]
    @scala.inline
    def withBucket(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$abortSignal(value: AbortSignal): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$abortSignal: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(js.undefined)
        ret
    }
    @scala.inline
    def with$bucketEndpoint(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bucketEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$bucketEndpoint: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bucketEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def with$forcePathStyle(value: Boolean): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$forcePathStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$forcePathStyle: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$forcePathStyle")(js.undefined)
        ret
    }
    @scala.inline
    def with$httpOptions(value: BrowserHttpOptions): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$httpOptions: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def with$maxRetries(value: Double): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$maxRetries: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def with$serverSideEncryptionKeyArrayBufferView(value: js.typedarray.ArrayBufferView): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$serverSideEncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$serverSideEncryptionKeyArrayBuffer(value: js.typedarray.ArrayBuffer): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$serverSideEncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$serverSideEncryptionKey(value: SourceData): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$serverSideEncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$serverSideEncryptionKey: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$serverSideEncryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def with$useAccelerateEndpoint(value: Boolean): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useAccelerateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$useAccelerateEndpoint: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useAccelerateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def with$useDualstackEndpoint(value: Boolean): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useDualstackEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$useDualstackEndpoint: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useDualstackEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withACL(
      value: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
    ): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutACL: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACL")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyArrayBufferView(value: js.typedarray.ArrayBufferView): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String | StreamType): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheControl(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheControl: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDisposition(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDisposition: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentDisposition")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEncoding(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEncoding: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLanguage(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLanguage: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLength(value: Double): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLength: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withContentMD5(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentMD5: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresDate(value: js.Date): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: js.Date | String | Double): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expires")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantFullControl(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantFullControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantFullControl: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantFullControl")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantRead(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantRead: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantRead")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantReadACP(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantReadACP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantReadACP: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantReadACP")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantWriteACP(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantWriteACP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantWriteACP: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantWriteACP")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataIterable(value: js.Iterable[js.Tuple2[String, String]]): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPayer(value: requester_ | String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestPayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayer: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestPayer")(js.undefined)
        ret
    }
    @scala.inline
    def withSSECustomerAlgorithm(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSECustomerAlgorithm: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSSEKMSKeyId(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEKMSKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEKMSKeyId: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEKMSKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryption(value: AES256 | awsColonkms | String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryption: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTagging(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagging: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagging")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteRedirectLocation(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteRedirectLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteRedirectLocation: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteRedirectLocation")(js.undefined)
        ret
    }
  }
  
}

