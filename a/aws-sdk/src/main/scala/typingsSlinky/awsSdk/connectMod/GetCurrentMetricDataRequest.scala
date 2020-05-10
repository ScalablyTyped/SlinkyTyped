package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCurrentMetricDataRequest extends js.Object {
  /**
    * The metrics to retrieve. Specify the name and unit for each metric. The following metrics are available:  AGENTS_AFTER_CONTACT_WORK  Unit: COUNT  AGENTS_AVAILABLE  Unit: COUNT  AGENTS_ERROR  Unit: COUNT  AGENTS_NON_PRODUCTIVE  Unit: COUNT  AGENTS_ON_CALL  Unit: COUNT  AGENTS_ON_CONTACT  Unit: COUNT  AGENTS_ONLINE  Unit: COUNT  AGENTS_STAFFED  Unit: COUNT  CONTACTS_IN_QUEUE  Unit: COUNT  CONTACTS_SCHEDULED  Unit: COUNT  OLDEST_CONTACT_AGE  Unit: SECONDS  SLOTS_ACTIVE  Unit: COUNT  SLOTS_AVAILABLE  Unit: COUNT  
    */
  var CurrentMetrics: typingsSlinky.awsSdk.connectMod.CurrentMetrics = js.native
  /**
    * The queues, up to 100, or channels, to use to filter the metrics returned. Metric data is retrieved only for the resources associated with the queues or channels included in the filter. You can include both queue IDs and queue ARNs in the same request. The only supported channel is VOICE.
    */
  var Filters: typingsSlinky.awsSdk.connectMod.Filters = js.native
  /**
    * The grouping applied to the metrics returned. For example, when grouped by QUEUE, the metrics returned apply to each queue rather than aggregated for all queues. If you group by CHANNEL, you should include a Channels filter. The only supported channel is VOICE. If no Grouping is included in the request, a summary of metrics is returned.
    */
  var Groupings: js.UndefOr[typingsSlinky.awsSdk.connectMod.Groupings] = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.native
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.NextToken] = js.native
}

object GetCurrentMetricDataRequest {
  @scala.inline
  def apply(CurrentMetrics: CurrentMetrics, Filters: Filters, InstanceId: InstanceId): GetCurrentMetricDataRequest = {
    val __obj = js.Dynamic.literal(CurrentMetrics = CurrentMetrics.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentMetricDataRequest]
  }
  @scala.inline
  implicit class GetCurrentMetricDataRequestOps[Self <: GetCurrentMetricDataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentMetrics(value: CurrentMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupings(value: Groupings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groupings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groupings")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResult100): Self = {
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
  }
  
}

