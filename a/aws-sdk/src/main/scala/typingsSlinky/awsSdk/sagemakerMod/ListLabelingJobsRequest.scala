package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLabelingJobsRequest extends js.Object {
  /**
    * A filter that returns only labeling jobs created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only labeling jobs created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only labeling jobs modified after the specified time (timestamp).
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only labeling jobs modified before the specified time (timestamp).
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * The maximum number of labeling jobs to return in each page of the response.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A string in the labeling job name. This filter returns only labeling jobs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NameContains] = js.native
  /**
    * If the result of the previous ListLabelingJobs request was truncated, the response includes a NextToken. To retrieve the next set of labeling jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortBy] = js.native
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that retrieves only labeling jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[LabelingJobStatus] = js.native
}

object ListLabelingJobsRequest {
  @scala.inline
  def apply(): ListLabelingJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLabelingJobsRequest]
  }
  @scala.inline
  implicit class ListLabelingJobsRequestOps[Self <: ListLabelingJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTimeAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimeBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTimeAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTimeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTimeBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTimeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimeBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNameContains(value: NameContains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameContains")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    @scala.inline
    def withSortBy(value: SortBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: SortOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusEquals(value: LabelingJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusEquals")(js.undefined)
        ret
    }
  }
  
}

