package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookWorksheetProtectionOptions extends js.Object {
  // Represents the worksheet protection option of allowing using auto filter feature.
  var allowAutoFilter: js.UndefOr[Boolean] = js.native
  // Represents the worksheet protection option of allowing deleting columns.
  var allowDeleteColumns: js.UndefOr[Boolean] = js.native
  // Represents the worksheet protection option of allowing deleting rows.
  var allowDeleteRows: js.UndefOr[Boolean] = js.native
  // Represents the worksheet protection option of allowing formatting cells.
  var allowFormatCells: js.UndefOr[Boolean] = js.native
  // Represents the worksheet protection option of allowing formatting columns.
  var allowFormatColumns: js.UndefOr[Boolean] = js.native
  // Represents the worksheet protection option of allowing formatting rows.
  var allowFormatRows: js.UndefOr[Boolean] = js.native
  // Represents the worksheet protection option of allowing inserting columns.
  var allowInsertColumns: js.UndefOr[Boolean] = js.native
  // Represents the worksheet protection option of allowing inserting hyperlinks.
  var allowInsertHyperlinks: js.UndefOr[Boolean] = js.native
  // Represents the worksheet protection option of allowing inserting rows.
  var allowInsertRows: js.UndefOr[Boolean] = js.native
  // Represents the worksheet protection option of allowing using pivot table feature.
  var allowPivotTables: js.UndefOr[Boolean] = js.native
  // Represents the worksheet protection option of allowing using sort feature.
  var allowSort: js.UndefOr[Boolean] = js.native
}

object WorkbookWorksheetProtectionOptions {
  @scala.inline
  def apply(): WorkbookWorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookWorksheetProtectionOptions]
  }
  @scala.inline
  implicit class WorkbookWorksheetProtectionOptionsOps[Self <: WorkbookWorksheetProtectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAutoFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutoFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAutoFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutoFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeleteColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleteColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeleteRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleteRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteRows")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFormatCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormatCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFormatCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormatCells")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFormatColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormatColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFormatColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormatColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFormatRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormatRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFormatRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormatRows")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInsertColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsertColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInsertHyperlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertHyperlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsertHyperlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertHyperlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInsertRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsertRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertRows")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPivotTables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPivotTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPivotTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPivotTables")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSort")(js.undefined)
        ret
    }
  }
  
}

