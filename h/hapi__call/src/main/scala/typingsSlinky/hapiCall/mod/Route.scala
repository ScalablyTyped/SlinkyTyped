package typingsSlinky.hapiCall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiCall.mod.Match[P, D]
  - typingsSlinky.std.Error
*/
trait Route[P, D] extends js.Object

object Route {
  @scala.inline
  implicit def apply[P, D](value: js.Error): Route[P, D] = value.asInstanceOf[Route[P, D]]
  @scala.inline
  implicit def apply[P, D](value: Match[P, D]): Route[P, D] = value.asInstanceOf[Route[P, D]]
}

