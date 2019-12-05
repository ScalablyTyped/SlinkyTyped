package typingsSlinky.cashaddrjs

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cashaddrjs", JSImport.Namespace)
@js.native
object cashaddrjsMod extends js.Object {
  @js.native
  class ValidationError protected () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def decode(address: String): Anon_Hash = js.native
  def encode(prefix: String, `type`: String, hash: scala.scalajs.js.typedarray.Uint8Array): String = js.native
}

