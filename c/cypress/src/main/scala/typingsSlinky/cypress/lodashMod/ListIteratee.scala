package typingsSlinky.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cypress.lodashMod.ListIterator[T, typingsSlinky.cypress.lodashMod.NotVoid]
  - typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
*/
trait ListIteratee[T] extends js.Object

object ListIteratee {
  @scala.inline
  implicit def apply[T](value: IterateeShorthand[T]): ListIteratee[T] = value.asInstanceOf[ListIteratee[T]]
  @scala.inline
  implicit def apply[T](value: ListIterator[T, NotVoid]): ListIteratee[T] = value.asInstanceOf[ListIteratee[T]]
}

