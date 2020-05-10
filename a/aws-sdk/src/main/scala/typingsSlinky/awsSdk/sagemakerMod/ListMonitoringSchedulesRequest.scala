package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMonitoringSchedulesRequest extends js.Object {
  /**
    * A filter that returns only monitoring schedules created after a specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only monitoring schedules created before a specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * Name of a specific endpoint to fetch schedules for.
    */
  var EndpointName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * A filter that returns only monitoring schedules modified after a specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only monitoring schedules modified before a specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * The maximum number of jobs to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * Filter for monitoring schedules whose name contains a specified string.
    */
  var NameContains: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NameContains] = js.native
  /**
    * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * Whether to sort results by Status, CreationTime, ScheduledTime field. The default is CreationTime.
    */
  var SortBy: js.UndefOr[MonitoringScheduleSortKey] = js.native
  /**
    * Whether to sort the results in Ascending or Descending order. The default is Descending.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that returns only monitoring schedules modified before a specified time.
    */
  var StatusEquals: js.UndefOr[ScheduleStatus] = js.native
}

object ListMonitoringSchedulesRequest {
  @scala.inline
  def apply(): ListMonitoringSchedulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitoringSchedulesRequest]
  }
  @scala.inline
  implicit class ListMonitoringSchedulesRequestOps[Self <: ListMonitoringSchedulesRequest] (val x: Self) extends AnyVal {
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
    def withEndpointName(value: EndpointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(js.undefined)
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
    def withSortBy(value: MonitoringScheduleSortKey): Self = {
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
    def withStatusEquals(value: ScheduleStatus): Self = {
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

