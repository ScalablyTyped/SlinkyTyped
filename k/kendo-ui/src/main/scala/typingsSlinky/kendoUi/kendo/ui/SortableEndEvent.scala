package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableEndEvent extends SortableEvent {
  
  var action: js.UndefOr[String] = js.native
  
  var draggableEvent: js.UndefOr[js.Any] = js.native
  
  var item: js.UndefOr[JQuery] = js.native
  
  var newIndex: js.UndefOr[Double] = js.native
  
  var oldIndex: js.UndefOr[Double] = js.native
}
object SortableEndEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Sortable): SortableEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableEndEvent]
  }
  
  @scala.inline
  implicit class SortableEndEventOps[Self <: SortableEndEvent] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setDraggableEvent(value: js.Any): Self = this.set("draggableEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableEvent: Self = this.set("draggableEvent", js.undefined)
    
    @scala.inline
    def setItem(value: JQuery): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewIndex: Self = this.set("newIndex", js.undefined)
    
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldIndex: Self = this.set("oldIndex", js.undefined)
  }
}
