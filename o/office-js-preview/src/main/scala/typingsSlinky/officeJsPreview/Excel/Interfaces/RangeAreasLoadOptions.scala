package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * RangeAreas represents a collection of one or more rectangular ranges in the same worksheet.
  To learn how to use discontinguous ranges, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-multiple-ranges | Work with multiple ranges simultaneously in Excel add-ins}.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait RangeAreasLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the RageAreas reference in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g. "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the RageAreas reference in the user locale. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the number of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var areaCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the number of cells in the RangeAreas object, summing up the cell counts of all of the individual rectangular ranges. Returns -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var cellCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns a dataValidation object for all ranges in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dataValidation: js.UndefOr[DataValidationLoadOptions] = js.native
  /**
    *
    * Returns a rangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[RangeFormatLoadOptions] = js.native
  /**
    *
    * Indicates whether all the ranges on this RangeAreas object represent entire columns (e.g., "A:C, Q:Z"). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates whether all the ranges on this RangeAreas object represent entire rows (e.g., "1:3, 5:7"). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the style for all ranges in this RangeAreas object.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the worksheet for the current RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.native
}

object RangeAreasLoadOptions {
  @scala.inline
  def apply(): RangeAreasLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeAreasLoadOptions]
  }
  @scala.inline
  implicit class RangeAreasLoadOptionsOps[Self <: RangeAreasLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressLocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withAreaCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCellCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDataValidation(value: DataValidationLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: RangeFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEntireColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEntireColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEntireColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEntireColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEntireRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEntireRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEntireRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEntireRow")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withWorksheet(value: WorksheetLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheet")(js.undefined)
        ret
    }
  }
  
}

