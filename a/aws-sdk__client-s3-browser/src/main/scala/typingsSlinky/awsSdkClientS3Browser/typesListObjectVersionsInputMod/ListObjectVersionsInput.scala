package typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsInputMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.url
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectVersionsInput extends InputTypesUnion {
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
    * _BucketName shape
    */
  var Bucket: String = js.native
  /**
    * <p>A delimiter is a character you use to group keys.</p>
    */
  var Delimiter: js.UndefOr[String] = js.native
  /**
    * <p>Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.</p>
    */
  var EncodingType: js.UndefOr[url | String] = js.native
  /**
    * <p>Specifies the key to start with when listing objects in a bucket.</p>
    */
  var KeyMarker: js.UndefOr[String] = js.native
  /**
    * <p>Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.</p>
    */
  var MaxKeys: js.UndefOr[Double] = js.native
  /**
    * <p>Limits the response to keys that begin with the specified prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>Specifies the object version you want to start listing from.</p>
    */
  var VersionIdMarker: js.UndefOr[String] = js.native
}

object ListObjectVersionsInput {
  @scala.inline
  def apply(Bucket: String): ListObjectVersionsInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectVersionsInput]
  }
  @scala.inline
  implicit class ListObjectVersionsInputOps[Self <: ListObjectVersionsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$abortSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$abortSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(js.undefined)
        ret
    }
    @scala.inline
    def with$bucketEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bucketEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$bucketEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bucketEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def with$forcePathStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$forcePathStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$forcePathStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$forcePathStyle")(js.undefined)
        ret
    }
    @scala.inline
    def with$httpOptions(value: BrowserHttpOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$httpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def with$maxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$maxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def with$useAccelerateEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useAccelerateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$useAccelerateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useAccelerateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def with$useDualstackEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useDualstackEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$useDualstackEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useDualstackEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodingType(value: url | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodingType")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxKeys(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionIdMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionIdMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionIdMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionIdMarker")(js.undefined)
        ret
    }
  }
  
}

