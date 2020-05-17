package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains all information about the requested context menu. */
@js.native
trait ContextMenuExecuteEvent extends js.Object {
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
  implicit class ContextMenuExecuteEventOps[Self <: ContextMenuExecuteEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionTriggerContainer(value: XIndexContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionTriggerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutePosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: XSelectionSupplier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceWindow(value: XWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceWindow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

