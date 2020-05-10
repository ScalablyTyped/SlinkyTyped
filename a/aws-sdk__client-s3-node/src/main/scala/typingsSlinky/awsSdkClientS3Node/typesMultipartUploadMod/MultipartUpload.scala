package typingsSlinky.awsSdkClientS3Node.typesMultipartUploadMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typingsSlinky.awsSdkClientS3Node.typesInitiatorMod.Initiator
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.Owner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartUpload extends js.Object {
  /**
    * <p>Date and time at which the multipart upload was initiated.</p>
    */
  var Initiated: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>Identifies who initiated the multipart upload.</p>
    */
  var Initiator: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesInitiatorMod.Initiator] = js.native
  /**
    * <p>Key of the object for which the multipart upload was initiated.</p>
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesOwnerMod.Owner] = js.native
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
  /**
    * <p>Upload ID that identifies the multipart upload.</p>
    */
  var UploadId: js.UndefOr[String] = js.native
}

object MultipartUpload {
  @scala.inline
  def apply(): MultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartUpload]
  }
  @scala.inline
  implicit class MultipartUploadOps[Self <: MultipartUpload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitiatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitiated(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiated")(js.undefined)
        ret
    }
    @scala.inline
    def withInitiator(value: Initiator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiator")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: Owner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = {
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
    def withUploadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadId")(js.undefined)
        ret
    }
  }
  
}

