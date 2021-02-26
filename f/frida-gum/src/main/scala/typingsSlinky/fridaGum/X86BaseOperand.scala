package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X86BaseOperand extends StObject {
  
  var size: Double = js.native
}
object X86BaseOperand {
  
  @scala.inline
  def apply(size: Double): X86BaseOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86BaseOperand]
  }
  
  @scala.inline
  implicit class X86BaseOperandMutableBuilder[Self <: X86BaseOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
