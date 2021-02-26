package typingsSlinky.rcTable.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTable.headerRowMod.RowProps
import typingsSlinky.rcTable.interfaceMod.CellType
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderRow {
  
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent,
    cells: js.Array[CellType[RecordType]],
    flattenColumns: js.Array[ColumnType[RecordType]],
    index: Double,
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    rowComponent: CustomizeComponent,
    stickyOffsets: StickyOffsets
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), rowComponent = rowComponent.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[RowProps[RecordType]]))
  }
  
  @JSImport("rc-table/lib/Header/HeaderRow", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[RecordType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def withProps[RecordType](p: RowProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
