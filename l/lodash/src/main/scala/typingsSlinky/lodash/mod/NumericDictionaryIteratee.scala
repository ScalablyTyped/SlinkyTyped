package typingsSlinky.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lodash.mod.NumericDictionaryIterator[T, typingsSlinky.lodash.mod.NotVoid]
  - typingsSlinky.lodash.mod.IterateeShorthand[T]
*/
trait NumericDictionaryIteratee[T] extends js.Object

object NumericDictionaryIteratee {
  @scala.inline
  implicit def apply[T](value: IterateeShorthand[T]): NumericDictionaryIteratee[T] = value.asInstanceOf[NumericDictionaryIteratee[T]]
  @scala.inline
  implicit def apply[T](value: NumericDictionaryIterator[T, NotVoid]): NumericDictionaryIteratee[T] = value.asInstanceOf[NumericDictionaryIteratee[T]]
}

