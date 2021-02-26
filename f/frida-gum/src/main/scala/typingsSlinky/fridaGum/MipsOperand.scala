package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.anon.BaseDisp
import typingsSlinky.fridaGum.fridaGumStrings.imm
import typingsSlinky.fridaGum.fridaGumStrings.mem
import typingsSlinky.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.MipsRegOperand
  - typingsSlinky.fridaGum.MipsImmOperand
  - typingsSlinky.fridaGum.MipsMemOperand
*/
trait MipsOperand extends StObject
object MipsOperand {
  
  @scala.inline
  def MipsImmOperand(`type`: imm, value: Double): typingsSlinky.fridaGum.MipsImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.MipsImmOperand]
  }
  
  @scala.inline
  def MipsMemOperand(`type`: mem, value: BaseDisp): typingsSlinky.fridaGum.MipsMemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.MipsMemOperand]
  }
  
  @scala.inline
  def MipsRegOperand(`type`: reg, value: MipsRegister): typingsSlinky.fridaGum.MipsRegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.MipsRegOperand]
  }
}
