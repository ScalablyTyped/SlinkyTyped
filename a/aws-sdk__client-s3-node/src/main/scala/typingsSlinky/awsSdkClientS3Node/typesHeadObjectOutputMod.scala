package typingsSlinky.awsSdkClientS3Node

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AES256
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.COMPLETE
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.FAILED
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.PENDING
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REPLICA
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.awsColonkms
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHeadObjectOutputMod {
  
  @js.native
  trait HeadObjectOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _AcceptRanges shape
      */
    var AcceptRanges: js.UndefOr[String] = js.native
    
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
      * <p>Size of the body in bytes.</p>
      */
    var ContentLength: js.UndefOr[Double] = js.native
    
    /**
      * <p>A standard MIME type describing the format of the object data.</p>
      */
    var ContentType: js.UndefOr[String] = js.native
    
    /**
      * <p>Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.</p>
      */
    var DeleteMarker: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL</p>
      */
    var ETag: js.UndefOr[String] = js.native
    
    /**
      * <p>If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.</p>
      */
    var Expiration: js.UndefOr[String] = js.native
    
    /**
      * <p>The date and time at which the object is no longer cacheable.</p>
      */
    var Expires: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>Last modified date of the object</p>
      */
    var LastModified: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>A map of metadata to store with the object in S3.</p>
      */
    var Metadata: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * <p>This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.</p>
      */
    var MissingMeta: js.UndefOr[Double] = js.native
    
    /**
      * <p>The count of parts this object has.</p>
      */
    var PartsCount: js.UndefOr[Double] = js.native
    
    /**
      * _ReplicationStatus shape
      */
    var ReplicationStatus: js.UndefOr[COMPLETE | PENDING | FAILED | REPLICA | String] = js.native
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
    
    /**
      * <p>Provides information about object restoration operation and expiration time of the restored object copy.</p>
      */
    var Restore: js.UndefOr[String] = js.native
    
    /**
      * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.</p>
      */
    var SSECustomerAlgorithm: js.UndefOr[String] = js.native
    
    /**
      * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.</p>
      */
    var SSECustomerKeyMD5: js.UndefOr[String] = js.native
    
    /**
      * <p>If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.</p>
      */
    var SSEKMSKeyId: js.UndefOr[String] = js.native
    
    /**
      * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
      */
    var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.native
    
    /**
      * _StorageClass shape
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
    
    /**
      * <p>Version of the object.</p>
      */
    var VersionId: js.UndefOr[String] = js.native
    
    /**
      * <p>If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.</p>
      */
    var WebsiteRedirectLocation: js.UndefOr[String] = js.native
  }
  object HeadObjectOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): HeadObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadObjectOutput]
    }
    
    @scala.inline
    implicit class HeadObjectOutputMutableBuilder[Self <: HeadObjectOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptRanges(value: String): Self = StObject.set(x, "AcceptRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptRangesUndefined: Self = StObject.set(x, "AcceptRanges", js.undefined)
      
      @scala.inline
      def setCacheControl(value: String): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
      
      @scala.inline
      def setContentDisposition(value: String): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
      
      @scala.inline
      def setContentEncoding(value: String): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
      
      @scala.inline
      def setContentLanguage(value: String): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
      
      @scala.inline
      def setContentLength(value: Double): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      @scala.inline
      def setDeleteMarker(value: Boolean): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setExpiration(value: String): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
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
      def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
      
      @scala.inline
      def setMissingMeta(value: Double): Self = StObject.set(x, "MissingMeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingMetaUndefined: Self = StObject.set(x, "MissingMeta", js.undefined)
      
      @scala.inline
      def setPartsCount(value: Double): Self = StObject.set(x, "PartsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsCountUndefined: Self = StObject.set(x, "PartsCount", js.undefined)
      
      @scala.inline
      def setReplicationStatus(value: COMPLETE | PENDING | FAILED | REPLICA | String): Self = StObject.set(x, "ReplicationStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationStatusUndefined: Self = StObject.set(x, "ReplicationStatus", js.undefined)
      
      @scala.inline
      def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
      
      @scala.inline
      def setRestore(value: String): Self = StObject.set(x, "Restore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreUndefined: Self = StObject.set(x, "Restore", js.undefined)
      
      @scala.inline
      def setSSECustomerAlgorithm(value: String): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
      
      @scala.inline
      def setSSECustomerKeyMD5(value: String): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
      
      @scala.inline
      def setSSEKMSKeyId(value: String): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
      
      @scala.inline
      def setServerSideEncryption(value: AES256 | awsColonkms | String): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
      
      @scala.inline
      def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
      
      @scala.inline
      def setWebsiteRedirectLocation(value: String): Self = StObject.set(x, "WebsiteRedirectLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteRedirectLocationUndefined: Self = StObject.set(x, "WebsiteRedirectLocation", js.undefined)
    }
  }
}
