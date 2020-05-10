package typingsSlinky.agGrid.colDefMod

import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQuickFilterTextParams extends js.Object {
  var colDef: ColDef = js.native
  var column: Column = js.native
  var data: js.Any = js.native
  var node: RowNode = js.native
  var value: js.Any = js.native
}

object GetQuickFilterTextParams {
  @scala.inline
  def apply(colDef: ColDef, column: Column, data: js.Any, node: RowNode, value: js.Any): GetQuickFilterTextParams = {
    val __obj = js.Dynamic.literal(colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQuickFilterTextParams]
  }
  @scala.inline
  implicit class GetQuickFilterTextParamsOps[Self <: GetQuickFilterTextParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

