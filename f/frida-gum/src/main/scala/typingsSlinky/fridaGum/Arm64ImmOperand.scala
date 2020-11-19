package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.imm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64ImmOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: imm = js.native
  
  var value: Int64 = js.native
}
object Arm64ImmOperand {
  
  @scala.inline
  def apply(`type`: imm, value: Int64): Arm64ImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64ImmOperand]
  }
  
  @scala.inline
  implicit class Arm64ImmOperandOps[Self <: Arm64ImmOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: imm): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Int64): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
