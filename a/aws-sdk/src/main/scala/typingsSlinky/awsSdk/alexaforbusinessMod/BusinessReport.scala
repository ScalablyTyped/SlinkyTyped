package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessReport extends js.Object {
  /**
    * The time of report delivery.
    */
  var DeliveryTime: js.UndefOr[js.Date] = js.native
  /**
    * The download link where a user can download the report.
    */
  var DownloadUrl: js.UndefOr[BusinessReportDownloadUrl] = js.native
  /**
    * The failure code.
    */
  var FailureCode: js.UndefOr[BusinessReportFailureCode] = js.native
  /**
    * The S3 location of the output reports.
    */
  var S3Location: js.UndefOr[BusinessReportS3Location] = js.native
  /**
    * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
    */
  var Status: js.UndefOr[BusinessReportStatus] = js.native
}

object BusinessReport {
  @scala.inline
  def apply(): BusinessReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReport]
  }
  @scala.inline
  implicit class BusinessReportOps[Self <: BusinessReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadUrl(value: BusinessReportDownloadUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCode(value: BusinessReportFailureCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Location(value: BusinessReportS3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Location")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: BusinessReportStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

