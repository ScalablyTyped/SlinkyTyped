package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsCore.tagInputMod.ITagInputProps
import typingsSlinky.blueprintjsCore.tagInputMod.TagInputAddMethod
import typingsSlinky.blueprintjsCore.tagMod.ITagProps
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TagInput {
  @JSImport("@blueprintjs/core", "TagInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.TagInput] {
    @scala.inline
    def addOnBlur(value: Boolean): this.type = set("addOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def addOnPaste(value: Boolean): this.type = set("addOnPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def inputProps(value: HTMLInputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRef(value: /* input */ HTMLInputElement | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def large(value: Boolean): this.type = set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def leftIconReactElement(value: ReactElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def leftIcon(value: IconName | MaybeElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def leftIconNull: this.type = set("leftIcon", null)
    @scala.inline
    def onAdd(value: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit): this.type = set("onAdd", js.Any.fromFunction2(value))
    @scala.inline
    def onChange(value: /* values */ js.Array[TagMod[Any]] => Boolean | Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onInputChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onInputChange", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): this.type = set("onKeyDown", js.Any.fromFunction2(value))
    @scala.inline
    def onKeyUp(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): this.type = set("onKeyUp", js.Any.fromFunction2(value))
    @scala.inline
    def onRemove(value: (/* value */ String, /* index */ Double) => Unit): this.type = set("onRemove", js.Any.fromFunction2(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def rightElement(value: ReactElement): this.type = set("rightElement", value.asInstanceOf[js.Any])
    @scala.inline
    def separatorRegExp(value: js.RegExp): this.type = set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def separator(value: String | js.RegExp | `false`): this.type = set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def tagPropsFunction2(value: (/* value */ TagMod[Any], /* index */ Double) => ITagProps): this.type = set("tagProps", js.Any.fromFunction2(value))
    @scala.inline
    def tagProps(value: ITagProps | (js.Function2[/* value */ TagMod[Any], /* index */ Double, ITagProps])): this.type = set("tagProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITagInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(values: js.Array[TagMod[Any]]): Builder = {
    val __props = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITagInputProps]))
  }
}

