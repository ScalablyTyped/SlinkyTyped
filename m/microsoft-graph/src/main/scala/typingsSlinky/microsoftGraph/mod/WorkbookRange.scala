package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookRange extends Entity {
  /**
    * Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. Sheet1!A1:B4).
    * Read-only.
    */
  var address: js.UndefOr[String] = js.native
  // Represents range reference for the specified range in the language of the user. Read-only.
  var addressLocal: js.UndefOr[String] = js.native
  // Number of cells in the range. Read-only.
  var cellCount: js.UndefOr[Double] = js.native
  // Represents the total number of columns in the range. Read-only.
  var columnCount: js.UndefOr[Double] = js.native
  // Represents if all columns of the current range are hidden.
  var columnHidden: js.UndefOr[Boolean] = js.native
  // Represents the column number of the first cell in the range. Zero-indexed. Read-only.
  var columnIndex: js.UndefOr[Double] = js.native
  // Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
  var format: js.UndefOr[WorkbookRangeFormat] = js.native
  // Represents the formula in A1-style notation.
  var formulas: js.UndefOr[js.Any] = js.native
  /**
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the
    * English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
    */
  var formulasLocal: js.UndefOr[js.Any] = js.native
  // Represents the formula in R1C1-style notation.
  var formulasR1C1: js.UndefOr[js.Any] = js.native
  // Represents if all cells of the current range are hidden. Read-only.
  var hidden: js.UndefOr[Boolean] = js.native
  // Represents Excel's number format code for the given cell.
  var numberFormat: js.UndefOr[js.Any] = js.native
  // Returns the total number of rows in the range. Read-only.
  var rowCount: js.UndefOr[Double] = js.native
  // Represents if all rows of the current range are hidden.
  var rowHidden: js.UndefOr[Boolean] = js.native
  // Returns the row number of the first cell in the range. Zero-indexed. Read-only.
  var rowIndex: js.UndefOr[Double] = js.native
  // The worksheet containing the current range. Read-only.
  var sort: js.UndefOr[WorkbookRangeSort] = js.native
  /**
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that
    * happens in Excel UI will not affect the text value returned by the API. Read-only.
    */
  var text: js.UndefOr[js.Any] = js.native
  /**
    * Represents the type of data of each cell. The possible values are: Unknown, Empty, String, Integer, Double, Boolean,
    * Error. Read-only.
    */
  var valueTypes: js.UndefOr[js.Any] = js.native
  /**
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell
    * that contain an error will return the error string.
    */
  var values: js.UndefOr[js.Any] = js.native
  // The worksheet containing the current range. Read-only.
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.native
}

object WorkbookRange {
  @scala.inline
  def apply(): WorkbookRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRange]
  }
  @scala.inline
  implicit class WorkbookRangeOps[Self <: WorkbookRange] (val x: Self) extends AnyVal {
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
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: WorkbookRangeFormat): Self = {
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
    def withFormulas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulas")(js.undefined)
        ret
    }
    @scala.inline
    def withFormulasLocal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulasLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulasLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulasLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withFormulasR1C1(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulasR1C1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulasR1C1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulasR1C1")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: WorkbookRangeSort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withValueTypes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withWorksheet(value: WorkbookWorksheet): Self = {
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

