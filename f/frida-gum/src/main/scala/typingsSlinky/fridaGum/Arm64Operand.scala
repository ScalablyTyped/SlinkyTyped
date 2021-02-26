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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Arm64Operand extends StObject
object Arm64Operand {
  
  @scala.inline
  def Arm64BarrierOperand(`type`: barrier, value: Double): typingsSlinky.fridaGum.Arm64BarrierOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64BarrierOperand]
  }
  
  @scala.inline
  def Arm64CimmOperand(`type`: cimm, value: Int64): typingsSlinky.fridaGum.Arm64CimmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64CimmOperand]
  }
  
  @scala.inline
  def Arm64FpOperand(`type`: fp, value: Double): typingsSlinky.fridaGum.Arm64FpOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64FpOperand]
  }
  
  @scala.inline
  def Arm64ImmOperand(`type`: imm, value: Int64): typingsSlinky.fridaGum.Arm64ImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64ImmOperand]
  }
  
  @scala.inline
  def Arm64MemOperand(`type`: mem, value: Index): typingsSlinky.fridaGum.Arm64MemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64MemOperand]
  }
  
  @scala.inline
  def Arm64PrefetchOperand(`type`: prefetch, value: Double): typingsSlinky.fridaGum.Arm64PrefetchOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64PrefetchOperand]
  }
  
  @scala.inline
  def Arm64PstateOperand(`type`: pstate, value: Double): typingsSlinky.fridaGum.Arm64PstateOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64PstateOperand]
  }
  
  @scala.inline
  def Arm64RegMrsOperand(`type`: `reg-mrs`, value: Arm64Register): typingsSlinky.fridaGum.Arm64RegMrsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64RegMrsOperand]
  }
  
  @scala.inline
  def Arm64RegMsrOperand(`type`: `reg-msr`, value: Arm64Register): typingsSlinky.fridaGum.Arm64RegMsrOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64RegMsrOperand]
  }
  
  @scala.inline
  def Arm64RegOperand(`type`: reg, value: Arm64Register): typingsSlinky.fridaGum.Arm64RegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64RegOperand]
  }
  
  @scala.inline
  def Arm64SysOperand(`type`: sys, value: Double): typingsSlinky.fridaGum.Arm64SysOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.Arm64SysOperand]
  }
}
