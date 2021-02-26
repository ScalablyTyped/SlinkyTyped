package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.sys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64SysOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: sys = js.native
  
  var value: Double = js.native
}
object Arm64SysOperand {
  
  @scala.inline
  def apply(`type`: sys, value: Double): Arm64SysOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64SysOperand]
  }
  
  @scala.inline
  implicit class Arm64SysOperandMutableBuilder[Self <: Arm64SysOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sys): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
