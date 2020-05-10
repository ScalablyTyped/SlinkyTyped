package typingsSlinky.antd.filterDropdownMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.antd.tableInterfaceMod.ColumnType
import typingsSlinky.antd.tableInterfaceMod.GetPopupContainer
import typingsSlinky.antd.tableInterfaceMod.Key
import typingsSlinky.antd.tableInterfaceMod.TableLocale
import typingsSlinky.antd.useFilterMod.FilterState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterDropdownProps[RecordType] extends js.Object {
  var children: TagMod[Any] = js.native
  var column: ColumnType[RecordType] = js.native
  var columnKey: Key = js.native
  var dropdownPrefixCls: String = js.native
  var filterMultiple: Boolean = js.native
  var filterState: js.UndefOr[FilterState[RecordType]] = js.native
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
  var locale: TableLocale = js.native
  var prefixCls: String = js.native
  def triggerFilter(filterState: FilterState[RecordType]): Unit = js.native
}

object FilterDropdownProps {
  @scala.inline
  def apply[RecordType](
    column: ColumnType[RecordType],
    columnKey: Key,
    dropdownPrefixCls: String,
    filterMultiple: Boolean,
    locale: TableLocale,
    prefixCls: String,
    triggerFilter: FilterState[RecordType] => Unit
  ): FilterDropdownProps[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], triggerFilter = js.Any.fromFunction1(triggerFilter))
    __obj.asInstanceOf[FilterDropdownProps[RecordType]]
  }
  @scala.inline
  implicit class FilterDropdownPropsOps[Self[recordtype] <: FilterDropdownProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withColumn(value: ColumnType[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnKey(value: Key): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdownPrefixCls(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterMultiple(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: TableLocale): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerFilter(value: FilterState[RecordType] => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerFilter")(js.Any.fromFunction1(value))
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
    def withFilterState(value: FilterState[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterState: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterState")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPopupContainer: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.undefined)
        ret
    }
  }
  
}

