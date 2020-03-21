package typingsSlinky.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gridOptionsMod {
  type GetContextMenuItems = js.Function1[
    /* params */ typingsSlinky.agGrid.gridOptionsMod.GetContextMenuItemsParams, 
    js.Array[java.lang.String | typingsSlinky.agGrid.gridOptionsMod.MenuItemDef]
  ]
  type GetDataPath = js.Function1[/* data */ js.Any, js.Array[java.lang.String]]
  type GetMainMenuItems = js.Function1[
    /* params */ typingsSlinky.agGrid.gridOptionsMod.GetMainMenuItemsParams, 
    js.Array[java.lang.String | typingsSlinky.agGrid.gridOptionsMod.MenuItemDef]
  ]
  type GetNodeChildDetails = js.Function1[/* dataItem */ js.Any, typingsSlinky.agGrid.gridOptionsMod.NodeChildDetails]
  type GetRowNodeIdFunc = js.Function1[/* data */ js.Any, java.lang.String]
  type IsRowMaster = js.Function1[/* dataItem */ js.Any, scala.Boolean]
  type IsRowSelectable = js.Function1[/* node */ typingsSlinky.agGrid.rowNodeMod.RowNode, scala.Boolean]
}
