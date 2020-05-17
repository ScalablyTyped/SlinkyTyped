package typingsSlinky.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.catbox.mod.PolicyOptions[T]
  - typingsSlinky.catbox.mod.DecoratedPolicyOptions[T]
*/
trait PolicyOptionVariants[T] extends js.Object

object PolicyOptionVariants {
  @scala.inline
  implicit def apply[T](value: DecoratedPolicyOptions[T]): PolicyOptionVariants[T] = value.asInstanceOf[PolicyOptionVariants[T]]
  @scala.inline
  implicit def apply[T](value: PolicyOptions[T]): PolicyOptionVariants[T] = value.asInstanceOf[PolicyOptionVariants[T]]
}

