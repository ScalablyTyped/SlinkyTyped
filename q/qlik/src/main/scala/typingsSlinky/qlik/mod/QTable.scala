package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QTable extends js.Object {
  var colCount: Double = js.native
  var headers: js.Array[QHeader] = js.native
  var rowCount: Double = js.native
  var rows: js.Array[QRow] = js.native
  var totals: js.Array[QMeasureCell] = js.native
  def exportData(options: ExportDataOptions, callback: js.Function1[/* url */ String, Unit]): Unit = js.native
  def getColByName(fld: String): js.UndefOr[Double] = js.native
  def getMoreData(): Unit = js.native
}

object QTable {
  @scala.inline
  def apply(
    colCount: Double,
    exportData: (ExportDataOptions, js.Function1[/* url */ String, Unit]) => Unit,
    getColByName: String => js.UndefOr[Double],
    getMoreData: () => Unit,
    headers: js.Array[QHeader],
    rowCount: Double,
    rows: js.Array[QRow],
    totals: js.Array[QMeasureCell]
  ): QTable = {
    val __obj = js.Dynamic.literal(colCount = colCount.asInstanceOf[js.Any], exportData = js.Any.fromFunction2(exportData), getColByName = js.Any.fromFunction1(getColByName), getMoreData = js.Any.fromFunction0(getMoreData), headers = headers.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], totals = totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[QTable]
  }
  @scala.inline
  implicit class QTableOps[Self <: QTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportData(value: (ExportDataOptions, js.Function1[/* url */ String, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetColByName(value: String => js.UndefOr[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMoreData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMoreData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[QHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[QRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotals(value: js.Array[QMeasureCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

