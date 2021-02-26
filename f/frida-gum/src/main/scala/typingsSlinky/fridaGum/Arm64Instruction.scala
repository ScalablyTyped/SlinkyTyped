package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64Instruction extends Instruction {
  
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[Arm64Operand] = js.native
  
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[Arm64Register] = js.native
  
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[Arm64Register] = js.native
}
object Arm64Instruction {
  
  @scala.inline
  def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    operands: js.Array[Arm64Operand],
    regsRead: js.Array[Arm64Register],
    regsWritten: js.Array[Arm64Register],
    size: Double
  ): Arm64Instruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], regsRead = regsRead.asInstanceOf[js.Any], regsWritten = regsWritten.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Instruction]
  }
  
  @scala.inline
  implicit class Arm64InstructionMutableBuilder[Self <: Arm64Instruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperands(value: js.Array[Arm64Operand]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperandsVarargs(value: Arm64Operand*): Self = StObject.set(x, "operands", js.Array(value :_*))
    
    @scala.inline
    def setRegsRead(value: js.Array[Arm64Register]): Self = StObject.set(x, "regsRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegsReadVarargs(value: Arm64Register*): Self = StObject.set(x, "regsRead", js.Array(value :_*))
    
    @scala.inline
    def setRegsWritten(value: js.Array[Arm64Register]): Self = StObject.set(x, "regsWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegsWrittenVarargs(value: Arm64Register*): Self = StObject.set(x, "regsWritten", js.Array(value :_*))
  }
}
