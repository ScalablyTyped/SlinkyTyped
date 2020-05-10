package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationHistoryRequest extends js.Object {
  /**
    * The end time of the event.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
    */
  var EventStatus: js.UndefOr[ConfigurationEventStatus] = js.native
  /**
    *  The maximum number of results returned by ListConfigurationHistory in paginated output. When this parameter is used, ListConfigurationHistory returns only MaxResults in a single page along with a NextToken response element. The remaining results of the initial request can be seen by sending another ListConfigurationHistory request with the returned NextToken value. If this parameter is not used, then ListConfigurationHistory returns all results. 
    */
  var MaxResults: js.UndefOr[MaxEntities] = js.native
  /**
    * The NextToken value returned from a previous paginated ListConfigurationHistory request where MaxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the NextToken value. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Resource group to which the application belongs. 
    */
  var ResourceGroupName: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
  /**
    * The start time of the event. 
    */
  var StartTime: js.UndefOr[js.Date] = js.native
}

object ListConfigurationHistoryRequest {
  @scala.inline
  def apply(): ListConfigurationHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationHistoryRequest]
  }
  @scala.inline
  implicit class ListConfigurationHistoryRequestOps[Self <: ListConfigurationHistoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEventStatus(value: ConfigurationEventStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxEntities): Self = {
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
    def withNextToken(value: PaginationToken): Self = {
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
    def withResourceGroupName(value: ResourceGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
  }
  
}

