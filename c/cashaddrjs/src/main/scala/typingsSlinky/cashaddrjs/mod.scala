package typingsSlinky.cashaddrjs

import typingsSlinky.cashaddrjs.anon.Hash
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cashaddrjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(address: String): Hash = js.native
  
  def encode(prefix: String, `type`: String, hash: js.typedarray.Uint8Array): String = js.native
  
  @js.native
  class ValidationError protected () extends Error {
    def this(message: String) = this()
  }
}
