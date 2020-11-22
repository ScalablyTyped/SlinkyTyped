package typingsSlinky.reactBootstrapTypeahead.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTypeahead.mod.HintProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hint {
  
  @JSImport("react-bootstrap-typeahead", "Hint")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Hint] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldSelect(value: (/* shouldSelect */ Boolean, /* e */ SyntheticKeyboardEvent[HTMLInputElement]) => Boolean): this.type = set("shouldSelect", js.Any.fromFunction2(value))
  }
  
  def withProps(p: HintProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Hint.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
