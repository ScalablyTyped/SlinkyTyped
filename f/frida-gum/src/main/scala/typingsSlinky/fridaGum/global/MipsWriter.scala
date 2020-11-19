package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.MipsWriterOptions
import typingsSlinky.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates machine code for mips.
  */
@JSGlobal("MipsWriter")
@js.native
class MipsWriter protected ()
  extends typingsSlinky.fridaGum.MipsWriter {
  /**
    * Creates a new code writer for generating MIPS machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: MipsWriterOptions) = this()
}
