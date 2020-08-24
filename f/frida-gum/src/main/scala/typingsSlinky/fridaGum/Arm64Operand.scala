package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.anon.Index
import typingsSlinky.fridaGum.fridaGumStrings.`reg-mrs`
import typingsSlinky.fridaGum.fridaGumStrings.`reg-msr`
import typingsSlinky.fridaGum.fridaGumStrings.barrier
import typingsSlinky.fridaGum.fridaGumStrings.cimm
import typingsSlinky.fridaGum.fridaGumStrings.fp
import typingsSlinky.fridaGum.fridaGumStrings.imm
import typingsSlinky.fridaGum.fridaGumStrings.mem
import typingsSlinky.fridaGum.fridaGumStrings.prefetch
import typingsSlinky.fridaGum.fridaGumStrings.pstate
import typingsSlinky.fridaGum.fridaGumStrings.reg
import typingsSlinky.fridaGum.fridaGumStrings.sys
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
  def Arm64RegOperand(`type`: reg, value: Arm64Register): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64BarrierOperand(`type`: barrier, value: Double): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64RegMsrOperand(`type`: `reg-msr`, value: Arm64Register): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64PstateOperand(`type`: pstate, value: Double): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64CimmOperand(`type`: cimm, value: Int64): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64RegMrsOperand(`type`: `reg-mrs`, value: Arm64Register): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64FpOperand(`type`: fp, value: Double): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64SysOperand(`type`: sys, value: Double): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64PrefetchOperand(`type`: prefetch, value: Double): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64MemOperand(`type`: mem, value: Index): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64ImmOperand(`type`: imm, value: Int64): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
}

