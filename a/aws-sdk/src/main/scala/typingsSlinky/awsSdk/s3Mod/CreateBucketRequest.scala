package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBucketRequest extends js.Object {
  /**
    * The canned ACL to apply to the bucket.
    */
  var ACL: js.UndefOr[BucketCannedACL] = js.native
  /**
    * The name of the bucket to create.
    */
  var Bucket: BucketName = js.native
  /**
    * The configuration information for the bucket.
    */
  var CreateBucketConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CreateBucketConfiguration] = js.native
  /**
    * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
    */
  var GrantFullControl: js.UndefOr[typingsSlinky.awsSdk.s3Mod.GrantFullControl] = js.native
  /**
    * Allows grantee to list the objects in the bucket.
    */
  var GrantRead: js.UndefOr[typingsSlinky.awsSdk.s3Mod.GrantRead] = js.native
  /**
    * Allows grantee to read the bucket ACL.
    */
  var GrantReadACP: js.UndefOr[typingsSlinky.awsSdk.s3Mod.GrantReadACP] = js.native
  /**
    * Allows grantee to create, overwrite, and delete any object in the bucket.
    */
  var GrantWrite: js.UndefOr[typingsSlinky.awsSdk.s3Mod.GrantWrite] = js.native
  /**
    * Allows grantee to write the ACL for the applicable bucket.
    */
  var GrantWriteACP: js.UndefOr[typingsSlinky.awsSdk.s3Mod.GrantWriteACP] = js.native
  /**
    * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
    */
  var ObjectLockEnabledForBucket: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ObjectLockEnabledForBucket] = js.native
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
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withACL(value: BucketCannedACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutACL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACL")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateBucketConfiguration(value: CreateBucketConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateBucketConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateBucketConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateBucketConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantFullControl(value: GrantFullControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantFullControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantFullControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantFullControl")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantRead(value: GrantRead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantRead")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantReadACP(value: GrantReadACP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantReadACP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantReadACP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantReadACP")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantWrite(value: GrantWrite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantWriteACP(value: GrantWriteACP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantWriteACP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantWriteACP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantWriteACP")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectLockEnabledForBucket(value: ObjectLockEnabledForBucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockEnabledForBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLockEnabledForBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockEnabledForBucket")(js.undefined)
        ret
    }
  }
  
}

