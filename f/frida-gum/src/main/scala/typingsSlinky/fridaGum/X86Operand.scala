package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.X86RegOperand
  - typingsSlinky.fridaGum.X86ImmOperand
  - typingsSlinky.fridaGum.X86MemOperand
*/
trait X86Operand extends js.Object

object X86Operand {
  @scala.inline
  implicit def apply(value: X86ImmOperand): X86Operand = value.asInstanceOf[X86Operand]
  @scala.inline
  implicit def apply(value: X86MemOperand): X86Operand = value.asInstanceOf[X86Operand]
  @scala.inline
  implicit def apply(value: X86RegOperand): X86Operand = value.asInstanceOf[X86Operand]
}

