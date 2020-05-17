package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// If T can't be assigned to TBase fallback to an alternate type TAlt
/* Rewritten from type alias, can be one of: 
  - TAlt
  - T
*/
trait IncompatibleToAlt[T, TBase, TAlt] extends js.Object

object IncompatibleToAlt {
  @scala.inline
  implicit def apply[T, TBase, TAlt](value: T | TAlt): IncompatibleToAlt[T, TBase, TAlt] = value.asInstanceOf[IncompatibleToAlt[T, TBase, TAlt]]
}

