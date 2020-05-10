package typingsSlinky.reflux.components

import org.scalablytyped.runtime.Instantiable0
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reflux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Component {
  @JSImport("reflux", "Component")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TOfStore <: Instantiable0[Store], P, S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reflux.mod.Component[js.Any, js.Any, js.Any]]
  
  def apply[TOfStore <: Instantiable0[Store], P, S](p: P): Builder[TOfStore, P, S] = new Builder[TOfStore, P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[TOfStore <: Instantiable0[Store], P, S](companion: Component.type): Builder[TOfStore, P, S] = new Builder[TOfStore, P, S](js.Array(this.component, js.Dictionary.empty))()
}

