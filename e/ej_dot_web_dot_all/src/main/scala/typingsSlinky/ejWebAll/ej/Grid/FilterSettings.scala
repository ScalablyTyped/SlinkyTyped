package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSettings extends js.Object {
  /** Gets or sets a value that indicates to perform the filter operation with case sensitive in excel styled filter menu mode
    * @Default {false}
    */
  var enableCaseSensitivity: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to define the interDeterminateState of checkbox in excel filter dialog.
    * @Default {true}
    */
  var enableInterDeterminateState: js.UndefOr[Boolean] = js.native
  /** This specifies the grid to starts the filter action while typing in the filterBar or after pressing the enter key. based on the filterBarMode. See filterBarMode.
    * @Default {ej.Grid.FilterBarMode.Immediate}
    */
  var filterBarMode: js.UndefOr[FilterBarMode | String] = js.native
  /** This specifies the grid to show the filterBar or filterMenu to the grid records. See filterType
    * @Default {ej.Grid.FilterType.FilterBar}
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  /** Gets or sets a value that indicates whether to define the filtered columns details programmatically at initial load
    * @Default {[]}
    */
  var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.native
  /** This specifies the grid to delay the filter action while typing in the filterBar.
    * @Default {1500}
    */
  var immediateModeDelay: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates the maximum number of filter choices that can be showed in the excel styled filter menu.
    * @Default {1000}
    */
  var maxFilterChoices: js.UndefOr[Double] = js.native
  /** This specifies the grid to show the filter text within the grid pager itself.
    * @Default {true}
    */
  var showFilterBarStatus: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the predicate options in the filtering menu
    * @Default {false}
    */
  var showPredicate: js.UndefOr[Boolean] = js.native
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
    def withEnableInterDeterminateState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableInterDeterminateState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableInterDeterminateState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableInterDeterminateState")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBarMode(value: FilterBarMode | String): Self = {
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
    def withImmediateModeDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateModeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediateModeDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateModeDelay")(js.undefined)
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
    @scala.inline
    def withShowFilterBarStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilterBarStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFilterBarStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilterBarStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPredicate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPredicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPredicate")(js.undefined)
        ret
    }
  }
  
}

