package typingsSlinky.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[/ * value * / T, / * key * / java.lang.String, typingsSlinky.cypress.lodashMod.NotVoid]
  - typingsSlinky.cypress.lodashMod.IterateeShorthand[T]
*/
trait ValueKeyIteratee[T] extends js.Object

object ValueKeyIteratee {
  @scala.inline
  implicit def apply[T](value: js.Function2[/* value */ T, /* key */ String, NotVoid]): ValueKeyIteratee[T] = value.asInstanceOf[ValueKeyIteratee[T]]
  @scala.inline
  implicit def apply[T](value: IterateeShorthand[T]): ValueKeyIteratee[T] = value.asInstanceOf[ValueKeyIteratee[T]]
}

