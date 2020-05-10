package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClusterJobsResult extends js.Object {
  /**
    * Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. 
    */
  var JobListEntries: js.UndefOr[JobListEntryList] = js.native
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next ListClusterJobsResult call, your list of returned jobs will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListClusterJobsResult {
  @scala.inline
  def apply(): ListClusterJobsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClusterJobsResult]
  }
  @scala.inline
  implicit class ListClusterJobsResultOps[Self <: ListClusterJobsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobListEntries(value: JobListEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobListEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobListEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobListEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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

