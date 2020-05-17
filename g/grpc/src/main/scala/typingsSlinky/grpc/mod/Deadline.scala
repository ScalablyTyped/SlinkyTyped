package typingsSlinky.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.std.Date
*/
trait Deadline extends js.Object

object Deadline {
  @scala.inline
  implicit def apply(value: js.Date): Deadline = value.asInstanceOf[Deadline]
  @scala.inline
  implicit def apply(value: Double): Deadline = value.asInstanceOf[Deadline]
}

