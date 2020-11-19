package typingsSlinky.reactRouterGuard.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouterGuard.mod.RouterGuardConfigProps
import typingsSlinky.reactRouterGuard.mod.RouterGuardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RouterGuard {
  
  @JSImport("react-router-guard", "RouterGuard")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRouterGuard.mod.RouterGuard[T]] {
    
    @scala.inline
    def history(value: History[LocationState]): this.type = set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingReactElement(value: ReactElement): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean | ReactElement): this.type = set("loading", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: RouterGuardProps): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T](config: js.Array[RouterGuardConfigProps]): Builder[T] = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[RouterGuardProps]))
  }
}
