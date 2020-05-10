package typingsSlinky.reduxRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRouter.mod.StaticRouterContext
import typingsSlinky.reactRouter.mod.StaticRouterProps
import typingsSlinky.reduxRouter.mod.ReduxRouter.StaticRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxRouterStaticRouter {
  @JSImport("redux-router", "ReduxRouter.StaticRouter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, StaticRouter] {
    @scala.inline
    def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def context(value: StaticRouterContext): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def location(value: String | js.Object): this.type = set("location", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StaticRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReduxRouterStaticRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

