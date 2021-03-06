package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTimeSeriesRequest extends StObject {
  
  /**
    * Required. The new data to be added to a list of time series. Adds at most one data point to each of several time series. The new data point must be more recent than any other point
    * in its time series. Each TimeSeries value must fully specify a unique time series by supplying all label values for the metric and the monitored resource.The maximum number of
    * TimeSeries objects per Create request is 200.
    */
  var timeSeries: js.UndefOr[js.Array[TimeSeries]] = js.native
}
object CreateTimeSeriesRequest {
  
  @scala.inline
  def apply(): CreateTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTimeSeriesRequest]
  }
  
  @scala.inline
  implicit class CreateTimeSeriesRequestMutableBuilder[Self <: CreateTimeSeriesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeSeries(value: js.Array[TimeSeries]): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesUndefined: Self = StObject.set(x, "timeSeries", js.undefined)
    
    @scala.inline
    def setTimeSeriesVarargs(value: TimeSeries*): Self = StObject.set(x, "timeSeries", js.Array(value :_*))
  }
}
