package typingsSlinky.rcTable.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTable.anon.Children
import typingsSlinky.rcTable.bodyRowMod.BodyRowProps
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BodyRow {
  @JSImport("rc-table/lib/Body/BodyRow", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[RecordType <: Children[RecordType]] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def indent(value: Double): this.type = set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps[RecordType <: Children[RecordType]](p: BodyRowProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[RecordType <: Children[RecordType]](
    cellComponent: CustomizeComponent,
    childrenColumnName: String,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    index: Double,
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    record: RecordType,
    recordKey: Key,
    rowComponent: CustomizeComponent,
    rowExpandable: RecordType => Boolean,
    rowKey: typingsSlinky.react.mod.Key,
    stickyOffsets: StickyOffsets
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], childrenColumnName = childrenColumnName.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), index = index.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), record = record.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowExpandable = js.Any.fromFunction1(rowExpandable), rowKey = rowKey.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[BodyRowProps[RecordType]]))
  }
}

