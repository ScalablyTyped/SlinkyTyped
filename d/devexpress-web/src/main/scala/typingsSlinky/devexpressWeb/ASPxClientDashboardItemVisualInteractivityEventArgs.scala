package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemVisualInteractivity event.
  */
@js.native
trait ASPxClientDashboardItemVisualInteractivityEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
  /**
    * Enables highlighting for the current dashboard item.
    * @param enableHighlighting true, to enable highlighting; otherwise, false.
    */
  def EnableHighlighting(enableHighlighting: Boolean): Unit = js.native
  /**
    * Gets the default selection for the current dashboard item.
    */
  def GetDefaultSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  /**
    * Gets the selection mode for dashboard item elements.
    */
  def GetSelectionMode(): String = js.native
  /**
    * Gets data axes used to perform custom interactivity actions.
    */
  def GetTargetAxes(): js.Array[String] = js.native
  /**
    * Returns whether highlighting is enabled for the current dashboard item.
    */
  def IsHighlightingEnabled(): Boolean = js.native
  /**
    * Sets the default selection for the current dashboard item.
    * @param values An array of ASPxClientDashboardItemDataAxisPointTuple objects specifying axis point tuples used to select default elements.
    */
  def SetDefaultSelection(values: js.Array[ASPxClientDashboardItemDataAxisPointTuple]): Unit = js.native
  /**
    * Sets the selection mode for dashboard item elements.
    * @param selectionMode A DashboardSelectionMode value that specifies the selection mode.
    */
  def SetSelectionMode(selectionMode: String): Unit = js.native
  /**
    * Sets data axes used to perform custom interactivity actions.
    * @param targetAxes An array of String objects that specify names of data axes.
    */
  def SetTargetAxes(targetAxes: js.Array[String]): Unit = js.native
}

object ASPxClientDashboardItemVisualInteractivityEventArgs {
  @scala.inline
  def apply(
    EnableHighlighting: Boolean => Unit,
    GetDefaultSelection: () => js.Array[ASPxClientDashboardItemDataAxisPointTuple],
    GetSelectionMode: () => String,
    GetTargetAxes: () => js.Array[String],
    IsHighlightingEnabled: () => Boolean,
    ItemName: String,
    SetDefaultSelection: js.Array[ASPxClientDashboardItemDataAxisPointTuple] => Unit,
    SetSelectionMode: String => Unit,
    SetTargetAxes: js.Array[String] => Unit
  ): ASPxClientDashboardItemVisualInteractivityEventArgs = {
    val __obj = js.Dynamic.literal(EnableHighlighting = js.Any.fromFunction1(EnableHighlighting), GetDefaultSelection = js.Any.fromFunction0(GetDefaultSelection), GetSelectionMode = js.Any.fromFunction0(GetSelectionMode), GetTargetAxes = js.Any.fromFunction0(GetTargetAxes), IsHighlightingEnabled = js.Any.fromFunction0(IsHighlightingEnabled), ItemName = ItemName.asInstanceOf[js.Any], SetDefaultSelection = js.Any.fromFunction1(SetDefaultSelection), SetSelectionMode = js.Any.fromFunction1(SetSelectionMode), SetTargetAxes = js.Any.fromFunction1(SetTargetAxes))
    __obj.asInstanceOf[ASPxClientDashboardItemVisualInteractivityEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardItemVisualInteractivityEventArgsOps[Self <: ASPxClientDashboardItemVisualInteractivityEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableHighlighting(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableHighlighting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefaultSelection(value: () => js.Array[ASPxClientDashboardItemDataAxisPointTuple]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectionMode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSelectionMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTargetAxes(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTargetAxes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsHighlightingEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHighlightingEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDefaultSelection(value: js.Array[ASPxClientDashboardItemDataAxisPointTuple] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDefaultSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelectionMode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSelectionMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTargetAxes(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetTargetAxes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

