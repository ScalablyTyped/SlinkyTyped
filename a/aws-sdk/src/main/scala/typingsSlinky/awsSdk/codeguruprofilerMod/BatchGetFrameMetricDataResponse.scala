package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetFrameMetricDataResponse extends js.Object {
  
  /**
    *  The end time of the time period for the returned time series values. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var endTime: js.Date = js.native
  
  /**
    *  List of instances, or time steps, in the time series. For example, if the period is one day (PT24H)), and the resolution is five minutes (PT5M), then there are 288 endTimes in the list that are each five minutes appart. 
    */
  var endTimes: ListOfTimestamps = js.native
  
  /**
    * Details of the metrics to request a time series of values. The metric includes the name of the frame, the aggregation type to calculate the metric value for the frame, and the thread states to use to get the count for the metric value of the frame.
    */
  var frameMetricData: FrameMetricData = js.native
  
  /**
    * Resolution or granularity of the profile data used to generate the time series. This is the value used to jump through time steps in a time series. There are 3 valid values.     P1D — 1 day     PT1H — 1 hour     PT5M — 5 minutes   
    */
  var resolution: AggregationPeriod = js.native
  
  /**
    *  The start time of the time period for the returned time series values. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var startTime: js.Date = js.native
  
  /**
    * List of instances which remained unprocessed. This will create a missing time step in the list of end times.
    */
  var unprocessedEndTimes: UnprocessedEndTimeMap = js.native
}
object BatchGetFrameMetricDataResponse {
  
  @scala.inline
  def apply(
    endTime: js.Date,
    endTimes: ListOfTimestamps,
    frameMetricData: FrameMetricData,
    resolution: AggregationPeriod,
    startTime: js.Date,
    unprocessedEndTimes: UnprocessedEndTimeMap
  ): BatchGetFrameMetricDataResponse = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], endTimes = endTimes.asInstanceOf[js.Any], frameMetricData = frameMetricData.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], unprocessedEndTimes = unprocessedEndTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetFrameMetricDataResponse]
  }
  
  @scala.inline
  implicit class BatchGetFrameMetricDataResponseOps[Self <: BatchGetFrameMetricDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: js.Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimesVarargs(value: TimestampStructure*): Self = this.set("endTimes", js.Array(value :_*))
    
    @scala.inline
    def setEndTimes(value: ListOfTimestamps): Self = this.set("endTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameMetricDataVarargs(value: FrameMetricDatum*): Self = this.set("frameMetricData", js.Array(value :_*))
    
    @scala.inline
    def setFrameMetricData(value: FrameMetricData): Self = this.set("frameMetricData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: AggregationPeriod): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedEndTimes(value: UnprocessedEndTimeMap): Self = this.set("unprocessedEndTimes", value.asInstanceOf[js.Any])
  }
}
