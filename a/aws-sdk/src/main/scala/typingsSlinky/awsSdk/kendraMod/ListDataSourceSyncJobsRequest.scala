package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourceSyncJobsRequest extends js.Object {
  /**
    * The identifier of the data source.
    */
  var Id: DataSourceId = js.native
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: typingsSlinky.awsSdk.kendraMod.IndexId = js.native
  /**
    * The maximum number of synchronization jobs to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourceSyncJobsRequest] = js.native
  /**
    * If the result of the previous request to GetDataSourceSyncJobHistory was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kendraMod.NextToken] = js.native
  /**
    * When specified, the synchronization jobs returned in the list are limited to jobs between the specified dates. 
    */
  var StartTimeFilter: js.UndefOr[TimeRange] = js.native
  /**
    * When specified, only returns synchronization jobs with the Status field equal to the specified status.
    */
  var StatusFilter: js.UndefOr[DataSourceSyncJobStatus] = js.native
}

object ListDataSourceSyncJobsRequest {
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): ListDataSourceSyncJobsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSourceSyncJobsRequest]
  }
  @scala.inline
  implicit class ListDataSourceSyncJobsRequestOps[Self <: ListDataSourceSyncJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: DataSourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexId(value: IndexId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResultsIntegerForListDataSourceSyncJobsRequest): Self = {
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
    def withStartTimeFilter(value: TimeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTimeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTimeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusFilter(value: DataSourceSyncJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusFilter")(js.undefined)
        ret
    }
  }
  
}

