package typingsSlinky.agGrid.componentResolverMod

import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicComponentParams extends js.Object {
  @JSName("$scope")
  var $scope: js.UndefOr[js.Any] = js.native
  var api: GridApi = js.native
  var colDef: js.UndefOr[ColDef] = js.native
  var column: js.UndefOr[Column] = js.native
  var columnApi: ColumnApi = js.native
  var data: js.UndefOr[js.Any] = js.native
  var node: js.UndefOr[RowNode] = js.native
  var rowIndex: js.UndefOr[Double] = js.native
}

