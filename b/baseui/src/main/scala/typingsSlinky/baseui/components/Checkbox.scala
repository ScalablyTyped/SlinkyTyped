package typingsSlinky.baseui.components

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.toggle
import typingsSlinky.baseui.baseuiStrings.toggle_round
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.checkboxMod.CheckboxOverrides
import typingsSlinky.baseui.checkboxMod.CheckboxProps
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkbox {
  @JSImport("baseui/checkbox", "Checkbox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.checkboxMod.Checkbox] {
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def checkmarkType(value: default_ | toggle | toggle_round): this.type = set("checkmarkType", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefRefObject(value: ReactRef[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def inputRef(value: Ref[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefNull: this.type = set("inputRef", null)
    @scala.inline
    def isError(value: Boolean): this.type = set("isError", value.asInstanceOf[js.Any])
    @scala.inline
    def isIndeterminate(value: Boolean): this.type = set("isIndeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def labelPlacement(value: top | right | bottom | left): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event_] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: CheckboxOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Checkbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

