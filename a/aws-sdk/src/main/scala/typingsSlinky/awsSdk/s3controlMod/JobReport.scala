package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobReport extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.
    */
  var Bucket: js.UndefOr[S3BucketArnString] = js.native
  /**
    * Indicates whether the specified job will generate a job-completion report.
    */
  var Enabled: Boolean = js.native
  /**
    * The format of the specified job-completion report.
    */
  var Format: js.UndefOr[JobReportFormat] = js.native
  /**
    * An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
    */
  var Prefix: js.UndefOr[ReportPrefixString] = js.native
  /**
    * Indicates whether the job-completion report will include details of all tasks or only failed tasks.
    */
  var ReportScope: js.UndefOr[JobReportScope] = js.native
}

object JobReport {
  @scala.inline
  def apply(Enabled: Boolean): JobReport = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobReport]
  }
  @scala.inline
  implicit class JobReportOps[Self <: JobReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucket(value: S3BucketArnString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: JobReportFormat): Self = {
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
    def withPrefix(value: ReportPrefixString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withReportScope(value: JobReportScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportScope")(js.undefined)
        ret
    }
  }
  
}

