package typingsSlinky.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMetricFiltersRequest extends StObject {
  
  /**
    * The prefix to match. CloudWatch Logs uses the value you set here only if you also include the logGroupName parameter in your request.
    */
  var filterNamePrefix: js.UndefOr[FilterName] = js.native
  
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  
  /**
    * Filters results to include only those with the specified metric name. If you include this parameter in your request, you must also include the metricNamespace parameter.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  
  /**
    * Filters results to include only those in the specified namespace. If you include this parameter in your request, you must also include the metricName parameter.
    */
  var metricNamespace: js.UndefOr[MetricNamespace] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeMetricFiltersRequest {
  
  @scala.inline
  def apply(): DescribeMetricFiltersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMetricFiltersRequest]
  }
  
  @scala.inline
  implicit class DescribeMetricFiltersRequestMutableBuilder[Self <: DescribeMetricFiltersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterNamePrefix(value: FilterName): Self = StObject.set(x, "filterNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNamePrefixUndefined: Self = StObject.set(x, "filterNamePrefix", js.undefined)
    
    @scala.inline
    def setLimit(value: DescribeLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    @scala.inline
    def setMetricNamespace(value: MetricNamespace): Self = StObject.set(x, "metricNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamespaceUndefined: Self = StObject.set(x, "metricNamespace", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
