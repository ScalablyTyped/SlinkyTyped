package typingsSlinky.reactFns.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object ReducerComponent {
  @JSImport("react-fns/dist/ReducerComponent", "ReducerComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P, S, A] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.reactFns.reducerComponentMod.ReducerComponent[js.Any, js.Any, js.Any]
        ]
  
  def apply[P, S, A](p: P): Builder[P, S, A] = new Builder[P, S, A](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P, S, A](companion: ReducerComponent.type): Builder[P, S, A] = new Builder[P, S, A](js.Array(this.component, js.Dictionary.empty))()
}

