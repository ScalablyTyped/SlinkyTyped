package typingsSlinky.inversifyExpressUtils.mod

import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.Router
import typingsSlinky.inversify.interfacesMod.interfaces.Container
import typingsSlinky.inversifyExpressUtils.anon.Instantiable
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.RoutingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-express-utils", "InversifyExpressServer")
@js.native
class InversifyExpressServer protected ()
  extends typingsSlinky.inversifyExpressUtils.serverMod.InversifyExpressServer {
  /**
    * Wrapper for the express server.
    *
    * @param container Container loaded with all controllers and their dependencies.
    * @param customRouter optional express.Router custom router
    * @param routingConfig optional interfaces.RoutingConfig routing config
    * @param customApp optional express.Application custom app
    * @param authProvider optional interfaces.AuthProvider auth provider
    * @param forceControllers optional boolean setting to force controllers (defaults do true)
    */
  def this(
    container: Container,
    customRouter: js.UndefOr[Router | Null],
    routingConfig: js.UndefOr[RoutingConfig | Null],
    customApp: js.UndefOr[Application_ | Null],
    authProvider: js.UndefOr[Instantiable | Null],
    forceControllers: js.UndefOr[Boolean]
  ) = this()
}
