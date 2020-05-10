package typingsSlinky.rcTable.bodyRowMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
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

@js.native
trait BodyRowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent = js.native
  var childrenColumnName: String = js.native
  var className: js.UndefOr[String] = js.native
  var expandedKeys: Set[Key] = js.native
  var getRowKey: GetRowKey[RecordType] = js.native
  var indent: js.UndefOr[Double] = js.native
  var index: Double = js.native
  var onRow: GetComponentProps[RecordType] = js.native
  var record: RecordType = js.native
  var recordKey: Key = js.native
  var rowComponent: CustomizeComponent = js.native
  var rowKey: typingsSlinky.react.mod.Key = js.native
  var stickyOffsets: StickyOffsets = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  def rowExpandable(record: RecordType): Boolean = js.native
}

object BodyRowProps {
  @scala.inline
  def apply[RecordType](
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
  ): BodyRowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], childrenColumnName = childrenColumnName.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), index = index.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), record = record.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowExpandable = js.Any.fromFunction1(rowExpandable), rowKey = rowKey.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyRowProps[RecordType]]
  }
  @scala.inline
  implicit class BodyRowPropsOps[Self[recordtype] <: BodyRowProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withCellComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellComponentComponentClass(value: ReactComponentClass[js.Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellComponent(value: CustomizeComponent): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenColumnName(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedKeys(value: Set[Key]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRecord(value: RecordType): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordKey(value: Key): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowComponentComponentClass(value: ReactComponentClass[js.Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowComponent(value: CustomizeComponent): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowExpandable(value: RecordType => Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpandable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowKey(value: typingsSlinky.react.mod.Key): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStickyOffsets(value: StickyOffsets): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyOffsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

