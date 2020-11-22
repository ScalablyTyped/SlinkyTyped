package typingsSlinky.reactInstantsearch.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object Snippet {
  
  @JSImport("react-instantsearch/dom", "Snippet")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, typingsSlinky.reactInstantsearch.domMod.Snippet] = new Default[tag.type, typingsSlinky.reactInstantsearch.domMod.Snippet](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Snippet.type): Default[tag.type, typingsSlinky.reactInstantsearch.domMod.Snippet] = new Default[tag.type, typingsSlinky.reactInstantsearch.domMod.Snippet](js.Array(this.component, js.Dictionary.empty))()
}
