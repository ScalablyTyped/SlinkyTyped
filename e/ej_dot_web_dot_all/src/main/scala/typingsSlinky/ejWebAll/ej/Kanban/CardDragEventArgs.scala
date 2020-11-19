package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardDragEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns drag data.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Returns dragged element.
    */
  var draggedElement: js.UndefOr[js.Any] = js.native
  
  /** Returns drag start element.
    */
  var dragtarget: js.UndefOr[js.Any] = js.native
  
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object CardDragEventArgs {
  
  @scala.inline
  def apply(): CardDragEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardDragEventArgs]
  }
  
  @scala.inline
  implicit class CardDragEventArgsOps[Self <: CardDragEventArgs] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDraggedElement(value: js.Any): Self = this.set("draggedElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggedElement: Self = this.set("draggedElement", js.undefined)
    
    @scala.inline
    def setDragtarget(value: js.Any): Self = this.set("dragtarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragtarget: Self = this.set("dragtarget", js.undefined)
    
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
