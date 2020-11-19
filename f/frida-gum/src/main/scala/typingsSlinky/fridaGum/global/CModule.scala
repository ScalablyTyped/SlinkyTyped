package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.CSymbols
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compiles C source code to machine code, straight to memory.
  *
  * Useful for implementing hot callbacks, e.g. for `Interceptor` and `Stalker`,
  * but also useful when needing to start new threads in order to call functions
  * in a tight loop, e.g. for fuzzing purposes.
  *
  * Global functions are automatically exported as `NativePointer` properties
  * named exactly like in the C source code. This means you can pass them to
  * `Interceptor` and `Stalker`, or call them using `NativeFunction`.
  *
  * Symbols can also be plugged in at creation, e.g. memory allocated using
  * `Memory.alloc()`, or `NativeCallback` for receiving callbacks from the C
  * module.
  *
  * To perform initialization and cleanup, you may define functions with the
  * following names and signatures:
  *
  *     `void init (void)`
  *     `void finalize (void)`
  *
  * Note that all data is read-only, so writable globals should be declared
  * `extern`, allocated using e.g. `Memory.alloc()`, and passed in as symbols
  * through the constructor's second argument.
  */
@JSGlobal("CModule")
@js.native
class CModule protected ()
  extends typingsSlinky.fridaGum.CModule {
  /**
    * Creates a new C module by compiling the provided C source code to machine
    * code, straight to memory.
    *
    * @param source C source code to compile.
    * @param symbols Symbols to expose to the C module. Declare them as `extern`.
    */
  def this(source: String) = this()
  def this(source: String, symbols: CSymbols) = this()
}
