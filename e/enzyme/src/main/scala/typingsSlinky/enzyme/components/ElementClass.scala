package typingsSlinky.enzyme.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object ElementClass {
  
  def apply(p: js.Any): Default[tag.type, typingsSlinky.enzyme.mod.ElementClass] = new Default[tag.type, typingsSlinky.enzyme.mod.ElementClass](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("enzyme", "ElementClass")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ElementClass.type): Default[tag.type, typingsSlinky.enzyme.mod.ElementClass] = new Default[tag.type, typingsSlinky.enzyme.mod.ElementClass](js.Array(this.component, js.Dictionary.empty))()
}
