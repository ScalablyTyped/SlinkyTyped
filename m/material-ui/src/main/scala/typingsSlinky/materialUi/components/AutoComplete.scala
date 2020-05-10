package typingsSlinky.materialUi.components

import org.scalajs.dom.raw.EventTarget
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.AnonText
import typingsSlinky.materialUi.MaterialUI.AutoCompleteProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverProps
import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import typingsSlinky.materialUi.autoCompleteMod.default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoComplete {
  @JSImport("material-ui/AutoComplete", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def anchorOrigin(value: origin): this.type = set("anchorOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def animation(value: ReactComponentClass[PopoverAnimationProps]): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def dataSourceConfig(value: AnonText): this.type = set("dataSourceConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String | Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disableFocusRipple(value: Boolean): this.type = set("disableFocusRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def errorStyle(value: CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def errorTextReactElement(value: ReactElement): this.type = set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def errorText(value: TagMod[Any]): this.type = set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def filter(value: (/* searchText */ String, /* key */ String, js.Any) => Boolean): this.type = set("filter", js.Any.fromFunction3(value))
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
    def floatingLabelText(value: TagMod[Any]): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
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
    def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def maxSearchResults(value: Double): this.type = set("maxSearchResults", value.asInstanceOf[js.Any])
    @scala.inline
    def maxlength(value: String): this.type = set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def menuCloseDelay(value: Double): this.type = set("menuCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def menuProps(value: js.Any): this.type = set("menuProps", value.asInstanceOf[js.Any])
    @scala.inline
    def menuStyle(value: CSSProperties): this.type = set("menuStyle", value.asInstanceOf[js.Any])
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
    def onChange(value: (SyntheticEvent[EventTarget with js.Object, Event_], /* newValue */ String) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def onNewRequest(value: (js.Any, /* index */ Double) => Unit): this.type = set("onNewRequest", js.Any.fromFunction2(value))
    @scala.inline
    def onUpdateInput(value: (/* searchText */ String, /* dataSource */ js.Array[js.Any]) => Unit): this.type = set("onUpdateInput", js.Any.fromFunction2(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def openOnFocus(value: Boolean): this.type = set("openOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def popoverProps(value: PopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def rowsMax(value: Double): this.type = set("rowsMax", value.asInstanceOf[js.Any])
    @scala.inline
    def searchText(value: String): this.type = set("searchText", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def targetOrigin(value: origin): this.type = set("targetOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def textFieldStyle(value: CSSProperties): this.type = set("textFieldStyle", value.asInstanceOf[js.Any])
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
  
  def withProps(p: AutoCompleteProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(dataSource: js.Array[js.Any]): Builder = {
    val __props = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutoCompleteProps[js.Any]]))
  }
}

