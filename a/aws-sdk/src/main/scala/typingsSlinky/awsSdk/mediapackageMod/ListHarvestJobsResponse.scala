package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHarvestJobsResponse extends js.Object {
  /**
    * A list of HarvestJob records.
    */
  var HarvestJobs: js.UndefOr[listOfHarvestJob] = js.native
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListHarvestJobsResponse {
  @scala.inline
  def apply(): ListHarvestJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHarvestJobsResponse]
  }
  @scala.inline
  implicit class ListHarvestJobsResponseOps[Self <: ListHarvestJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHarvestJobs(value: listOfHarvestJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HarvestJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHarvestJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HarvestJobs")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
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

