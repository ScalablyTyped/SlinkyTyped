package typingsSlinky.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lodash.mod.ListIterator[T, typingsSlinky.lodash.mod.NotVoid]
  - typingsSlinky.lodash.mod.IterateeShorthand[T]
*/
trait ListIteratee[T] extends js.Object

object ListIteratee {
  @scala.inline
  implicit def apply[T](value: IterateeShorthand[T]): ListIteratee[T] = value.asInstanceOf[ListIteratee[T]]
  @scala.inline
  implicit def apply[T](value: ListIterator[T, NotVoid]): ListIteratee[T] = value.asInstanceOf[ListIteratee[T]]
}

