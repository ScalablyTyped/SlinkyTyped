package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
  /**
    *  The ARN of the report run. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The date and time this report run occurred. 
    */
  var created: js.UndefOr[js.Date] = js.native
  /**
    *  The ARN of the build run that generated this report. 
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    *  The date and time a report expires. A report expires 30 days after it is created. An expired report is not available to view in CodeBuild. 
    */
  var expired: js.UndefOr[js.Date] = js.native
  /**
    *  Information about where the raw data used to generate this report was exported. 
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.native
  /**
    *  The name of the report that was run. 
    */
  var name: js.UndefOr[String] = js.native
  /**
    *  The ARN of the report group associated with this report. 
    */
  var reportGroupArn: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The status of this report. 
    */
  var status: js.UndefOr[ReportStatusType] = js.native
  /**
    *  A TestReportSummary object that contains information about this test report. 
    */
  var testSummary: js.UndefOr[TestReportSummary] = js.native
  /**
    *  A boolean that specifies if this report run is truncated. The list of test cases is truncated after the maximum number of test cases is reached. 
    */
  var truncated: js.UndefOr[WrapperBoolean] = js.native
  /**
    *  The type of the report that was run. 
    */
  var `type`: js.UndefOr[ReportType] = js.native
}

object Report {
  @scala.inline
  def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  @scala.inline
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionId")(js.undefined)
        ret
    }
    @scala.inline
    def withExpired(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(js.undefined)
        ret
    }
    @scala.inline
    def withExportConfig(value: ReportExportConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withReportGroupArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ReportStatusType): Self = {
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
    @scala.inline
    def withTestSummary(value: TestReportSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncated(value: WrapperBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ReportType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

