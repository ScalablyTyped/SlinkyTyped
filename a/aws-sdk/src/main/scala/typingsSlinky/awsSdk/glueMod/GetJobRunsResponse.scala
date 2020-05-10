package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRunsResponse extends js.Object {
  /**
    * A list of job-run metadata objects.
    */
  var JobRuns: js.UndefOr[JobRunList] = js.native
  /**
    * A continuation token, if not all requested job runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetJobRunsResponse {
  @scala.inline
  def apply(): GetJobRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobRunsResponse]
  }
  @scala.inline
  implicit class GetJobRunsResponseOps[Self <: GetJobRunsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobRuns(value: JobRunList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRuns")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

