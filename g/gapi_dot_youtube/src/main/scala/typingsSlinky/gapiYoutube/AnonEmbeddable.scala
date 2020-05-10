package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmbeddable extends js.Object {
  /**
    * This value indicates whether the video can be embedded on another website.
    */
  var embeddable: Boolean = js.native
  /**
    * This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.
    */
  var failureReason: String = js.native
  /**
    * The videos license.
    */
  var license: String = js.native
  /**
    * The videos privacy status.
    */
  var privacyStatus: String = js.native
  /**
    * This value indicates whether the extended video statistics on the videos watch page are publicly viewable. By default, those statistics are viewable, and statistics like a videos viewcount and ratings will still be publicly visible even if this propertys value is set to false.
    */
  var publicStatsViewable: Boolean = js.native
  /**
    * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.
    */
  var rejectionReason: String = js.native
  /**
    * The status of the uploaded video.
    */
  var uploadStatus: String = js.native
}

object AnonEmbeddable {
  @scala.inline
  def apply(
    embeddable: Boolean,
    failureReason: String,
    license: String,
    privacyStatus: String,
    publicStatsViewable: Boolean,
    rejectionReason: String,
    uploadStatus: String
  ): AnonEmbeddable = {
    val __obj = js.Dynamic.literal(embeddable = embeddable.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], privacyStatus = privacyStatus.asInstanceOf[js.Any], publicStatsViewable = publicStatsViewable.asInstanceOf[js.Any], rejectionReason = rejectionReason.asInstanceOf[js.Any], uploadStatus = uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmbeddable]
  }
  @scala.inline
  implicit class AnonEmbeddableOps[Self <: AnonEmbeddable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbeddable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivacyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicStatsViewable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicStatsViewable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectionReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

