package typingsSlinky.reactOutsideClickHandler.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOutsideClickHandler.mod.Props
import typingsSlinky.reactOutsideClickHandler.mod.default
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactOutsideClickHandler {
  
  @JSImport("react-outside-click-handler", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def display(value: block | flex | `inline` | `inline-block` | contents): this.type = set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useCapture(value: Boolean): this.type = set("useCapture", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onOutsideClick: SyntheticMouseEvent[HTMLElement] => Unit): Builder = {
    val __props = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1(onOutsideClick))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
