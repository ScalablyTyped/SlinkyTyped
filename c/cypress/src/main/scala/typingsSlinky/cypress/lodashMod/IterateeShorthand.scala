package typingsSlinky.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cypress.lodashMod.PropertyName
  - js.Tuple2[typingsSlinky.cypress.lodashMod.PropertyName, js.Any]
  - typingsSlinky.cypress.lodashMod.PartialDeep[T]
*/
trait IterateeShorthand[T]
  extends ListIteratee[T]
     with ListIterateeCustom[T, js.Any]
     with NumericDictionaryIteratee[T]
     with NumericDictionaryIterateeCustom[T, js.Any]
     with ObjectIteratee[js.Any]
     with ObjectIterateeCustom[js.Any, js.Any]
     with ValueIteratee[T]
     with ValueIterateeCustom[T, js.Any]
     with ValueKeyIteratee[T]

object IterateeShorthand {
  @scala.inline
  implicit def apply[T](value: PartialDeep[T]): IterateeShorthand[T] = value.asInstanceOf[IterateeShorthand[T]]
  @scala.inline
  implicit def apply[T](value: PropertyName): IterateeShorthand[T] = value.asInstanceOf[IterateeShorthand[T]]
  @scala.inline
  implicit def apply[T](value: js.Tuple2[PropertyName, js.Any]): IterateeShorthand[T] = value.asInstanceOf[IterateeShorthand[T]]
}

