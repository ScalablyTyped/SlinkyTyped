package typingsSlinky.rcTable.bodyMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyProps[RecordType] extends js.Object {
  var childrenColumnName: String = js.native
  var data: js.Array[RecordType] = js.native
  var emptyNode: TagMod[Any] = js.native
  var expandedKeys: Set[Key] = js.native
  var getRowKey: GetRowKey[RecordType] = js.native
  var measureColumnWidth: Boolean = js.native
  var onRow: GetComponentProps[RecordType] = js.native
  var stickyOffsets: StickyOffsets = js.native
  def rowExpandable(record: RecordType): Boolean = js.native
}

object BodyProps {
  @scala.inline
  def apply[RecordType](
    childrenColumnName: String,
    data: js.Array[RecordType],
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    measureColumnWidth: Boolean,
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    rowExpandable: RecordType => Boolean,
    stickyOffsets: StickyOffsets
  ): BodyProps[RecordType] = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), measureColumnWidth = measureColumnWidth.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), rowExpandable = js.Any.fromFunction1(rowExpandable), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProps[RecordType]]
  }
  @scala.inline
  implicit class BodyPropsOps[Self[recordtype] <: BodyProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withChildrenColumnName(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
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
    def withMeasureColumnWidth(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowExpandable(value: RecordType => Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpandable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStickyOffsets(value: StickyOffsets): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyOffsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyNode(value: TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyNode: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyNode")(js.undefined)
        ret
    }
  }
  
}

