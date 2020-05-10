package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEC2RecommendationProjectedMetricsRequest extends js.Object {
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
  implicit class GetEC2RecommendationProjectedMetricsRequestOps[Self <: GetEC2RecommendationProjectedMetricsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceArn(value: InstanceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStat(value: MetricStatistic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

