package typingsSlinky.reactInstantsearchDom.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object VoiceSearch {
  
  @JSImport("react-instantsearch-dom", "VoiceSearch")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.VoiceSearch] = new Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.VoiceSearch](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: VoiceSearch.type): Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.VoiceSearch] = new Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.VoiceSearch](js.Array(this.component, js.Dictionary.empty))()
}
