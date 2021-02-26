package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateValuesRequest extends StObject {
  
  /** The new values to apply to the spreadsheet. */
  var data: js.UndefOr[js.Array[ValueRange]] = js.native
  
  /**
    * Determines if the update response should include the values of the cells that were updated. By default, responses do not include the updated values. The `updatedData` field within
    * each of the BatchUpdateValuesResponse.responses contains the updated values. If the range to write was larger than the range actually written, the response includes all values in
    * the requested range (excluding trailing empty rows and columns).
    */
  var includeValuesInResponse: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines how dates, times, and durations in the response should be rendered. This is ignored if response_value_render_option is FORMATTED_VALUE. The default dateTime render option
    * is DateTimeRenderOption.SERIAL_NUMBER.
    */
  var responseDateTimeRenderOption: js.UndefOr[String] = js.native
  
  /** Determines how values in the response should be rendered. The default render option is ValueRenderOption.FORMATTED_VALUE. */
  var responseValueRenderOption: js.UndefOr[String] = js.native
  
  /** How the input data should be interpreted. */
  var valueInputOption: js.UndefOr[String] = js.native
}
object BatchUpdateValuesRequest {
  
  @scala.inline
  def apply(): BatchUpdateValuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateValuesRequest]
  }
  
  @scala.inline
  implicit class BatchUpdateValuesRequestMutableBuilder[Self <: BatchUpdateValuesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[ValueRange]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: ValueRange*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setIncludeValuesInResponse(value: Boolean): Self = StObject.set(x, "includeValuesInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeValuesInResponseUndefined: Self = StObject.set(x, "includeValuesInResponse", js.undefined)
    
    @scala.inline
    def setResponseDateTimeRenderOption(value: String): Self = StObject.set(x, "responseDateTimeRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDateTimeRenderOptionUndefined: Self = StObject.set(x, "responseDateTimeRenderOption", js.undefined)
    
    @scala.inline
    def setResponseValueRenderOption(value: String): Self = StObject.set(x, "responseValueRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseValueRenderOptionUndefined: Self = StObject.set(x, "responseValueRenderOption", js.undefined)
    
    @scala.inline
    def setValueInputOption(value: String): Self = StObject.set(x, "valueInputOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueInputOptionUndefined: Self = StObject.set(x, "valueInputOption", js.undefined)
  }
}
