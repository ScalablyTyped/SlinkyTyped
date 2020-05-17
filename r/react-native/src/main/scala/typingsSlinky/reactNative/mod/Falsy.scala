package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - typingsSlinky.reactNative.reactNativeBooleans.`false`
*/
trait Falsy
  extends StyleProp[js.Any]

object Falsy {
  @scala.inline
  def `false`: typingsSlinky.reactNative.reactNativeBooleans.`false` = false.asInstanceOf[typingsSlinky.reactNative.reactNativeBooleans.`false`]
  @scala.inline
  implicit def apply(value: Null): Falsy = value.asInstanceOf[Falsy]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Falsy): Falsy = value.asInstanceOf[Falsy]
}

