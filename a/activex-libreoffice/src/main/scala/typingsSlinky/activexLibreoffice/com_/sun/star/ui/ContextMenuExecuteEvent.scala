package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains all information about the requested context menu. */
@js.native
trait ContextMenuExecuteEvent extends StObject {
  
  /** enables the access to the menu content. The implementing object has to support the service {@link com.sun.star.ui.ActionTriggerContainer} ; */
  var ActionTriggerContainer: XIndexContainer = js.native
  
  /** contains the position the context menu will be executed at. */
  var ExecutePosition: Point = js.native
  
  /** provides the current selection inside the source window. */
  var Selection: XSelectionSupplier = js.native
  
  /** contains the window where the context menu has been requested */
  var SourceWindow: XWindow = js.native
}
object ContextMenuExecuteEvent {
  
  @scala.inline
  def apply(
    ActionTriggerContainer: XIndexContainer,
    ExecutePosition: Point,
    Selection: XSelectionSupplier,
    SourceWindow: XWindow
  ): ContextMenuExecuteEvent = {
    val __obj = js.Dynamic.literal(ActionTriggerContainer = ActionTriggerContainer.asInstanceOf[js.Any], ExecutePosition = ExecutePosition.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SourceWindow = SourceWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuExecuteEvent]
  }
  
  @scala.inline
  implicit class ContextMenuExecuteEventMutableBuilder[Self <: ContextMenuExecuteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTriggerContainer(value: XIndexContainer): Self = StObject.set(x, "ActionTriggerContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutePosition(value: Point): Self = StObject.set(x, "ExecutePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: XSelectionSupplier): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceWindow(value: XWindow): Self = StObject.set(x, "SourceWindow", value.asInstanceOf[js.Any])
  }
}
