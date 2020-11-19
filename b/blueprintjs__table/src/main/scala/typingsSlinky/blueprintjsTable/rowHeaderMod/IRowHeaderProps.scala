package typingsSlinky.blueprintjsTable.rowHeaderMod

import typingsSlinky.blueprintjsTable.gridMod.IRowIndices
import typingsSlinky.blueprintjsTable.headerMod.IHeaderProps
import typingsSlinky.blueprintjsTable.resizableMod.IIndexedResizeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRowHeaderProps
  extends IHeaderProps
     with IRowHeights
     with IRowIndices {
  
  /**
    * A callback invoked when user is done resizing the column
    */
  var onRowHeightChanged: IIndexedResizeCallback = js.native
  
  /**
    * Renders the cell for each row header
    */
  var rowHeaderCellRenderer: js.UndefOr[IRowHeaderRenderer] = js.native
}
