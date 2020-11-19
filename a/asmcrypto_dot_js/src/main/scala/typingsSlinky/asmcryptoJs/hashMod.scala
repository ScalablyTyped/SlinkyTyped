package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.sha1AsmMod.sha1result
import typingsSlinky.asmcryptoJs.sha256AsmMod.sha256result
import typingsSlinky.asmcryptoJs.sha512AsmMod.sha512result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/hash/hash", JSImport.Namespace)
@js.native
object hashMod extends js.Object {
  
  @js.native
  abstract class Hash[T /* <: sha1result | sha256result | sha512result */] () extends js.Object {
    
    var BLOCK_SIZE: Double = js.native
    
    var HASH_SIZE: Double = js.native
    
    var asm: T = js.native
    
    def finish(): this.type = js.native
    
    var heap: js.typedarray.Uint8Array = js.native
    
    var len: Double = js.native
    
    var pos: Double = js.native
    
    def process(data: js.typedarray.Uint8Array): this.type = js.native
    
    def reset(): this.type = js.native
    
    var result: js.typedarray.Uint8Array | Null = js.native
  }
}
