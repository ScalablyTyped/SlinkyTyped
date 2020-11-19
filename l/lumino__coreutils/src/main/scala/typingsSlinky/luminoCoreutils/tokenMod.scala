package typingsSlinky.luminoCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/coreutils/types/token", JSImport.Namespace)
@js.native
object tokenMod extends js.Object {
  
  @js.native
  class Token[T] protected () extends js.Object {
    /**
      * Construct a new token.
      *
      * @param name - A human readable name for the token.
      */
    def this(name: String) = this()
    
    var _tokenStructuralPropertyT: js.Any = js.native
    
    /**
      * The human readable name for the token.
      *
      * #### Notes
      * This can be useful for debugging and logging.
      */
    val name: String = js.native
  }
}
