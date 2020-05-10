package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehendMedicalAsyncJobFilter extends js.Object {
  /**
    * Filters on the name of the job.
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.JobName] = js.native
  /**
    * Filters the list of jobs based on job status. Returns only jobs with the specified status.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.JobStatus] = js.native
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmitTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmitTimeBefore: js.UndefOr[js.Date] = js.native
}

object ComprehendMedicalAsyncJobFilter {
  @scala.inline
  def apply(): ComprehendMedicalAsyncJobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComprehendMedicalAsyncJobFilter]
  }
  @scala.inline
  implicit class ComprehendMedicalAsyncJobFilterOps[Self <: ComprehendMedicalAsyncJobFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobName(value: JobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(js.undefined)
        ret
    }
    @scala.inline
    def withJobStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitTimeAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTimeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitTimeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTimeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitTimeBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTimeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitTimeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTimeBefore")(js.undefined)
        ret
    }
  }
  
}

