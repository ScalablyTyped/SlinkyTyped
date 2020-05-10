package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellData extends js.Object {
  /**
    * A data validation rule on the cell, if any.
    *
    * When writing, the new data validation rule will overwrite any prior rule.
    */
  var dataValidation: js.UndefOr[DataValidationRule] = js.native
  /**
    * The effective format being used by the cell.
    * This includes the results of applying any conditional formatting and,
    * if the cell contains a formula, the computed number format.
    * If the effective format is the default format, effective format will
    * not be written.
    * This field is read-only.
    */
  var effectiveFormat: js.UndefOr[CellFormat] = js.native
  /**
    * The effective value of the cell. For cells with formulas, this is
    * the calculated value.  For cells with literals, this is
    * the same as the user_entered_value.
    * This field is read-only.
    */
  var effectiveValue: js.UndefOr[ExtendedValue] = js.native
  /**
    * The formatted value of the cell.
    * This is the value as it's shown to the user.
    * This field is read-only.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /**
    * A hyperlink this cell points to, if any.
    * This field is read-only.  (To set it, use a `=HYPERLINK` formula
    * in the userEnteredValue.formulaValue
    * field.)
    */
  var hyperlink: js.UndefOr[String] = js.native
  /** Any note on the cell. */
  var note: js.UndefOr[String] = js.native
  /**
    * A pivot table anchored at this cell. The size of pivot table itself
    * is computed dynamically based on its data, grouping, filters, values,
    * etc. Only the top-left cell of the pivot table contains the pivot table
    * definition. The other cells will contain the calculated values of the
    * results of the pivot in their effective_value fields.
    */
  var pivotTable: js.UndefOr[PivotTable] = js.native
  /**
    * Runs of rich text applied to subsections of the cell.  Runs are only valid
    * on user entered strings, not formulas, bools, or numbers.
    * Runs start at specific indexes in the text and continue until the next
    * run. Properties of a run will continue unless explicitly changed
    * in a subsequent run (and properties of the first run will continue
    * the properties of the cell unless explicitly changed).
    *
    * When writing, the new runs will overwrite any prior runs.  When writing a
    * new user_entered_value, previous runs are erased.
    */
  var textFormatRuns: js.UndefOr[js.Array[TextFormatRun]] = js.native
  /**
    * The format the user entered for the cell.
    *
    * When writing, the new format will be merged with the existing format.
    */
  var userEnteredFormat: js.UndefOr[CellFormat] = js.native
  /**
    * The value the user entered in the cell. e.g, `1234`, `'Hello'`, or `=NOW()`
    * Note: Dates, Times and DateTimes are represented as doubles in
    * serial number format.
    */
  var userEnteredValue: js.UndefOr[ExtendedValue] = js.native
}

object CellData {
  @scala.inline
  def apply(): CellData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellData]
  }
  @scala.inline
  implicit class CellDataOps[Self <: CellData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataValidation(value: DataValidationRule): Self = {
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
    def withEffectiveFormat(value: CellFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveValue(value: ExtendedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotTable(value: PivotTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTable")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormatRuns(value: js.Array[TextFormatRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormatRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFormatRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormatRuns")(js.undefined)
        ret
    }
    @scala.inline
    def withUserEnteredFormat(value: CellFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEnteredFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEnteredFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEnteredFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withUserEnteredValue(value: ExtendedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEnteredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEnteredValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEnteredValue")(js.undefined)
        ret
    }
  }
  
}

