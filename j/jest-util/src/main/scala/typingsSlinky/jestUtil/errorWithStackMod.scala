package typingsSlinky.jestUtil

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-util/build/ErrorWithStack", JSImport.Namespace)
@js.native
object errorWithStackMod extends js.Object {
  
  @js.native
  class default protected () extends Error {
    def this(message: js.UndefOr[scala.Nothing], callsite: js.Function) = this()
    def this(message: String, callsite: js.Function) = this()
  }
  
  type ErrorWithStack = js.Error
}
