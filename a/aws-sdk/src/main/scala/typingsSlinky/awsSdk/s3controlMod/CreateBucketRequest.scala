package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBucketRequest extends js.Object {
  
  /**
    * The canned ACL to apply to the bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var ACL: js.UndefOr[BucketCannedACL] = js.native
  
  /**
    * The name of the bucket.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The configuration information for the bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var CreateBucketConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.CreateBucketConfiguration] = js.native
  
  /**
    * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var GrantFullControl: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.GrantFullControl] = js.native
  
  /**
    * Allows grantee to list the objects in the bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var GrantRead: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.GrantRead] = js.native
  
  /**
    * Allows grantee to read the bucket ACL.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var GrantReadACP: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.GrantReadACP] = js.native
  
  /**
    * Allows grantee to create, overwrite, and delete any object in the bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var GrantWrite: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.GrantWrite] = js.native
  
  /**
    * Allows grantee to write the ACL for the applicable bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var GrantWriteACP: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.GrantWriteACP] = js.native
  
  /**
    * Specifies whether you want S3 Object Lock to be enabled for the new bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var ObjectLockEnabledForBucket: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.ObjectLockEnabledForBucket] = js.native
  
  /**
    * The ID of the Outposts where the bucket is being created.  This is required by Amazon S3 on Outposts buckets. 
    */
  var OutpostId: js.UndefOr[NonEmptyMaxLength64String] = js.native
}
object CreateBucketRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): CreateBucketRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketRequest]
  }
  
  @scala.inline
  implicit class CreateBucketRequestOps[Self <: CreateBucketRequest] (val x: Self) extends AnyVal {
    
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
    def setACL(value: BucketCannedACL): Self = this.set("ACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteACL: Self = this.set("ACL", js.undefined)
    
    @scala.inline
    def setCreateBucketConfiguration(value: CreateBucketConfiguration): Self = this.set("CreateBucketConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateBucketConfiguration: Self = this.set("CreateBucketConfiguration", js.undefined)
    
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
    def setGrantWrite(value: GrantWrite): Self = this.set("GrantWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantWrite: Self = this.set("GrantWrite", js.undefined)
    
    @scala.inline
    def setGrantWriteACP(value: GrantWriteACP): Self = this.set("GrantWriteACP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantWriteACP: Self = this.set("GrantWriteACP", js.undefined)
    
    @scala.inline
    def setObjectLockEnabledForBucket(value: ObjectLockEnabledForBucket): Self = this.set("ObjectLockEnabledForBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectLockEnabledForBucket: Self = this.set("ObjectLockEnabledForBucket", js.undefined)
    
    @scala.inline
    def setOutpostId(value: NonEmptyMaxLength64String): Self = this.set("OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostId: Self = this.set("OutpostId", js.undefined)
  }
}
