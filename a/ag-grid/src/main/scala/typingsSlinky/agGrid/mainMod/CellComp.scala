package typingsSlinky.agGrid.mainMod

import typingsSlinky.agGrid.beansMod.Beans
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "CellComp")
@js.native
class CellComp protected ()
  extends typingsSlinky.agGrid.cellCompMod.CellComp {
  def this(
    scope: js.Any,
    beans: Beans,
    column: typingsSlinky.agGrid.columnMod.Column,
    rowNode: typingsSlinky.agGrid.rowNodeMod.RowNode,
    rowComp: typingsSlinky.agGrid.rowCompMod.RowComp,
    autoHeightCell: Boolean
  ) = this()
}
/* static members */
@JSImport("ag-grid/dist/lib/main", "CellComp")
@js.native
object CellComp extends js.Object {
  
  var DOM_DATA_KEY_CELL_COMP: String = js.native
}
