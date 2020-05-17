package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.downloads.BooleanDelta
import typingsSlinky.firefoxWebextBrowser.browser.downloads.DoubleDelta
import typingsSlinky.firefoxWebextBrowser.browser.downloads.StringDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanResume extends js.Object {
  var canResume: js.UndefOr[BooleanDelta] = js.native
  /** Describes a change in a DownloadItem's `danger`. */
  var danger: js.UndefOr[StringDelta] = js.native
  /** Describes a change in a DownloadItem's `endTime`. */
  var endTime: js.UndefOr[StringDelta] = js.native
  /** Describes a change in a DownloadItem's `error`. */
  var error: js.UndefOr[StringDelta] = js.native
  var exists: js.UndefOr[BooleanDelta] = js.native
  /** Describes a change in a DownloadItem's `fileSize`. */
  var fileSize: js.UndefOr[DoubleDelta] = js.native
  /** Describes a change in a DownloadItem's `filename`. */
  var filename: js.UndefOr[StringDelta] = js.native
  /** The `id` of the DownloadItem that changed. */
  var id: Double = js.native
  /** Describes a change in a DownloadItem's `mime`. */
  var mime: js.UndefOr[StringDelta] = js.native
  /** Describes a change in a DownloadItem's `paused`. */
  var paused: js.UndefOr[BooleanDelta] = js.native
  /** Describes a change in a DownloadItem's `startTime`. */
  var startTime: js.UndefOr[StringDelta] = js.native
  /** Describes a change in a DownloadItem's `state`. */
  var state: js.UndefOr[StringDelta] = js.native
  /** Describes a change in a DownloadItem's `totalBytes`. */
  var totalBytes: js.UndefOr[DoubleDelta] = js.native
  /** Describes a change in a DownloadItem's `url`. */
  var url: js.UndefOr[StringDelta] = js.native
}

object CanResume {
  @scala.inline
  def apply(id: Double): CanResume = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanResume]
  }
  @scala.inline
  implicit class CanResumeOps[Self <: CanResume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanResume(value: BooleanDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResume")(js.undefined)
        ret
    }
    @scala.inline
    def withDanger(value: StringDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("danger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDanger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("danger")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: StringDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: StringDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExists(value: BooleanDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSize(value: DoubleDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: StringDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withMime(value: StringDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(js.undefined)
        ret
    }
    @scala.inline
    def withPaused(value: BooleanDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: StringDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: StringDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytes(value: DoubleDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: StringDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

