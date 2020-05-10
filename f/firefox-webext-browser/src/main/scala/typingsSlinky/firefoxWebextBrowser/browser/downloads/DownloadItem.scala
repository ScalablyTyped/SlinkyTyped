package typingsSlinky.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadItem extends js.Object {
  var byExtensionId: js.UndefOr[String] = js.native
  var byExtensionName: js.UndefOr[String] = js.native
  /** Number of bytes received so far from the host, without considering file compression. */
  var bytesReceived: Double = js.native
  var canResume: Boolean = js.native
  /** Indication of whether this download is thought to be safe or known to be suspicious. */
  var danger: DangerType = js.native
  /** Number of milliseconds between the unix epoch and when this download ended. */
  var endTime: js.UndefOr[String] = js.native
  /** Number indicating why a download was interrupted. */
  var error: js.UndefOr[InterruptReason] = js.native
  var estimatedEndTime: js.UndefOr[String] = js.native
  var exists: Boolean = js.native
  /** Number of bytes in the whole file post-decompression, or -1 if unknown. */
  var fileSize: Double = js.native
  /** Absolute local path. */
  var filename: String = js.native
  /** An identifier that is persistent across browser sessions. */
  var id: Double = js.native
  /** False if this download is recorded in the history, true if it is not recorded. */
  var incognito: Boolean = js.native
  /** The file's MIME type. */
  var mime: js.UndefOr[String] = js.native
  /** True if the download has stopped reading data from the host, but kept the connection open. */
  var paused: Boolean = js.native
  var referrer: js.UndefOr[String] = js.native
  /** Number of milliseconds between the unix epoch and when this download began. */
  var startTime: String = js.native
  /** Indicates whether the download is progressing, interrupted, or complete. */
  var state: State = js.native
  /** Number of bytes in the whole file, without considering file compression, or -1 if unknown. */
  var totalBytes: Double = js.native
  /** Absolute URL. */
  var url: String = js.native
}

object DownloadItem {
  @scala.inline
  def apply(
    bytesReceived: Double,
    canResume: Boolean,
    danger: DangerType,
    exists: Boolean,
    fileSize: Double,
    filename: String,
    id: Double,
    incognito: Boolean,
    paused: Boolean,
    startTime: String,
    state: State,
    totalBytes: Double,
    url: String
  ): DownloadItem = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], canResume = canResume.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadItem]
  }
  @scala.inline
  implicit class DownloadItemOps[Self <: DownloadItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanResume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDanger(value: DangerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("danger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncognito(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByExtensionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byExtensionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByExtensionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byExtensionId")(js.undefined)
        ret
    }
    @scala.inline
    def withByExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byExtensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByExtensionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byExtensionName")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
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
    def withError(value: InterruptReason): Self = {
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
    def withEstimatedEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMime(value: String): Self = {
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
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
  }
  
}

