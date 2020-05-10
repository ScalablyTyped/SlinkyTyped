package typingsSlinky.cashaddrjs

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cashaddrjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ValidationError protected () extends Error {
    def this(message: String) = this()
  }
  
  def decode(address: String): AnonHash = js.native
  def encode(prefix: String, `type`: String, hash: js.typedarray.Uint8Array): String = js.native
}

