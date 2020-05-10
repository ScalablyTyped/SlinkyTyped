package typingsSlinky.materialUi.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.TimePickerProps
import typingsSlinky.materialUi.materialUiStrings.`24hr`
import typingsSlinky.materialUi.materialUiStrings.ampm
import typingsSlinky.materialUi.timePickerMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePicker {
  @JSImport("material-ui/TimePicker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoOk(value: Boolean): this.type = set("autoOk", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelLabelReactElement(value: ReactElement): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelLabel(value: TagMod[Any]): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultTime(value: js.Date): this.type = set("defaultTime", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String | Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def dialogBodyStyle(value: CSSProperties): this.type = set("dialogBodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dialogStyle(value: CSSProperties): this.type = set("dialogStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def errorStyle(value: CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def errorTextReactElement(value: ReactElement): this.type = set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def errorText(value: TagMod[Any]): this.type = set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelFixed(value: Boolean): this.type = set("floatingLabelFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelFocusStyle(value: CSSProperties): this.type = set("floatingLabelFocusStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelStyle(value: CSSProperties): this.type = set("floatingLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelTextReactElement(value: ReactElement): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelText(value: TagMod[Any]): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: ampm | `24hr`): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def hintStyle(value: CSSProperties): this.type = set("hintStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def hintTextReactElement(value: ReactElement): this.type = set("hintText", value.asInstanceOf[js.Any])
    @scala.inline
    def hintText(value: TagMod[Any]): this.type = set("hintText", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def inputStyle(value: CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def minutesStep(value: Double): this.type = set("minutesStep", value.asInstanceOf[js.Any])
    @scala.inline
    def multiLine(value: Boolean): this.type = set("multiLine", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def okLabelReactElement(value: ReactElement): this.type = set("okLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def okLabel(value: TagMod[Any]): this.type = set("okLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: (/* e */ js.Any, /* time */ js.Date) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def pedantic(value: Boolean): this.type = set("pedantic", value.asInstanceOf[js.Any])
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def rowsMax(value: Double): this.type = set("rowsMax", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def textFieldStyle(value: CSSProperties): this.type = set("textFieldStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def textareaStyle(value: CSSProperties): this.type = set("textareaStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def underlineDisabledStyle(value: CSSProperties): this.type = set("underlineDisabledStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def underlineFocusStyle(value: CSSProperties): this.type = set("underlineFocusStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def underlineShow(value: Boolean): this.type = set("underlineShow", value.asInstanceOf[js.Any])
    @scala.inline
    def underlineStyle(value: CSSProperties): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

