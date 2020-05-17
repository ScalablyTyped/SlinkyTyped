package typingsSlinky.baseui.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.textarea.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.both
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.inputMod.BaseInputOverrides
import typingsSlinky.baseui.inputMod.SharedProps
import typingsSlinky.baseui.textareaMod.TextareaProps
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Textarea {
  @JSImport("baseui/textarea", "Textarea")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.textareaMod.Textarea] {
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
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def inputMode(value: String): this.type = set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefRefObject(value: ReactRef[HTMLTextAreaElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefFunction1(value: /* instance */ HTMLTextAreaElement | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def inputRef(value: Ref[HTMLTextAreaElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefNull: this.type = set("inputRef", null)
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLTextAreaElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLTextAreaElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: BaseInputOverrides[SharedProps]): this.type = set("overrides", value.asInstanceOf[js.Any])
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
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextareaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Textarea.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

