package typingsSlinky.reactInteractive.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactInteractive.mod.InteractiveProps
import typingsSlinky.reactInteractive.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object ReactInteractive {
  
  @JSImport("react-interactive", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: InteractiveProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactInteractive.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}
