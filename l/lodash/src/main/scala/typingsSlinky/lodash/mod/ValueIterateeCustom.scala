package typingsSlinky.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * value * / T, TResult]
  - typingsSlinky.lodash.mod.IterateeShorthand[T]
*/
trait ValueIterateeCustom[T, TResult] extends js.Object

object ValueIterateeCustom {
  @scala.inline
  implicit def apply[T, TResult](value: js.Function1[/* value */ T, TResult]): ValueIterateeCustom[T, TResult] = value.asInstanceOf[ValueIterateeCustom[T, TResult]]
  @scala.inline
  implicit def apply[T, TResult](value: IterateeShorthand[T]): ValueIterateeCustom[T, TResult] = value.asInstanceOf[ValueIterateeCustom[T, TResult]]
}

