package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Instruction")
@js.native
class Instruction ()
  extends typingsSlinky.fridaGum.Instruction
object Instruction {
  
  /**
    * Parses the instruction at the `target` address in memory.
    *
    * Note that on 32-bit ARM this address must have its least significant bit
    * set to 0 for ARM functions, and 1 for Thumb functions. Frida takes care
    * of this detail for you if you get the address from a Frida API, for
    * example `Module.getExportByName()`.
    *
    * @param target Memory location containing instruction to parse.
    */
  /* static member */
  @JSGlobal("Instruction.parse")
  @js.native
  def parse(target: NativePointerValue): typingsSlinky.fridaGum.Instruction | typingsSlinky.fridaGum.X86Instruction | typingsSlinky.fridaGum.ArmInstruction | typingsSlinky.fridaGum.Arm64Instruction | typingsSlinky.fridaGum.MipsInstruction = js.native
}
