package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.anon.Base
import typingsSlinky.fridaGum.fridaGumStrings.imm
import typingsSlinky.fridaGum.fridaGumStrings.mem
import typingsSlinky.fridaGum.fridaGumStrings.reg
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
  def X86RegOperand(size: Double, `type`: reg, value: X86Register): X86Operand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86Operand]
  }
  @scala.inline
  def X86ImmOperand(size: Double, `type`: imm, value: Double | Int64): X86Operand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86Operand]
  }
  @scala.inline
  def X86MemOperand(size: Double, `type`: mem, value: Base): X86Operand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86Operand]
  }
}

