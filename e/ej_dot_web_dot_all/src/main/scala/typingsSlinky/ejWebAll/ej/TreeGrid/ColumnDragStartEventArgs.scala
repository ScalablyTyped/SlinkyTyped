package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDragStartEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the column data which is dragged
    */
  var draggedColumn: js.UndefOr[js.Any] = js.native
  
  /** Returns the index of the column being dragged
    */
  var draggedColumnIndex: js.UndefOr[Double] = js.native
  
  /** Returns the control model values.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the event Type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ColumnDragStartEventArgs {
  
  @scala.inline
  def apply(): ColumnDragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDragStartEventArgs]
  }
  
  @scala.inline
  implicit class ColumnDragStartEventArgsOps[Self <: ColumnDragStartEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDraggedColumn(value: js.Any): Self = this.set("draggedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggedColumn: Self = this.set("draggedColumn", js.undefined)
    
    @scala.inline
    def setDraggedColumnIndex(value: Double): Self = this.set("draggedColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggedColumnIndex: Self = this.set("draggedColumnIndex", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
