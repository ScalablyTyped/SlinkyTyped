package typingsSlinky.agGrid

import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.gridPanelMod.GridPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/headerRendering/headerRootComp", JSImport.Namespace)
@js.native
object headerRootCompMod extends js.Object {
  
  @js.native
  class HeaderRootComp () extends Component {
    
    /* private */ def addPreventHeaderScroll(): js.Any = js.native
    
    var autoWidthCalculator: js.Any = js.native
    
    var centerContainer: js.Any = js.native
    
    var childContainers: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var context: js.Any = js.native
    
    var eHeaderContainer: js.Any = js.native
    
    var eHeaderViewport: js.Any = js.native
    
    var ePinnedLeftHeader: js.Any = js.native
    
    var ePinnedRightHeader: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    def forEachHeaderElement(callback: js.Function1[/* renderedHeaderElement */ Component, Unit]): Unit = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var gridPanel: js.Any = js.native
    
    /* private */ def onPivotModeChanged(): js.Any = js.native
    
    var pinnedLeftContainer: js.Any = js.native
    
    var pinnedRightContainer: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    def refreshHeader(): Unit = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    var scrollVisibleService: js.Any = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setHorizontalScroll(offset: Double): Unit = js.native
    
    def setLeftVisible(visible: Boolean): Unit = js.native
    
    def setRightVisible(visible: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object HeaderRootComp extends js.Object {
    
    var TEMPLATE: js.Any = js.native
  }
}
