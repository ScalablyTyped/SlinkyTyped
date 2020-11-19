package typingsSlinky.agGrid

import typingsSlinky.agGrid.gridPanelMod.GridPanel
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rendering/autoHeightCalculator", JSImport.Namespace)
@js.native
object autoHeightCalculatorMod extends js.Object {
  
  @js.native
  class AutoHeightCalculator () extends js.Object {
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
    var beans: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var eDummyContainer: js.Any = js.native
    
    def getPreferredHeightForRow(rowNode: RowNode): Double = js.native
    
    var gridPanel: js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
  }
}
