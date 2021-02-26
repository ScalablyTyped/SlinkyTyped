package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.imm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X86ImmOperand
  extends X86BaseOperand
     with X86Operand {
  
  var `type`: imm = js.native
  
  var value: Double | Int64 = js.native
}
object X86ImmOperand {
  
  @scala.inline
  def apply(size: Double, `type`: imm, value: Double | Int64): X86ImmOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86ImmOperand]
  }
  
  @scala.inline
  implicit class X86ImmOperandMutableBuilder[Self <: X86ImmOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: imm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double | Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
