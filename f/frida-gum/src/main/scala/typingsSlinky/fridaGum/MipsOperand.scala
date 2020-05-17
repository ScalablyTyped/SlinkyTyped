package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.MipsRegOperand
  - typingsSlinky.fridaGum.MipsImmOperand
  - typingsSlinky.fridaGum.MipsMemOperand
*/
trait MipsOperand extends js.Object

object MipsOperand {
  @scala.inline
  implicit def apply(value: MipsImmOperand): MipsOperand = value.asInstanceOf[MipsOperand]
  @scala.inline
  implicit def apply(value: MipsMemOperand): MipsOperand = value.asInstanceOf[MipsOperand]
  @scala.inline
  implicit def apply(value: MipsRegOperand): MipsOperand = value.asInstanceOf[MipsOperand]
}

