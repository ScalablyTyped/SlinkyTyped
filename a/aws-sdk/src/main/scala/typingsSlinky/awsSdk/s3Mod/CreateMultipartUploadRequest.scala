package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMultipartUploadRequest extends js.Object {
  
  /**
    * The canned ACL to apply to the object. This action is not supported by Amazon S3 on Outposts.
    */
  var ACL: js.UndefOr[ObjectCannedACL] = js.native
  
  /**
    * The name of the bucket to which to initiate the upload When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide. When using this API with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this operation using S3 on Outposts through the AWS SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using S3 on Outposts in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  
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
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentType] = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[js.Date] = js.native
  
  /**
    * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantFullControl: js.UndefOr[typingsSlinky.awsSdk.s3Mod.GrantFullControl] = js.native
  
  /**
    * Allows grantee to read the object data and its metadata. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantRead: js.UndefOr[typingsSlinky.awsSdk.s3Mod.GrantRead] = js.native
  
  /**
    * Allows grantee to read the object ACL. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantReadACP: js.UndefOr[typingsSlinky.awsSdk.s3Mod.GrantReadACP] = js.native
  
  /**
    * Allows grantee to write the ACL for the applicable object. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantWriteACP: js.UndefOr[typingsSlinky.awsSdk.s3Mod.GrantWriteACP] = js.native
  
  /**
    * Object key for which the multipart upload is to be initiated.
    */
  var Key: ObjectKey = js.native
  
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Metadata] = js.native
  
  /**
    * Specifies whether you want to apply a Legal Hold to the uploaded object.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ObjectLockLegalHoldStatus] = js.native
  
  /**
    * Specifies the Object Lock mode that you want to apply to the uploaded object.
    */
  var ObjectLockMode: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ObjectLockMode] = js.native
  
  /**
    * Specifies the date and time when you want the Object Lock to expire.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.native
  
  var RequestPayer: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestPayer] = js.native
  
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerKey] = js.native
  
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  
  /**
    * Specifies the AWS KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSEKMSEncryptionContext] = js.native
  
  /**
    * Specifies the ID of the symmetric customer managed AWS KMS CMK to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. For information about configuring using any of the officially supported AWS SDKs and AWS CLI, see Specifying the Signature Version in Request Authentication in the Amazon S3 Developer Guide.
    */
  var SSEKMSKeyId: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSEKMSKeyId] = js.native
  
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ServerSideEncryption] = js.native
  
  /**
    * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage class provides high durability and high availability. Depending on performance needs, you can specify a different Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information, see Storage Classes in the Amazon S3 Service Developer Guide.
    */
  var StorageClass: js.UndefOr[typingsSlinky.awsSdk.s3Mod.StorageClass] = js.native
  
  /**
    * The tag-set for the object. The tag-set must be encoded as URL Query parameters.
    */
  var Tagging: js.UndefOr[TaggingHeader] = js.native
  
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[typingsSlinky.awsSdk.s3Mod.WebsiteRedirectLocation] = js.native
}
object CreateMultipartUploadRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey): CreateMultipartUploadRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultipartUploadRequest]
  }
  
  @scala.inline
  implicit class CreateMultipartUploadRequestOps[Self <: CreateMultipartUploadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setACL(value: ObjectCannedACL): Self = this.set("ACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteACL: Self = this.set("ACL", js.undefined)
    
    @scala.inline
    def setCacheControl(value: CacheControl): Self = this.set("CacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheControl: Self = this.set("CacheControl", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: ContentDisposition): Self = this.set("ContentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDisposition: Self = this.set("ContentDisposition", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: ContentEncoding): Self = this.set("ContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("ContentEncoding", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: ContentLanguage): Self = this.set("ContentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("ContentLanguage", js.undefined)
    
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = this.set("ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedBucketOwner: Self = this.set("ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setExpires(value: js.Date): Self = this.set("Expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("Expires", js.undefined)
    
    @scala.inline
    def setGrantFullControl(value: GrantFullControl): Self = this.set("GrantFullControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantFullControl: Self = this.set("GrantFullControl", js.undefined)
    
    @scala.inline
    def setGrantRead(value: GrantRead): Self = this.set("GrantRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantRead: Self = this.set("GrantRead", js.undefined)
    
    @scala.inline
    def setGrantReadACP(value: GrantReadACP): Self = this.set("GrantReadACP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantReadACP: Self = this.set("GrantReadACP", js.undefined)
    
    @scala.inline
    def setGrantWriteACP(value: GrantWriteACP): Self = this.set("GrantWriteACP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantWriteACP: Self = this.set("GrantWriteACP", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setObjectLockLegalHoldStatus(value: ObjectLockLegalHoldStatus): Self = this.set("ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectLockLegalHoldStatus: Self = this.set("ObjectLockLegalHoldStatus", js.undefined)
    
    @scala.inline
    def setObjectLockMode(value: ObjectLockMode): Self = this.set("ObjectLockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectLockMode: Self = this.set("ObjectLockMode", js.undefined)
    
    @scala.inline
    def setObjectLockRetainUntilDate(value: js.Date): Self = this.set("ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectLockRetainUntilDate: Self = this.set("ObjectLockRetainUntilDate", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
    
    @scala.inline
    def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = this.set("SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSECustomerAlgorithm: Self = this.set("SSECustomerAlgorithm", js.undefined)
    
    @scala.inline
    def setSSECustomerKeyUint8Array(value: js.typedarray.Uint8Array): Self = this.set("SSECustomerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerKey(value: SSECustomerKey): Self = this.set("SSECustomerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSECustomerKey: Self = this.set("SSECustomerKey", js.undefined)
    
    @scala.inline
    def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = this.set("SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSECustomerKeyMD5: Self = this.set("SSECustomerKeyMD5", js.undefined)
    
    @scala.inline
    def setSSEKMSEncryptionContext(value: SSEKMSEncryptionContext): Self = this.set("SSEKMSEncryptionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSEKMSEncryptionContext: Self = this.set("SSEKMSEncryptionContext", js.undefined)
    
    @scala.inline
    def setSSEKMSKeyId(value: SSEKMSKeyId): Self = this.set("SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSEKMSKeyId: Self = this.set("SSEKMSKeyId", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: ServerSideEncryption): Self = this.set("ServerSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("ServerSideEncryption", js.undefined)
    
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    
    @scala.inline
    def setTagging(value: TaggingHeader): Self = this.set("Tagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagging: Self = this.set("Tagging", js.undefined)
    
    @scala.inline
    def setWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = this.set("WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteRedirectLocation: Self = this.set("WebsiteRedirectLocation", js.undefined)
  }
}
