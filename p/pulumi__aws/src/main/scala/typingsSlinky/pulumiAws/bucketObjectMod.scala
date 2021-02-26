package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.s3Mod.Bucket
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.mod.asset.Archive
import typingsSlinky.pulumiPulumi.mod.asset.Asset
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketObjectMod {
  
  @JSImport("@pulumi/aws/s3/bucketObject", "BucketObject")
  @js.native
  class BucketObject protected () extends CustomResource {
    /**
      * Create a BucketObject resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketObjectArgs) = this()
    def this(name: String, args: BucketObjectArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, and `bucket-owner-full-control`. Defaults to `private`.
      */
    val acl: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
      */
    val cacheControl: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
      */
    val content: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
      */
    val contentBase64: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
      */
    val contentDisposition: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
      */
    val contentEncoding: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The language the content is in e.g. en-US or en-GB.
      */
    val contentLanguage: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
      */
    val contentType: Output_[String] = js.native
    
    /**
      * Used to trigger updates. The only meaningful value is `${filemd5("path/to/file")}` (this provider 0.11.12 or later) or `${md5(file("path/to/file"))}` (this provider 0.11.11 or earlier).
      * This attribute is not compatible with KMS encryption, `kmsKeyId` or `serverSideEncryption = "aws:kms"`.
      */
    val etag: Output_[String] = js.native
    
    /**
      * Allow the object to be deleted by removing any legal hold on any object version.
      * Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
      */
    val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The name of the object once it is in the bucket.
      */
    val key: Output_[String] = js.native
    
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * A map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
      */
    val metadata: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
      */
    val objectLockLegalHoldStatus: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
      */
    val objectLockMode: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object's object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
      */
    val objectLockRetainUntilDate: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
      */
    val serverSideEncryption: Output_[String] = js.native
    
    /**
      * The path to a file that will be read and uploaded as raw bytes for the object content.
      */
    val source: Output_[js.UndefOr[Asset | Archive]] = js.native
    
    /**
      * Specifies the desired [Storage Class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html)
      * for the object. Can be either "`STANDARD`", "`REDUCED_REDUNDANCY`", "`ONEZONE_IA`", "`INTELLIGENT_TIERING`", "`GLACIER`", "`DEEP_ARCHIVE`", or "`STANDARD_IA`". Defaults to "`STANDARD`".
      */
    val storageClass: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A unique version ID value for the object, if bucket versioning
      * is enabled.
      */
    val versionId: Output_[String] = js.native
    
    /**
      * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
      */
    val websiteRedirect: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object BucketObject {
    
    /**
      * Get an existing BucketObject resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3/bucketObject", "BucketObject.get")
    @js.native
    def get(name: String, id: Input[ID]): BucketObject = js.native
    @JSImport("@pulumi/aws/s3/bucketObject", "BucketObject.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketObject = js.native
    @JSImport("@pulumi/aws/s3/bucketObject", "BucketObject.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketObjectState): BucketObject = js.native
    @JSImport("@pulumi/aws/s3/bucketObject", "BucketObject.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketObjectState, opts: CustomResourceOptions): BucketObject = js.native
    
    /**
      * Returns true if the given object is an instance of BucketObject.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3/bucketObject", "BucketObject.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketObject.BucketObject */ Boolean = js.native
  }
  
  @js.native
  trait BucketObjectArgs extends StObject {
    
    /**
      * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, and `bucket-owner-full-control`. Defaults to `private`.
      */
    val acl: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
      */
    val bucket: Input[String | Bucket] = js.native
    
    /**
      * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
      */
    val cacheControl: js.UndefOr[Input[String]] = js.native
    
    /**
      * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
      */
    val content: js.UndefOr[Input[String]] = js.native
    
    /**
      * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
      */
    val contentBase64: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
      */
    val contentDisposition: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
      */
    val contentEncoding: js.UndefOr[Input[String]] = js.native
    
    /**
      * The language the content is in e.g. en-US or en-GB.
      */
    val contentLanguage: js.UndefOr[Input[String]] = js.native
    
    /**
      * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
      */
    val contentType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Used to trigger updates. The only meaningful value is `${filemd5("path/to/file")}` (this provider 0.11.12 or later) or `${md5(file("path/to/file"))}` (this provider 0.11.11 or earlier).
      * This attribute is not compatible with KMS encryption, `kmsKeyId` or `serverSideEncryption = "aws:kms"`.
      */
    val etag: js.UndefOr[Input[String]] = js.native
    
    /**
      * Allow the object to be deleted by removing any legal hold on any object version.
      * Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the object once it is in the bucket.
      */
    val key: js.UndefOr[Input[String]] = js.native
    
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
      */
    val metadata: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
      */
    val objectLockLegalHoldStatus: js.UndefOr[Input[String]] = js.native
    
    /**
      * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
      */
    val objectLockMode: js.UndefOr[Input[String]] = js.native
    
    /**
      * The date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object's object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
      */
    val objectLockRetainUntilDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
      */
    val serverSideEncryption: js.UndefOr[Input[String]] = js.native
    
    /**
      * The path to a file that will be read and uploaded as raw bytes for the object content.
      */
    val source: js.UndefOr[Input[Asset | Archive]] = js.native
    
    /**
      * Specifies the desired [Storage Class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html)
      * for the object. Can be either "`STANDARD`", "`REDUCED_REDUNDANCY`", "`ONEZONE_IA`", "`INTELLIGENT_TIERING`", "`GLACIER`", "`DEEP_ARCHIVE`", or "`STANDARD_IA`". Defaults to "`STANDARD`".
      */
    val storageClass: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
      */
    val websiteRedirect: js.UndefOr[Input[String]] = js.native
  }
  object BucketObjectArgs {
    
    @scala.inline
    def apply(bucket: Input[String | Bucket]): BucketObjectArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketObjectArgs]
    }
    
    @scala.inline
    implicit class BucketObjectArgsMutableBuilder[Self <: BucketObjectArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcl(value: Input[String]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
      
      @scala.inline
      def setBucket(value: Input[String | Bucket]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControl(value: Input[String]): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      @scala.inline
      def setContent(value: Input[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBase64(value: Input[String]): Self = StObject.set(x, "contentBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBase64Undefined: Self = StObject.set(x, "contentBase64", js.undefined)
      
      @scala.inline
      def setContentDisposition(value: Input[String]): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      @scala.inline
      def setContentEncoding(value: Input[String]): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      @scala.inline
      def setContentLanguage(value: Input[String]): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      @scala.inline
      def setContentType(value: Input[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEtag(value: Input[String]): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      @scala.inline
      def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setObjectLockLegalHoldStatus(value: Input[String]): Self = StObject.set(x, "objectLockLegalHoldStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "objectLockLegalHoldStatus", js.undefined)
      
      @scala.inline
      def setObjectLockMode(value: Input[String]): Self = StObject.set(x, "objectLockMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectLockModeUndefined: Self = StObject.set(x, "objectLockMode", js.undefined)
      
      @scala.inline
      def setObjectLockRetainUntilDate(value: Input[String]): Self = StObject.set(x, "objectLockRetainUntilDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "objectLockRetainUntilDate", js.undefined)
      
      @scala.inline
      def setServerSideEncryption(value: Input[String]): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      @scala.inline
      def setSource(value: Input[Asset | Archive]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStorageClass(value: Input[String]): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWebsiteRedirect(value: Input[String]): Self = StObject.set(x, "websiteRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteRedirectUndefined: Self = StObject.set(x, "websiteRedirect", js.undefined)
    }
  }
  
  @js.native
  trait BucketObjectState extends StObject {
    
    /**
      * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, and `bucket-owner-full-control`. Defaults to `private`.
      */
    val acl: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
      */
    val bucket: js.UndefOr[Input[String | Bucket]] = js.native
    
    /**
      * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
      */
    val cacheControl: js.UndefOr[Input[String]] = js.native
    
    /**
      * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
      */
    val content: js.UndefOr[Input[String]] = js.native
    
    /**
      * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
      */
    val contentBase64: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
      */
    val contentDisposition: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
      */
    val contentEncoding: js.UndefOr[Input[String]] = js.native
    
    /**
      * The language the content is in e.g. en-US or en-GB.
      */
    val contentLanguage: js.UndefOr[Input[String]] = js.native
    
    /**
      * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
      */
    val contentType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Used to trigger updates. The only meaningful value is `${filemd5("path/to/file")}` (this provider 0.11.12 or later) or `${md5(file("path/to/file"))}` (this provider 0.11.11 or earlier).
      * This attribute is not compatible with KMS encryption, `kmsKeyId` or `serverSideEncryption = "aws:kms"`.
      */
    val etag: js.UndefOr[Input[String]] = js.native
    
    /**
      * Allow the object to be deleted by removing any legal hold on any object version.
      * Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the object once it is in the bucket.
      */
    val key: js.UndefOr[Input[String]] = js.native
    
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
      */
    val metadata: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
      */
    val objectLockLegalHoldStatus: js.UndefOr[Input[String]] = js.native
    
    /**
      * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
      */
    val objectLockMode: js.UndefOr[Input[String]] = js.native
    
    /**
      * The date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object's object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
      */
    val objectLockRetainUntilDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
      */
    val serverSideEncryption: js.UndefOr[Input[String]] = js.native
    
    /**
      * The path to a file that will be read and uploaded as raw bytes for the object content.
      */
    val source: js.UndefOr[Input[Asset | Archive]] = js.native
    
    /**
      * Specifies the desired [Storage Class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html)
      * for the object. Can be either "`STANDARD`", "`REDUCED_REDUNDANCY`", "`ONEZONE_IA`", "`INTELLIGENT_TIERING`", "`GLACIER`", "`DEEP_ARCHIVE`", or "`STANDARD_IA`". Defaults to "`STANDARD`".
      */
    val storageClass: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A unique version ID value for the object, if bucket versioning
      * is enabled.
      */
    val versionId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
      */
    val websiteRedirect: js.UndefOr[Input[String]] = js.native
  }
  object BucketObjectState {
    
    @scala.inline
    def apply(): BucketObjectState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketObjectState]
    }
    
    @scala.inline
    implicit class BucketObjectStateMutableBuilder[Self <: BucketObjectState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcl(value: Input[String]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
      
      @scala.inline
      def setBucket(value: Input[String | Bucket]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setCacheControl(value: Input[String]): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      @scala.inline
      def setContent(value: Input[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBase64(value: Input[String]): Self = StObject.set(x, "contentBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBase64Undefined: Self = StObject.set(x, "contentBase64", js.undefined)
      
      @scala.inline
      def setContentDisposition(value: Input[String]): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      @scala.inline
      def setContentEncoding(value: Input[String]): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      @scala.inline
      def setContentLanguage(value: Input[String]): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      @scala.inline
      def setContentType(value: Input[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEtag(value: Input[String]): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      @scala.inline
      def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setObjectLockLegalHoldStatus(value: Input[String]): Self = StObject.set(x, "objectLockLegalHoldStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "objectLockLegalHoldStatus", js.undefined)
      
      @scala.inline
      def setObjectLockMode(value: Input[String]): Self = StObject.set(x, "objectLockMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectLockModeUndefined: Self = StObject.set(x, "objectLockMode", js.undefined)
      
      @scala.inline
      def setObjectLockRetainUntilDate(value: Input[String]): Self = StObject.set(x, "objectLockRetainUntilDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "objectLockRetainUntilDate", js.undefined)
      
      @scala.inline
      def setServerSideEncryption(value: Input[String]): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      @scala.inline
      def setSource(value: Input[Asset | Archive]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStorageClass(value: Input[String]): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersionId(value: Input[String]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
      
      @scala.inline
      def setWebsiteRedirect(value: Input[String]): Self = StObject.set(x, "websiteRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteRedirectUndefined: Self = StObject.set(x, "websiteRedirect", js.undefined)
    }
  }
}
