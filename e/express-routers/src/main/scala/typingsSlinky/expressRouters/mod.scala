package typingsSlinky.expressRouters

import typingsSlinky.express.mod.Router
import typingsSlinky.expressRouters.expressRoutersMod.RouteConfig
import typingsSlinky.expressRouters.expressRoutersMod.RouteConfigAlternative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-routers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createRouter(routeConfig: js.Array[RouteConfig]): Router = js.native
  def createRouter(routeConfig: RouteConfigAlternative): Router = js.native
}

