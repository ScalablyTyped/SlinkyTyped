package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<exceljs.exceljs.TableProperties> */
@js.native
trait Table extends js.Object {
  var columns: js.Array[TableColumnProperties] = js.native
  var displayName: String = js.native
  var headerRow: Boolean = js.native
  var name: String = js.native
  var ref: String = js.native
  var rows: js.Array[js.Array[_]] = js.native
  var style: TableStyleProperties = js.native
  var totalsRow: Boolean = js.native
  /**
  	 * Add a new column, including column defn and values
  	 * inserts at colNumber or adds to the right
  	 */
  def addColumn(column: TableColumnProperties, values: js.Array[_], colIndex: Double): Unit = js.native
  /**
  	 * Add a row of data, either insert at rowNumber or append
  	 */
  def addRow(values: js.Array[_], rowNumber: Double): Unit = js.native
  /**
  	 * Commit changes
  	 */
  def commit(): Unit = js.native
  /**
  	 * Get column
  	 */
  def getColumn(colIndex: Double): TableColumn = js.native
  /**
  	 * Remove a column with data
  	 */
  def removeColumns(colIndex: Double, count: Double): Unit = js.native
  /**
  	 * Remove a rows of data
  	 */
  def removeRows(rowIndex: Double, count: Double): Unit = js.native
}

object Table {
  @scala.inline
  def apply(
    addColumn: (TableColumnProperties, js.Array[_], Double) => Unit,
    addRow: (js.Array[_], Double) => Unit,
    columns: js.Array[TableColumnProperties],
    commit: () => Unit,
    displayName: String,
    getColumn: Double => TableColumn,
    headerRow: Boolean,
    name: String,
    ref: String,
    removeColumns: (Double, Double) => Unit,
    removeRows: (Double, Double) => Unit,
    rows: js.Array[js.Array[_]],
    style: TableStyleProperties,
    totalsRow: Boolean
  ): Table = {
    val __obj = js.Dynamic.literal(addColumn = js.Any.fromFunction3(addColumn), addRow = js.Any.fromFunction2(addRow), columns = columns.asInstanceOf[js.Any], commit = js.Any.fromFunction0(commit), displayName = displayName.asInstanceOf[js.Any], getColumn = js.Any.fromFunction1(getColumn), headerRow = headerRow.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], removeColumns = js.Any.fromFunction2(removeColumns), removeRows = js.Any.fromFunction2(removeRows), rows = rows.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], totalsRow = totalsRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddColumn(value: (TableColumnProperties, js.Array[_], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColumn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddRow(value: (js.Array[_], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[TableColumnProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColumn(value: Double => TableColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveColumns(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeColumns")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveRows(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRows")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: TableStyleProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalsRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

