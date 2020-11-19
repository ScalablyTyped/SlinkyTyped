package typingsSlinky.reactTable.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTableCellProps[D /* <: js.Object */, V] extends js.Object {
  
  var column: ColumnInstance[D] = js.native
  
  def getCellProps(): TableCellProps = js.native
  def getCellProps(propGetter: CellPropGetter[D]): TableCellProps = js.native
  
  def render(`type`: String): ReactElement = js.native
  def render(`type`: String, userProps: js.Object): ReactElement = js.native
  @JSName("render")
  def render_Cell(`type`: typingsSlinky.reactTable.reactTableStrings.Cell): ReactElement = js.native
  @JSName("render")
  def render_Cell(`type`: typingsSlinky.reactTable.reactTableStrings.Cell, userProps: js.Object): ReactElement = js.native
  
  var row: Row[D] = js.native
  
  var value: CellValue[V] = js.native
}
