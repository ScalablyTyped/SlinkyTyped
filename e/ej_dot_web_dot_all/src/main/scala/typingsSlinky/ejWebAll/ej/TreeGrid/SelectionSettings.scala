package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionSettings extends js.Object {
  /** Enables or disables the selection by hierarchy in check box selection
    * @Default {true}
    */
  var enableHierarchySelection: js.UndefOr[Boolean] = js.native
  /** Toggles the visibility of the checkbox in column header, using which all the check boxes can be selected or unselected.
    * @Default {true}
    */
  var enableSelectAll: js.UndefOr[Boolean] = js.native
  /** Specifies the type of selection whether to select row or cell.
    * @Default {ej.TreeGrid.SelectionMode.Row}
    */
  var selectionMode: js.UndefOr[SelectionMode | String] = js.native
  /** Specifies the type of selection whether single, multiple or checkbox.
    * @Default {ej.TreeGrid.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.native
}

object SelectionSettings {
  @scala.inline
  def apply(): SelectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionSettings]
  }
  @scala.inline
  implicit class SelectionSettingsOps[Self <: SelectionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableHierarchySelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHierarchySelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHierarchySelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHierarchySelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionType(value: SelectionType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(js.undefined)
        ret
    }
  }
  
}

