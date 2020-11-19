package typingsSlinky.router5

import typingsSlinky.routeNode.routeNodeMod.RouteNodeOptions
import typingsSlinky.router5.anon.PartialOptions
import typingsSlinky.router5.constantsMod.Constants_
import typingsSlinky.router5.constantsMod.ErrorCodes_
import typingsSlinky.router5.routerMod.DefaultDependencies
import typingsSlinky.router5.routerMod.Route
import typingsSlinky.router5.routerMod.Router
import typingsSlinky.router5TransitionPath.transitionPathMod.State
import typingsSlinky.router5TransitionPath.transitionPathMod.TransitionPath
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("router5", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def cloneRouter[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies]): Router[Dependencies] = js.native
  def cloneRouter[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies], dependencies: Dependencies): Router[Dependencies] = js.native
  
  val constants: Constants_ = js.native
  
  def createRouter[Dependencies /* <: Record[String, _] */](): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], dependencies: Dependencies): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: PartialOptions): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.Array[Route[Dependencies]]): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](
    routes: js.Array[Route[Dependencies]],
    options: js.UndefOr[scala.Nothing],
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.Array[Route[Dependencies]], options: PartialOptions): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.Array[Route[Dependencies]], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: typingsSlinky.routeNode.mod.RouteNode): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](
    routes: typingsSlinky.routeNode.mod.RouteNode,
    options: js.UndefOr[scala.Nothing],
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: typingsSlinky.routeNode.mod.RouteNode, options: PartialOptions): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: typingsSlinky.routeNode.mod.RouteNode, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  
  def default[Dependencies /* <: Record[String, _] */](): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], dependencies: Dependencies): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: PartialOptions): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.Array[Route[Dependencies]]): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](
    routes: js.Array[Route[Dependencies]],
    options: js.UndefOr[scala.Nothing],
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.Array[Route[Dependencies]], options: PartialOptions): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.Array[Route[Dependencies]], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: typingsSlinky.routeNode.mod.RouteNode): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](
    routes: typingsSlinky.routeNode.mod.RouteNode,
    options: js.UndefOr[scala.Nothing],
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: typingsSlinky.routeNode.mod.RouteNode, options: PartialOptions): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: typingsSlinky.routeNode.mod.RouteNode, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  
  val errorCodes: ErrorCodes_ = js.native
  
  def transitionPath(toState: State): TransitionPath = js.native
  def transitionPath(toState: State, fromState: State): TransitionPath = js.native
  
  @js.native
  class RouteNode ()
    extends typingsSlinky.routeNode.mod.RouteNode {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], path: String) = this()
    def this(name: String, path: String) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.Array[typingsSlinky.routeNode.routeNodeMod.Route]
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: String,
      childRoutes: js.Array[typingsSlinky.routeNode.routeNodeMod.Route]
    ) = this()
    def this(
      name: String,
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.Array[typingsSlinky.routeNode.routeNodeMod.Route]
    ) = this()
    def this(name: String, path: String, childRoutes: js.Array[typingsSlinky.routeNode.routeNodeMod.Route]) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.UndefOr[scala.Nothing],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.Array[typingsSlinky.routeNode.routeNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: String,
      childRoutes: js.UndefOr[scala.Nothing],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: String,
      childRoutes: js.Array[typingsSlinky.routeNode.routeNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: String,
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.UndefOr[scala.Nothing],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: String,
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.Array[typingsSlinky.routeNode.routeNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: String, path: String, childRoutes: js.UndefOr[scala.Nothing], options: RouteNodeOptions) = this()
    def this(
      name: String,
      path: String,
      childRoutes: js.Array[typingsSlinky.routeNode.routeNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
  }
}
