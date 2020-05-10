package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightRuleMetricDatapoint extends js.Object {
  /**
    * The average value from all contributors during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Average: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated separately, so the identity of the max contributor could be different for each timestamp. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var MaxContributorValue: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The maximum value from a single occurence from a single contributor during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Maximum: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The minimum value from a single contributor during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Minimum: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The number of occurrences that matched the rule during this data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var SampleCount: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The sum of the values from all contributors during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Sum: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The timestamp of the data point.
    */
  var Timestamp: js.Date = js.native
  /**
    * The number of unique contributors who published data during this timestamp. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var UniqueContributors: js.UndefOr[InsightRuleUnboundDouble] = js.native
}

object InsightRuleMetricDatapoint {
  @scala.inline
  def apply(Timestamp: js.Date): InsightRuleMetricDatapoint = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleMetricDatapoint]
  }
  @scala.inline
  implicit class InsightRuleMetricDatapointOps[Self <: InsightRuleMetricDatapoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAverage(value: InsightRuleUnboundDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Average")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxContributorValue(value: InsightRuleUnboundDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxContributorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxContributorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxContributorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: InsightRuleUnboundDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: InsightRuleUnboundDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleCount(value: InsightRuleUnboundDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: InsightRuleUnboundDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sum")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueContributors(value: InsightRuleUnboundDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueContributors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueContributors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueContributors")(js.undefined)
        ret
    }
  }
  
}

