package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketAclRequest extends js.Object {
  /**
    * The canned ACL to apply to the bucket.
    */
  var ACL: js.UndefOr[BucketCannedACL] = js.native
  /**
    * Contains the elements that set the ACL permissions for an object per grantee.
    */
  var AccessControlPolicy: js.UndefOr[typingsSlinky.awsSdk.s3Mod.AccessControlPolicy] = js.native
  /**
    * The bucket to which to apply the ACL.
    */
  var Bucket: BucketName = js.native
  /**
    * The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message integrity check to verify that the request body was not corrupted in transit. For more information, go to RFC 1864. 
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
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
}

object PutBucketAclRequest {
  @scala.inline
  def apply(Bucket: BucketName): PutBucketAclRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAclRequest]
  }
  @scala.inline
  implicit class PutBucketAclRequestOps[Self <: PutBucketAclRequest] (val x: Self) extends AnyVal {
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
    def withAccessControlPolicy(value: AccessControlPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControlPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withContentMD5(value: ContentMD5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(js.undefined)
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
  }
  
}

