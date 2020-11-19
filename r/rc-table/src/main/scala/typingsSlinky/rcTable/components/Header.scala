package typingsSlinky.rcTable.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTable.headerMod.HeaderProps
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @JSImport("rc-table/lib/Header/Header", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[RecordType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def withProps[RecordType](p: HeaderProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[RecordType](
    columns: ColumnsType[RecordType],
    flattenColumns: js.Array[ColumnType[RecordType]],
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    stickyOffsets: StickyOffsets
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[HeaderProps[RecordType]]))
  }
}
