package typingsSlinky.lzString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object LZString extends js.Object {
    
    def compress(input: String): String = js.native
    
    def compressToBase64(input: String): String = js.native
    
    def compressToEncodedURIComponent(input: String): String = js.native
    
    def compressToUTF16(input: String): String = js.native
    
    def compressToUint8Array(uncompressed: String): js.typedarray.Uint8Array = js.native
    
    def decompress(compressed: String): String = js.native
    
    def decompressFromBase64(input: String): String = js.native
    
    def decompressFromEncodedURIComponent(compressed: String): String = js.native
    
    def decompressFromUTF16(compressed: String): String = js.native
    
    def decompressFromUint8Array(compressed: js.typedarray.Uint8Array): String = js.native
  }
}
