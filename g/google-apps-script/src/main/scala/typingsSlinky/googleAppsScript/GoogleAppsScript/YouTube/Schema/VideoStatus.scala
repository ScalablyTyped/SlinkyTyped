package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoStatus extends js.Object {
  var embeddable: js.UndefOr[Boolean] = js.native
  var failureReason: js.UndefOr[String] = js.native
  var license: js.UndefOr[String] = js.native
  var privacyStatus: js.UndefOr[String] = js.native
  var publicStatsViewable: js.UndefOr[Boolean] = js.native
  var publishAt: js.UndefOr[String] = js.native
  var rejectionReason: js.UndefOr[String] = js.native
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

