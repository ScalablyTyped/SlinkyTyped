package typingsSlinky.reactInstantsearch.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object PoweredBy {
  
  @JSImport("react-instantsearch/dom", "PoweredBy")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, typingsSlinky.reactInstantsearch.domMod.PoweredBy] = new Default[tag.type, typingsSlinky.reactInstantsearch.domMod.PoweredBy](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PoweredBy.type): Default[tag.type, typingsSlinky.reactInstantsearch.domMod.PoweredBy] = new Default[tag.type, typingsSlinky.reactInstantsearch.domMod.PoweredBy](js.Array(this.component, js.Dictionary.empty))()
}
