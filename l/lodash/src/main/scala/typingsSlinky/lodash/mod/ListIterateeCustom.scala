package typingsSlinky.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lodash.mod.ListIterator[T, TResult]
  - typingsSlinky.lodash.mod.IterateeShorthand[T]
*/
trait ListIterateeCustom[T, TResult] extends js.Object

object ListIterateeCustom {
  @scala.inline
  implicit def apply[T, TResult](value: IterateeShorthand[T]): ListIterateeCustom[T, TResult] = value.asInstanceOf[ListIterateeCustom[T, TResult]]
  @scala.inline
  implicit def apply[T, TResult](value: ListIterator[T, TResult]): ListIterateeCustom[T, TResult] = value.asInstanceOf[ListIterateeCustom[T, TResult]]
}

