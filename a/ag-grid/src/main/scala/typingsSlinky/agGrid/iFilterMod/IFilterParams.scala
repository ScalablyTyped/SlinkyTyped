package typingsSlinky.agGrid.iFilterMod

import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.iRowModelMod.IRowModel
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilterParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var applyButton: js.UndefOr[Boolean] = js.native
  var clearButton: js.UndefOr[Boolean] = js.native
  var colDef: ColDef = js.native
  var column: Column = js.native
  var context: js.Any = js.native
  var defaultOption: js.UndefOr[String] = js.native
  var filterOptions: js.UndefOr[js.Array[String]] = js.native
  var newRowsAction: js.UndefOr[String] = js.native
  var rowModel: IRowModel = js.native
  var textFormatter: js.UndefOr[js.Function1[/* from */ String, String]] = js.native
  def doesRowPassOtherFilter(rowNode: RowNode): Boolean = js.native
  def filterChangedCallback(): Unit = js.native
  def filterModifiedCallback(): Unit = js.native
  def valueGetter(rowNode: RowNode): js.Any = js.native
}

