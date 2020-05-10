package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetImportJobsResponse extends js.Object {
  /**
    * The list of dataset import jobs.
    */
  var datasetImportJobs: js.UndefOr[DatasetImportJobs] = js.native
  /**
    * A token for getting the next set of dataset import jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetImportJobsResponse {
  @scala.inline
  def apply(): ListDatasetImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetImportJobsResponse]
  }
  @scala.inline
  implicit class ListDatasetImportJobsResponseOps[Self <: ListDatasetImportJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetImportJobs(value: DatasetImportJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetImportJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetImportJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetImportJobs")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

