package typingsSlinky.agGrid.mainMod

import typingsSlinky.agGrid.beansMod.Beans
import org.scalablytyped.runtime.StObject
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
object CellComp {
  
  @JSImport("ag-grid/dist/lib/main", "CellComp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "CellComp.DOM_DATA_KEY_CELL_COMP")
  @js.native
  def DOM_DATA_KEY_CELL_COMP: String = js.native
  @scala.inline
  def DOM_DATA_KEY_CELL_COMP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DATA_KEY_CELL_COMP")(x.asInstanceOf[js.Any])
}
