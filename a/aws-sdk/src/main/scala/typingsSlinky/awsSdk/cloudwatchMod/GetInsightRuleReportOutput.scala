package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInsightRuleReportOutput extends js.Object {
  /**
    * The sum of the values from all individual contributors that match the rule.
    */
  var AggregateValue: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * Specifies whether this rule aggregates contributor data by COUNT or SUM.
    */
  var AggregationStatistic: js.UndefOr[InsightRuleAggregationStatistic] = js.native
  /**
    * An approximate count of the unique contributors found by this rule in this time period.
    */
  var ApproximateUniqueCount: js.UndefOr[InsightRuleUnboundLong] = js.native
  /**
    * An array of the unique contributors found by this rule in this time period. If the rule contains multiple keys, each combination of values for the keys counts as a unique contributor.
    */
  var Contributors: js.UndefOr[InsightRuleContributors] = js.native
  /**
    * An array of the strings used as the keys for this rule. The keys are the dimensions used to classify contributors. If the rule contains more than one key, then each unique combination of values for the keys is counted as a unique contributor.
    */
  var KeyLabels: js.UndefOr[InsightRuleContributorKeyLabels] = js.native
  /**
    * A time series of metric data points that matches the time period in the rule request.
    */
  var MetricDatapoints: js.UndefOr[InsightRuleMetricDatapoints] = js.native
}

object GetInsightRuleReportOutput {
  @scala.inline
  def apply(): GetInsightRuleReportOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightRuleReportOutput]
  }
  @scala.inline
  implicit class GetInsightRuleReportOutputOps[Self <: GetInsightRuleReportOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateValue(value: InsightRuleUnboundDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregateValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregationStatistic(value: InsightRuleAggregationStatistic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregationStatistic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationStatistic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregationStatistic")(js.undefined)
        ret
    }
    @scala.inline
    def withApproximateUniqueCount(value: InsightRuleUnboundLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateUniqueCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproximateUniqueCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateUniqueCount")(js.undefined)
        ret
    }
    @scala.inline
    def withContributors(value: InsightRuleContributors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contributors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContributors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contributors")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyLabels(value: InsightRuleContributorKeyLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricDatapoints(value: InsightRuleMetricDatapoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricDatapoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricDatapoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricDatapoints")(js.undefined)
        ret
    }
  }
  
}

