package typingsSlinky.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
  - typingsSlinky.esfxTypeModel.distMod.Not[A | B]
*/
trait XOr[A /* <: Boolean */, B /* <: Boolean */] extends js.Object

object XOr {
  @scala.inline
  def `false`[A, B]: typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false` = false.asInstanceOf[typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`]
  @scala.inline
  implicit def apply[A, B](value: Not[A | B]): XOr[A, B] = value.asInstanceOf[XOr[A, B]]
}

