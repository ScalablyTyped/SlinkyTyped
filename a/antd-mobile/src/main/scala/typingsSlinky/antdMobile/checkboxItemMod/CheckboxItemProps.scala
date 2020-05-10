package typingsSlinky.antdMobile.checkboxItemMod

import typingsSlinky.antdMobile.checkboxCheckboxMod.CheckboxProps
import typingsSlinky.antdMobile.checkboxPropsTypeMod.CheckboxItemPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxItemProps extends CheckboxItemPropsType {
  var checkboxProps: js.UndefOr[CheckboxProps] = js.native
  var className: js.UndefOr[String] = js.native
  var listPrefixCls: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var wrapLabel: js.UndefOr[Boolean] = js.native
}

object CheckboxItemProps {
  @scala.inline
  def apply(): CheckboxItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxItemProps]
  }
  @scala.inline
  implicit class CheckboxItemPropsOps[Self <: CheckboxItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckboxProps(value: CheckboxProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxProps")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withListPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapLabel")(js.undefined)
        ret
    }
  }
  
}

