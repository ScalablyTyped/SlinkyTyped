package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`authenticated-read`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`aws-exec-read`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`bucket-owner-full-control`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`bucket-owner-read`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`private`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read-write`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read`
import typingsSlinky.awsSdkClientS3Browser.typesEncryptionMod.Encryption
import typingsSlinky.awsSdkClientS3Browser.typesEncryptionMod.UnmarshalledEncryption
import typingsSlinky.awsSdkClientS3Browser.typesGrantMod.Grant
import typingsSlinky.awsSdkClientS3Browser.typesGrantMod.UnmarshalledGrant
import typingsSlinky.awsSdkClientS3Browser.typesMetadataEntryMod.MetadataEntry
import typingsSlinky.awsSdkClientS3Browser.typesMetadataEntryMod.UnmarshalledMetadataEntry
import typingsSlinky.awsSdkClientS3Browser.typesTaggingMod.Tagging
import typingsSlinky.awsSdkClientS3Browser.typesTaggingMod.UnmarshalledTagging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesS3LocationMod {
  
  @js.native
  trait S3Location extends StObject {
    
    /**
      * <p>A list of grants that control access to the staged results.</p>
      */
    var AccessControlList: js.UndefOr[js.Array[Grant] | js.Iterable[Grant]] = js.native
    
    /**
      * <p>The name of the bucket where the restore results will be placed.</p>
      */
    var BucketName: String = js.native
    
    /**
      * <p>The canned ACL to apply to the restore results.</p>
      */
    var CannedACL: js.UndefOr[
        `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
      ] = js.native
    
    /**
      * <p>Describes the server-side encryption that will be applied to the restore results.</p>
      */
    var Encryption: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesEncryptionMod.Encryption] = js.native
    
    /**
      * <p>The prefix that is prepended to the restore results for this request.</p>
      */
    var Prefix: String = js.native
    
    /**
      * <p>The class of storage used to store the restore results.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
    
    /**
      * <p>The tag-set that is applied to the restore results.</p>
      */
    var Tagging: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesTaggingMod.Tagging] = js.native
    
    /**
      * <p>A list of metadata to store with the restore results in S3.</p>
      */
    var UserMetadata: js.UndefOr[js.Array[MetadataEntry] | js.Iterable[MetadataEntry]] = js.native
  }
  object S3Location {
    
    @scala.inline
    def apply(BucketName: String, Prefix: String): S3Location = {
      val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3Location]
    }
    
    @scala.inline
    implicit class S3LocationMutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessControlList(value: js.Array[Grant] | js.Iterable[Grant]): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessControlListIterable(value: js.Iterable[Grant]): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
      
      @scala.inline
      def setAccessControlListVarargs(value: Grant*): Self = StObject.set(x, "AccessControlList", js.Array(value :_*))
      
      @scala.inline
      def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCannedACL(
        value: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
      ): Self = StObject.set(x, "CannedACL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCannedACLUndefined: Self = StObject.set(x, "CannedACL", js.undefined)
      
      @scala.inline
      def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      @scala.inline
      def setTagging(value: Tagging): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
      
      @scala.inline
      def setUserMetadata(value: js.Array[MetadataEntry] | js.Iterable[MetadataEntry]): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserMetadataIterable(value: js.Iterable[MetadataEntry]): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
      
      @scala.inline
      def setUserMetadataVarargs(value: MetadataEntry*): Self = StObject.set(x, "UserMetadata", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledS3Location extends S3Location {
    
    /**
      * <p>A list of grants that control access to the staged results.</p>
      */
    @JSName("AccessControlList")
    var AccessControlList_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledGrant]] = js.native
    
    /**
      * <p>Describes the server-side encryption that will be applied to the restore results.</p>
      */
    @JSName("Encryption")
    var Encryption_UnmarshalledS3Location: js.UndefOr[UnmarshalledEncryption] = js.native
    
    /**
      * <p>The tag-set that is applied to the restore results.</p>
      */
    @JSName("Tagging")
    var Tagging_UnmarshalledS3Location: js.UndefOr[UnmarshalledTagging] = js.native
    
    /**
      * <p>A list of metadata to store with the restore results in S3.</p>
      */
    @JSName("UserMetadata")
    var UserMetadata_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledMetadataEntry]] = js.native
  }
  object UnmarshalledS3Location {
    
    @scala.inline
    def apply(BucketName: String, Prefix: String): UnmarshalledS3Location = {
      val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledS3Location]
    }
    
    @scala.inline
    implicit class UnmarshalledS3LocationMutableBuilder[Self <: UnmarshalledS3Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessControlList(value: js.Array[UnmarshalledGrant]): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
      
      @scala.inline
      def setAccessControlListVarargs(value: UnmarshalledGrant*): Self = StObject.set(x, "AccessControlList", js.Array(value :_*))
      
      @scala.inline
      def setEncryption(value: UnmarshalledEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      @scala.inline
      def setTagging(value: UnmarshalledTagging): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
      
      @scala.inline
      def setUserMetadata(value: js.Array[UnmarshalledMetadataEntry]): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
      
      @scala.inline
      def setUserMetadataVarargs(value: UnmarshalledMetadataEntry*): Self = StObject.set(x, "UserMetadata", js.Array(value :_*))
    }
  }
}
