package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * A list of grants that control access to the staged results.
    */
  var AccessControlList: js.UndefOr[AccessControlPolicyList] = js.native
  /**
    * The name of the Amazon S3 bucket where the job results are stored.
    */
  var BucketName: js.UndefOr[String] = js.native
  /**
    * The canned access control list (ACL) to apply to the job results.
    */
  var CannedACL: js.UndefOr[typingsSlinky.awsSdk.glacierMod.CannedACL] = js.native
  /**
    * Contains information about the encryption used to store the job results in Amazon S3.
    */
  var Encryption: js.UndefOr[typingsSlinky.awsSdk.glacierMod.Encryption] = js.native
  /**
    * The prefix that is prepended to the results for this request.
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * The storage class used to store the job results.
    */
  var StorageClass: js.UndefOr[typingsSlinky.awsSdk.glacierMod.StorageClass] = js.native
  /**
    * The tag-set that is applied to the job results.
    */
  var Tagging: js.UndefOr[hashmap] = js.native
  /**
    * A map of metadata to store with the job results in Amazon S3.
    */
  var UserMetadata: js.UndefOr[hashmap] = js.native
}

object S3Location {
  @scala.inline
  def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  @scala.inline
  implicit class S3LocationOps[Self <: S3Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlList(value: AccessControlPolicyList): Self = {
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
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withCannedACL(value: CannedACL): Self = {
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
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
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
    def withTagging(value: hashmap): Self = {
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
    def withUserMetadata(value: hashmap): Self = {
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

