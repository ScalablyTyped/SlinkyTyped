package typingsSlinky.agGrid.colDefMod

import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueGetterParams extends BaseColDefParams {
  def getValue(field: String): js.Any
}

object ValueGetterParams {
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    getValue: String => js.Any,
    node: RowNode
  ): ValueGetterParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getValue = js.Any.fromFunction1(getValue), node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValueGetterParams]
  }
}

