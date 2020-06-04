package typingsSlinky.materialUi.MaterialUI.Switches

import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.materialUi.MaterialUI.ReactLink
import typingsSlinky.materialUi.materialUiStrings.left
import typingsSlinky.materialUi.materialUiStrings.right
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends CommonEnhancedSwitchProps[Checkbox] {
  var checkedIcon: js.UndefOr[ReactElement] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var inputStyle: js.UndefOr[CSSProperties] = js.undefined
  var labelPosition: js.UndefOr[left | right] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var onCheck: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[js.Object], /* checked */ Boolean, Unit]
  ] = js.undefined
  var uncheckedIcon: js.UndefOr[ReactElement] = js.undefined
   // Normally an SvgIcon
  var valueLink: js.UndefOr[ReactLink[Boolean]] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxProps]
  }
  @scala.inline
  implicit class CheckboxPropsOps[Self <: CheckboxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckedIcon(value: ReactElement): Self = this.set("checkedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedIcon: Self = this.set("checkedIcon", js.undefined)
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setInputStyle(value: CSSProperties): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setLabelPosition(value: left | right): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setOnCheck(value: (/* event */ SyntheticMouseEvent[js.Object], /* checked */ Boolean) => Unit): Self = this.set("onCheck", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCheck: Self = this.set("onCheck", js.undefined)
    @scala.inline
    def setUncheckedIcon(value: ReactElement): Self = this.set("uncheckedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncheckedIcon: Self = this.set("uncheckedIcon", js.undefined)
    @scala.inline
    def setValueLink(value: ReactLink[Boolean]): Self = this.set("valueLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueLink: Self = this.set("valueLink", js.undefined)
  }
  
}

