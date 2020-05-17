package typingsSlinky.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
  - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`
  - typingsSlinky.esfxTypeModel.distMod.IsNever[B]
*/
trait SameType[A, B] extends js.Object

object SameType {
  @scala.inline
  def `false`[A, B]: typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false` = false.asInstanceOf[typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`]
  @scala.inline
  def `true`[A, B]: typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true` = true.asInstanceOf[typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`]
  @scala.inline
  implicit def apply[A, B](value: IsNever[B]): SameType[A, B] = value.asInstanceOf[SameType[A, B]]
}

