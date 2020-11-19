package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.Arm64WriterOptions
import typingsSlinky.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates machine code for arm64.
  */
@JSGlobal("Arm64Writer")
@js.native
class Arm64Writer protected ()
  extends typingsSlinky.fridaGum.Arm64Writer {
  /**
    * Creates a new code writer for generating AArch64 machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: Arm64WriterOptions) = this()
}
