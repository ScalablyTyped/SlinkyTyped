package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAddEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.native
  
  /** Returns the column index.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /** Returns the column object.
    */
  var columnObject: js.UndefOr[js.Any] = js.native
  
  /** Returns deleted data.
    */
  var defaultData: js.UndefOr[js.Any] = js.native
  
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the primaryKey.
    */
  var primaryKey: js.UndefOr[js.Any] = js.native
  
  /** Returns the row element.
    */
  var row: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object BatchAddEventArgs {
  
  @scala.inline
  def apply(): BatchAddEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAddEventArgs]
  }
  
  @scala.inline
  implicit class BatchAddEventArgsOps[Self <: BatchAddEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCell(value: js.Any): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setColumnObject(value: js.Any): Self = this.set("columnObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnObject: Self = this.set("columnObject", js.undefined)
    
    @scala.inline
    def setDefaultData(value: js.Any): Self = this.set("defaultData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultData: Self = this.set("defaultData", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: js.Any): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setRow(value: js.Any): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
