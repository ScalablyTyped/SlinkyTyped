package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCredentialReportResponse extends js.Object {
  /**
    * Contains the credential report. The report is Base64-encoded.
    */
  var Content: js.UndefOr[ReportContentType] = js.native
  /**
    *  The date and time when the credential report was created, in ISO 8601 date-time format.
    */
  var GeneratedTime: js.UndefOr[js.Date] = js.native
  /**
    * The format (MIME type) of the credential report.
    */
  var ReportFormat: js.UndefOr[ReportFormatType] = js.native
}

object GetCredentialReportResponse {
  @scala.inline
  def apply(): GetCredentialReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCredentialReportResponse]
  }
  @scala.inline
  implicit class GetCredentialReportResponseOps[Self <: GetCredentialReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: ReportContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneratedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeneratedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeneratedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withReportFormat(value: ReportFormatType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportFormat")(js.undefined)
        ret
    }
  }
  
}

