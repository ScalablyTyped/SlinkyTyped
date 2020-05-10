package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * A list of grants that control access to the staged results.
    */
  var AccessControlList: js.UndefOr[Grants] = js.native
  /**
    * The name of the bucket where the restore results will be placed.
    */
  var BucketName: typingsSlinky.awsSdk.s3Mod.BucketName = js.native
  /**
    * The canned ACL to apply to the restore results.
    */
  var CannedACL: js.UndefOr[ObjectCannedACL] = js.native
  var Encryption: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Encryption] = js.native
  /**
    * The prefix that is prepended to the restore results for this request.
    */
  var Prefix: LocationPrefix = js.native
  /**
    * The class of storage used to store the restore results.
    */
  var StorageClass: js.UndefOr[typingsSlinky.awsSdk.s3Mod.StorageClass] = js.native
  /**
    * The tag-set that is applied to the restore results.
    */
  var Tagging: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Tagging] = js.native
  /**
    * A list of metadata to store with the restore results in S3.
    */
  var UserMetadata: js.UndefOr[typingsSlinky.awsSdk.s3Mod.UserMetadata] = js.native
}

object S3Location {
  @scala.inline
  def apply(BucketName: BucketName, Prefix: LocationPrefix): S3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  @scala.inline
  implicit class S3LocationOps[Self <: S3Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: LocationPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessControlList(value: Grants): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControlList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(js.undefined)
        ret
    }
    @scala.inline
    def withCannedACL(value: ObjectCannedACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CannedACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCannedACL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CannedACL")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: Encryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
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
    def withTagging(value: Tagging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagging")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMetadata(value: UserMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(js.undefined)
        ret
    }
  }
  
}

