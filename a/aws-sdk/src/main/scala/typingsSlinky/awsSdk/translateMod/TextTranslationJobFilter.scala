package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTranslationJobFilter extends js.Object {
  /**
    * Filters the list of jobs by name.
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.translateMod.JobName] = js.native
  /**
    * Filters the list of jobs based by job status.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsSdk.translateMod.JobStatus] = js.native
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmittedAfterTime: js.UndefOr[js.Date] = js.native
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmittedBeforeTime: js.UndefOr[js.Date] = js.native
}

object TextTranslationJobFilter {
  @scala.inline
  def apply(): TextTranslationJobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTranslationJobFilter]
  }
  @scala.inline
  implicit class TextTranslationJobFilterOps[Self <: TextTranslationJobFilter] (val x: Self) extends AnyVal {
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
    def withSubmittedAfterTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedAfterTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedAfterTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedAfterTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmittedBeforeTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedBeforeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedBeforeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedBeforeTime")(js.undefined)
        ret
    }
  }
  
}

