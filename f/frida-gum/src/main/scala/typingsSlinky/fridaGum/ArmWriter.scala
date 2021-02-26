package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates machine code for arm.
  */
@js.native
trait ArmWriter extends StObject {
  
  /**
    * Memory location of the first byte of output.
    */
  var base: NativePointer = js.native
  
  /**
    * Determines whether a direct branch is possible between the two
    * given memory locations.
    */
  def canBranchDirectlyBetween(from: NativePointerValue, to: NativePointerValue): Boolean = js.native
  
  /**
    * Memory location of the next byte of output.
    */
  var code: NativePointer = js.native
  
  /**
    * Eagerly cleans up memory.
    */
  def dispose(): Unit = js.native
  
  /**
    * Resolves label references and writes pending data to memory. You
    * should always call this once you've finished generating code. It
    * is usually also desirable to do this between pieces of unrelated
    * code, e.g. when generating multiple functions in one go.
    */
  def flush(): Unit = js.native
  
  /**
    * Current offset in bytes.
    */
  var offset: Double = js.native
  
  /**
    * Program counter at the next byte of output.
    */
  var pc: NativePointer = js.native
  
  /**
    * Puts an ADD instruction.
    */
  def putAddRegRegImm(dstReg: ArmRegister, srcReg: ArmRegister, immVal: Double): Unit = js.native
  
  /**
    * Puts an ADD instruction.
    */
  def putAddRegRegReg(dstReg: ArmRegister, srcReg1: ArmRegister, srcReg2: ArmRegister): Unit = js.native
  
  /**
    * Puts an ADD SHIFT instruction.
    */
  def putAddRegRegRegShift(
    dstReg: ArmRegister,
    srcReg1: ArmRegister,
    srcReg2: ArmRegister,
    shift: ArmShifter,
    shiftValue: Double
  ): Unit = js.native
  
  /**
    * Puts an ADD U16 instruction.
    */
  def putAddRegU16(dstReg: ArmRegister, `val`: Double): Unit = js.native
  
  /**
    * Puts an ADD instruction.
    */
  def putAddRegU32(dstReg: ArmRegister, `val`: Double): Unit = js.native
  
  /**
    * Puts an ANDS instruction.
    */
  def putAndsRegRegImm(dstReg: ArmRegister, srcReg: ArmRegister, immVal: Double): Unit = js.native
  
  /**
    * Puts a B COND instruction.
    */
  def putBCondImm(cc: ArmConditionCode, target: NativePointerValue): Unit = js.native
  
  /**
    * Puts a B COND instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBCondLabel(cc: ArmConditionCode, labelId: String): Unit = js.native
  
  /**
    * Puts a B instruction.
    */
  def putBImm(target: NativePointerValue): Unit = js.native
  
  /**
    * Puts a B instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBLabel(labelId: String): Unit = js.native
  
  /**
    * Puts a BL instruction.
    */
  def putBlImm(target: NativePointerValue): Unit = js.native
  
  /**
    * Puts a BL instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBlLabel(labelId: String): Unit = js.native
  
  /**
    * Puts a BLX instruction.
    */
  def putBlxImm(target: NativePointerValue): Unit = js.native
  
  /**
    * Puts a BLX instruction.
    */
  def putBlxReg(reg: ArmRegister): Unit = js.native
  
  /**
    * Puts code needed for branching/jumping to the given address.
    */
  def putBranchAddress(address: NativePointerValue): Unit = js.native
  
  /**
    * Puts an OS/architecture-specific breakpoint instruction.
    */
  def putBreakpoint(): Unit = js.native
  
  /**
    * Puts a BRK instruction.
    */
  def putBrkImm(imm: Double): Unit = js.native
  
  /**
    * Puts a BX instruction.
    */
  def putBxReg(reg: ArmRegister): Unit = js.native
  
  def putBytes(data: String): Unit = js.native
  def putBytes(data: js.Array[Double]): Unit = js.native
  /**
    * Puts raw data.
    */
  def putBytes(data: ArrayBuffer): Unit = js.native
  
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallAddressWithArguments(func: NativePointerValue, args: js.Array[ArmCallArgument]): Unit = js.native
  
  /**
    * Puts a CMP instruction.
    */
  def putCmpRegImm(dstReg: ArmRegister, immVal: Double): Unit = js.native
  
  /**
    * Puts a raw instruction.
    */
  def putInstruction(insn: Double): Unit = js.native
  
  /**
    * Puts a label at the current position, where `id` is an identifier
    * that may be referenced in past and future `put*Label()` calls.
    */
  def putLabel(id: String): Unit = js.native
  
  /**
    * Puts an LDMIA MASK instruction.
    */
  def putLdmiaRegMask(reg: ArmRegister, mask: Double): Unit = js.native
  
  /**
    * Puts an LDR COND instruction.
    */
  def putLdrCondRegRegOffset(cc: ArmConditionCode, dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: Double): Unit = js.native
  def putLdrCondRegRegOffset(cc: ArmConditionCode, dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: Int64): Unit = js.native
  def putLdrCondRegRegOffset(cc: ArmConditionCode, dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: UInt64): Unit = js.native
  
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegAddress(reg: ArmRegister, address: NativePointerValue): Unit = js.native
  
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegRegOffset(dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: Double): Unit = js.native
  def putLdrRegRegOffset(dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: Int64): Unit = js.native
  def putLdrRegRegOffset(dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: UInt64): Unit = js.native
  
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegU32(reg: ArmRegister, `val`: Double): Unit = js.native
  
  /**
    * Puts a MOV CPSR instruction.
    */
  def putMovCpsrReg(reg: ArmRegister): Unit = js.native
  
  /**
    * Puts a MOV CPSR instruction.
    */
  def putMovRegCpsr(reg: ArmRegister): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegReg(dstReg: ArmRegister, srcReg: ArmRegister): Unit = js.native
  
  /**
    * Puts a MOV SHIFT instruction.
    */
  def putMovRegRegShift(dstReg: ArmRegister, srcReg: ArmRegister, shift: ArmShifter, shiftValue: Double): Unit = js.native
  
  /**
    * Puts a NOP instruction.
    */
  def putNop(): Unit = js.native
  
  /**
    * Puts a RET instruction.
    */
  def putRet(): Unit = js.native
  
  /**
    * Puts a STR COND instruction.
    */
  def putStrCondRegRegOffset(cc: ArmConditionCode, srcReg: ArmRegister, dstReg: ArmRegister, dstOffset: Double): Unit = js.native
  def putStrCondRegRegOffset(cc: ArmConditionCode, srcReg: ArmRegister, dstReg: ArmRegister, dstOffset: Int64): Unit = js.native
  def putStrCondRegRegOffset(cc: ArmConditionCode, srcReg: ArmRegister, dstReg: ArmRegister, dstOffset: UInt64): Unit = js.native
  
  /**
    * Puts a STR instruction.
    */
  def putStrRegRegOffset(srcReg: ArmRegister, dstReg: ArmRegister, dstOffset: Double): Unit = js.native
  def putStrRegRegOffset(srcReg: ArmRegister, dstReg: ArmRegister, dstOffset: Int64): Unit = js.native
  def putStrRegRegOffset(srcReg: ArmRegister, dstReg: ArmRegister, dstOffset: UInt64): Unit = js.native
  
  /**
    * Puts a SUB instruction.
    */
  def putSubRegRegImm(dstReg: ArmRegister, srcReg: ArmRegister, immVal: Double): Unit = js.native
  
  /**
    * Puts a SUB instruction.
    */
  def putSubRegRegReg(dstReg: ArmRegister, srcReg1: ArmRegister, srcReg2: ArmRegister): Unit = js.native
  
  /**
    * Puts a SUB U16 instruction.
    */
  def putSubRegU16(dstReg: ArmRegister, `val`: Double): Unit = js.native
  
  /**
    * Puts a SUB instruction.
    */
  def putSubRegU32(dstReg: ArmRegister, `val`: Double): Unit = js.native
  
  /**
    * Recycles instance.
    */
  def reset(codeAddress: NativePointerValue): Unit = js.native
  def reset(codeAddress: NativePointerValue, options: ArmWriterOptions): Unit = js.native
  
  /**
    * Skips `nBytes`.
    */
  def skip(nBytes: Double): Unit = js.native
}
