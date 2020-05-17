package typingsSlinky.falcorRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.falcorRouter.mod.GetRoute
  - typingsSlinky.falcorRouter.mod.SetRoute
  - typingsSlinky.falcorRouter.mod.CallRoute
*/
trait RouteDefinition extends js.Object

object RouteDefinition {
  @scala.inline
  implicit def apply(value: CallRoute): RouteDefinition = value.asInstanceOf[RouteDefinition]
  @scala.inline
  implicit def apply(value: GetRoute): RouteDefinition = value.asInstanceOf[RouteDefinition]
  @scala.inline
  implicit def apply(value: SetRoute): RouteDefinition = value.asInstanceOf[RouteDefinition]
}

