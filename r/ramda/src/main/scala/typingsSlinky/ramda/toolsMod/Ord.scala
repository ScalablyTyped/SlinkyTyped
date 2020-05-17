package typingsSlinky.ramda.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - scala.Boolean
  - typingsSlinky.std.Date
*/
trait Ord extends js.Object

object Ord {
  @scala.inline
  implicit def apply(value: Boolean): Ord = value.asInstanceOf[Ord]
  @scala.inline
  implicit def apply(value: js.Date): Ord = value.asInstanceOf[Ord]
  @scala.inline
  implicit def apply(value: Double): Ord = value.asInstanceOf[Ord]
  @scala.inline
  implicit def apply(value: String): Ord = value.asInstanceOf[Ord]
}

