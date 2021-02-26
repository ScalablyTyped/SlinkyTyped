package typingsSlinky.reactBootstrapTypeahead.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTypeahead.mod.HighligherProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Highlighter {
  
  @JSImport("react-bootstrap-typeahead", "Highlighter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Highlighter] {
    
    @scala.inline
    def search(value: String): this.type = set("search", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Highlighter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HighligherProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
