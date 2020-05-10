package typingsSlinky.awsSdk.managedUploadMod.ManagedUpload

import typingsSlinky.awsSdk.s3Mod.PutObjectRequest
import typingsSlinky.awsSdk.s3Mod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedUploadOptions extends js.Object {
  /**
    * Default: false
    * Whether to abort the multipart upload if an error occurs. Set to true if you want to handle failures manually.
    */
  var leavePartsOnError: js.UndefOr[Boolean] = js.native
  /**
    * A map of parameters to pass to the upload requests.
    * The "Body" parameter is required to be specified either on the service or in the params option.
    */
  var params: js.UndefOr[PutObjectRequest] = js.native
  /**
    * Default: 5 mb
    * The size in bytes for each individual part to be uploaded. Adjust the part size to ensure the number of parts does not exceed maxTotalParts. See minPartSize for the minimum allowed part size.
    */
  var partSize: js.UndefOr[Double] = js.native
  /**
    * The size of the concurrent queue manager to upload parts in parallel. Set to 1 for synchronous uploading of parts. Note that the uploader will buffer at most queueSize * partSize bytes into memory at any given time.
    * default: 4
    */
  var queueSize: js.UndefOr[Double] = js.native
  /**
    * An optional S3 service object to use for requests.
    * This object might have bound parameters used by the uploader.
    */
  var service: js.UndefOr[typingsSlinky.awsSdk.s3Mod.^] = js.native
  /**
    * The tags to apply to the object.
    */
  var tags: js.UndefOr[js.Array[Tag]] = js.native
}

object ManagedUploadOptions {
  @scala.inline
  def apply(): ManagedUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedUploadOptions]
  }
  @scala.inline
  implicit class ManagedUploadOptionsOps[Self <: ManagedUploadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeavePartsOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavePartsOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeavePartsOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavePartsOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: PutObjectRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPartSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partSize")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueSize")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: typingsSlinky.awsSdk.s3Mod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

