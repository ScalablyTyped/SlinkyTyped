package typingsSlinky.apolloReactHoc.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from TProps because couldn't resolve ClassTree. */
object GraphQLBase {
  @JSImport("@apollo/react-hoc/lib/hoc-utils", "GraphQLBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TProps, TChildProps, TState] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.apolloReactHoc.hocUtilsMod.GraphQLBase[TProps, TChildProps, TState]
        ]
  
  def apply[TProps, TChildProps, TState](p: TProps): Builder[TProps, TChildProps, TState] = new Builder[TProps, TChildProps, TState](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[TProps, TChildProps, TState](companion: GraphQLBase.type): Builder[TProps, TChildProps, TState] = new Builder[TProps, TChildProps, TState](js.Array(this.component, js.Dictionary.empty))()
}

