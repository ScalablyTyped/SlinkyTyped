package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.NativePointerValue
import typingsSlinky.fridaGum.ThumbWriterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generates machine code for arm.
  */
@JSGlobal("ThumbWriter")
@js.native
class ThumbWriter protected ()
  extends typingsSlinky.fridaGum.ThumbWriter {
  /**
    * Creates a new code writer for generating ARM machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: ThumbWriterOptions) = this()
}

