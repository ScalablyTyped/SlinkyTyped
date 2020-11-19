package typingsSlinky.agGrid.headerCompMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/headerRendering/header/headerComp", "HeaderComp")
@js.native
class HeaderComp ()
  extends Component
     with IHeader {
  
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
@JSImport("ag-grid/dist/lib/headerRendering/header/headerComp", "HeaderComp")
@js.native
object HeaderComp extends js.Object {
  
  var TEMPLATE: js.Any = js.native
}
