package typingsSlinky.giustoInkRouter.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.giustoInkRouter.anon.Key
import typingsSlinky.giustoInkRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Route {
  @JSImport("@giusto/ink-router", "Route")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.giustoInkRouter.mod.Route] {
    @scala.inline
    def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def location(value: Key): this.type = set("location", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RouteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(component: ReactComponentClass[_], path: String): Builder = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RouteProps]))
  }
}

