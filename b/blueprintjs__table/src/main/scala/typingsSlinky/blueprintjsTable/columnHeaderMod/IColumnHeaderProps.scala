package typingsSlinky.blueprintjsTable.columnHeaderMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.blueprintjsTable.gridMod.IColumnIndices
import typingsSlinky.blueprintjsTable.headerMod.IHeaderProps
import typingsSlinky.blueprintjsTable.resizableMod.IIndexedResizeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnHeaderProps
  extends IHeaderProps
     with IColumnWidths
     with IColumnIndices {
  
  /**
    * A IColumnHeaderRenderer that, for each `<Column>`, will delegate to:
    * 1. The `columnHeaderCellRenderer` method from the `<Column>`
    * 2. A `<ColumnHeaderCell>` using the `name` prop from the `<Column>`
    * 3. A `<ColumnHeaderCell>` with a `name` generated from `Utils.toBase26Alpha`
    */
  var cellRenderer: IColumnHeaderRenderer = js.native
  
  /**
    * Ref handler that receives the HTML element that should be measured to
    * indicate the fluid height of the column header.
    */
  var measurableElementRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
  
  /**
    * A callback invoked when user is done resizing the column
    */
  var onColumnWidthChanged: IIndexedResizeCallback = js.native
}
