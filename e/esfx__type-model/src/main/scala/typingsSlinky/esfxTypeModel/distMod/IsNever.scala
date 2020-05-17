package typingsSlinky.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
  - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`
*/
trait IsNever[A]
  extends IsSubtypeOf[A, js.Any]
     with SameType[js.Any, A]

object IsNever {
  @scala.inline
  def `false`[A]: typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false` = false.asInstanceOf[typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`]
  @scala.inline
  def `true`[A]: typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true` = true.asInstanceOf[typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`true`]
}

