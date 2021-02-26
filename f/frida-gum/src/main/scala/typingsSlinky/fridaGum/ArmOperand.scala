package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.anon.Disp
import typingsSlinky.fridaGum.fridaGumStrings.cimm
import typingsSlinky.fridaGum.fridaGumStrings.fp
import typingsSlinky.fridaGum.fridaGumStrings.imm
import typingsSlinky.fridaGum.fridaGumStrings.mem
import typingsSlinky.fridaGum.fridaGumStrings.pimm
import typingsSlinky.fridaGum.fridaGumStrings.reg
import typingsSlinky.fridaGum.fridaGumStrings.setend
import typingsSlinky.fridaGum.fridaGumStrings.sysreg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.ArmRegOperand
  - typingsSlinky.fridaGum.ArmImmOperand
  - typingsSlinky.fridaGum.ArmMemOperand
  - typingsSlinky.fridaGum.ArmFpOperand
  - typingsSlinky.fridaGum.ArmCimmOperand
  - typingsSlinky.fridaGum.ArmPimmOperand
  - typingsSlinky.fridaGum.ArmSetendOperand
  - typingsSlinky.fridaGum.ArmSysregOperand
*/
trait ArmOperand extends StObject
object ArmOperand {
  
  @scala.inline
  def ArmCimmOperand(subtracted: Boolean, `type`: cimm, value: Double): typingsSlinky.fridaGum.ArmCimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.ArmCimmOperand]
  }
  
  @scala.inline
  def ArmFpOperand(subtracted: Boolean, `type`: fp, value: Double): typingsSlinky.fridaGum.ArmFpOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.ArmFpOperand]
  }
  
  @scala.inline
  def ArmImmOperand(subtracted: Boolean, `type`: imm, value: Double): typingsSlinky.fridaGum.ArmImmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.ArmImmOperand]
  }
  
  @scala.inline
  def ArmMemOperand(subtracted: Boolean, `type`: mem, value: Disp): typingsSlinky.fridaGum.ArmMemOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.ArmMemOperand]
  }
  
  @scala.inline
  def ArmPimmOperand(subtracted: Boolean, `type`: pimm, value: Double): typingsSlinky.fridaGum.ArmPimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.ArmPimmOperand]
  }
  
  @scala.inline
  def ArmRegOperand(subtracted: Boolean, `type`: reg, value: ArmRegister): typingsSlinky.fridaGum.ArmRegOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.ArmRegOperand]
  }
  
  @scala.inline
  def ArmSetendOperand(subtracted: Boolean, `type`: setend, value: Endian): typingsSlinky.fridaGum.ArmSetendOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.ArmSetendOperand]
  }
  
  @scala.inline
  def ArmSysregOperand(subtracted: Boolean, `type`: sysreg, value: ArmRegister): typingsSlinky.fridaGum.ArmSysregOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.ArmSysregOperand]
  }
}
