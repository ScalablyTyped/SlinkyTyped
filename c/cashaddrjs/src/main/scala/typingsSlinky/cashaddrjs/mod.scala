package typingsSlinky.cashaddrjs

import typingsSlinky.cashaddrjs.anon.Hash
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cashaddrjs", "ValidationError")
  @js.native
  class ValidationError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("cashaddrjs", "decode")
  @js.native
  def decode(address: String): Hash = js.native
  
  @JSImport("cashaddrjs", "encode")
  @js.native
  def encode(prefix: String, `type`: String, hash: js.typedarray.Uint8Array): String = js.native
}
