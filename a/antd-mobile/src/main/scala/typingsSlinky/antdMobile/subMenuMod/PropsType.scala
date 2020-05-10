package typingsSlinky.antdMobile.subMenuMod

import typingsSlinky.antdMobile.menuPropsTypeMod.DataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType extends js.Object {
  var multiSelect: js.UndefOr[Boolean] = js.native
  var radioPrefixCls: js.UndefOr[String] = js.native
  var selItem: js.Array[DataItem] = js.native
  var showSelect: Boolean = js.native
  var subMenuData: js.Array[DataItem] = js.native
  var subMenuPrefixCls: js.UndefOr[String] = js.native
  def onSel(dataItem: DataItem): Unit = js.native
}

object PropsType {
  @scala.inline
  def apply(
    onSel: DataItem => Unit,
    selItem: js.Array[DataItem],
    showSelect: Boolean,
    subMenuData: js.Array[DataItem]
  ): PropsType = {
    val __obj = js.Dynamic.literal(onSel = js.Any.fromFunction1(onSel), selItem = selItem.asInstanceOf[js.Any], showSelect = showSelect.asInstanceOf[js.Any], subMenuData = subMenuData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSel(value: DataItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelItem(value: js.Array[DataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubMenuData(value: js.Array[DataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSubMenuPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenuPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuPrefixCls")(js.undefined)
        ret
    }
  }
  
}

