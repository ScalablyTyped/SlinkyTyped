package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BehaviorCriteria extends js.Object {
  /**
    * The operator that relates the thing measured (metric) to the criteria (containing a value or statisticalThreshold).
    */
  var comparisonOperator: js.UndefOr[ComparisonOperator] = js.native
  /**
    * If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs. If not specified, the default is 1.
    */
  var consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm] = js.native
  /**
    * If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
    */
  var consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear] = js.native
  /**
    * Use this to specify the time duration over which the behavior is evaluated, for those criteria which have a time dimension (for example, NUM_MESSAGES_SENT). For a statisticalThreshhold metric comparison, measurements from all devices are accumulated over this time duration before being used to calculate percentiles, and later, measurements from an individual device are also accumulated over this time duration before being given a percentile rank.
    */
  var durationSeconds: js.UndefOr[DurationSeconds] = js.native
  /**
    * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in compliance or in violation of the behavior.
    */
  var statisticalThreshold: js.UndefOr[StatisticalThreshold] = js.native
  /**
    * The value to be compared with the metric.
    */
  var value: js.UndefOr[MetricValue] = js.native
}

object BehaviorCriteria {
  @scala.inline
  def apply(): BehaviorCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BehaviorCriteria]
  }
  @scala.inline
  implicit class BehaviorCriteriaOps[Self <: BehaviorCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonOperator(value: ComparisonOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withConsecutiveDatapointsToAlarm(value: ConsecutiveDatapointsToAlarm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consecutiveDatapointsToAlarm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsecutiveDatapointsToAlarm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consecutiveDatapointsToAlarm")(js.undefined)
        ret
    }
    @scala.inline
    def withConsecutiveDatapointsToClear(value: ConsecutiveDatapointsToClear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consecutiveDatapointsToClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsecutiveDatapointsToClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consecutiveDatapointsToClear")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationSeconds(value: DurationSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withStatisticalThreshold(value: StatisticalThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatisticalThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

