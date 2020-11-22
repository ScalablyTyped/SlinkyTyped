package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRangeRequest extends js.Object {
  
  /** The range of cells to delete. */
  var range: js.UndefOr[GridRange] = js.native
  
  /**
    * The dimension from which deleted cells will be replaced with. If ROWS, existing cells will be shifted upward to replace the deleted cells. If COLUMNS, existing cells will be shifted
    * left to replace the deleted cells.
    */
  var shiftDimension: js.UndefOr[String] = js.native
}
object DeleteRangeRequest {
  
  @scala.inline
  def apply(): DeleteRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRangeRequest]
  }
  
  @scala.inline
  implicit class DeleteRangeRequestOps[Self <: DeleteRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setShiftDimension(value: String): Self = this.set("shiftDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftDimension: Self = this.set("shiftDimension", js.undefined)
  }
}
