package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.anon.Base
import typingsSlinky.fridaGum.fridaGumStrings.imm
import typingsSlinky.fridaGum.fridaGumStrings.mem
import typingsSlinky.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.X86RegOperand
  - typingsSlinky.fridaGum.X86ImmOperand
  - typingsSlinky.fridaGum.X86MemOperand
*/
trait X86Operand extends StObject
object X86Operand {
  
  @scala.inline
  def X86ImmOperand(size: Double, `type`: imm, value: Double | Int64): typingsSlinky.fridaGum.X86ImmOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.X86ImmOperand]
  }
  
  @scala.inline
  def X86MemOperand(size: Double, `type`: mem, value: Base): typingsSlinky.fridaGum.X86MemOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.X86MemOperand]
  }
  
  @scala.inline
  def X86RegOperand(size: Double, `type`: reg, value: X86Register): typingsSlinky.fridaGum.X86RegOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.X86RegOperand]
  }
}
