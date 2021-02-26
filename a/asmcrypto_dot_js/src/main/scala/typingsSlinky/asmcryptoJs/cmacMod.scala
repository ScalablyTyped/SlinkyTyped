package typingsSlinky.asmcryptoJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cmacMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/cmac", "AES_CMAC")
  @js.native
  class AES_CMAC protected () extends StObject {
    def this(key: js.typedarray.Uint8Array) = this()
    
    val buffer: js.Any = js.native
    
    var bufferLength: js.Any = js.native
    
    val cbc: js.Any = js.native
    
    def finish(): this.type = js.native
    
    val k: js.Any = js.native
    
    def process(data: js.typedarray.Uint8Array): this.type = js.native
    
    var result: js.typedarray.Uint8Array | Null = js.native
  }
  /* static members */
  object AES_CMAC {
    
    @JSImport("asmcrypto.js/dist_es8/aes/cmac", "AES_CMAC.bytes")
    @js.native
    def bytes(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
}
