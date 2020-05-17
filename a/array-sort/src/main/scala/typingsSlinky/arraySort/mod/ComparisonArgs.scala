package typingsSlinky.arraySort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arraySort.mod.ComparisonArg[T]
  - js.Array[typingsSlinky.arraySort.mod.ComparisonArg[T]]
*/
trait ComparisonArgs[T] extends js.Object

object ComparisonArgs {
  @scala.inline
  implicit def apply[T](value: js.Array[ComparisonArg[T]]): ComparisonArgs[T] = value.asInstanceOf[ComparisonArgs[T]]
  @scala.inline
  implicit def apply[T](value: ComparisonArg[T]): ComparisonArgs[T] = value.asInstanceOf[ComparisonArgs[T]]
}

