package typingsSlinky.agGrid

import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridPanelMod.GridPanel
import typingsSlinky.agGrid.headerRootCompMod.HeaderRootComp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/autoWidthCalculator", JSImport.Namespace)
@js.native
object autoWidthCalculatorMod extends js.Object {
  @js.native
  class AutoWidthCalculator () extends js.Object {
    var gridOptionsWrapper: js.Any = js.native
    var gridPanel: js.Any = js.native
    var headerRootComp: js.Any = js.native
    var rowRenderer: js.Any = js.native
    /* private */ def cloneItemIntoDummy(eCell: js.Any, eDummyContainer: js.Any): js.Any = js.native
    /* private */ def getHeaderCellForColumn(column: js.Any): js.Any = js.native
    def getPreferredWidthForColumn(column: Column): Double = js.native
    /* private */ def putRowCellsIntoDummyContainer(column: js.Any, eDummyContainer: js.Any): js.Any = js.native
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    def registerHeaderRootComp(headerRootComp: HeaderRootComp): Unit = js.native
  }
  
}

