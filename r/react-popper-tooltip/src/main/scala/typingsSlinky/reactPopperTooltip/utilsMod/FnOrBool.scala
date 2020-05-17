package typingsSlinky.reactPopperTooltip.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.reactPopperTooltip.utilsMod.Fn
*/
trait FnOrBool extends js.Object

object FnOrBool {
  @scala.inline
  implicit def apply(value: Fn): FnOrBool = value.asInstanceOf[FnOrBool]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => FnOrBool): FnOrBool = value.asInstanceOf[FnOrBool]
}

