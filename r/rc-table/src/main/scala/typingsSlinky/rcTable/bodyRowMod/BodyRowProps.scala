package typingsSlinky.rcTable.bodyRowMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyRowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent[HTMLAttributes[HTMLElement]]
  var childrenColumnName: String
  var className: js.UndefOr[String] = js.undefined
  var expandedKeys: Set[Key]
  var getRowKey: GetRowKey[RecordType]
  var indent: js.UndefOr[Double] = js.undefined
  var index: Double
  var onRow: GetComponentProps[RecordType]
  var record: RecordType
  var recordKey: Key
  var rowComponent: CustomizeComponent[HTMLAttributes[HTMLElement]]
  var rowKey: typingsSlinky.react.mod.Key
  var stickyOffsets: StickyOffsets
  var style: js.UndefOr[CSSProperties] = js.undefined
  def rowExpandable(record: RecordType): Boolean
}

object BodyRowProps {
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent[HTMLAttributes[HTMLElement]],
    childrenColumnName: String,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    index: Double,
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    record: RecordType,
    recordKey: Key,
    rowComponent: CustomizeComponent[HTMLAttributes[HTMLElement]],
    rowExpandable: RecordType => Boolean,
    rowKey: typingsSlinky.react.mod.Key,
    stickyOffsets: StickyOffsets,
    className: String = null,
    indent: Int | Double = null,
    style: CSSProperties = null
  ): BodyRowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], childrenColumnName = childrenColumnName.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), index = index.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), record = record.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowExpandable = js.Any.fromFunction1(rowExpandable), rowKey = rowKey.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyRowProps[RecordType]]
  }
}

