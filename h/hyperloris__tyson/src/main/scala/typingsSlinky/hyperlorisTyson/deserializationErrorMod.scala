package typingsSlinky.hyperlorisTyson

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hyperloris/tyson/dist/types/exceptions/deserializationError", JSImport.Namespace)
@js.native
object deserializationErrorMod extends js.Object {
  
  @js.native
  class DeserializationError () extends Error {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], json: String) = this()
    def this(message: String, json: String) = this()
    
    var _json: js.Any = js.native
    
    val json: js.UndefOr[String] = js.native
  }
}
