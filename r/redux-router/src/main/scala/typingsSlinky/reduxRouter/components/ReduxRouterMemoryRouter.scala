package typingsSlinky.reduxRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.MemoryRouterProps
import typingsSlinky.reduxRouter.mod.ReduxRouter.MemoryRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxRouterMemoryRouter {
  @JSImport("redux-router", "ReduxRouter.MemoryRouter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, MemoryRouter] {
    @scala.inline
    def getUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): this.type = set("getUserConfirmation", js.Any.fromFunction2(value))
    @scala.inline
    def initialEntries(value: js.Array[LocationDescriptor[LocationState]]): this.type = set("initialEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def keyLength(value: Double): this.type = set("keyLength", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MemoryRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReduxRouterMemoryRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

