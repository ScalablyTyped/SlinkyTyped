package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.imm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArmImmOperand
  extends ArmBaseOperand
     with ArmOperand {
  
  var `type`: imm = js.native
  
  var value: Double = js.native
}
object ArmImmOperand {
  
  @scala.inline
  def apply(subtracted: Boolean, `type`: imm, value: Double): ArmImmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmImmOperand]
  }
  
  @scala.inline
  implicit class ArmImmOperandMutableBuilder[Self <: ArmImmOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: imm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
