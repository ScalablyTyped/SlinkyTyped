package typingsSlinky.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadQuery extends js.Object {
  /** Optional. Number of bytes received so far from the host, without considering file compression.  */
  var bytesReceived: js.UndefOr[Double] = js.native
  /** Optional. Indication of whether this download is thought to be safe or known to be suspicious.  */
  var danger: js.UndefOr[String] = js.native
  /** Optional. The time when the download ended in ISO 8601 format.  */
  var endTime: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem that ended after the time in ISO 8601 format.  */
  var endedAfter: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem that ended before the time in ISO 8601 format.  */
  var endedBefore: js.UndefOr[String] = js.native
  /** Optional. Why a download was interrupted.  */
  var error: js.UndefOr[Double] = js.native
  /** Optional. Whether the downloaded file exists;  */
  var exists: js.UndefOr[Boolean] = js.native
  /** Optional. Number of bytes in the whole file post-decompression, or -1 if unknown.  */
  var fileSize: js.UndefOr[Double] = js.native
  /** Optional. Absolute local path.  */
  var filename: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem whose filename matches the given regular expression.  */
  var filenameRegex: js.UndefOr[String] = js.native
  /** Optional. The id of the DownloadItem to query.  */
  var id: js.UndefOr[Double] = js.native
  /** Optional. The maximum number of matching DownloadItem returned. Defaults to 1000. Set to 0 in order to return all matching DownloadItem. See search for how to page through results.  */
  var limit: js.UndefOr[Double] = js.native
  /** Optional. The file's MIME type.  */
  var mime: js.UndefOr[String] = js.native
  /** Optional. Set elements of this array to DownloadItem properties in order to sort search results. For example, setting orderBy=['startTime'] sorts the DownloadItem by their start time in ascending order. To specify descending order, prefix with a hyphen: '-startTime'.  */
  var orderBy: js.UndefOr[js.Array[String]] = js.native
  /** Optional. True if the download has stopped reading data from the host, but kept the connection open.  */
  var paused: js.UndefOr[Boolean] = js.native
  /** Optional. This array of search terms limits results to DownloadItem whose filename or url contain all of the search terms that do not begin with a dash '-' and none of the search terms that do begin with a dash.  */
  var query: js.UndefOr[js.Array[String]] = js.native
  /** Optional. The time when the download began in ISO 8601 format.  */
  var startTime: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem that started after the time in ISO 8601 format.  */
  var startedAfter: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem that started before the time in ISO 8601 format.  */
  var startedBefore: js.UndefOr[String] = js.native
  /** Optional. Indicates whether the download is progressing, interrupted, or complete.  */
  var state: js.UndefOr[String] = js.native
  /** Optional. Number of bytes in the whole file, without considering file compression, or -1 if unknown.  */
  var totalBytes: js.UndefOr[Double] = js.native
  /** Optional. Limits results to DownloadItem whose totalBytes is greater than the given integer.  */
  var totalBytesGreater: js.UndefOr[Double] = js.native
  /** Optional. Limits results to DownloadItem whose totalBytes is less than the given integer.  */
  var totalBytesLess: js.UndefOr[Double] = js.native
  /** Optional. Absolute URL.  */
  var url: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem whose url matches the given regular expression.  */
  var urlRegex: js.UndefOr[String] = js.native
}

object DownloadQuery {
  @scala.inline
  def apply(): DownloadQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadQuery]
  }
  @scala.inline
  implicit class DownloadQueryOps[Self <: DownloadQuery] (val x: Self) extends AnyVal {
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
    def withoutBytesReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withDanger(value: String): Self = {
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
    def withEndedAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endedAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndedAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endedAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withEndedBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endedBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndedBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endedBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: Double): Self = {
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
    def withExists(value: Boolean): Self = {
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
    def withFileSize(value: Double): Self = {
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
    def withFilename(value: String): Self = {
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
    def withFilenameRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilenameRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
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
    def withOrderBy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
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
    def withQuery(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
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
    def withStartedAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
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
    def withTotalBytes(value: Double): Self = {
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
    def withTotalBytesGreater(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesGreater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesGreater: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesGreater")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytesLess(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesLess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesLess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesLess")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
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
    @scala.inline
    def withUrlRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRegex")(js.undefined)
        ret
    }
  }
  
}

