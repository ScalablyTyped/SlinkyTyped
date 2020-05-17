package typingsSlinky.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
  - typingsSlinky.esfxTypeModel.esfxTypeModelNumbers.`0`
  - typingsSlinky.esfxTypeModel.esfxTypeModelStrings._empty
*/
trait Falsey extends js.Object

object Falsey {
  @scala.inline
  def `false`: typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false` = false.asInstanceOf[typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`]
  @scala.inline
  def `0`: typingsSlinky.esfxTypeModel.esfxTypeModelNumbers.`0` = 0.asInstanceOf[typingsSlinky.esfxTypeModel.esfxTypeModelNumbers.`0`]
  @scala.inline
  def _empty: typingsSlinky.esfxTypeModel.esfxTypeModelStrings._empty = "".asInstanceOf[typingsSlinky.esfxTypeModel.esfxTypeModelStrings._empty]
  @scala.inline
  implicit def apply(value: Null): Falsey = value.asInstanceOf[Falsey]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Falsey): Falsey = value.asInstanceOf[Falsey]
}

