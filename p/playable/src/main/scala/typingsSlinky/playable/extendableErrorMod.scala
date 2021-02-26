package typingsSlinky.playable

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendableErrorMod {
  
  @JSImport("playable/dist/src/core/dependency-container/errors/ExtendableError", JSImport.Default)
  @js.native
  class default protected () extends Error {
    def this(message: String) = this()
  }
  
  type ExtendableError = js.Error
}
