package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetContentsResponse extends js.Object {
  /**
    * Summary information about data set contents that have been created.
    */
  var datasetContentSummaries: js.UndefOr[DatasetContentSummaries] = js.native
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetContentsResponse {
  @scala.inline
  def apply(): ListDatasetContentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetContentsResponse]
  }
  @scala.inline
  implicit class ListDatasetContentsResponseOps[Self <: ListDatasetContentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetContentSummaries(value: DatasetContentSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetContentSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetContentSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetContentSummaries")(js.undefined)
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

