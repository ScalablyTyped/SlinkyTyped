package typingsSlinky.mergerino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mergerino.mergerinoBooleans.`false`
  - typingsSlinky.mergerino.mergerinoNumbers.`0`
  - typingsSlinky.mergerino.mergerinoStrings._empty
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait Falsy
  extends TopLevelPatch[js.Any]

object Falsy {
  @scala.inline
  def `false`: typingsSlinky.mergerino.mergerinoBooleans.`false` = false.asInstanceOf[typingsSlinky.mergerino.mergerinoBooleans.`false`]
  @scala.inline
  def `0`: typingsSlinky.mergerino.mergerinoNumbers.`0` = 0.asInstanceOf[typingsSlinky.mergerino.mergerinoNumbers.`0`]
  @scala.inline
  def _empty: typingsSlinky.mergerino.mergerinoStrings._empty = "".asInstanceOf[typingsSlinky.mergerino.mergerinoStrings._empty]
  @scala.inline
  implicit def apply(value: Null): Falsy = value.asInstanceOf[Falsy]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Falsy): Falsy = value.asInstanceOf[Falsy]
}

