package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricUpdate extends js.Object {
  
  /**
    * True if this metric is reported as the total cumulative aggregate
    * value accumulated since the worker started working on this WorkItem.
    * By default this is false, indicating that this metric is reported
    * as a delta that is not associated with any WorkItem.
    */
  var cumulative: js.UndefOr[Boolean] = js.native
  
  /** A struct value describing properties of a distribution of numeric values. */
  var distribution: js.UndefOr[js.Any] = js.native
  
  /**
    * Worker-computed aggregate value for internal use by the Dataflow
    * service.
    */
  var internal: js.UndefOr[js.Any] = js.native
  
  /**
    * Metric aggregation kind.  The possible metric aggregation kinds are
    * "Sum", "Max", "Min", "Mean", "Set", "And", "Or", and "Distribution".
    * The specified aggregation kind is case-insensitive.
    *
    * If omitted, this is not an aggregated value but instead
    * a single metric sample value.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Worker-computed aggregate value for the "Mean" aggregation kind.
    * This holds the count of the aggregated values and is used in combination
    * with mean_sum above to obtain the actual mean aggregate value.
    * The only possible value type is Long.
    */
  var meanCount: js.UndefOr[js.Any] = js.native
  
  /**
    * Worker-computed aggregate value for the "Mean" aggregation kind.
    * This holds the sum of the aggregated values and is used in combination
    * with mean_count below to obtain the actual mean aggregate value.
    * The only possible value types are Long and Double.
    */
  var meanSum: js.UndefOr[js.Any] = js.native
  
  /** Name of the metric. */
  var name: js.UndefOr[MetricStructuredName] = js.native
  
  /**
    * Worker-computed aggregate value for aggregation kinds "Sum", "Max", "Min",
    * "And", and "Or".  The possible value types are Long, Double, and Boolean.
    */
  var scalar: js.UndefOr[js.Any] = js.native
  
  /**
    * Worker-computed aggregate value for the "Set" aggregation kind.  The only
    * possible value type is a list of Values whose type can be Long, Double,
    * or String, according to the metric's type.  All Values in the list must
    * be of the same type.
    */
  var set: js.UndefOr[js.Any] = js.native
  
  /**
    * Timestamp associated with the metric value. Optional when workers are
    * reporting work progress; it will be filled in responses from the
    * metrics API.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object MetricUpdate {
  
  @scala.inline
  def apply(): MetricUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricUpdate]
  }
  
  @scala.inline
  implicit class MetricUpdateOps[Self <: MetricUpdate] (val x: Self) extends AnyVal {
    
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
    def setCumulative(value: Boolean): Self = this.set("cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCumulative: Self = this.set("cumulative", js.undefined)
    
    @scala.inline
    def setDistribution(value: js.Any): Self = this.set("distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    
    @scala.inline
    def setInternal(value: js.Any): Self = this.set("internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMeanCount(value: js.Any): Self = this.set("meanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanCount: Self = this.set("meanCount", js.undefined)
    
    @scala.inline
    def setMeanSum(value: js.Any): Self = this.set("meanSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanSum: Self = this.set("meanSum", js.undefined)
    
    @scala.inline
    def setName(value: MetricStructuredName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScalar(value: js.Any): Self = this.set("scalar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalar: Self = this.set("scalar", js.undefined)
    
    @scala.inline
    def setSet(value: js.Any): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
