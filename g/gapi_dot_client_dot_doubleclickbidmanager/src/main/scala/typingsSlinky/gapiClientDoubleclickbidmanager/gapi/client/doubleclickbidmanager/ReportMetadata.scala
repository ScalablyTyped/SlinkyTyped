package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportMetadata extends js.Object {
  /** The path to the location in Google Cloud Storage where the report is stored. */
  var googleCloudStoragePath: js.UndefOr[String] = js.native
  /** The ending time for the data that is shown in the report. */
  var reportDataEndTimeMs: js.UndefOr[String] = js.native
  /** The starting time for the data that is shown in the report. */
  var reportDataStartTimeMs: js.UndefOr[String] = js.native
  /** Report status. */
  var status: js.UndefOr[ReportStatus] = js.native
}

object ReportMetadata {
  @scala.inline
  def apply(): ReportMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportMetadata]
  }
  @scala.inline
  implicit class ReportMetadataOps[Self <: ReportMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoogleCloudStoragePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCloudStoragePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleCloudStoragePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCloudStoragePath")(js.undefined)
        ret
    }
    @scala.inline
    def withReportDataEndTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDataEndTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDataEndTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDataEndTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withReportDataStartTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDataStartTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDataStartTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDataStartTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ReportStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

