package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeAreas.toJSON()`. */
@js.native
trait RangeAreasData extends js.Object {
  /**
    *
    * Returns the RageAreas reference in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g. "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[String] = js.native
  /**
    *
    * Returns the RageAreas reference in the user locale. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[String] = js.native
  /**
    *
    * Returns the number of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var areaCount: js.UndefOr[Double] = js.native
  /**
    *
    * Returns a collection of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var areas: js.UndefOr[js.Array[RangeData]] = js.native
  /**
    *
    * Returns the number of cells in the RangeAreas object, summing up the cell counts of all of the individual rectangular ranges. Returns -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var cellCount: js.UndefOr[Double] = js.native
  /**
    *
    * Returns a collection of ConditionalFormats that intersect with any cells in this RangeAreas object. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatData]] = js.native
  /**
    *
    * Returns a dataValidation object for all ranges in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dataValidation: js.UndefOr[DataValidationData] = js.native
  /**
    *
    * Returns a rangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[RangeFormatData] = js.native
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
  var style: js.UndefOr[String] = js.native
}

object RangeAreasData {
  @scala.inline
  def apply(): RangeAreasData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeAreasData]
  }
  @scala.inline
  implicit class RangeAreasDataOps[Self <: RangeAreasData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
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
    def withAddressLocal(value: String): Self = {
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
    def withAreaCount(value: Double): Self = {
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
    def withAreas(value: js.Array[RangeData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areas")(js.undefined)
        ret
    }
    @scala.inline
    def withCellCount(value: Double): Self = {
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
    def withConditionalFormats(value: js.Array[ConditionalFormatData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withDataValidation(value: DataValidationData): Self = {
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
    def withFormat(value: RangeFormatData): Self = {
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
    def withStyle(value: String): Self = {
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
  }
  
}

