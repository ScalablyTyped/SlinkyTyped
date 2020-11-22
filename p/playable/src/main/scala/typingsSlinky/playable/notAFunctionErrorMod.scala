package typingsSlinky.playable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/core/dependency-container/errors/NotAFunctionError", JSImport.Namespace)
@js.native
object notAFunctionErrorMod extends js.Object {
  
  @js.native
  class default protected ()
    extends typingsSlinky.playable.extendableErrorMod.default {
    def this(functionName: String, expectedType: String, givenType: String) = this()
  }
  
  type NotAFunctionError = typingsSlinky.playable.extendableErrorMod.default
}
