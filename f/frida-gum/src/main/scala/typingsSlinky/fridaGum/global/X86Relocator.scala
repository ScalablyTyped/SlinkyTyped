package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relocates machine code for x86.
  */
@JSGlobal("X86Relocator")
@js.native
class X86Relocator protected ()
  extends typingsSlinky.fridaGum.X86Relocator {
  /**
    * Creates a new code relocator for copying x86 instructions
    * from one memory location to another, taking care to adjust
    * position-dependent instructions accordingly.
    *
    * @param inputCode Source address to copy instructions from.
    * @param output X86Writer pointed at the desired target memory
    *               address.
    */
  def this(inputCode: NativePointerValue, output: typingsSlinky.fridaGum.X86Writer) = this()
}
