package typingsSlinky.cypress.JQuery

import typingsSlinky.std.HTMLAllCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cypress.cypressBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.cypress.cypressNumbers.`0`
  - typingsSlinky.cypress.cypressStrings._empty
  - typingsSlinky.std.HTMLAllCollection
*/
trait Falsy extends js.Object

object Falsy {
  @scala.inline
  def `false`: typingsSlinky.cypress.cypressBooleans.`false` = false.asInstanceOf[typingsSlinky.cypress.cypressBooleans.`false`]
  @scala.inline
  def `0`: typingsSlinky.cypress.cypressNumbers.`0` = 0.asInstanceOf[typingsSlinky.cypress.cypressNumbers.`0`]
  @scala.inline
  def _empty: typingsSlinky.cypress.cypressStrings._empty = "".asInstanceOf[typingsSlinky.cypress.cypressStrings._empty]
  @scala.inline
  implicit def apply(value: HTMLAllCollection): Falsy = value.asInstanceOf[Falsy]
  @scala.inline
  implicit def apply(value: Null): Falsy = value.asInstanceOf[Falsy]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Falsy): Falsy = value.asInstanceOf[Falsy]
}

