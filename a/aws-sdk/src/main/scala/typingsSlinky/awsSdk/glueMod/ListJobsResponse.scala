package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsResponse extends js.Object {
  /**
    * The names of all jobs in the account, or the jobs with the specified tags.
    */
  var JobNames: js.UndefOr[JobNameList] = js.native
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListJobsResponse {
  @scala.inline
  def apply(): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsResponse]
  }
  @scala.inline
  implicit class ListJobsResponseOps[Self <: ListJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobNames(value: JobNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobNames")(js.undefined)
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

