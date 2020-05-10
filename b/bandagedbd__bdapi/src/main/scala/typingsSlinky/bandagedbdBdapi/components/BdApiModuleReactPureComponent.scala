package typingsSlinky.bandagedbdBdapi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.bandagedbdBdapi.mod.BdApiModule.React.PureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object BdApiModuleReactPureComponent {
  @JSImport("@bandagedbd/bdapi", "BdApiModule.React.PureComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P, S, SS] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, PureComponent[js.Any, js.Any, js.Any]]
  
  def apply[P, S, SS](p: P): Builder[P, S, SS] = new Builder[P, S, SS](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P, S, SS](companion: BdApiModuleReactPureComponent.type): Builder[P, S, SS] = new Builder[P, S, SS](js.Array(this.component, js.Dictionary.empty))()
}

