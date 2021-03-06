package typingsSlinky.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightRuleReportOutput extends StObject {
  
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
  implicit class GetInsightRuleReportOutputMutableBuilder[Self <: GetInsightRuleReportOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateValue(value: InsightRuleUnboundDouble): Self = StObject.set(x, "AggregateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateValueUndefined: Self = StObject.set(x, "AggregateValue", js.undefined)
    
    @scala.inline
    def setAggregationStatistic(value: InsightRuleAggregationStatistic): Self = StObject.set(x, "AggregationStatistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationStatisticUndefined: Self = StObject.set(x, "AggregationStatistic", js.undefined)
    
    @scala.inline
    def setApproximateUniqueCount(value: InsightRuleUnboundLong): Self = StObject.set(x, "ApproximateUniqueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximateUniqueCountUndefined: Self = StObject.set(x, "ApproximateUniqueCount", js.undefined)
    
    @scala.inline
    def setContributors(value: InsightRuleContributors): Self = StObject.set(x, "Contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributorsUndefined: Self = StObject.set(x, "Contributors", js.undefined)
    
    @scala.inline
    def setContributorsVarargs(value: InsightRuleContributor*): Self = StObject.set(x, "Contributors", js.Array(value :_*))
    
    @scala.inline
    def setKeyLabels(value: InsightRuleContributorKeyLabels): Self = StObject.set(x, "KeyLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyLabelsUndefined: Self = StObject.set(x, "KeyLabels", js.undefined)
    
    @scala.inline
    def setKeyLabelsVarargs(value: InsightRuleContributorKeyLabel*): Self = StObject.set(x, "KeyLabels", js.Array(value :_*))
    
    @scala.inline
    def setMetricDatapoints(value: InsightRuleMetricDatapoints): Self = StObject.set(x, "MetricDatapoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDatapointsUndefined: Self = StObject.set(x, "MetricDatapoints", js.undefined)
    
    @scala.inline
    def setMetricDatapointsVarargs(value: InsightRuleMetricDatapoint*): Self = StObject.set(x, "MetricDatapoints", js.Array(value :_*))
  }
}
