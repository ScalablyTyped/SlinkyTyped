package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.Arm64RegOperand
  - typingsSlinky.fridaGum.Arm64ImmOperand
  - typingsSlinky.fridaGum.Arm64MemOperand
  - typingsSlinky.fridaGum.Arm64FpOperand
  - typingsSlinky.fridaGum.Arm64CimmOperand
  - typingsSlinky.fridaGum.Arm64RegMrsOperand
  - typingsSlinky.fridaGum.Arm64RegMsrOperand
  - typingsSlinky.fridaGum.Arm64PstateOperand
  - typingsSlinky.fridaGum.Arm64SysOperand
  - typingsSlinky.fridaGum.Arm64PrefetchOperand
  - typingsSlinky.fridaGum.Arm64BarrierOperand
*/
trait Arm64Operand extends js.Object

object Arm64Operand {
  @scala.inline
  implicit def apply(value: Arm64BarrierOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
  @scala.inline
  implicit def apply(value: Arm64CimmOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
  @scala.inline
  implicit def apply(value: Arm64FpOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
  @scala.inline
  implicit def apply(value: Arm64ImmOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
  @scala.inline
  implicit def apply(value: Arm64MemOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
  @scala.inline
  implicit def apply(value: Arm64PrefetchOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
  @scala.inline
  implicit def apply(value: Arm64PstateOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
  @scala.inline
  implicit def apply(value: Arm64RegMrsOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
  @scala.inline
  implicit def apply(value: Arm64RegMsrOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
  @scala.inline
  implicit def apply(value: Arm64RegOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
  @scala.inline
  implicit def apply(value: Arm64SysOperand): Arm64Operand = value.asInstanceOf[Arm64Operand]
}

