package typingsSlinky.reactInstantsearchDom.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactInstantsearchDom.anon.Translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stats {
  
  @JSImport("react-instantsearch-dom", "Stats")
  @js.native
  object component extends js.Object
  
  def withProps(p: Translations): Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.Stats] = new Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.Stats](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Stats.type): Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.Stats] = new Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.Stats](js.Array(this.component, js.Dictionary.empty))()
}
