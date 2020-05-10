package typingsSlinky.agGrid.iCellRendererMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellRendererParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var api: GridApi = js.native
  var colDef: ColDef = js.native
  var column: Column = js.native
  var columnApi: ColumnApi = js.native
  var context: js.Any = js.native
  var data: js.Any = js.native
  var eGridCell: HTMLElement = js.native
  var eParentOfValue: HTMLElement = js.native
  var node: RowNode = js.native
  var rowIndex: Double = js.native
  var value: js.Any = js.native
  var valueFormatted: js.Any = js.native
  def addRenderedRowListener(eventType: String, listener: js.Function): Unit = js.native
  def formatValue(value: js.Any): js.Any = js.native
  def getValue(): js.Any = js.native
  def refreshCell(): Unit = js.native
  def setValue(value: js.Any): Unit = js.native
}

object ICellRendererParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    addRenderedRowListener: (String, js.Function) => Unit,
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    eGridCell: HTMLElement,
    eParentOfValue: HTMLElement,
    formatValue: js.Any => js.Any,
    getValue: () => js.Any,
    node: RowNode,
    refreshCell: () => Unit,
    rowIndex: Double,
    setValue: js.Any => Unit,
    value: js.Any,
    valueFormatted: js.Any
  ): ICellRendererParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eGridCell = eGridCell.asInstanceOf[js.Any], eParentOfValue = eParentOfValue.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), getValue = js.Any.fromFunction0(getValue), node = node.asInstanceOf[js.Any], refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue), value = value.asInstanceOf[js.Any], valueFormatted = valueFormatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellRendererParams]
  }
  @scala.inline
  implicit class ICellRendererParamsOps[Self <: ICellRendererParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$scope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddRenderedRowListener(value: (String, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRenderedRowListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withApi(value: GridApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColDef(value: ColDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnApi(value: ColumnApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEGridCell(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eGridCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEParentOfValue(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eParentOfValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatValue(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshCell(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueFormatted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

