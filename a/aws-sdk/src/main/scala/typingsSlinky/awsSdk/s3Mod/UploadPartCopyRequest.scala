package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadPartCopyRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
  /**
    * The name of the source bucket and key name of the source object, separated by a slash (/). Must be URL-encoded.
    */
  var CopySource: typingsSlinky.awsSdk.s3Mod.CopySource = js.native
  /**
    * Copies the object if its entity tag (ETag) matches the specified tag.
    */
  var CopySourceIfMatch: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CopySourceIfMatch] = js.native
  /**
    * Copies the object if it has been modified since the specified time.
    */
  var CopySourceIfModifiedSince: js.UndefOr[js.Date] = js.native
  /**
    * Copies the object if its entity tag (ETag) is different than the specified ETag.
    */
  var CopySourceIfNoneMatch: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CopySourceIfNoneMatch] = js.native
  /**
    * Copies the object if it hasn't been modified since the specified time.
    */
  var CopySourceIfUnmodifiedSince: js.UndefOr[js.Date] = js.native
  /**
    * The range of bytes to copy from the source object. The range value must use the form bytes=first-last, where the first and last are the zero-based byte offsets to copy. For example, bytes=0-9 indicates that you want to copy the first 10 bytes of the source. You can copy a range only if the source object is greater than 5 MB.
    */
  var CopySourceRange: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CopySourceRange] = js.native
  /**
    * Specifies the algorithm to use when decrypting the source object (for example, AES256).
    */
  var CopySourceSSECustomerAlgorithm: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CopySourceSSECustomerAlgorithm] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption key provided in this header must be one that was used when the source object was created.
    */
  var CopySourceSSECustomerKey: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CopySourceSSECustomerKey] = js.native
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var CopySourceSSECustomerKeyMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CopySourceSSECustomerKeyMD5] = js.native
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: ObjectKey = js.native
  /**
    * Part number of part being copied. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: typingsSlinky.awsSdk.s3Mod.PartNumber = js.native
  var RequestPayer: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header. This must be the same encryption key specified in the initiate multipart upload request.
    */
  var SSECustomerKey: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerKey] = js.native
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  /**
    * Upload ID identifying the multipart upload whose part is being copied.
    */
  var UploadId: MultipartUploadId = js.native
}

object UploadPartCopyRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    CopySource: CopySource,
    Key: ObjectKey,
    PartNumber: PartNumber,
    UploadId: MultipartUploadId
  ): UploadPartCopyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartCopyRequest]
  }
  @scala.inline
  implicit class UploadPartCopyRequestOps[Self <: UploadPartCopyRequest] (val x: Self) extends AnyVal {
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
    def withCopySource(value: CopySource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: ObjectKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartNumber(value: PartNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadId(value: MultipartUploadId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopySourceIfMatch(value: CopySourceIfMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceIfMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopySourceIfMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceIfMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withCopySourceIfModifiedSince(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceIfModifiedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopySourceIfModifiedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceIfModifiedSince")(js.undefined)
        ret
    }
    @scala.inline
    def withCopySourceIfNoneMatch(value: CopySourceIfNoneMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceIfNoneMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopySourceIfNoneMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceIfNoneMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withCopySourceIfUnmodifiedSince(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceIfUnmodifiedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopySourceIfUnmodifiedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceIfUnmodifiedSince")(js.undefined)
        ret
    }
    @scala.inline
    def withCopySourceRange(value: CopySourceRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopySourceRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceRange")(js.undefined)
        ret
    }
    @scala.inline
    def withCopySourceSSECustomerAlgorithm(value: CopySourceSSECustomerAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceSSECustomerAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopySourceSSECustomerAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceSSECustomerAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withCopySourceSSECustomerKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceSSECustomerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopySourceSSECustomerKey(value: CopySourceSSECustomerKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceSSECustomerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopySourceSSECustomerKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceSSECustomerKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCopySourceSSECustomerKeyMD5(value: CopySourceSSECustomerKeyMD5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceSSECustomerKeyMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopySourceSSECustomerKeyMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceSSECustomerKeyMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPayer(value: RequestPayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestPayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestPayer")(js.undefined)
        ret
    }
    @scala.inline
    def withSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSECustomerAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSSECustomerKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSSECustomerKey(value: SSECustomerKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSECustomerKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKeyMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSECustomerKeyMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKeyMD5")(js.undefined)
        ret
    }
  }
  
}

