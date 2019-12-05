package typingsSlinky.expressDashRouters

import typingsSlinky.express.expressMod.Router
import typingsSlinky.expressDashRouters.distExpressDashRoutersMod.RouteConfig
import typingsSlinky.expressDashRouters.distExpressDashRoutersMod.RouteConfigAlternative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-routers", JSImport.Namespace)
@js.native
object expressDashRoutersMod extends js.Object {
  def createRouter(routeConfig: js.Array[RouteConfig]): Router = js.native
  def createRouter(routeConfig: RouteConfigAlternative): Router = js.native
}

