package typingsSlinky.agGrid.colDefMod

import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var api: GridApi = js.native
  var colDef: ColDef = js.native
  var context: js.Any = js.native
  var data: js.Any = js.native
  var node: RowNode = js.native
  var rowIndex: Double = js.native
  var value: js.Any = js.native
  var valueFormatted: js.Any = js.native
}

object TooltipParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    api: GridApi,
    colDef: ColDef,
    context: js.Any,
    data: js.Any,
    node: RowNode,
    rowIndex: Double,
    value: js.Any,
    valueFormatted: js.Any
  ): TooltipParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueFormatted = valueFormatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipParams]
  }
  @scala.inline
  implicit class TooltipParamsOps[Self <: TooltipParams] (val x: Self) extends AnyVal {
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
    def withNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
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

