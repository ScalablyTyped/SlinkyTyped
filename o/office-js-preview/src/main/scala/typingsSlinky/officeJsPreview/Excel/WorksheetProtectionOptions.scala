package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Normal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the options in sheet protection.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait WorksheetProtectionOptions extends js.Object {
  /**
    *
    * Represents the worksheet protection option of allowing using auto filter feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowAutoFilter: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing deleting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteColumns: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing deleting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteRows: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing editing objects.
    *
    * [Api set: ExcelApi 1.7]
    */
  var allowEditObjects: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing editing scenarios.
    *
    * [Api set: ExcelApi 1.7]
    */
  var allowEditScenarios: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing formatting cells.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatCells: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing formatting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatColumns: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing formatting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatRows: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing inserting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertColumns: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing inserting hyperlinks.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertHyperlinks: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing inserting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertRows: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing using PivotTable feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowPivotTables: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of allowing using sort feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowSort: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the worksheet protection option of selection mode.
    *
    * [Api set: ExcelApi 1.7]
    */
  var selectionMode: js.UndefOr[ProtectionSelectionMode | Normal | Unlocked | None] = js.native
}

object WorksheetProtectionOptions {
  @scala.inline
  def apply(): WorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetProtectionOptions]
  }
  @scala.inline
  implicit class WorksheetProtectionOptionsOps[Self <: WorksheetProtectionOptions] (val x: Self) extends AnyVal {
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
    def withAllowEditObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEditScenarios(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditScenarios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditScenarios: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditScenarios")(js.undefined)
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
    @scala.inline
    def withSelectionMode(value: ProtectionSelectionMode | Normal | Unlocked | None): Self = {
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

