package typingsSlinky.reactRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRouter.mod.StaticRouterContext
import typingsSlinky.reactRouter.mod.StaticRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticRouter {
  @JSImport("react-router", "StaticRouter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRouter.mod.StaticRouter] {
    @scala.inline
    def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def context(value: StaticRouterContext): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def location(value: String | js.Object): this.type = set("location", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StaticRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StaticRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

