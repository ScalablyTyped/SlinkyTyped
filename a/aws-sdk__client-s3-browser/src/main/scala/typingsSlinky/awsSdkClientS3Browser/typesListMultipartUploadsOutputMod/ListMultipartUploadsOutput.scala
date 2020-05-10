package typingsSlinky.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.url
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typingsSlinky.awsSdkClientS3Browser.typesMultipartUploadMod.UnmarshalledMultipartUpload
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultipartUploadsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Name of the bucket to which the multipart upload was initiated.</p>
    */
  var Bucket: js.UndefOr[String] = js.native
  /**
    * _CommonPrefixList shape
    */
  var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.native
  /**
    * _Delimiter shape
    */
  var Delimiter: js.UndefOr[String] = js.native
  /**
    * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
    */
  var EncodingType: js.UndefOr[url | String] = js.native
  /**
    * <p>Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or specified by max uploads.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.native
  /**
    * <p>The key at or after which the listing began.</p>
    */
  var KeyMarker: js.UndefOr[String] = js.native
  /**
    * <p>Maximum number of multipart uploads that could have been included in the response.</p>
    */
  var MaxUploads: js.UndefOr[Double] = js.native
  /**
    * <p>When a list is truncated, this element specifies the value that should be used for the key-marker request parameter in a subsequent request.</p>
    */
  var NextKeyMarker: js.UndefOr[String] = js.native
  /**
    * <p>When a list is truncated, this element specifies the value that should be used for the upload-id-marker request parameter in a subsequent request.</p>
    */
  var NextUploadIdMarker: js.UndefOr[String] = js.native
  /**
    * <p>When a prefix is provided in the request, this field contains the specified prefix. The result contains only keys starting with the specified prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>Upload ID after which listing began.</p>
    */
  var UploadIdMarker: js.UndefOr[String] = js.native
  /**
    * _MultipartUploadList shape
    */
  var Uploads: js.UndefOr[js.Array[UnmarshalledMultipartUpload]] = js.native
}

object ListMultipartUploadsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
  @scala.inline
  implicit class ListMultipartUploadsOutputOps[Self <: ListMultipartUploadsOutput] (val x: Self) extends AnyVal {
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
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonPrefixes(value: js.Array[UnmarshalledCommonPrefix]): Self = {
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
    def withIsTruncated(value: Boolean): Self = {
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
    def withMaxUploads(value: Double): Self = {
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
    def withNextKeyMarker(value: String): Self = {
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
    def withNextUploadIdMarker(value: String): Self = {
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
    def withUploadIdMarker(value: String): Self = {
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
    def withUploads(value: js.Array[UnmarshalledMultipartUpload]): Self = {
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

