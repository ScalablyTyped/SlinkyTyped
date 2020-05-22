package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.anon.BaseDisp
import typingsSlinky.fridaGum.fridaGumStrings.imm
import typingsSlinky.fridaGum.fridaGumStrings.mem
import typingsSlinky.fridaGum.fridaGumStrings.reg
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
  def MipsRegOperand(`type`: reg, value: MipsRegister): MipsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsOperand]
  }
  @scala.inline
  def MipsImmOperand(`type`: imm, value: Double): MipsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsOperand]
  }
  @scala.inline
  def MipsMemOperand(`type`: mem, value: BaseDisp): MipsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsOperand]
  }
}

