package typingsSlinky.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleStyleElements[T] extends js.Object {
  var Cell: js.UndefOr[T] = js.native
  var Filter: js.UndefOr[T] = js.native
  var Layout: js.UndefOr[T] = js.native
  var Loading: js.UndefOr[T] = js.native
  var NextButton: js.UndefOr[T] = js.native
  var NoResults: js.UndefOr[T] = js.native
  var PageDropdown: js.UndefOr[T] = js.native
  var Pagination: js.UndefOr[T] = js.native
  var PreviousButton: js.UndefOr[T] = js.native
  var Row: js.UndefOr[T] = js.native
  var RowDefinition: js.UndefOr[T] = js.native
  var Settings: js.UndefOr[T] = js.native
  var SettingsToggle: js.UndefOr[T] = js.native
  var Table: js.UndefOr[T] = js.native
  var TableBody: js.UndefOr[T] = js.native
  var TableHeading: js.UndefOr[T] = js.native
  var TableHeadingCell: js.UndefOr[T] = js.native
  var TableHeadingCellAscending: js.UndefOr[T] = js.native
  var TableHeadingCellDescending: js.UndefOr[T] = js.native
}

object GriddleStyleElements {
  @scala.inline
  def apply[T](): GriddleStyleElements[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleStyleElements[T]]
  }
  @scala.inline
  implicit class GriddleStyleElementsOps[Self[t] <: GriddleStyleElements[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCell(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Loading")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButton(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButton: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResults(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResults: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResults")(js.undefined)
        ret
    }
    @scala.inline
    def withPageDropdown(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageDropdown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousButton(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousButton: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Row")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDefinition(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDefinition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsToggle(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsToggle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBody(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBody: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeading(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeading: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingCell(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeadingCell: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCell")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingCellAscending(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCellAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeadingCellAscending: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCellAscending")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingCellDescending(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCellDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeadingCellDescending: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCellDescending")(js.undefined)
        ret
    }
  }
  
}

