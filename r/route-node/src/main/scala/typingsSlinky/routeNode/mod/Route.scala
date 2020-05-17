package typingsSlinky.routeNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.routeNode.mod.RouteNode
  - typingsSlinky.routeNode.mod.RouteDefinition
*/
trait Route extends js.Object

object Route {
  @scala.inline
  implicit def apply(value: RouteDefinition): Route = value.asInstanceOf[Route]
  @scala.inline
  implicit def apply(value: RouteNode): Route = value.asInstanceOf[Route]
}

