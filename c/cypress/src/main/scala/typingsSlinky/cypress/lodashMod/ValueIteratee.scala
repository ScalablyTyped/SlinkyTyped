package typingsSlinky.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * value * / T, typingsSlinky.cypress.lodashMod.NotVoid]
  - typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
*/
trait ValueIteratee[T] extends js.Object

object ValueIteratee {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* value */ T, NotVoid]): ValueIteratee[T] = value.asInstanceOf[ValueIteratee[T]]
  @scala.inline
  implicit def apply[T](value: IterateeShorthand[T]): ValueIteratee[T] = value.asInstanceOf[ValueIteratee[T]]
}

