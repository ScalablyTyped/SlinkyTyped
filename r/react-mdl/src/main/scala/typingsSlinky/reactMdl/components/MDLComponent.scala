package typingsSlinky.reactMdl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdl.mod._MDLComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object MDLComponent {
  
  def apply[P](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-mdl", "__MDLComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, _MDLComponent[P]]
  
  implicit def make[P](companion: MDLComponent.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}
