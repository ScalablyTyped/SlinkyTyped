package typingsSlinky.arraySort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.arraySort.mod.Comparator[T]
*/
trait ComparisonArg[T] extends ComparisonArgs[T]

object ComparisonArg {
  @scala.inline
  implicit def apply[T](value: Comparator[T]): ComparisonArg[T] = value.asInstanceOf[ComparisonArg[T]]
  @scala.inline
  implicit def apply[T](value: String): ComparisonArg[T] = value.asInstanceOf[ComparisonArg[T]]
}

