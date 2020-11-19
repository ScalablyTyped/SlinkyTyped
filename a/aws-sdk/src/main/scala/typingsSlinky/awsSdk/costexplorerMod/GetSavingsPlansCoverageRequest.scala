package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSavingsPlansCoverageRequest extends js.Object {
  
  /**
    * Filters Savings Plans coverage data by dimensions. You can filter data for Savings Plans usage with the following dimensions:    LINKED_ACCOUNT     REGION     SERVICE     INSTANCE_FAMILY     GetSavingsPlansCoverage uses the same Expression object as the other operations, but only AND is supported among each dimension. If there are multiple values for a dimension, they are OR'd together. Cost category is also supported.
    */
  var Filter: js.UndefOr[Expression] = js.native
  
  /**
    * The granularity of the Amazon Web Services cost data for your Savings Plans. Granularity can't be set if GroupBy is set. The GetSavingsPlansCoverage operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Granularity] = js.native
  
  /**
    * You can group the data using the attributes INSTANCE_FAMILY, REGION, or SERVICE.
    */
  var GroupBy: js.UndefOr[GroupDefinitions] = js.native
  
  /**
    * The number of items to be returned in a response. The default is 20, with a minimum value of 1.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.MaxResults] = js.native
  
  /**
    * The measurement that you want your Savings Plans coverage reported in. The only valid value is SpendCoveredBySavingsPlans.
    */
  var Metrics: js.UndefOr[MetricNames] = js.native
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
  
  /**
    * The time period that you want the usage and costs for. The Start date must be within 13 months. The End date must be after the Start date, and before the current date. Future dates can't be used as an End date.
    */
  var TimePeriod: DateInterval = js.native
}
object GetSavingsPlansCoverageRequest {
  
  @scala.inline
  def apply(TimePeriod: DateInterval): GetSavingsPlansCoverageRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansCoverageRequest]
  }
  
  @scala.inline
  implicit class GetSavingsPlansCoverageRequestOps[Self <: GetSavingsPlansCoverageRequest] (val x: Self) extends AnyVal {
    
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
    def setTimePeriod(value: DateInterval): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: Expression): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setGranularity(value: Granularity): Self = this.set("Granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranularity: Self = this.set("Granularity", js.undefined)
    
    @scala.inline
    def setGroupByVarargs(value: GroupDefinition*): Self = this.set("GroupBy", js.Array(value :_*))
    
    @scala.inline
    def setGroupBy(value: GroupDefinitions): Self = this.set("GroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("GroupBy", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricName*): Self = this.set("Metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: MetricNames): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextPageToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
