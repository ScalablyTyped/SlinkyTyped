package typingsSlinky.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
  - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`
  - typingsSlinky.esfxTypeModel.distMod.IsNever[Sub]
*/
trait IsSubtypeOf[Sub, Super] extends js.Object

object IsSubtypeOf {
  @scala.inline
  def `false`[Sub, Super]: typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false` = false.asInstanceOf[typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`]
  @scala.inline
  def `true`[Sub, Super]: typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true` = true.asInstanceOf[typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`]
  @scala.inline
  implicit def apply[Sub, Super](value: IsNever[Sub]): IsSubtypeOf[Sub, Super] = value.asInstanceOf[IsSubtypeOf[Sub, Super]]
}

