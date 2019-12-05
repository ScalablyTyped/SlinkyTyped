package typingsSlinky.agDashGrid.agDashGridMod

import typingsSlinky.agDashGrid.distLibRenderingBeansMod.Beans
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "CellComp")
@js.native
class CellComp protected ()
  extends typingsSlinky.agDashGrid.distLibRenderingCellCompMod.CellComp {
  def this(
    scope: js.Any,
    beans: Beans,
    column: typingsSlinky.agDashGrid.distLibEntitiesColumnMod.Column,
    rowNode: typingsSlinky.agDashGrid.distLibEntitiesRowNodeMod.RowNode,
    rowComp: typingsSlinky.agDashGrid.distLibRenderingRowCompMod.RowComp,
    autoHeightCell: Boolean
  ) = this()
}

/* static members */
@JSImport("ag-grid", "CellComp")
@js.native
object CellComp extends js.Object {
  var DOM_DATA_KEY_CELL_COMP: String = js.native
}

