package typingsSlinky.rcTable.interfaceMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyExpandableProps[RecordType] extends js.Object {
  /** @deprecated Use `expandable.childrenColumnName` instead */
  var childrenColumnName: js.UndefOr[String] = js.native
  /** @deprecated Use `expandable.defaultExpandAllRows` instead */
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.native
  /** @deprecated Use `expandable.defaultExpandedRowKeys` instead */
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  /** @deprecated Use `expandable.expandIcon` instead */
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.native
  /** @deprecated Use `expandable.expandIconColumnIndex` instead */
  var expandIconColumnIndex: js.UndefOr[Double] = js.native
  /** @deprecated Use `expandable.expandRowByClick` instead */
  var expandRowByClick: js.UndefOr[Boolean] = js.native
  /** @deprecated Use `expandable.expandedRowClassName` instead */
  var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.native
  /** @deprecated Use `expandable.expandedRowKeys` instead */
  var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  /** @deprecated Use `expandable.expandedRowRender` instead */
  var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.native
  /** @deprecated Use `expandable.indentSize` instead */
  var indentSize: js.UndefOr[Double] = js.native
  /** @deprecated Use `expandable.onExpand` instead */
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.native
  /** @deprecated Use `expandable.onExpandedRowsChange` instead */
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.native
}

object LegacyExpandableProps {
  @scala.inline
  def apply[RecordType](): LegacyExpandableProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyExpandableProps[RecordType]]
  }
  @scala.inline
  implicit class LegacyExpandablePropsOps[Self[recordtype] <: LegacyExpandableProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
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
    def withoutChildrenColumnName: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenColumnName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExpandAllRows(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAllRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExpandAllRows: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAllRows")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExpandedRowKeys(value: js.Array[Key]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedRowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExpandedRowKeys: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedRowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpandIcon: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandIconColumnIndex(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIconColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandIconColumnIndex: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIconColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandRowByClick(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRowByClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandRowByClick: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRowByClick")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowClassName")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutExpandedRowClassName: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedRowKeys(value: js.Array[Key]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedRowKeys: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedRowRender(
      value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => TagMod[Any]
    ): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowRender")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutExpandedRowRender: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowRender")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentSize(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentSize: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnExpand: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExpandedRowsChange: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpandedRowsChange")(js.undefined)
        ret
    }
  }
  
}

