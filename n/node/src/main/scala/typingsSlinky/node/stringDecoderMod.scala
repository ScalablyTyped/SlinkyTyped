package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("string_decoder", JSImport.Namespace)
@js.native
object stringDecoderMod extends js.Object {
  
  @js.native
  class StringDecoder () extends js.Object {
    def this(encoding: BufferEncoding) = this()
    
    def end(): java.lang.String = js.native
    def end(buffer: Buffer): java.lang.String = js.native
    
    def write(buffer: Buffer): java.lang.String = js.native
  }
}
