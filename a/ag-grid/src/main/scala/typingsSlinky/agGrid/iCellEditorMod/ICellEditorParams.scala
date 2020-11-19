package typingsSlinky.agGrid.iCellEditorMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellEditorParams extends js.Object {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  var api: GridApi = js.native
  
  var cellStartedEdit: Boolean = js.native
  
  var charPress: String = js.native
  
  var column: Column = js.native
  
  var columnApi: ColumnApi = js.native
  
  var context: js.Any = js.native
  
  var eGridCell: HTMLElement = js.native
  
  def formatValue(value: js.Any): js.Any = js.native
  
  var keyPress: Double = js.native
  
  var node: RowNode = js.native
  
  def onKeyDown(event: KeyboardEvent): Unit = js.native
  
  def parseValue(value: js.Any): js.Any = js.native
  
  var rowIndex: Double = js.native
  
  def stopEditing(): Unit = js.native
  def stopEditing(suppressNavigateAfterEdit: Boolean): Unit = js.native
  
  var value: js.Any = js.native
}
