package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectOutput extends js.Object {
  /**
    * Indicates that a range of bytes was specified.
    */
  var AcceptRanges: js.UndefOr[typingsSlinky.awsSdk.s3Mod.AcceptRanges] = js.native
  /**
    * Object data.
    */
  var Body: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Body] = js.native
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  var CacheControl: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CacheControl] = js.native
  /**
    * Specifies presentational information for the object.
    */
  var ContentDisposition: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentDisposition] = js.native
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  var ContentEncoding: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentEncoding] = js.native
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentLanguage] = js.native
  /**
    * Size of the body in bytes.
    */
  var ContentLength: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentLength] = js.native
  /**
    * The portion of the object returned in the response.
    */
  var ContentRange: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentRange] = js.native
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentType] = js.native
  /**
    * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.
    */
  var DeleteMarker: js.UndefOr[typingsSlinky.awsSdk.s3Mod.DeleteMarker] = js.native
  /**
    * An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL.
    */
  var ETag: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ETag] = js.native
  /**
    * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key-value pairs providing object expiration information. The value of the rule-id is URL encoded.
    */
  var Expiration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Expiration] = js.native
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[js.Date] = js.native
  /**
    * Last modified date of the object
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Metadata] = js.native
  /**
    * This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
    */
  var MissingMeta: js.UndefOr[typingsSlinky.awsSdk.s3Mod.MissingMeta] = js.native
  /**
    * Indicates whether this object has an active legal hold. This field is only returned if you have permission to view an object's legal hold status. 
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ObjectLockLegalHoldStatus] = js.native
  /**
    * The Object Lock mode currently in place for this object.
    */
  var ObjectLockMode: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ObjectLockMode] = js.native
  /**
    * The date and time when this object's Object Lock will expire.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.native
  /**
    * The count of parts this object has.
    */
  var PartsCount: js.UndefOr[typingsSlinky.awsSdk.s3Mod.PartsCount] = js.native
  /**
    * Amazon S3 can return this if your request involves a bucket that is either a source or destination in a replication rule.
    */
  var ReplicationStatus: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ReplicationStatus] = js.native
  var RequestCharged: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestCharged] = js.native
  /**
    * Provides information about object restoration operation and expiration time of the restored object copy.
    */
  var Restore: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Restore] = js.native
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round-trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  /**
    * If present, specifies the ID of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK) that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSEKMSKeyId] = js.native
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ServerSideEncryption] = js.native
  /**
    * Provides storage class information of the object. Amazon S3 returns this header for all objects except for Standard storage class objects.
    */
  var StorageClass: js.UndefOr[typingsSlinky.awsSdk.s3Mod.StorageClass] = js.native
  /**
    * The number of tags, if any, on the object.
    */
  var TagCount: js.UndefOr[typingsSlinky.awsSdk.s3Mod.TagCount] = js.native
  /**
    * Version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[typingsSlinky.awsSdk.s3Mod.WebsiteRedirectLocation] = js.native
}

object GetObjectOutput {
  @scala.inline
  def apply(): GetObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectOutput]
  }
  @scala.inline
  implicit class GetObjectOutputOps[Self <: GetObjectOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptRanges(value: AcceptRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheControl(value: CacheControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDisposition(value: ContentDisposition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentDisposition")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEncoding(value: ContentEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLanguage(value: ContentLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLength(value: ContentLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withContentRange(value: ContentRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentRange")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: ContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteMarker(value: DeleteMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withETag(value: ETag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutETag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: Expiration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expires")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingMeta(value: MissingMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectLockLegalHoldStatus(value: ObjectLockLegalHoldStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockLegalHoldStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLockLegalHoldStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockLegalHoldStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectLockMode(value: ObjectLockMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLockMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockMode")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectLockRetainUntilDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockRetainUntilDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLockRetainUntilDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockRetainUntilDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPartsCount(value: PartsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationStatus(value: ReplicationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCharged(value: RequestCharged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCharged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(js.undefined)
        ret
    }
    @scala.inline
    def withRestore(value: Restore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Restore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Restore")(js.undefined)
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
    def withSSEKMSKeyId(value: SSEKMSKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEKMSKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEKMSKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEKMSKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryption(value: ServerSideEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClass(value: StorageClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTagCount(value: TagCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagCount")(js.undefined)
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
    @scala.inline
    def withWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteRedirectLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteRedirectLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteRedirectLocation")(js.undefined)
        ret
    }
  }
  
}

