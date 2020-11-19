package typingsSlinky.router5

import typingsSlinky.routeNode.mod.RouteNode
import typingsSlinky.router5.routerMod.Route
import typingsSlinky.router5.routerMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("router5/dist/core/routes", JSImport.Namespace)
@js.native
object routesMod extends js.Object {
  
  def default[Dependencies](routes: js.Array[Route[Dependencies]]): js.Function1[/* router */ Router[Dependencies], Router[Dependencies]] = js.native
  def default[Dependencies](routes: RouteNode): js.Function1[/* router */ Router[Dependencies], Router[Dependencies]] = js.native
}
