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

trait FilterDropdownProps[RecordType] extends js.Object {
  var children: TagMod[Any]
  var column: ColumnType[RecordType]
  var columnKey: Key
  var dropdownPrefixCls: String
  var filterMultiple: Boolean
  var filterState: js.UndefOr[FilterState[RecordType]] = js.undefined
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var locale: TableLocale
  var prefixCls: String
  def triggerFilter(filterState: FilterState[RecordType]): Unit
}

object FilterDropdownProps {
  @scala.inline
  def apply[RecordType](
    children: TagMod[Any],
    column: ColumnType[RecordType],
    columnKey: Key,
    dropdownPrefixCls: String,
    filterMultiple: Boolean,
    locale: TableLocale,
    prefixCls: String,
    triggerFilter: FilterState[RecordType] => Unit,
    filterState: FilterState[RecordType] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null
  ): FilterDropdownProps[RecordType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], triggerFilter = js.Any.fromFunction1(triggerFilter))
    if (filterState != null) __obj.updateDynamic("filterState")(filterState.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    __obj.asInstanceOf[FilterDropdownProps[RecordType]]
  }
}

