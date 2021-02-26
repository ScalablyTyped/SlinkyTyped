package typingsSlinky.bandagedbdBdapi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object PureComponent {
  
  def apply[P, S, SS](p: P): Builder[P, S, SS] = new Builder[P, S, SS](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@bandagedbd/bdapi", "BdApiModule.React.PureComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P, S, SS] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.bandagedbdBdapi.mod.BdApiModule.React.PureComponent[P, S, SS]
        ]
  
  implicit def make[P, S, SS](companion: PureComponent.type): Builder[P, S, SS] = new Builder[P, S, SS](js.Array(this.component, js.Dictionary.empty))()
}
