package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectRequest extends js.Object {
  /**
    * The bucket name containing the object.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).
    */
  var IfMatch: js.UndefOr[typingsSlinky.awsSdk.s3Mod.IfMatch] = js.native
  /**
    * Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).
    */
  var IfModifiedSince: js.UndefOr[js.Date] = js.native
  /**
    * Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).
    */
  var IfNoneMatch: js.UndefOr[typingsSlinky.awsSdk.s3Mod.IfNoneMatch] = js.native
  /**
    * Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).
    */
  var IfUnmodifiedSince: js.UndefOr[js.Date] = js.native
  /**
    * Key of the object to get.
    */
  var Key: ObjectKey = js.native
  /**
    * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.
    */
  var PartNumber: js.UndefOr[typingsSlinky.awsSdk.s3Mod.PartNumber] = js.native
  /**
    * Downloads the specified range bytes of an object. For more information about the HTTP Range header, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.
    */
  var Range: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Range] = js.native
  var RequestPayer: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * Sets the Cache-Control header of the response.
    */
  var ResponseCacheControl: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ResponseCacheControl] = js.native
  /**
    * Sets the Content-Disposition header of the response
    */
  var ResponseContentDisposition: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ResponseContentDisposition] = js.native
  /**
    * Sets the Content-Encoding header of the response.
    */
  var ResponseContentEncoding: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ResponseContentEncoding] = js.native
  /**
    * Sets the Content-Language header of the response.
    */
  var ResponseContentLanguage: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ResponseContentLanguage] = js.native
  /**
    * Sets the Content-Type header of the response.
    */
  var ResponseContentType: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ResponseContentType] = js.native
  /**
    * Sets the Expires header of the response.
    */
  var ResponseExpires: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerKey] = js.native
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  /**
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object GetObjectRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey): GetObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectRequest]
  }
  @scala.inline
  implicit class GetObjectRequestOps[Self <: GetObjectRequest] (val x: Self) extends AnyVal {
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
    def withKey(value: ObjectKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfMatch(value: IfMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfModifiedSince(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfModifiedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfModifiedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfModifiedSince")(js.undefined)
        ret
    }
    @scala.inline
    def withIfNoneMatch(value: IfNoneMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfNoneMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfNoneMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfNoneMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfUnmodifiedSince(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfUnmodifiedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfUnmodifiedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfUnmodifiedSince")(js.undefined)
        ret
    }
    @scala.inline
    def withPartNumber(value: PartNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(js.undefined)
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
    def withResponseCacheControl(value: ResponseCacheControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseCacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCacheControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseCacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseContentDisposition(value: ResponseContentDisposition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseContentDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseContentDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseContentDisposition")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseContentEncoding(value: ResponseContentEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseContentEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseContentEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseContentEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseContentLanguage(value: ResponseContentLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseContentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseContentLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseContentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseContentType(value: ResponseContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseExpires(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseExpires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseExpires")(js.undefined)
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
    @scala.inline
    def withVersionId(value: ObjectVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

