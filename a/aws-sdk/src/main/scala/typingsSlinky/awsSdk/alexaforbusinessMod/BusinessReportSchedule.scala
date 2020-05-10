package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessReportSchedule extends js.Object {
  /**
    * The content range of the reports.
    */
  var ContentRange: js.UndefOr[BusinessReportContentRange] = js.native
  /**
    * The format of the generated report (individual CSV files or zipped files of individual files).
    */
  var Format: js.UndefOr[BusinessReportFormat] = js.native
  /**
    * The details of the last business report delivery for a specified time interval.
    */
  var LastBusinessReport: js.UndefOr[BusinessReport] = js.native
  /**
    * The recurrence of the reports.
    */
  var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.native
  /**
    * The S3 bucket name of the output reports.
    */
  var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.native
  /**
    * The S3 key where the report is delivered.
    */
  var S3KeyPrefix: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.S3KeyPrefix] = js.native
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: js.UndefOr[Arn] = js.native
  /**
    * The name identifier of the schedule.
    */
  var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.native
}

object BusinessReportSchedule {
  @scala.inline
  def apply(): BusinessReportSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReportSchedule]
  }
  @scala.inline
  implicit class BusinessReportScheduleOps[Self <: BusinessReportSchedule] (val x: Self) extends AnyVal {
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
    def withoutContentRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentRange")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: BusinessReportFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
    @scala.inline
    def withLastBusinessReport(value: BusinessReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastBusinessReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastBusinessReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastBusinessReport")(js.undefined)
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
    def withScheduleArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleArn")(js.undefined)
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

