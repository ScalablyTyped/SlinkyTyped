package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for how to set the data in a binding.
  *
  * @remarks
  * 
  * If the rows option is used, the value must be "thisRow".
  */
@js.native
trait SetBindingDataOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * Use only with binding type table and when a TableData object is passed for the data parameter. An array of objects that specify a range of 
    * columns, rows, or cells and specify, as key-value pairs, the cell formatting to apply to that range. 
    * 
    * Example: `[{cells: Office.Table.Data, format: {fontColor: "yellow"}}, {cells: {row: 3, column: 4}, format: {borderColor: "white", fontStyle: "bold"}}]`
    */
  var cellFormat: js.UndefOr[js.Array[RangeFormatConfiguration]] = js.native
  /**
    * Explicitly sets the shape of the data object. If not supplied is inferred from the data type.
    */
  var coercionType: js.UndefOr[CoercionType | String] = js.native
  /**
    * Only for table bindings in content add-ins for Access. Array of strings. Specifies the column names.
    * 
    * **Important**: We no longer recommend that you create and use Access web apps and databases in SharePoint.
    * As an alternative, we recommend that you use {@link https://powerapps.microsoft.com/ | Microsoft PowerApps}
    * to build no-code business solutions for web and mobile devices.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only for table bindings in content add-ins for Access. Specifies the pre-defined string "thisRow" to get data in the currently selected row.
    * 
    * **Important**: We no longer recommend that you create and use Access web apps and databases in SharePoint.
    * As an alternative, we recommend that you use {@link https://powerapps.microsoft.com/ | Microsoft PowerApps}
    * to build no-code business solutions for web and mobile devices.
    */
  var rows: js.UndefOr[String] = js.native
  /**
    * Specifies the zero-based starting column for a subset of the data. Only for table or matrix bindings. If omitted, data is set starting in 
    * the first column.
    */
  var startColumn: js.UndefOr[Double] = js.native
  /**
    * Specifies the zero-based starting row for a subset of the data in the binding. Only for table or matrix bindings. If omitted, data is set 
    * starting in the first row.
    */
  var startRow: js.UndefOr[Double] = js.native
  /**
    * For an inserted table, a list of key-value pairs that specify table formatting options, such as header row, total row, and banded rows. 
    * Example: `{bandedRows: true,  filterButton: false}`
    */
  var tableOptions: js.UndefOr[js.Object] = js.native
}

object SetBindingDataOptions {
  @scala.inline
  def apply(): SetBindingDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBindingDataOptions]
  }
  @scala.inline
  implicit class SetBindingDataOptionsOps[Self <: SetBindingDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncContext")(js.undefined)
        ret
    }
    @scala.inline
    def withCellFormat(value: js.Array[RangeFormatConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCoercionType(value: CoercionType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoercionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercionType")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: String): Self = {
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
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(js.undefined)
        ret
    }
    @scala.inline
    def withTableOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOptions")(js.undefined)
        ret
    }
  }
  
}

