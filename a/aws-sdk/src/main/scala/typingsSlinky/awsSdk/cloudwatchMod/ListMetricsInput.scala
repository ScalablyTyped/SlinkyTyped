package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMetricsInput extends js.Object {
  
  /**
    * The dimensions to filter against. Only the dimensions that match exactly will be returned.
    */
  var Dimensions: js.UndefOr[DimensionFilters] = js.native
  
  /**
    * The name of the metric to filter against. Only the metrics with names that match exactly will be returned.
    */
  var MetricName: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MetricName] = js.native
  
  /**
    * The metric namespace to filter against. Only the namespace that matches exactly will be returned.
    */
  var Namespace: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Namespace] = js.native
  
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
  
  /**
    * To filter the results to show only metrics that have had data points published in the past three hours, specify this parameter with a value of PT3H. This is the only valid value for this parameter. The results that are returned are an approximation of the value you specify. There is a low probability that the returned results include metrics with last published data as much as 40 minutes more than the specified time interval.
    */
  var RecentlyActive: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.RecentlyActive] = js.native
}
object ListMetricsInput {
  
  @scala.inline
  def apply(): ListMetricsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricsInput]
  }
  
  @scala.inline
  implicit class ListMetricsInputOps[Self <: ListMetricsInput] (val x: Self) extends AnyVal {
    
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
    def setDimensionsVarargs(value: DimensionFilter*): Self = this.set("Dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: DimensionFilters): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricName: Self = this.set("MetricName", js.undefined)
    
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRecentlyActive(value: RecentlyActive): Self = this.set("RecentlyActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentlyActive: Self = this.set("RecentlyActive", js.undefined)
  }
}
