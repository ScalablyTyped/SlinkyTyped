package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropTargetAreaDragenterEvent extends DropTargetAreaEvent {
  
  var draggable: js.UndefOr[Draggable] = js.native
  
  var dropTarget: js.UndefOr[JQuery] = js.native
  
  var target: js.UndefOr[Element] = js.native
}
object DropTargetAreaDragenterEvent {
  
  @scala.inline
  def apply(sender: DropTargetArea): DropTargetAreaDragenterEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetAreaDragenterEvent]
  }
  
  @scala.inline
  implicit class DropTargetAreaDragenterEventMutableBuilder[Self <: DropTargetAreaDragenterEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggable(value: Draggable): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setDropTarget(value: JQuery): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
