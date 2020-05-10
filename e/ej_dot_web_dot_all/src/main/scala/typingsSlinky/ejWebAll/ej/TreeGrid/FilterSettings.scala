package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSettings extends js.Object {
  /** Gets or sets a value that indicates to perform the filter operation with case sensitive in excel styled filter menu mode.
    * @Default {false}
    */
  var enableCaseSensitivity: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to filter the columns with empty, null and undefined values.
    * @Default {true}
    */
  var enableComplexBlankFilter: js.UndefOr[Boolean] = js.native
  /** Specifies the mode on which column filtering should start
    * @Default {immediate}
    */
  var filterBarMode: js.UndefOr[String] = js.native
  /** Specifies the mode of filtering to filter the record with or without hierarchy.
    * @Default {ej.TreeGrid.FilterHierarchyMode.Parent}
    */
  var filterHierarchyMode: js.UndefOr[FilterHierarchyMode | String] = js.native
  /** Specifies the type of column filtering.
    * @Default {ej.TreeGrid.FilterType.FilterBar}
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  /** Specifies the column collection for filtering the TreeGrid content on initial load
    * @Default {[]}
    */
  var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.native
  /** Gets or sets a value that indicates the maximum number of filter choices that can be showed in the excel styled filter menu.
    * @Default {1000}
    */
  var maxFilterChoices: js.UndefOr[Double] = js.native
}

object FilterSettings {
  @scala.inline
  def apply(): FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSettings]
  }
  @scala.inline
  implicit class FilterSettingsOps[Self <: FilterSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableCaseSensitivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCaseSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCaseSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCaseSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableComplexBlankFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableComplexBlankFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableComplexBlankFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableComplexBlankFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBarMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBarMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterBarMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBarMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterHierarchyMode(value: FilterHierarchyMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHierarchyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterHierarchyMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHierarchyMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: FilterType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredColumns(value: js.Array[FilterSettingsFilteredColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFilterChoices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFilterChoices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFilterChoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFilterChoices")(js.undefined)
        ret
    }
  }
  
}

