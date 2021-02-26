package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.hashMod.Hash
import typingsSlinky.asmcryptoJs.hmacMod.Hmac
import typingsSlinky.asmcryptoJs.sha512AsmMod.sha512result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hmacSha512Mod {
  
  @JSImport("asmcrypto.js/dist_es8/hmac/hmac-sha512", "HmacSha512")
  @js.native
  class HmacSha512 protected () extends Hmac[Hash[sha512result]] {
    def this(password: js.typedarray.Uint8Array) = this()
    def this(password: js.typedarray.Uint8Array, verify: js.typedarray.Uint8Array) = this()
    
    def reset(): this.type = js.native
  }
}
