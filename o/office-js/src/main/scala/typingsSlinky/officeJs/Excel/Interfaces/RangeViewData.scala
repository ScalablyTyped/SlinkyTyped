package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.RangeValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeView.toJSON()`. */
@js.native
trait RangeViewData extends js.Object {
  /**
    *
    * Represents the cell addresses of the RangeView. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var cellAddresses: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * Returns the number of visible columns. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var columnCount: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * Returns a value that represents the index of the RangeView. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var index: js.UndefOr[Double] = js.native
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * Returns the number of visible rows. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var rowCount: js.UndefOr[Double] = js.native
  /**
    *
    * Represents a collection of range views associated with the range. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var rows: js.UndefOr[js.Array[RangeViewData]] = js.native
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var text: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    *
    * Represents the type of data of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var valueTypes: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.native
  /**
    *
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object RangeViewData {
  @scala.inline
  def apply(): RangeViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewData]
  }
  @scala.inline
  implicit class RangeViewDataOps[Self <: RangeViewData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellAddresses(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAddresses")(js.undefined)
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
    def withFormulas(value: js.Array[js.Array[_]]): Self = {
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
    def withFormulasLocal(value: js.Array[js.Array[_]]): Self = {
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
    def withFormulasR1C1(value: js.Array[js.Array[_]]): Self = {
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
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormat(value: js.Array[js.Array[_]]): Self = {
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
    def withRows(value: js.Array[RangeViewData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: js.Array[js.Array[String]]): Self = {
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
    def withValueTypes(value: js.Array[js.Array[RangeValueType]]): Self = {
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
    def withValues(value: js.Array[js.Array[_]]): Self = {
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
  }
  
}

