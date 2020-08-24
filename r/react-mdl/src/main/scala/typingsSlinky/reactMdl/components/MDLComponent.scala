package typingsSlinky.reactMdl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdl.mod._MDLComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object MDLComponent {
  @JSImport("react-mdl", "__MDLComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, _MDLComponent[P]]
  
  def apply[P](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P](companion: MDLComponent.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}

