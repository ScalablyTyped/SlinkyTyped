package typingsSlinky.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cypress.lodashMod.NumericDictionaryIterator[T, typingsSlinky.cypress.lodashMod.NotVoid]
  - typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
*/
trait NumericDictionaryIteratee[T] extends js.Object

object NumericDictionaryIteratee {
  @scala.inline
  implicit def apply[T](value: IterateeShorthand[T]): NumericDictionaryIteratee[T] = value.asInstanceOf[NumericDictionaryIteratee[T]]
  @scala.inline
  implicit def apply[T](value: NumericDictionaryIterator[T, NotVoid]): NumericDictionaryIteratee[T] = value.asInstanceOf[NumericDictionaryIteratee[T]]
}

