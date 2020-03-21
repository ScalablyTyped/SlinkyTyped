package typingsSlinky.router5

import typingsSlinky.routeNode.mod.Callback
import typingsSlinky.routeNode.mod.Route
import typingsSlinky.router5.constantsMod.Constants_
import typingsSlinky.router5.constantsMod.ErrorCodes_
import typingsSlinky.router5.routerMod.CreateRouter
import typingsSlinky.router5.routerMod.Dependencies
import typingsSlinky.router5.routerMod.Router
import typingsSlinky.router5TransitionPath.transitionPathMod.State
import typingsSlinky.router5TransitionPath.transitionPathMod.TransitionPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RouteNode protected ()
    extends typingsSlinky.routeNode.mod.default {
    def this(
      name: js.UndefOr[String],
      path: js.UndefOr[String],
      childRoutes: js.UndefOr[js.Array[Route]],
      cb: js.UndefOr[Callback],
      parent: js.UndefOr[typingsSlinky.routeNode.mod.RouteNode],
      finalSort: js.UndefOr[Boolean],
      sort: js.UndefOr[Boolean]
    ) = this()
  }
  
  val constants: Constants_ = js.native
  val createRouter: CreateRouter = js.native
  val default: CreateRouter = js.native
  val errorCodes: ErrorCodes_ = js.native
  def cloneRouter(router: Router): Router = js.native
  def cloneRouter(router: Router, dependencies: Dependencies): Router = js.native
  def transitionPath(toState: State): TransitionPath = js.native
  def transitionPath(toState: State, fromState: State): TransitionPath = js.native
}

