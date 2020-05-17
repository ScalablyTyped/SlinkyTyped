package typingsSlinky.reactTracking.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactTracking.reactTrackingBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.reactTracking.reactTrackingStrings._empty
*/
trait Falsy extends js.Object

object Falsy {
  @scala.inline
  def `false`: typingsSlinky.reactTracking.reactTrackingBooleans.`false` = false.asInstanceOf[typingsSlinky.reactTracking.reactTrackingBooleans.`false`]
  @scala.inline
  def _empty: typingsSlinky.reactTracking.reactTrackingStrings._empty = "".asInstanceOf[typingsSlinky.reactTracking.reactTrackingStrings._empty]
  @scala.inline
  implicit def apply(value: Null): Falsy = value.asInstanceOf[Falsy]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Falsy): Falsy = value.asInstanceOf[Falsy]
}

