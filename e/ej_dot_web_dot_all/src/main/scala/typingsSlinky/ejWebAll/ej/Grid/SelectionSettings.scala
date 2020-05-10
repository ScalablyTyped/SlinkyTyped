package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionSettings extends js.Object {
  /** Gets or sets a value that indicates whether to select multiple rows or cells by performing dragging in Grid.
    * @Default {false}
    */
  var allowDragSelection: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates the cell selection actions based on the cell selection mode.
    * @Default {ej.Grid.CellSelectionMode.Flow}
    */
  var cellSelectionMode: js.UndefOr[CellSelectionMode | String] = js.native
  /** Gets or sets a value that indicates whether to enable the toggle selection behavior for row, cell and column.
    * @Default {false}
    */
  var enableToggle: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to add the default selection actions as a selection mode.See selectionMode
    * @Default {[row]}
    */
  var selectionMode: js.UndefOr[js.Array[_]] = js.native
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
    def withAllowDragSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelectionMode(value: CellSelectionMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: js.Array[_]): Self = {
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
  }
  
}

