package typingsSlinky.reduxRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.MemoryRouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MemoryRouter {
  
  @JSImport("redux-router", "ReduxRouter.MemoryRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reduxRouter.mod.ReduxRouter.MemoryRouter] {
    
    @scala.inline
    def getUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): this.type = set("getUserConfirmation", js.Any.fromFunction2(value))
    
    @scala.inline
    def initialEntries(value: js.Array[LocationDescriptor[LocationState]]): this.type = set("initialEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialEntriesVarargs(value: LocationDescriptor[LocationState]*): this.type = set("initialEntries", js.Array(value :_*))
    
    @scala.inline
    def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyLength(value: Double): this.type = set("keyLength", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MemoryRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MemoryRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
