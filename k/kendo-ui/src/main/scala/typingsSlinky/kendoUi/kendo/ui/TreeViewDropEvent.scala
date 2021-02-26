package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeViewDropEvent extends TreeViewEvent {
  
  var destinationNode: js.UndefOr[Element] = js.native
  
  var dropPosition: js.UndefOr[String] = js.native
  
  var dropTarget: js.UndefOr[Element] = js.native
  
  var setValid: js.UndefOr[js.Function] = js.native
  
  var sourceNode: js.UndefOr[Element] = js.native
  
  var valid: js.UndefOr[Boolean] = js.native
}
object TreeViewDropEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewDropEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDropEvent]
  }
  
  @scala.inline
  implicit class TreeViewDropEventMutableBuilder[Self <: TreeViewDropEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationNode(value: Element): Self = StObject.set(x, "destinationNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNodeUndefined: Self = StObject.set(x, "destinationNode", js.undefined)
    
    @scala.inline
    def setDropPosition(value: String): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
    
    @scala.inline
    def setDropTarget(value: Element): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    @scala.inline
    def setSetValid(value: js.Function): Self = StObject.set(x, "setValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValidUndefined: Self = StObject.set(x, "setValid", js.undefined)
    
    @scala.inline
    def setSourceNode(value: Element): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
