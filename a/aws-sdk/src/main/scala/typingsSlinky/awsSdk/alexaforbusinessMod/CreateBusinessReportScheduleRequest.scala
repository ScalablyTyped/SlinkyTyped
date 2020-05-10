package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBusinessReportScheduleRequest extends js.Object {
  /**
    * The client request token.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The content range of the reports.
    */
  var ContentRange: BusinessReportContentRange = js.native
  /**
    * The format of the generated report (individual CSV files or zipped files of individual files).
    */
  var Format: BusinessReportFormat = js.native
  /**
    * The recurrence of the reports. If this isn't specified, the report will only be delivered one time when the API is called. 
    */
  var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.native
  /**
    * The S3 bucket name of the output reports. If this isn't specified, the report can be retrieved from a download link by calling ListBusinessReportSchedule. 
    */
  var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.native
  /**
    * The S3 key where the report is delivered.
    */
  var S3KeyPrefix: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.S3KeyPrefix] = js.native
  /**
    * The name identifier of the schedule.
    */
  var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.native
}

object CreateBusinessReportScheduleRequest {
  @scala.inline
  def apply(ContentRange: BusinessReportContentRange, Format: BusinessReportFormat): CreateBusinessReportScheduleRequest = {
    val __obj = js.Dynamic.literal(ContentRange = ContentRange.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBusinessReportScheduleRequest]
  }
  @scala.inline
  implicit class CreateBusinessReportScheduleRequestOps[Self <: CreateBusinessReportScheduleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentRange(value: BusinessReportContentRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: BusinessReportFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrence(value: BusinessReportRecurrence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recurrence")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketName(value: CustomerS3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withS3KeyPrefix(value: S3KeyPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleName(value: BusinessReportScheduleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleName")(js.undefined)
        ret
    }
  }
  
}

