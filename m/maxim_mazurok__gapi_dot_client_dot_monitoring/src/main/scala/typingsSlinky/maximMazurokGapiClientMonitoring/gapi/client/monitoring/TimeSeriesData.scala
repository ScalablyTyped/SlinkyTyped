package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeriesData extends StObject {
  
  /**
    * The values of the labels in the time series identifier, given in the same order as the label_descriptors field of the TimeSeriesDescriptor associated with this object. Each value
    * must have a value of the type given in the corresponding entry of label_descriptors.
    */
  var labelValues: js.UndefOr[js.Array[LabelValue]] = js.native
  
  /** The points in the time series. */
  var pointData: js.UndefOr[js.Array[PointData]] = js.native
}
object TimeSeriesData {
  
  @scala.inline
  def apply(): TimeSeriesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesData]
  }
  
  @scala.inline
  implicit class TimeSeriesDataMutableBuilder[Self <: TimeSeriesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelValues(value: js.Array[LabelValue]): Self = StObject.set(x, "labelValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelValuesUndefined: Self = StObject.set(x, "labelValues", js.undefined)
    
    @scala.inline
    def setLabelValuesVarargs(value: LabelValue*): Self = StObject.set(x, "labelValues", js.Array(value :_*))
    
    @scala.inline
    def setPointData(value: js.Array[PointData]): Self = StObject.set(x, "pointData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointDataUndefined: Self = StObject.set(x, "pointData", js.undefined)
    
    @scala.inline
    def setPointDataVarargs(value: PointData*): Self = StObject.set(x, "pointData", js.Array(value :_*))
  }
}
