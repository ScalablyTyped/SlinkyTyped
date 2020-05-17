package typingsSlinky.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxFirstRouter.mod.RouteString
  - typingsSlinky.reduxFirstRouter.mod.RouteObject[TKeys, TState]
*/
trait Route[TKeys, TState] extends js.Object

object Route {
  @scala.inline
  implicit def apply[TKeys, TState](value: RouteObject[TKeys, TState]): Route[TKeys, TState] = value.asInstanceOf[Route[TKeys, TState]]
  @scala.inline
  implicit def apply[TKeys, TState](value: RouteString): Route[TKeys, TState] = value.asInstanceOf[Route[TKeys, TState]]
}

