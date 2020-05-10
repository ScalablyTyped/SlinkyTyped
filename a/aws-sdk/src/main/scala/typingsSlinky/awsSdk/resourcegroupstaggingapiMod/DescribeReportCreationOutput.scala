package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReportCreationOutput extends js.Object {
  /**
    * Details of the common errors that all operations return.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ErrorMessage] = js.native
  /**
    * The path to the Amazon S3 bucket where the report was stored on creation.
    */
  var S3Location: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.S3Location] = js.native
  /**
    * Reports the status of the operation. The operation status can be one of the following:    RUNNING - Report creation is in progress.    SUCCEEDED - Report creation is complete. You can open the report from the Amazon S3 bucket that you specified when you ran StartReportCreation.    FAILED - Report creation timed out or the Amazon S3 bucket is not accessible.     NO REPORT - No report was generated in the last 90 days.  
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.Status] = js.native
}

object DescribeReportCreationOutput {
  @scala.inline
  def apply(): DescribeReportCreationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReportCreationOutput]
  }
  @scala.inline
  implicit class DescribeReportCreationOutputOps[Self <: DescribeReportCreationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Location(value: S3Location): Self = {
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
    def withStatus(value: Status): Self = {
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

