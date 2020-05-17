package typingsSlinky.awsSdkClientS3Browser.typesUploadPartInputMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import typingsSlinky.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadPartInput[StreamType] extends InputTypesUnion {
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
    * <p>Object data.</p>
    */
  var Body: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String | StreamType] = js.native
  /**
    * <p>Name of the bucket to which the multipart upload was initiated.</p>
    */
  var Bucket: String = js.native
  /**
    * <p>Size of the body in bytes. This parameter is useful when the size of the body cannot be determined automatically.</p>
    */
  var ContentLength: js.UndefOr[Double] = js.native
  /**
    * <p>The base64-encoded 128-bit MD5 digest of the part data.</p>
    */
  var ContentMD5: js.UndefOr[String] = js.native
  /**
    * <p>Object key for which the multipart upload was initiated.</p>
    */
  var Key: String = js.native
  /**
    * <p>Part number of part being uploaded. This is a positive integer between 1 and 10,000.</p>
    */
  var PartNumber: Double = js.native
  /**
    * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
    */
  var RequestPayer: js.UndefOr[requester_ | String] = js.native
  /**
    * <p>Specifies the algorithm to use to when encrypting the object (e.g., AES256).</p>
    */
  var SSECustomerAlgorithm: js.UndefOr[String] = js.native
  /**
    * <p>Upload ID identifying the multipart upload whose part is being uploaded.</p>
    */
  var UploadId: String = js.native
}

object UploadPartInput {
  @scala.inline
  def apply[StreamType](Bucket: String, Key: String, PartNumber: Double, UploadId: String): UploadPartInput[StreamType] = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartInput[StreamType]]
  }
  @scala.inline
  implicit class UploadPartInputOps[Self[streamtype] <: UploadPartInput[streamtype], StreamType] (val x: Self[StreamType]) extends AnyVal {
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
    def withPartNumber(value: Double): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadId(value: String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadId")(value.asInstanceOf[js.Any])
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
  }
  
}

