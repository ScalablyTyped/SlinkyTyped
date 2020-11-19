package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.hashMod.Hash
import typingsSlinky.asmcryptoJs.hmacMod.Hmac
import typingsSlinky.asmcryptoJs.sha256AsmMod.sha256result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/hmac/hmac-sha256", JSImport.Namespace)
@js.native
object hmacSha256Mod extends js.Object {
  
  @js.native
  class HmacSha256 protected () extends Hmac[Hash[sha256result]] {
    def this(password: js.typedarray.Uint8Array) = this()
    def this(password: js.typedarray.Uint8Array, verify: js.typedarray.Uint8Array) = this()
    
    def reset(): this.type = js.native
  }
}
