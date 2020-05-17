package typingsSlinky.jquery.JQuery

import typingsSlinky.std.HTMLAllCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jquery.jqueryBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.jquery.jqueryNumbers.`0`
  - typingsSlinky.jquery.jqueryStrings._empty
  - typingsSlinky.std.HTMLAllCollection
*/
trait Falsy extends js.Object

object Falsy {
  @scala.inline
  def `false`: typingsSlinky.jquery.jqueryBooleans.`false` = false.asInstanceOf[typingsSlinky.jquery.jqueryBooleans.`false`]
  @scala.inline
  def `0`: typingsSlinky.jquery.jqueryNumbers.`0` = 0.asInstanceOf[typingsSlinky.jquery.jqueryNumbers.`0`]
  @scala.inline
  def _empty: typingsSlinky.jquery.jqueryStrings._empty = "".asInstanceOf[typingsSlinky.jquery.jqueryStrings._empty]
  @scala.inline
  implicit def apply(value: HTMLAllCollection): Falsy = value.asInstanceOf[Falsy]
  @scala.inline
  implicit def apply(value: Null): Falsy = value.asInstanceOf[Falsy]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Falsy): Falsy = value.asInstanceOf[Falsy]
}

