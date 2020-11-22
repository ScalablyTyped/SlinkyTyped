package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchedValueRange extends js.Object {
  
  /** The DataFilters from the request that matched the range of values. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  
  /** The values matched by the DataFilter. */
  var valueRange: js.UndefOr[ValueRange] = js.native
}
object MatchedValueRange {
  
  @scala.inline
  def apply(): MatchedValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchedValueRange]
  }
  
  @scala.inline
  implicit class MatchedValueRangeOps[Self <: MatchedValueRange] (val x: Self) extends AnyVal {
    
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
    def setDataFiltersVarargs(value: DataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
    
    @scala.inline
    def setValueRange(value: ValueRange): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
  }
}
