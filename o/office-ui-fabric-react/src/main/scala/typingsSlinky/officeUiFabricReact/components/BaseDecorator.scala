package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from TProps because couldn't resolve ClassTree. */
object BaseDecorator {
  
  def apply[TProps, TState](p: TProps): Builder[TProps, TState] = new Builder[TProps, TState](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/BaseDecorator", "BaseDecorator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[TProps, TState] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.baseDecoratorMod.BaseDecorator[TProps, TState]
        ]
  
  implicit def make[TProps, TState](companion: BaseDecorator.type): Builder[TProps, TState] = new Builder[TProps, TState](js.Array(this.component, js.Dictionary.empty))()
}
