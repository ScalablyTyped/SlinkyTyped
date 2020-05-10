package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadDBLogFilePortionDetails extends js.Object {
  /**
    * Boolean value that if true, indicates there is more data to be downloaded.
    */
  var AdditionalDataPending: js.UndefOr[Boolean] = js.native
  /**
    * Entries from the specified log file.
    */
  var LogFileData: js.UndefOr[String] = js.native
  /**
    * A pagination token that can be used in a later DownloadDBLogFilePortion request.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DownloadDBLogFilePortionDetails {
  @scala.inline
  def apply(): DownloadDBLogFilePortionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadDBLogFilePortionDetails]
  }
  @scala.inline
  implicit class DownloadDBLogFilePortionDetailsOps[Self <: DownloadDBLogFilePortionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalDataPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalDataPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalDataPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalDataPending")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFileData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFileData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFileData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFileData")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

