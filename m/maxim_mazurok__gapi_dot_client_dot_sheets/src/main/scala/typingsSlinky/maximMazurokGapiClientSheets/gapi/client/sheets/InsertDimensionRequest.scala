package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertDimensionRequest extends js.Object {
  
  /**
    * Whether dimension properties should be extended from the dimensions before or after the newly inserted dimensions. True to inherit from the dimensions before (in which case the
    * start index must be greater than 0), and false to inherit from the dimensions after. For example, if row index 0 has red background and row index 1 has a green background, then
    * inserting 2 rows at index 1 can inherit either the green or red background. If `inheritFromBefore` is true, the two new rows will be red (because the row before the insertion point
    * was red), whereas if `inheritFromBefore` is false, the two new rows will be green (because the row after the insertion point was green).
    */
  var inheritFromBefore: js.UndefOr[Boolean] = js.native
  
  /** The dimensions to insert. Both the start and end indexes must be bounded. */
  var range: js.UndefOr[DimensionRange] = js.native
}
object InsertDimensionRequest {
  
  @scala.inline
  def apply(): InsertDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertDimensionRequest]
  }
  
  @scala.inline
  implicit class InsertDimensionRequestOps[Self <: InsertDimensionRequest] (val x: Self) extends AnyVal {
    
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
    def setInheritFromBefore(value: Boolean): Self = this.set("inheritFromBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritFromBefore: Self = this.set("inheritFromBefore", js.undefined)
    
    @scala.inline
    def setRange(value: DimensionRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
