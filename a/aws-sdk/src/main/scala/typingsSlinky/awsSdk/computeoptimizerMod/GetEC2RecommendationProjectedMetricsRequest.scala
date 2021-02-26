package typingsSlinky.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEC2RecommendationProjectedMetricsRequest extends StObject {
  
  /**
    * The time stamp of the last projected metrics data point to return.
    */
  var endTime: js.Date = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
    */
  var instanceArn: InstanceArn = js.native
  
  /**
    * The granularity, in seconds, of the projected metrics data points.
    */
  var period: Period = js.native
  
  /**
    * The time stamp of the first projected metrics data point to return.
    */
  var startTime: js.Date = js.native
  
  /**
    * The statistic of the projected metrics.
    */
  var stat: MetricStatistic = js.native
}
object GetEC2RecommendationProjectedMetricsRequest {
  
  @scala.inline
  def apply(
    endTime: js.Date,
    instanceArn: InstanceArn,
    period: Period,
    startTime: js.Date,
    stat: MetricStatistic
  ): GetEC2RecommendationProjectedMetricsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], instanceArn = instanceArn.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsRequest]
  }
  
  @scala.inline
  implicit class GetEC2RecommendationProjectedMetricsRequestMutableBuilder[Self <: GetEC2RecommendationProjectedMetricsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "instanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: MetricStatistic): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
  }
}
