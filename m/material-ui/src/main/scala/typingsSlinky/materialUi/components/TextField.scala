package typingsSlinky.materialUi.components

import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.TextFieldProps
import typingsSlinky.materialUi.textFieldMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextField {
  @JSImport("material-ui/TextField", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String | Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def errorStyle(value: CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def errorTextReactElement(value: ReactElement): this.type = set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def errorText(value: ReactElement): this.type = set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelFixed(value: Boolean): this.type = set("floatingLabelFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelFocusStyle(value: CSSProperties): this.type = set("floatingLabelFocusStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelShrinkStyle(value: CSSProperties): this.type = set("floatingLabelShrinkStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelStyle(value: CSSProperties): this.type = set("floatingLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelTextReactElement(value: ReactElement): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def floatingLabelText(value: ReactElement): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def hintStyle(value: CSSProperties): this.type = set("hintStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def hintTextReactElement(value: ReactElement): this.type = set("hintText", value.asInstanceOf[js.Any])
    @scala.inline
    def hintText(value: ReactElement): this.type = set("hintText", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def inputStyle(value: CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def maxlength(value: String): this.type = set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def minlength(value: String): this.type = set("minlength", value.asInstanceOf[js.Any])
    @scala.inline
    def multiLine(value: Boolean): this.type = set("multiLine", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(
      value: (SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event], /* newValue */ String) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def rowsMax(value: Double): this.type = set("rowsMax", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def textareaStyle(value: CSSProperties): this.type = set("textareaStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
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
    def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TextField.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

