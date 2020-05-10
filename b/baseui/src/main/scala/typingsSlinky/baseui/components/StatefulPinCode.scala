package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.AnonValues
import typingsSlinky.baseui.baseuiStrings.both
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.inputMod.InputOverrides
import typingsSlinky.baseui.inputMod.SharedProps
import typingsSlinky.baseui.pinCodeMod.PinCodeOverrides
import typingsSlinky.baseui.pinCodeMod.State
import typingsSlinky.baseui.pinCodeMod.StatefulPinCodeProps
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPinCode {
  @JSImport("baseui/pin-code", "StatefulPinCode")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def adjoined(value: none | left | right | both): this.type = set("adjoined", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def clearable(value: Boolean): this.type = set("clearable", value.asInstanceOf[js.Any])
    @scala.inline
    def `data-baseweb`(value: String): this.type = set("data-baseweb", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def endEnhancerReactElement(value: ReactElement): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def endEnhancerFunction1(value: /* args */ SharedProps => TagMod[Any]): this.type = set("endEnhancer", js.Any.fromFunction1(value))
    @scala.inline
    def endEnhancer(value: (js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any]): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def inputMode(value: String): this.type = set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefRefObject(value: ReactRef[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def inputRef(value: Ref[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefNull: this.type = set("inputRef", null)
    @scala.inline
    def manageFocus(value: Boolean): this.type = set("manageFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* args */ AnonValues => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: InputOverrides with PinCodeOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def startEnhancerReactElement(value: ReactElement): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def startEnhancerFunction1(value: /* args */ SharedProps => TagMod[Any]): this.type = set("startEnhancer", js.Any.fromFunction1(value))
    @scala.inline
    def startEnhancer(value: (js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any]): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def stateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): this.type = set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def values(value: js.Array[String]): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulPinCodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatefulPinCode.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

