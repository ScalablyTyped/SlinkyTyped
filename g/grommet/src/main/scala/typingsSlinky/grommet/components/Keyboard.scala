package typingsSlinky.grommet.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.grommetStrings.component
import typingsSlinky.grommet.grommetStrings.document
import typingsSlinky.grommet.keyboardMod.KeyboardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Keyboard {
  @JSImport("grommet", "Keyboard")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def onBackspace(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onBackspace", js.Any.fromFunction1(value))
    @scala.inline
    def onComma(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onComma", js.Any.fromFunction1(value))
    @scala.inline
    def onDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onDown", js.Any.fromFunction1(value))
    @scala.inline
    def onEnter(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onEsc(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onEsc", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onLeft(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onLeft", js.Any.fromFunction1(value))
    @scala.inline
    def onRight(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onRight", js.Any.fromFunction1(value))
    @scala.inline
    def onShift(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onShift", js.Any.fromFunction1(value))
    @scala.inline
    def onSpace(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onSpace", js.Any.fromFunction1(value))
    @scala.inline
    def onTab(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onTab", js.Any.fromFunction1(value))
    @scala.inline
    def onUp(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onUp", js.Any.fromFunction1(value))
    @scala.inline
    def target(value: component | document): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: KeyboardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Keyboard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

