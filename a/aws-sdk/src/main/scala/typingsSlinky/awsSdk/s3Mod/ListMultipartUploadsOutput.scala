package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultipartUploadsOutput extends js.Object {
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  /**
    * If you specify a delimiter in the request, then the result returns each distinct key prefix containing the delimiter in a CommonPrefixes element. The distinct key prefixes are returned in the Prefix child element.
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.native
  /**
    * Contains the delimiter you specified in the request. If you don't specify a delimiter in your request, this element is absent from the response.
    */
  var Delimiter: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Delimiter] = js.native
  /**
    * Encoding type used by Amazon S3 to encode object keys in the response. If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and returns encoded key name values in the following response elements:  Delimiter, KeyMarker, Prefix, NextKeyMarker, Key.
    */
  var EncodingType: js.UndefOr[typingsSlinky.awsSdk.s3Mod.EncodingType] = js.native
  /**
    * Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or specified by max uploads.
    */
  var IsTruncated: js.UndefOr[typingsSlinky.awsSdk.s3Mod.IsTruncated] = js.native
  /**
    * The key at or after which the listing began.
    */
  var KeyMarker: js.UndefOr[typingsSlinky.awsSdk.s3Mod.KeyMarker] = js.native
  /**
    * Maximum number of multipart uploads that could have been included in the response.
    */
  var MaxUploads: js.UndefOr[typingsSlinky.awsSdk.s3Mod.MaxUploads] = js.native
  /**
    * When a list is truncated, this element specifies the value that should be used for the key-marker request parameter in a subsequent request.
    */
  var NextKeyMarker: js.UndefOr[typingsSlinky.awsSdk.s3Mod.NextKeyMarker] = js.native
  /**
    * When a list is truncated, this element specifies the value that should be used for the upload-id-marker request parameter in a subsequent request.
    */
  var NextUploadIdMarker: js.UndefOr[typingsSlinky.awsSdk.s3Mod.NextUploadIdMarker] = js.native
  /**
    * When a prefix is provided in the request, this field contains the specified prefix. The result contains only keys starting with the specified prefix.
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Prefix] = js.native
  /**
    * Upload ID after which listing began.
    */
  var UploadIdMarker: js.UndefOr[typingsSlinky.awsSdk.s3Mod.UploadIdMarker] = js.native
  /**
    * Container for elements related to a particular multipart upload. A response can contain zero or more Upload elements.
    */
  var Uploads: js.UndefOr[MultipartUploadList] = js.native
}

object ListMultipartUploadsOutput {
  @scala.inline
  def apply(): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
  @scala.inline
  implicit class ListMultipartUploadsOutputOps[Self <: ListMultipartUploadsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonPrefixes(value: CommonPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: Delimiter): Self = {
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
    def withEncodingType(value: EncodingType): Self = {
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
    def withIsTruncated(value: IsTruncated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMarker(value: KeyMarker): Self = {
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
    def withMaxUploads(value: MaxUploads): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withNextKeyMarker(value: NextKeyMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextKeyMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextKeyMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextKeyMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withNextUploadIdMarker(value: NextUploadIdMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextUploadIdMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextUploadIdMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextUploadIdMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Prefix): Self = {
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
    def withUploadIdMarker(value: UploadIdMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadIdMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadIdMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadIdMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withUploads(value: MultipartUploadList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uploads")(js.undefined)
        ret
    }
  }
  
}

