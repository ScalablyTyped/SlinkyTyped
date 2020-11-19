package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMetricDataInput extends js.Object {
  
  /**
    * The time stamp indicating the latest data to be returned. The value specified is exclusive; results include data points up to the specified time stamp. For better performance, specify StartTime and EndTime values that align with the value of the metric's Period and sync up with the beginning and end of an hour. For example, if the Period of a metric is 5 minutes, specifying 12:05 or 12:30 as EndTime can get a faster response from CloudWatch than setting 12:07 or 12:29 as the EndTime.
    */
  var EndTime: js.Date = js.native
  
  /**
    * The maximum number of data points the request should return before paginating. If you omit this, the default of 100,800 is used.
    */
  var MaxDatapoints: js.UndefOr[GetMetricDataMaxDatapoints] = js.native
  
  /**
    * The metric queries to be returned. A single GetMetricData call can include as many as 500 MetricDataQuery structures. Each of these structures can specify either a metric to retrieve, or a math expression to perform on retrieved data. 
    */
  var MetricDataQueries: typingsSlinky.awsSdk.cloudwatchMod.MetricDataQueries = js.native
  
  /**
    * Include this value, if it was returned by the previous call, to get the next set of data points.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
  
  /**
    * The order in which data points should be returned. TimestampDescending returns the newest data first and paginates when the MaxDatapoints limit is reached. TimestampAscending returns the oldest data first and paginates when the MaxDatapoints limit is reached.
    */
  var ScanBy: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ScanBy] = js.native
  
  /**
    * The time stamp indicating the earliest data to be returned. The value specified is inclusive; results include data points with the specified time stamp.  CloudWatch rounds the specified time stamp as follows:   Start time less than 15 days ago - Round down to the nearest whole minute. For example, 12:32:34 is rounded down to 12:32:00.   Start time between 15 and 63 days ago - Round down to the nearest 5-minute clock interval. For example, 12:32:34 is rounded down to 12:30:00.   Start time greater than 63 days ago - Round down to the nearest 1-hour clock interval. For example, 12:32:34 is rounded down to 12:00:00.   If you set Period to 5, 10, or 30, the start time of your request is rounded down to the nearest time that corresponds to even 5-, 10-, or 30-second divisions of a minute. For example, if you make a query at (HH:mm:ss) 01:05:23 for the previous 10-second period, the start time of your request is rounded down and you receive data from 01:05:10 to 01:05:20. If you make a query at 15:07:17 for the previous 5 minutes of data, using a period of 5 seconds, you receive data timestamped between 15:02:15 and 15:07:15.  For better performance, specify StartTime and EndTime values that align with the value of the metric's Period and sync up with the beginning and end of an hour. For example, if the Period of a metric is 5 minutes, specifying 12:05 or 12:30 as StartTime can get a faster response from CloudWatch than setting 12:07 or 12:29 as the StartTime.
    */
  var StartTime: js.Date = js.native
}
object GetMetricDataInput {
  
  @scala.inline
  def apply(EndTime: js.Date, MetricDataQueries: MetricDataQueries, StartTime: js.Date): GetMetricDataInput = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], MetricDataQueries = MetricDataQueries.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricDataInput]
  }
  
  @scala.inline
  implicit class GetMetricDataInputOps[Self <: GetMetricDataInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: js.Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDataQueriesVarargs(value: MetricDataQuery*): Self = this.set("MetricDataQueries", js.Array(value :_*))
    
    @scala.inline
    def setMetricDataQueries(value: MetricDataQueries): Self = this.set("MetricDataQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDatapoints(value: GetMetricDataMaxDatapoints): Self = this.set("MaxDatapoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDatapoints: Self = this.set("MaxDatapoints", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setScanBy(value: ScanBy): Self = this.set("ScanBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanBy: Self = this.set("ScanBy", js.undefined)
  }
}
