package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetValuesByDataFilterRequest extends StObject {
  
  /** The data filters used to match the ranges of values to retrieve. Ranges that match any of the specified data filters are included in the response. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  
  /**
    * How dates, times, and durations should be represented in the output. This is ignored if value_render_option is FORMATTED_VALUE. The default dateTime render option is
    * [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.native
  
  /**
    * The major dimension that results should use. For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then a request that selects that range and sets `majorDimension=ROWS`
    * returns `[[1,2],[3,4]]`, whereas a request that sets `majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.native
  
  /** How values should be represented in the output. The default render option is ValueRenderOption.FORMATTED_VALUE. */
  var valueRenderOption: js.UndefOr[String] = js.native
}
object BatchGetValuesByDataFilterRequest {
  
  @scala.inline
  def apply(): BatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetValuesByDataFilterRequest]
  }
  
  @scala.inline
  implicit class BatchGetValuesByDataFilterRequestMutableBuilder[Self <: BatchGetValuesByDataFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setDateTimeRenderOption(value: String): Self = StObject.set(x, "dateTimeRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeRenderOptionUndefined: Self = StObject.set(x, "dateTimeRenderOption", js.undefined)
    
    @scala.inline
    def setMajorDimension(value: String): Self = StObject.set(x, "majorDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorDimensionUndefined: Self = StObject.set(x, "majorDimension", js.undefined)
    
    @scala.inline
    def setValueRenderOption(value: String): Self = StObject.set(x, "valueRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRenderOptionUndefined: Self = StObject.set(x, "valueRenderOption", js.undefined)
  }
}
