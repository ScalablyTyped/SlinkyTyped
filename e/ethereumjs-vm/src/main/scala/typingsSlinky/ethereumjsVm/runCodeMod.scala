package typingsSlinky.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethereumjsVm.evmMod.ExecResult
import typingsSlinky.ethereumjsVm.evmMod.default
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runCodeMod {
  
  @JSImport("ethereumjs-vm/dist/runCode", JSImport.Default)
  @js.native
  def default(opts: RunCodeOpts): js.Promise[ExecResult] = js.native
  
  @js.native
  trait RunCodeOpts extends StObject {
    
    /**
      * The address of the account that is executing this code. The address should be a `Buffer` of bytes. Defaults to `0`
      */
    var address: js.UndefOr[Buffer] = js.native
    
    /**
      * The [`Block`](https://github.com/ethereumjs/ethereumjs-block) the `tx` belongs to. If omitted a blank block will be used
      */
    var block: js.UndefOr[js.Any] = js.native
    
    /**
      * The address that ran this code. The address should be a `Buffer` of 20 bits. Defaults to `0`
      */
    var caller: js.UndefOr[Buffer] = js.native
    
    /**
      * The EVM code to run
      */
    var code: js.UndefOr[Buffer] = js.native
    
    /**
      * The input data
      */
    var data: js.UndefOr[Buffer] = js.native
    
    var depth: js.UndefOr[Double] = js.native
    
    var evm: js.UndefOr[default] = js.native
    
    /**
      * Gas limit
      */
    var gasLimit: js.UndefOr[Buffer] = js.native
    
    var gasPrice: js.UndefOr[Buffer] = js.native
    
    var isStatic: js.UndefOr[Boolean] = js.native
    
    var message: js.UndefOr[typingsSlinky.ethereumjsVm.messageMod.default] = js.native
    
    /**
      * The address where the call originated from. The address should be a `Buffer` of 20 bits. Defaults to `0`
      */
    var origin: js.UndefOr[Buffer] = js.native
    
    /**
      * The initial program counter. Defaults to `0`
      */
    var pc: js.UndefOr[Double] = js.native
    
    var selfdestruct: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    var txContext: js.UndefOr[typingsSlinky.ethereumjsVm.txContextMod.default] = js.native
    
    /**
      * The value in ether that is being sent to `opt.address`. Defaults to `0`
      */
    var value: js.UndefOr[Buffer] = js.native
  }
  object RunCodeOpts {
    
    @scala.inline
    def apply(): RunCodeOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunCodeOpts]
    }
    
    @scala.inline
    implicit class RunCodeOptsMutableBuilder[Self <: RunCodeOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Buffer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setBlock(value: js.Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setCaller(value: Buffer): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
      
      @scala.inline
      def setCode(value: Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setEvm(value: default): Self = StObject.set(x, "evm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvmUndefined: Self = StObject.set(x, "evm", js.undefined)
      
      @scala.inline
      def setGasLimit(value: Buffer): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      @scala.inline
      def setGasPrice(value: Buffer): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
      
      @scala.inline
      def setMessage(value: typingsSlinky.ethereumjsVm.messageMod.default): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOrigin(value: Buffer): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPc(value: Double): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
      
      @scala.inline
      def setSelfdestruct(value: StringDictionary[Boolean]): Self = StObject.set(x, "selfdestruct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfdestructUndefined: Self = StObject.set(x, "selfdestruct", js.undefined)
      
      @scala.inline
      def setTxContext(value: typingsSlinky.ethereumjsVm.txContextMod.default): Self = StObject.set(x, "txContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxContextUndefined: Self = StObject.set(x, "txContext", js.undefined)
      
      @scala.inline
      def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
