package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectOutput extends StObject {
  
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
    * Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3 Standard storage class objects.
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
  implicit class GetObjectOutputMutableBuilder[Self <: GetObjectOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptRanges(value: AcceptRanges): Self = StObject.set(x, "AcceptRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptRangesUndefined: Self = StObject.set(x, "AcceptRanges", js.undefined)
    
    @scala.inline
    def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setCacheControl(value: CacheControl): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: ContentDisposition): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: ContentLanguage): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
    
    @scala.inline
    def setContentLength(value: ContentLength): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    @scala.inline
    def setContentRange(value: ContentRange): Self = StObject.set(x, "ContentRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRangeUndefined: Self = StObject.set(x, "ContentRange", js.undefined)
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setDeleteMarker(value: DeleteMarker): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
    
    @scala.inline
    def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setExpiration(value: Expiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    @scala.inline
    def setExpires(value: js.Date): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
    
    @scala.inline
    def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setMissingMeta(value: MissingMeta): Self = StObject.set(x, "MissingMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingMetaUndefined: Self = StObject.set(x, "MissingMeta", js.undefined)
    
    @scala.inline
    def setObjectLockLegalHoldStatus(value: ObjectLockLegalHoldStatus): Self = StObject.set(x, "ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "ObjectLockLegalHoldStatus", js.undefined)
    
    @scala.inline
    def setObjectLockMode(value: ObjectLockMode): Self = StObject.set(x, "ObjectLockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockModeUndefined: Self = StObject.set(x, "ObjectLockMode", js.undefined)
    
    @scala.inline
    def setObjectLockRetainUntilDate(value: js.Date): Self = StObject.set(x, "ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "ObjectLockRetainUntilDate", js.undefined)
    
    @scala.inline
    def setPartsCount(value: PartsCount): Self = StObject.set(x, "PartsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsCountUndefined: Self = StObject.set(x, "PartsCount", js.undefined)
    
    @scala.inline
    def setReplicationStatus(value: ReplicationStatus): Self = StObject.set(x, "ReplicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationStatusUndefined: Self = StObject.set(x, "ReplicationStatus", js.undefined)
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    @scala.inline
    def setRestore(value: Restore): Self = StObject.set(x, "Restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreUndefined: Self = StObject.set(x, "Restore", js.undefined)
    
    @scala.inline
    def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    @scala.inline
    def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    @scala.inline
    def setSSEKMSKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
    
    @scala.inline
    def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    @scala.inline
    def setTagCount(value: TagCount): Self = StObject.set(x, "TagCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagCountUndefined: Self = StObject.set(x, "TagCount", js.undefined)
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    
    @scala.inline
    def setWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = StObject.set(x, "WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteRedirectLocationUndefined: Self = StObject.set(x, "WebsiteRedirectLocation", js.undefined)
  }
}
