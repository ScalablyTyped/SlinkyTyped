package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoStatus extends js.Object {
  /** This value indicates if the video can be embedded on another website. */
  var embeddable: js.UndefOr[Boolean] = js.native
  /** This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed. */
  var failureReason: js.UndefOr[String] = js.native
  /** The video's license. */
  var license: js.UndefOr[String] = js.native
  /** The video's privacy status. */
  var privacyStatus: js.UndefOr[String] = js.native
  /**
    * This value indicates if the extended video statistics on the watch page can be viewed by everyone. Note that the view count, likes, etc will still be
    * visible if this is disabled.
    */
  var publicStatsViewable: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the video is scheduled to publish. It can be set only if the privacy status of the video is private. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishAt: js.UndefOr[String] = js.native
  /**
    * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was
    * rejected.
    */
  var rejectionReason: js.UndefOr[String] = js.native
  /** The status of the uploaded video. */
  var uploadStatus: js.UndefOr[String] = js.native
}

object VideoStatus {
  @scala.inline
  def apply(): VideoStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoStatus]
  }
  @scala.inline
  implicit class VideoStatusOps[Self <: VideoStatus] (val x: Self) extends AnyVal {
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
    def withoutEmbeddable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddable")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicStatsViewable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicStatsViewable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicStatsViewable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicStatsViewable")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishAt")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectionReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionReason")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadStatus")(js.undefined)
        ret
    }
  }
  
}

