package typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGoogleCloudStoragePath(value: String): Self = this.set("googleCloudStoragePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleCloudStoragePath: Self = this.set("googleCloudStoragePath", js.undefined)
    
    @scala.inline
    def setReportDataEndTimeMs(value: String): Self = this.set("reportDataEndTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportDataEndTimeMs: Self = this.set("reportDataEndTimeMs", js.undefined)
    
    @scala.inline
    def setReportDataStartTimeMs(value: String): Self = this.set("reportDataStartTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportDataStartTimeMs: Self = this.set("reportDataStartTimeMs", js.undefined)
    
    @scala.inline
    def setStatus(value: ReportStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
