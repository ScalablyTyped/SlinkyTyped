package typingsSlinky.ethereumjsVm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionsMod {
  
  @js.native
  sealed trait ERROR extends StObject
  @JSImport("ethereumjs-vm/dist/exceptions", "ERROR")
  @js.native
  object ERROR extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ERROR with String] = js.native
    
    @js.native
    sealed trait CREATE_COLLISION extends ERROR
    /* "create collision" */ val CREATE_COLLISION: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.CREATE_COLLISION with String = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends ERROR
    /* "internal error" */ val INTERNAL_ERROR: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.INTERNAL_ERROR with String = js.native
    
    @js.native
    sealed trait INVALID_JUMP extends ERROR
    /* "invalid JUMP" */ val INVALID_JUMP: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.INVALID_JUMP with String = js.native
    
    @js.native
    sealed trait INVALID_OPCODE extends ERROR
    /* "invalid opcode" */ val INVALID_OPCODE: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.INVALID_OPCODE with String = js.native
    
    @js.native
    sealed trait OUT_OF_GAS extends ERROR
    /* "out of gas" */ val OUT_OF_GAS: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.OUT_OF_GAS with String = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE extends ERROR
    /* "value out of range" */ val OUT_OF_RANGE: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.OUT_OF_RANGE with String = js.native
    
    @js.native
    sealed trait REFUND_EXHAUSTED extends ERROR
    /* "refund exhausted" */ val REFUND_EXHAUSTED: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.REFUND_EXHAUSTED with String = js.native
    
    @js.native
    sealed trait REVERT extends ERROR
    /* "revert" */ val REVERT: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.REVERT with String = js.native
    
    @js.native
    sealed trait STACK_OVERFLOW extends ERROR
    /* "stack overflow" */ val STACK_OVERFLOW: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.STACK_OVERFLOW with String = js.native
    
    @js.native
    sealed trait STACK_UNDERFLOW extends ERROR
    /* "stack underflow" */ val STACK_UNDERFLOW: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.STACK_UNDERFLOW with String = js.native
    
    @js.native
    sealed trait STATIC_STATE_CHANGE extends ERROR
    /* "static state change" */ val STATIC_STATE_CHANGE: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.STATIC_STATE_CHANGE with String = js.native
    
    @js.native
    sealed trait STOP extends ERROR
    /* "stop" */ val STOP: typingsSlinky.ethereumjsVm.exceptionsMod.ERROR.STOP with String = js.native
  }
  
  @JSImport("ethereumjs-vm/dist/exceptions", "VmError")
  @js.native
  class VmError protected () extends StObject {
    def this(error: ERROR) = this()
    
    var error: ERROR = js.native
    
    var errorType: String = js.native
  }
}
