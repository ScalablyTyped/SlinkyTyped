package typingsSlinky.routeNode

import typingsSlinky.routeNode.routeNodeMod.MatchOptions
import typingsSlinky.routeNode.routeNodeMod.MatchResponse
import typingsSlinky.routeNode.routeNodeMod.RouteNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("route-node/dist/matchChildren", JSImport.Namespace)
@js.native
object matchChildrenMod extends js.Object {
  
  def default(nodes: js.Array[RouteNode], pathSegment: String, currentMatch: MatchResponse): MatchResponse | Null = js.native
  def default(
    nodes: js.Array[RouteNode],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: js.UndefOr[scala.Nothing],
    consumedBefore: String
  ): MatchResponse | Null = js.native
  def default(
    nodes: js.Array[RouteNode],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: MatchOptions
  ): MatchResponse | Null = js.native
  def default(
    nodes: js.Array[RouteNode],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: MatchOptions,
    consumedBefore: String
  ): MatchResponse | Null = js.native
}
