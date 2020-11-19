package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A location of a single table cell within a table.
  */
@js.native
trait SchemaTableCellLocation extends js.Object {
  
  /**
    * The 0-based column index.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * The 0-based row index.
    */
  var rowIndex: js.UndefOr[Double] = js.native
}
object SchemaTableCellLocation {
  
  @scala.inline
  def apply(): SchemaTableCellLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellLocation]
  }
  
  @scala.inline
  implicit class SchemaTableCellLocationOps[Self <: SchemaTableCellLocation] (val x: Self) extends AnyVal {
    
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
}
