package typingsSlinky.googleAppsScript.GoogleAppsScript.Charts

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder of DataTable objects. Building a data table consists of first specifying its columns, and
  * then adding its rows, one at a time. Example:
  *
  *     var data = Charts.newDataTable()
  *         .addColumn(Charts.ColumnType.STRING, "Month")
  *         .addColumn(Charts.ColumnType.NUMBER, "In Store")
  *         .addColumn(Charts.ColumnType.NUMBER, "Online")
  *         .addRow(["January", 10, 1])
  *         .addRow(["February", 12, 1])
  *         .addRow(["March", 20, 2])
  *         .addRow(["April", 25, 3])
  *         .addRow(["May", 30, 4])
  *         .build();
  */
@js.native
trait DataTableBuilder extends js.Object {
  def addColumn(`type`: ColumnType, label: String): DataTableBuilder = js.native
  def addRow(values: js.Array[_]): DataTableBuilder = js.native
  def build(): DataTable = js.native
  def setValue(row: Integer, column: Integer, value: js.Any): DataTableBuilder = js.native
}

object DataTableBuilder {
  @scala.inline
  def apply(
    addColumn: (ColumnType, String) => DataTableBuilder,
    addRow: js.Array[_] => DataTableBuilder,
    build: () => DataTable,
    setValue: (Integer, Integer, js.Any) => DataTableBuilder
  ): DataTableBuilder = {
    val __obj = js.Dynamic.literal(addColumn = js.Any.fromFunction2(addColumn), addRow = js.Any.fromFunction1(addRow), build = js.Any.fromFunction0(build), setValue = js.Any.fromFunction3(setValue))
    __obj.asInstanceOf[DataTableBuilder]
  }
  @scala.inline
  implicit class DataTableBuilderOps[Self <: DataTableBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddColumn(value: (ColumnType, String) => DataTableBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddRow(value: js.Array[_] => DataTableBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuild(value: () => DataTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetValue(value: (Integer, Integer, js.Any) => DataTableBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

