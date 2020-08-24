package typingsSlinky.fundamentalReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.State
import typingsSlinky.fundamentalReact.comboboxInputMod.ComboboxInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComboboxInput {
  @JSImport("fundamental-react", "ComboboxInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def buttonProps(value: js.Object): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def inputProps(value: js.Object): this.type = set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def list(value: ReactElement): this.type = set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* event */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def popoverProps(value: js.Object): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def validationState(value: State): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ComboboxInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(menu: ReactElement): Builder = {
    val __props = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ComboboxInputProps]))
  }
}

