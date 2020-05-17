package typingsSlinky.jointjs.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jointjs.mod.util.IterateeFunction
  - typingsSlinky.jointjs.mod.util.IterateeShorthand
*/
trait Iteratee extends js.Object

object Iteratee {
  @scala.inline
  implicit def apply(value: IterateeFunction): Iteratee = value.asInstanceOf[Iteratee]
  @scala.inline
  implicit def apply(value: IterateeShorthand): Iteratee = value.asInstanceOf[Iteratee]
}

