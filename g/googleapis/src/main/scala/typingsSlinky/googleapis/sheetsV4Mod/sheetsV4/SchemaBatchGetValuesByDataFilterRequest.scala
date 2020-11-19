package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for retrieving a range of values in a spreadsheet selected by a
  * set of DataFilters.
  */
@js.native
trait SchemaBatchGetValuesByDataFilterRequest extends js.Object {
  
  /**
    * The data filters used to match the ranges of values to retrieve.  Ranges
    * that match any of the specified data filters will be included in the
    * response.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  
  /**
    * How dates, times, and durations should be represented in the output. This
    * is ignored if value_render_option is FORMATTED_VALUE. The default
    * dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.native
  
  /**
    * The major dimension that results should use.  For example, if the
    * spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then a request that selects
    * that range and sets `majorDimension=ROWS` will return `[[1,2],[3,4]]`,
    * whereas a request that sets `majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.native
  
  /**
    * How values should be represented in the output. The default render option
    * is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.native
}
object SchemaBatchGetValuesByDataFilterRequest {
  
  @scala.inline
  def apply(): SchemaBatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetValuesByDataFilterRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchGetValuesByDataFilterRequestOps[Self <: SchemaBatchGetValuesByDataFilterRequest] (val x: Self) extends AnyVal {
    
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
    def setDataFiltersVarargs(value: SchemaDataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setDataFilters(value: js.Array[SchemaDataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
    
    @scala.inline
    def setDateTimeRenderOption(value: String): Self = this.set("dateTimeRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeRenderOption: Self = this.set("dateTimeRenderOption", js.undefined)
    
    @scala.inline
    def setMajorDimension(value: String): Self = this.set("majorDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorDimension: Self = this.set("majorDimension", js.undefined)
    
    @scala.inline
    def setValueRenderOption(value: String): Self = this.set("valueRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRenderOption: Self = this.set("valueRenderOption", js.undefined)
  }
}
