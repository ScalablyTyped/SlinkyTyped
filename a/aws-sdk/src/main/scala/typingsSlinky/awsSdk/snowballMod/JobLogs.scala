package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobLogs extends js.Object {
  /**
    * A link to an Amazon S3 presigned URL where the job completion report is located.
    */
  var JobCompletionReportURI: js.UndefOr[String] = js.native
  /**
    * A link to an Amazon S3 presigned URL where the job failure log is located.
    */
  var JobFailureLogURI: js.UndefOr[String] = js.native
  /**
    * A link to an Amazon S3 presigned URL where the job success log is located.
    */
  var JobSuccessLogURI: js.UndefOr[String] = js.native
}

object JobLogs {
  @scala.inline
  def apply(): JobLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobLogs]
  }
  @scala.inline
  implicit class JobLogsOps[Self <: JobLogs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobCompletionReportURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobCompletionReportURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobCompletionReportURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobCompletionReportURI")(js.undefined)
        ret
    }
    @scala.inline
    def withJobFailureLogURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFailureLogURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobFailureLogURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFailureLogURI")(js.undefined)
        ret
    }
    @scala.inline
    def withJobSuccessLogURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobSuccessLogURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobSuccessLogURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobSuccessLogURI")(js.undefined)
        ret
    }
  }
  
}

