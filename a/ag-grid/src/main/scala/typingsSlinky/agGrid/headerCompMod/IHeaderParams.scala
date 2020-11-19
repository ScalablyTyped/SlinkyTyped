package typingsSlinky.agGrid.headerCompMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHeaderParams extends js.Object {
  
  var api: GridApi = js.native
  
  var column: Column = js.native
  
  var columnApi: ColumnApi = js.native
  
  var context: js.Any = js.native
  
  var displayName: String = js.native
  
  var enableMenu: Boolean = js.native
  
  var enableSorting: Boolean = js.native
  
  def progressSort(): Unit = js.native
  def progressSort(multiSort: Boolean): Unit = js.native
  
  def setSort(sort: String): Unit = js.native
  def setSort(sort: String, multiSort: Boolean): Unit = js.native
  
  def showColumnMenu(source: HTMLElement): Unit = js.native
  
  var template: String = js.native
}
