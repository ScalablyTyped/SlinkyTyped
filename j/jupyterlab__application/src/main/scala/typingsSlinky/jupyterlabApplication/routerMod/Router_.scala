package typingsSlinky.jupyterlabApplication.routerMod

import typingsSlinky.jupyterlabApplication.routerMod.Router.IOptions
import typingsSlinky.jupyterlabApplication.tokensMod.IRouter
import typingsSlinky.jupyterlabApplication.tokensMod.IRouter.ILocation
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/application/lib/router", "Router")
@js.native
class Router_ protected () extends IRouter {
  /**
    * Create a URL router.
    */
  def this(options: IOptions) = this()
  
  var _routed: js.Any = js.native
  
  var _rules: js.Any = js.native
  
  /**
    * Returns the parsed current URL of the application.
    */
  @JSName("current")
  def current_MRouter_ : ILocation = js.native
  
  /**
    * Route a specific path to an action.
    *
    * #### Notes
    * If a pattern is matched, its command will be invoked with arguments that
    * match the `IRouter.ILocation` interface.
    */
  def route(): js.Promise[Unit] = js.native
  
  /**
    * A signal emitted when the router routes a route.
    */
  @JSName("routed")
  def routed_MRouter_ : ISignal[this.type, ILocation] = js.native
}
