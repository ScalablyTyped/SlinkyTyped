package typingsSlinky.agGrid.mainMod

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
@JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager")
@js.native
object ClientSideNodeManager extends js.Object {
  
  var ROOT_NODE_ID: js.Any = js.native
  
  var TOP_LEVEL: js.Any = js.native
}
