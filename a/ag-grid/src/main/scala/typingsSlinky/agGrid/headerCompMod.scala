package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.iComponentMod.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerCompMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.agGrid.iComponentMod.IComponent because Already inherited
  - typingsSlinky.agGrid.headerCompMod.IHeaderComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/headerRendering/header/headerComp", "HeaderComp")
  @js.native
  class HeaderComp ()
    extends Component
       with IHeader {
    def this(template: String) = this()
    
    /* private */ def addInIcon(iconName: js.Any, eParent: js.Any, column: js.Any): js.Any = js.native
    
    var eFilter: js.Any = js.native
    
    var eLabel: js.Any = js.native
    
    var eMenu: js.Any = js.native
    
    var eSortAsc: js.Any = js.native
    
    var eSortDesc: js.Any = js.native
    
    var eSortNone: js.Any = js.native
    
    var eSortOrder: js.Any = js.native
    
    var eText: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    @JSName("init")
    def init_MHeaderComp(params: IHeaderParams): Unit = js.native
    
    var lastMovingChanged: js.Any = js.native
    
    var menuFactory: js.Any = js.native
    
    /* private */ def onFilterChanged(): js.Any = js.native
    
    /* private */ def onSortChanged(): js.Any = js.native
    
    var params: js.Any = js.native
    
    /* private */ def removeSortIcons(): js.Any = js.native
    
    /* private */ def setMultiSortOrder(): js.Any = js.native
    
    /* private */ def setupFilterIcon(): js.Any = js.native
    
    /* private */ def setupIcons(column: js.Any): js.Any = js.native
    
    /* private */ def setupMenu(): js.Any = js.native
    
    def setupSort(): Unit = js.native
    
    /* private */ def setupTap(): js.Any = js.native
    
    /* private */ def setupText(displayName: js.Any): js.Any = js.native
    
    def showMenu(eventSource: HTMLElement): Unit = js.native
    
    var sortController: js.Any = js.native
  }
  /* static members */
  object HeaderComp {
    
    @JSImport("ag-grid/dist/lib/headerRendering/header/headerComp", "HeaderComp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/headerRendering/header/headerComp", "HeaderComp.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    @scala.inline
    def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IHeader extends StObject
  
  @js.native
  trait IHeaderComp
    extends IHeader
       with IComponent[IHeaderParams]
  object IHeaderComp {
    
    @scala.inline
    def apply(getGui: () => HTMLElement): IHeaderComp = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
      __obj.asInstanceOf[IHeaderComp]
    }
  }
  
  @js.native
  trait IHeaderParams extends StObject {
    
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
}
