package typingsSlinky.antDesignReactNative.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@ant-design/react-native.@ant-design/react-native/lib/picker/PopupPickerTypes.PopupPickerProps> */
@js.native
trait ReadonlyPopupPickerProps extends js.Object {
  val WrapComponent: js.UndefOr[js.Any] = js.native
  val actionTextActiveOpacity: js.UndefOr[Double] = js.native
  val actionTextUnderlayColor: js.UndefOr[String] = js.native
  val content: js.UndefOr[ReactElement | String] = js.native
  val disabled: js.UndefOr[Boolean] = js.native
  val dismissText: js.UndefOr[String | ReactElement] = js.native
  val maskTransitionName: js.UndefOr[String] = js.native
  val okText: js.UndefOr[String | ReactElement] = js.native
  val onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  val onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  val onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  val picker: js.UndefOr[js.Any] = js.native
  val pickerValueChangeProp: js.UndefOr[String] = js.native
  val pickerValueProp: js.UndefOr[String] = js.native
  val popupTransitionName: js.UndefOr[String] = js.native
  val style: js.UndefOr[js.Any] = js.native
  val styles: js.UndefOr[js.Any] = js.native
  val title: js.UndefOr[String | ReactElement] = js.native
  val transitionName: js.UndefOr[String] = js.native
  val triggerType: js.UndefOr[String] = js.native
  val value: js.UndefOr[js.Any] = js.native
  val visible: js.UndefOr[Boolean] = js.native
  val wrapStyle: js.UndefOr[CSSProperties] = js.native
}

object ReadonlyPopupPickerProps {
  @scala.inline
  def apply(): ReadonlyPopupPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPopupPickerProps]
  }
  @scala.inline
  implicit class ReadonlyPopupPickerPropsOps[Self <: ReadonlyPopupPickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrapComponent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrapComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrapComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withActionTextActiveOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTextActiveOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionTextActiveOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTextActiveOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withActionTextUnderlayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTextUnderlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionTextUnderlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTextUnderlayColor")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: ReactElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissText(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissText")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskTransitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskTransitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withOkTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOkText(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOk(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOk")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVisibleChange(value: /* visible */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVisibleChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPicker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerValueChangeProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerValueChangeProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerValueChangeProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerValueChangeProp")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerValueProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerValueProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerValueProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerValueProp")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapStyle")(js.undefined)
        ret
    }
  }
  
}

