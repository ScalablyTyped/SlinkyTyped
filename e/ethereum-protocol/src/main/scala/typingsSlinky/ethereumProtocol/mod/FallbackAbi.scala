package typingsSlinky.ethereumProtocol.mod

import typingsSlinky.ethereumProtocol.mod.AbiType.Fallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FallbackAbi extends FunctionAbi {
  
  var payable: Boolean = js.native
  
  var `type`: Fallback = js.native
}
object FallbackAbi {
  
  @scala.inline
  def apply(payable: Boolean, `type`: Fallback): FallbackAbi = {
    val __obj = js.Dynamic.literal(payable = payable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackAbi]
  }
  
  @scala.inline
  implicit class FallbackAbiMutableBuilder[Self <: FallbackAbi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Fallback): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
