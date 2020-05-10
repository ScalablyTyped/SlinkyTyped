package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetImportJobsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset to list the dataset import jobs for.
    */
  var datasetArn: js.UndefOr[Arn] = js.native
  /**
    * The maximum number of dataset import jobs to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token returned from the previous call to ListDatasetImportJobs for getting the next set of dataset import jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetImportJobsRequest {
  @scala.inline
  def apply(): ListDatasetImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetImportJobsRequest]
  }
  @scala.inline
  implicit class ListDatasetImportJobsRequestOps[Self <: ListDatasetImportJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
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

