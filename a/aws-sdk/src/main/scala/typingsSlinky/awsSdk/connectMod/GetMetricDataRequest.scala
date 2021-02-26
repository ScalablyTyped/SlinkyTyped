package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMetricDataRequest extends StObject {
  
  /**
    * The timestamp, in UNIX Epoch time format, at which to end the reporting interval for the retrieval of historical metrics data. The time must be specified using an interval of 5 minutes, such as 11:00, 11:05, 11:10, and must be later than the start time timestamp. The time range between the start and end time must be less than 24 hours.
    */
  var EndTime: js.Date = js.native
  
  /**
    * The queues, up to 100, or channels, to use to filter the metrics returned. Metric data is retrieved only for the resources associated with the queues or channels included in the filter. You can include both queue IDs and queue ARNs in the same request. Both VOICE and CHAT channels are supported.
    */
  var Filters: typingsSlinky.awsSdk.connectMod.Filters = js.native
  
  /**
    * The grouping applied to the metrics returned. For example, when results are grouped by queue, the metrics returned are grouped by queue. The values returned apply to the metrics for each queue rather than aggregated for all queues. The only supported grouping is QUEUE. If no grouping is specified, a summary of metrics for all queues is returned.
    */
  var Groupings: js.UndefOr[typingsSlinky.awsSdk.connectMod.Groupings] = js.native
  
  /**
    * The metrics to retrieve. Specify the name, unit, and statistic for each metric. The following historical metrics are available. For a description of each metric, see Historical Metrics Definitions in the Amazon Connect Administrator Guide.  ABANDON_TIME  Unit: SECONDS Statistic: AVG  AFTER_CONTACT_WORK_TIME  Unit: SECONDS Statistic: AVG  API_CONTACTS_HANDLED  Unit: COUNT Statistic: SUM  CALLBACK_CONTACTS_HANDLED  Unit: COUNT Statistic: SUM  CONTACTS_ABANDONED  Unit: COUNT Statistic: SUM  CONTACTS_AGENT_HUNG_UP_FIRST  Unit: COUNT Statistic: SUM  CONTACTS_CONSULTED  Unit: COUNT Statistic: SUM  CONTACTS_HANDLED  Unit: COUNT Statistic: SUM  CONTACTS_HANDLED_INCOMING  Unit: COUNT Statistic: SUM  CONTACTS_HANDLED_OUTBOUND  Unit: COUNT Statistic: SUM  CONTACTS_HOLD_ABANDONS  Unit: COUNT Statistic: SUM  CONTACTS_MISSED  Unit: COUNT Statistic: SUM  CONTACTS_QUEUED  Unit: COUNT Statistic: SUM  CONTACTS_TRANSFERRED_IN  Unit: COUNT Statistic: SUM  CONTACTS_TRANSFERRED_IN_FROM_QUEUE  Unit: COUNT Statistic: SUM  CONTACTS_TRANSFERRED_OUT  Unit: COUNT Statistic: SUM  CONTACTS_TRANSFERRED_OUT_FROM_QUEUE  Unit: COUNT Statistic: SUM  HANDLE_TIME  Unit: SECONDS Statistic: AVG  HOLD_TIME  Unit: SECONDS Statistic: AVG  INTERACTION_AND_HOLD_TIME  Unit: SECONDS Statistic: AVG  INTERACTION_TIME  Unit: SECONDS Statistic: AVG  OCCUPANCY  Unit: PERCENT Statistic: AVG  QUEUE_ANSWER_TIME  Unit: SECONDS Statistic: AVG  QUEUED_TIME  Unit: SECONDS Statistic: MAX  SERVICE_LEVEL  Unit: PERCENT Statistic: AVG Threshold: Only "Less than" comparisons are supported, with the following service level thresholds: 15, 20, 25, 30, 45, 60, 90, 120, 180, 240, 300, 600  
    */
  var HistoricalMetrics: typingsSlinky.awsSdk.connectMod.HistoricalMetrics = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.native
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * The timestamp, in UNIX Epoch time format, at which to start the reporting interval for the retrieval of historical metrics data. The time must be specified using a multiple of 5 minutes, such as 10:05, 10:10, 10:15. The start time cannot be earlier than 24 hours before the time of the request. Historical metrics are available only for 24 hours.
    */
  var StartTime: js.Date = js.native
}
object GetMetricDataRequest {
  
  @scala.inline
  def apply(
    EndTime: js.Date,
    Filters: Filters,
    HistoricalMetrics: HistoricalMetrics,
    InstanceId: InstanceId,
    StartTime: js.Date
  ): GetMetricDataRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], HistoricalMetrics = HistoricalMetrics.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricDataRequest]
  }
  
  @scala.inline
  implicit class GetMetricDataRequestMutableBuilder[Self <: GetMetricDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupings(value: Groupings): Self = StObject.set(x, "Groupings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingsUndefined: Self = StObject.set(x, "Groupings", js.undefined)
    
    @scala.inline
    def setGroupingsVarargs(value: Grouping*): Self = StObject.set(x, "Groupings", js.Array(value :_*))
    
    @scala.inline
    def setHistoricalMetrics(value: HistoricalMetrics): Self = StObject.set(x, "HistoricalMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoricalMetricsVarargs(value: HistoricalMetric*): Self = StObject.set(x, "HistoricalMetrics", js.Array(value :_*))
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResult100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
