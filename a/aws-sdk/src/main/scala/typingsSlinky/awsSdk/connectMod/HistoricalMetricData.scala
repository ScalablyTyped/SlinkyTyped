package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoricalMetricData extends StObject {
  
  /**
    * Information about the metric.
    */
  var Metric: js.UndefOr[HistoricalMetric] = js.native
  
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[typingsSlinky.awsSdk.connectMod.Value] = js.native
}
object HistoricalMetricData {
  
  @scala.inline
  def apply(): HistoricalMetricData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalMetricData]
  }
  
  @scala.inline
  implicit class HistoricalMetricDataMutableBuilder[Self <: HistoricalMetricData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric(value: HistoricalMetric): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
