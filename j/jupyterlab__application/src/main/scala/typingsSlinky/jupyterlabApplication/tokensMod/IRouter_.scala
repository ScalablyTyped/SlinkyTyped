package typingsSlinky.jupyterlabApplication.tokensMod

import typingsSlinky.jupyterlabApplication.tokensMod.IRouter.ILocation
import typingsSlinky.jupyterlabApplication.tokensMod.IRouter.INavOptions
import typingsSlinky.jupyterlabApplication.tokensMod.IRouter.IRegisterOptions
import typingsSlinky.luminoCommands.mod.CommandRegistry
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouter_ extends js.Object {
  
  /**
    * The base URL for the router.
    */
  val base: String = js.native
  
  /**
    * The command registry used by the router.
    */
  val commands: CommandRegistry = js.native
  
  /**
    * The parsed current URL of the application.
    */
  val current: ILocation = js.native
  
  /**
    * Navigate to a new path within the application.
    *
    * @param path - The new path or empty string if redirecting to root.
    *
    * @param options - The navigation options.
    */
  def navigate(path: String): Unit = js.native
  def navigate(path: String, options: INavOptions): Unit = js.native
  
  /**
    * Register a rule that maps a path pattern to a command.
    *
    * @param options - The route registration options.
    *
    * @returns A disposable that removes the registered rule from the router.
    */
  def register(options: IRegisterOptions): IDisposable = js.native
  
  /**
    * Cause a hard reload of the document.
    */
  def reload(): Unit = js.native
  
  /**
    * Route a specific path to an action.
    *
    * @param url - The URL string that will be routed.
    *
    * #### Notes
    * If a pattern is matched, its command will be invoked with arguments that
    * match the `IRouter.ILocation` interface.
    */
  def route(url: String): Unit = js.native
  
  /**
    * A signal emitted when the router routes a route.
    */
  val routed: ISignal[IRouter, ILocation] = js.native
  
  /**
    * If a matching rule's command resolves with the `stop` token during routing,
    * no further matches will execute.
    */
  val stop: Token[Unit] = js.native
}
