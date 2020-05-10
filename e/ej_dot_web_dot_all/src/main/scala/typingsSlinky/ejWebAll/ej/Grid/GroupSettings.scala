package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupSettings extends js.Object {
  /** Gets or sets a value that customize the group caption format.
    * @Default {null}
    */
  var captionFormat: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to enable animation button option in the group drop area of the grid.
    * @Default {false}
    */
  var enableDropAreaAutoSizing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to add grouped columns programmatically at initial load
    * @Default {[]}
    */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to show the group drop area just above the column header. It can be used to avoid ungrouping the already grouped column using
    * groupSettings.
    * @Default {true}
    */
  var showDropArea: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to hide the grouped columns from the grid
    * @Default {false}
    */
  var showGroupedColumn: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to show the group button image(toggle button)in the column header and also in the grouped column in the group drop area . It can be
    * used to group/ungroup the columns by click on the toggle button.
    * @Default {false}
    */
  var showToggleButton: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the close button in the grouped column which is in the group drop area to ungroup the grouped column
    * @Default {false}
    */
  var showUngroupButton: js.UndefOr[Boolean] = js.native
}

object GroupSettings {
  @scala.inline
  def apply(): GroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSettings]
  }
  @scala.inline
  implicit class GroupSettingsOps[Self <: GroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptionFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDropAreaAutoSizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDropAreaAutoSizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDropAreaAutoSizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDropAreaAutoSizing")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedColumns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGroupedColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGroupedColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupedColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToggleButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToggleButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToggleButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToggleButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowUngroupButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUngroupButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowUngroupButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUngroupButton")(js.undefined)
        ret
    }
  }
  
}

