package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTimeSeriesResponse extends StObject {
  
  /** Query execution errors that may have caused the time series data returned to be incomplete. */
  var executionErrors: js.UndefOr[js.Array[Status]] = js.native
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this
    * method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** One or more time series that match the filter included in the request. */
  var timeSeries: js.UndefOr[js.Array[TimeSeries]] = js.native
  
  /**
    * The unit in which all time_series point values are reported. unit follows the UCUM format for units as seen in https://unitsofmeasure.org/ucum.html. If different time_series have
    * different units (for example, because they come from different metric types, or a unit is absent), then unit will be "{not_a_unit}".
    */
  var unit: js.UndefOr[String] = js.native
}
object ListTimeSeriesResponse {
  
  @scala.inline
  def apply(): ListTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTimeSeriesResponse]
  }
  
  @scala.inline
  implicit class ListTimeSeriesResponseMutableBuilder[Self <: ListTimeSeriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionErrors(value: js.Array[Status]): Self = StObject.set(x, "executionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionErrorsUndefined: Self = StObject.set(x, "executionErrors", js.undefined)
    
    @scala.inline
    def setExecutionErrorsVarargs(value: Status*): Self = StObject.set(x, "executionErrors", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTimeSeries(value: js.Array[TimeSeries]): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesUndefined: Self = StObject.set(x, "timeSeries", js.undefined)
    
    @scala.inline
    def setTimeSeriesVarargs(value: TimeSeries*): Self = StObject.set(x, "timeSeries", js.Array(value :_*))
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
