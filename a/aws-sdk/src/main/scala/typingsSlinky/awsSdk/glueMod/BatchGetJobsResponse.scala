package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetJobsResponse extends js.Object {
  /**
    * A list of job definitions.
    */
  var Jobs: js.UndefOr[JobList] = js.native
  /**
    * A list of names of jobs not found.
    */
  var JobsNotFound: js.UndefOr[JobNameList] = js.native
}

object BatchGetJobsResponse {
  @scala.inline
  def apply(): BatchGetJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetJobsResponse]
  }
  @scala.inline
  implicit class BatchGetJobsResponseOps[Self <: BatchGetJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobs(value: JobList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jobs")(js.undefined)
        ret
    }
    @scala.inline
    def withJobsNotFound(value: JobNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobsNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobsNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobsNotFound")(js.undefined)
        ret
    }
  }
  
}

