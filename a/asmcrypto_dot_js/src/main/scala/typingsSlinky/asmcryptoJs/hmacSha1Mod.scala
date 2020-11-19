package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.hashMod.Hash
import typingsSlinky.asmcryptoJs.hmacMod.Hmac
import typingsSlinky.asmcryptoJs.sha1AsmMod.sha1result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/hmac/hmac-sha1", JSImport.Namespace)
@js.native
object hmacSha1Mod extends js.Object {
  
  @js.native
  class HmacSha1 protected () extends Hmac[Hash[sha1result]] {
    def this(password: js.typedarray.Uint8Array) = this()
    def this(password: js.typedarray.Uint8Array, verify: js.typedarray.Uint8Array) = this()
    
    def reset(): this.type = js.native
  }
}
