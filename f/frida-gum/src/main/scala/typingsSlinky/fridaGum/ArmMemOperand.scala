package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.anon.Disp
import typingsSlinky.fridaGum.fridaGumStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArmMemOperand
  extends ArmBaseOperand
     with ArmOperand {
  
  var `type`: mem = js.native
  
  var value: Disp = js.native
}
object ArmMemOperand {
  
  @scala.inline
  def apply(subtracted: Boolean, `type`: mem, value: Disp): ArmMemOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmMemOperand]
  }
  
  @scala.inline
  implicit class ArmMemOperandOps[Self <: ArmMemOperand] (val x: Self) extends AnyVal {
    
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
    def setType(value: mem): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Disp): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
