package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaDownload extends js.Object {
  /**
    * A boolean that determines whether a notification for the completion of a
    * download should be sent to the backend.
    */
  var completeNotification: js.UndefOr[Boolean] = js.native
  /**
    * DO NOT USE FIELDS BELOW THIS LINE UNTIL THIS WARNING IS REMOVED.
    *
    * Specify name of the download service if one is used for download.
    */
  var downloadService: js.UndefOr[String] = js.native
  /** Name of the Scotty dropzone to use for the current API. */
  var dropzone: js.UndefOr[String] = js.native
  /** Whether download is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional maximum acceptable size for direct download.
    * The size is specified in bytes.
    */
  var maxDirectDownloadSize: js.UndefOr[String] = js.native
  /**
    * A boolean that determines if direct download from ESF should be used for
    * download of this media.
    */
  var useDirectDownload: js.UndefOr[Boolean] = js.native
}

object MediaDownload {
  @scala.inline
  def apply(): MediaDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaDownload]
  }
  @scala.inline
  implicit class MediaDownloadOps[Self <: MediaDownload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleteNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadService")(js.undefined)
        ret
    }
    @scala.inline
    def withDropzone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropzone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropzone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropzone")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDirectDownloadSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDirectDownloadSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDirectDownloadSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDirectDownloadSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDirectDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDirectDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDirectDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDirectDownload")(js.undefined)
        ret
    }
  }
  
}

