package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportInfo extends js.Object {
  /**
    * A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the export succeeded.
    */
  var configurationsDownloadUrl: js.UndefOr[ConfigurationsDownloadUrl] = js.native
  /**
    * A unique identifier used to query an export.
    */
  var exportId: ConfigurationsExportId = js.native
  /**
    * The time that the data export was initiated.
    */
  var exportRequestTime: js.Date = js.native
  /**
    * The status of the data export job.
    */
  var exportStatus: ExportStatus = js.native
  /**
    * If true, the export of agent information exceeded the size limit for a single export and the exported data is incomplete for the requested time range. To address this, select a smaller time range for the export by using startDate and endDate.
    */
  var isTruncated: js.UndefOr[Boolean] = js.native
  /**
    * The endTime used in the StartExportTask request. If no endTime was requested, this result does not appear in ExportInfo.
    */
  var requestedEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The value of startTime parameter in the StartExportTask request. If no startTime was requested, this result does not appear in ExportInfo.
    */
  var requestedStartTime: js.UndefOr[js.Date] = js.native
  /**
    * A status message provided for API callers.
    */
  var statusMessage: ExportStatusMessage = js.native
}

object ExportInfo {
  @scala.inline
  def apply(
    exportId: ConfigurationsExportId,
    exportRequestTime: js.Date,
    exportStatus: ExportStatus,
    statusMessage: ExportStatusMessage
  ): ExportInfo = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any], exportRequestTime = exportRequestTime.asInstanceOf[js.Any], exportStatus = exportStatus.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportInfo]
  }
  @scala.inline
  implicit class ExportInfoOps[Self <: ExportInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportId(value: ConfigurationsExportId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportRequestTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportRequestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportStatus(value: ExportStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: ExportStatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationsDownloadUrl(value: ConfigurationsDownloadUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationsDownloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationsDownloadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationsDownloadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTruncated")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedStartTime")(js.undefined)
        ret
    }
  }
  
}

