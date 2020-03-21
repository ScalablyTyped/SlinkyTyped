package typingsSlinky.antd.useFilterMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.antd.tableInterfaceMod.ColumnsType
import typingsSlinky.antd.tableInterfaceMod.GetPopupContainer
import typingsSlinky.antd.tableInterfaceMod.Key
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterConfig[RecordType] extends js.Object {
  var columns: ColumnsType[RecordType]
  var dropdownPrefixCls: js.UndefOr[String] = js.undefined
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var prefixCls: String
  def onFilterChange(filters: Record[String, js.Array[Key] | Null], filterStates: js.Array[FilterState[RecordType]]): Unit
}

object FilterConfig {
  @scala.inline
  def apply[RecordType](
    columns: ColumnsType[RecordType],
    onFilterChange: (Record[String, js.Array[Key] | Null], js.Array[FilterState[RecordType]]) => Unit,
    prefixCls: String,
    dropdownPrefixCls: String = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null
  ): FilterConfig[RecordType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onFilterChange = js.Any.fromFunction2(onFilterChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    if (dropdownPrefixCls != null) __obj.updateDynamic("dropdownPrefixCls")(dropdownPrefixCls.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    __obj.asInstanceOf[FilterConfig[RecordType]]
  }
}

