package typingsSlinky.blueprintjsTable.tableBodyMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.mod.AbstractComponent2
import typingsSlinky.blueprintjsTable.anon.Loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
@js.native
class TableBody ()
  extends AbstractComponent2[ITableBodyProps, js.Object, js.Object] {
  
  var activationCell: js.Any = js.native
  
  var handleSelectionEnd: js.Any = js.native
  
  var locateClick: js.Any = js.native
  
  var locateDrag: js.Any = js.native
  
  def renderContextMenu(e: SyntheticMouseEvent[HTMLElement]): ReactElement = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTableBody(nextProps: ITableBodyProps): Boolean = js.native
}
/* static members */
@JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
@js.native
object TableBody extends js.Object {
  
  def cellClassNames(rowIndex: Double, columnIndex: Double): js.Array[String] = js.native
  
  var defaultProps: Loading = js.native
}
