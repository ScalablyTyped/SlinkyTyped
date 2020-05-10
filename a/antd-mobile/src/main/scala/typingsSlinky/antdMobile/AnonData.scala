package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonData extends js.Object {
  var MenuSelectContanerPrefixCls: String = js.native
  var data: js.Array[scala.Nothing] = js.native
  var level: Double = js.native
  var multiSelect: Boolean = js.native
  var multiSelectMenuBtnsCls: String = js.native
  var prefixCls: String = js.native
  var radioPrefixCls: String = js.native
  var subMenuPrefixCls: String = js.native
  def onCancel(): Unit = js.native
  def onChange(): Unit = js.native
  def onOk(): Unit = js.native
}

object AnonData {
  @scala.inline
  def apply(
    MenuSelectContanerPrefixCls: String,
    data: js.Array[scala.Nothing],
    level: Double,
    multiSelect: Boolean,
    multiSelectMenuBtnsCls: String,
    onCancel: () => Unit,
    onChange: () => Unit,
    onOk: () => Unit,
    prefixCls: String,
    radioPrefixCls: String,
    subMenuPrefixCls: String
  ): AnonData = {
    val __obj = js.Dynamic.literal(MenuSelectContanerPrefixCls = MenuSelectContanerPrefixCls.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], multiSelect = multiSelect.asInstanceOf[js.Any], multiSelectMenuBtnsCls = multiSelectMenuBtnsCls.asInstanceOf[js.Any], onCancel = js.Any.fromFunction0(onCancel), onChange = js.Any.fromFunction0(onChange), onOk = js.Any.fromFunction0(onOk), prefixCls = prefixCls.asInstanceOf[js.Any], radioPrefixCls = radioPrefixCls.asInstanceOf[js.Any], subMenuPrefixCls = subMenuPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
  @scala.inline
  implicit class AnonDataOps[Self <: AnonData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenuSelectContanerPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuSelectContanerPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiSelectMenuBtnsCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectMenuBtnsCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOk(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOk")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubMenuPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

