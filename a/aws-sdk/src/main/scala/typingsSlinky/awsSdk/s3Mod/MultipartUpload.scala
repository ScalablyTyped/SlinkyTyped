package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartUpload extends js.Object {
  /**
    * Date and time at which the multipart upload was initiated.
    */
  var Initiated: js.UndefOr[js.Date] = js.native
  /**
    * Identifies who initiated the multipart upload.
    */
  var Initiator: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Initiator] = js.native
  /**
    * Key of the object for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * Specifies the owner of the object that is part of the multipart upload. 
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Owner] = js.native
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[typingsSlinky.awsSdk.s3Mod.StorageClass] = js.native
  /**
    * Upload ID that identifies the multipart upload.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.native
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
    def withInitiated(value: js.Date): Self = {
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
    def withKey(value: ObjectKey): Self = {
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
    def withUploadId(value: MultipartUploadId): Self = {
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

