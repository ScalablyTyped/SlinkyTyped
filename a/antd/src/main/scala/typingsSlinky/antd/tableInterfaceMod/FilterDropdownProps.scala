package typingsSlinky.antd.tableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterDropdownProps extends js.Object {
  var clearFilters: js.UndefOr[js.Function0[Unit]] = js.native
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
  var prefixCls: String = js.native
  var selectedKeys: js.Array[typingsSlinky.react.mod.Key] = js.native
  var visible: Boolean = js.native
  def confirm(): Unit = js.native
  def setSelectedKeys(selectedKeys: js.Array[String]): Unit = js.native
}

object FilterDropdownProps {
  @scala.inline
  def apply(
    confirm: () => Unit,
    prefixCls: String,
    selectedKeys: js.Array[typingsSlinky.react.mod.Key],
    setSelectedKeys: js.Array[String] => Unit,
    visible: Boolean
  ): FilterDropdownProps = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction0(confirm), prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], setSelectedKeys = js.Any.fromFunction1(setSelectedKeys), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDropdownProps]
  }
  @scala.inline
  implicit class FilterDropdownPropsOps[Self <: FilterDropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirm(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedKeys(value: js.Array[typingsSlinky.react.mod.Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSelectedKeys(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectedKeys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearFilters(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFilters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[ColumnFilterItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}

