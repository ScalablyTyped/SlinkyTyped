package typingsSlinky.ethereumjsVm

import typingsSlinky.bnJs.mod.^
import typingsSlinky.ethereumjsCommon.mod.default
import typingsSlinky.ethereumjsVm.evmMod.ExecResult
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type PrecompileFunc = js.Function1[/* opts */ PrecompileInput, ExecResult]
  
  @js.native
  trait PrecompileInput extends StObject {
    
    var _common: default = js.native
    
    var data: Buffer = js.native
    
    var gasLimit: ^ = js.native
  }
  object PrecompileInput {
    
    @scala.inline
    def apply(_common: default, data: Buffer, gasLimit: ^): PrecompileInput = {
      val __obj = js.Dynamic.literal(_common = _common.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrecompileInput]
    }
    
    @scala.inline
    implicit class PrecompileInputMutableBuilder[Self <: PrecompileInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimit(value: ^): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_common(value: default): Self = StObject.set(x, "_common", value.asInstanceOf[js.Any])
    }
  }
}
