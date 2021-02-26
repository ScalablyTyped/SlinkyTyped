package typingsSlinky.agGrid.mainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager")
@js.native
class ClientSideNodeManager protected ()
  extends typingsSlinky.agGrid.clientSideNodeManagerMod.ClientSideNodeManager {
  def this(
    rootNode: typingsSlinky.agGrid.rowNodeMod.RowNode,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    context: typingsSlinky.agGrid.contextMod.Context,
    eventService: typingsSlinky.agGrid.eventServiceMod.EventService,
    columnController: typingsSlinky.agGrid.columnControllerMod.ColumnController,
    gridApi: typingsSlinky.agGrid.gridApiMod.GridApi,
    columnApi: typingsSlinky.agGrid.columnApiMod.ColumnApi,
    selectionController: typingsSlinky.agGrid.selectionControllerMod.SelectionController
  ) = this()
}
/* static members */
object ClientSideNodeManager {
  
  @JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager.ROOT_NODE_ID")
  @js.native
  def ROOT_NODE_ID: js.Any = js.native
  @scala.inline
  def ROOT_NODE_ID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_NODE_ID")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager.TOP_LEVEL")
  @js.native
  def TOP_LEVEL: js.Any = js.native
  @scala.inline
  def TOP_LEVEL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEVEL")(x.asInstanceOf[js.Any])
}
