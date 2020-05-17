package typingsSlinky.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cypress.lodashMod.ListIterator[T, TResult]
  - typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
*/
trait ListIterateeCustom[T, TResult] extends js.Object

object ListIterateeCustom {
  @scala.inline
  implicit def apply[T, TResult](value: IterateeShorthand[T]): ListIterateeCustom[T, TResult] = value.asInstanceOf[ListIterateeCustom[T, TResult]]
  @scala.inline
  implicit def apply[T, TResult](value: ListIterator[T, TResult]): ListIterateeCustom[T, TResult] = value.asInstanceOf[ListIterateeCustom[T, TResult]]
}

