package typingsSlinky.rcPicker.pickerTriggerMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.rcPickerStrings.ltr
import typingsSlinky.rcPicker.rcPickerStrings.rtl
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerTriggerProps extends js.Object {
  var children: ReactElement
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var dropdownAlign: js.UndefOr[AlignType] = js.undefined
  var dropdownClassName: js.UndefOr[String] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
  var popupElement: ReactElement
  var popupPlacement: js.UndefOr[Placement] = js.undefined
  var popupStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: String
  var range: js.UndefOr[Boolean] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var visible: Boolean
}

object PickerTriggerProps {
  @scala.inline
  def apply(children: ReactElement, popupElement: ReactElement, prefixCls: String, visible: Boolean): PickerTriggerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], popupElement = popupElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerTriggerProps]
  }
  @scala.inline
  implicit class PickerTriggerPropsOps[Self <: PickerTriggerProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopupElement(value: ReactElement): Self = this.set("popupElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDropdownAlign(value: AlignType): Self = this.set("dropdownAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownAlign: Self = this.set("dropdownAlign", js.undefined)
    @scala.inline
    def setDropdownClassName(value: String): Self = this.set("dropdownClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownClassName: Self = this.set("dropdownClassName", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setPopupPlacement(value: Placement): Self = this.set("popupPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupPlacement: Self = this.set("popupPlacement", js.undefined)
    @scala.inline
    def setPopupStyle(value: CSSProperties): Self = this.set("popupStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupStyle: Self = this.set("popupStyle", js.undefined)
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
  }
  
}

