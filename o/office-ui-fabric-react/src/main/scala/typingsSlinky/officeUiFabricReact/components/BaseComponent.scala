package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from TProps because couldn't resolve ClassTree. */
object BaseComponent {
  @JSImport("office-ui-fabric-react", "BaseComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TProps <: IBaseProps[js.Any], TState] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.BaseComponent[js.Any, js.Any]]
  
  def apply[TProps <: IBaseProps[js.Any], TState](p: TProps): Builder[TProps, TState] = new Builder[TProps, TState](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[TProps <: IBaseProps[js.Any], TState](companion: BaseComponent.type): Builder[TProps, TState] = new Builder[TProps, TState](js.Array(this.component, js.Dictionary.empty))()
}

