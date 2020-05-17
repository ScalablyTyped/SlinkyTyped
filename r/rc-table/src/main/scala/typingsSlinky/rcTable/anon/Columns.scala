package typingsSlinky.rcTable.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.RenderExpandIcon
import typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps
import typingsSlinky.rcTable.interfaceMod.TriggerEventHandler
import typingsSlinky.rcTable.rcTableStrings.ltr
import typingsSlinky.rcTable.rcTableStrings.rtl
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns[RecordType] extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.native
  var expandIconColumnIndex: js.UndefOr[Double] = js.native
  var expandable: Boolean = js.native
  var expandedKeys: Set[Key] = js.native
  var getRowKey: GetRowKey[RecordType] = js.native
  var onTriggerExpand: TriggerEventHandler[RecordType] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.native
}

object Columns {
  @scala.inline
  def apply[RecordType](
    expandable: Boolean,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    onTriggerExpand: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit
  ): Columns[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), onTriggerExpand = js.Any.fromFunction2(onTriggerExpand))
    __obj.asInstanceOf[Columns[RecordType]]
  }
  @scala.inline
  implicit class ColumnsOps[Self[recordtype] <: Columns[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withExpandable(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
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
    def withOnTriggerExpand(value: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTriggerExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: ColumnsType[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ltr | rtl): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
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
    def withPrefixCls(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRowExpandable(value: /* record */ RecordType => Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpandable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowExpandable: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpandable")(js.undefined)
        ret
    }
  }
  
}

