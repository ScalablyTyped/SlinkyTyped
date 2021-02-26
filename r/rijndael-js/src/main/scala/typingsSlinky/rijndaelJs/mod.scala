package typingsSlinky.rijndaelJs

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rijndael-js", JSImport.Namespace)
  @js.native
  class ^ protected () extends RijndaelBlock {
    def this(key: String, mode: String) = this()
    def this(key: Buffer, mode: String) = this()
  }
  
  @js.native
  trait RijndaelBlock extends StObject {
    
    def decrypt(_ciphertext: Buffer, blockSize: String, _iv: String): Buffer = js.native
    def decrypt(_ciphertext: Buffer, blockSize: String, _iv: Buffer): Buffer = js.native
    
    def encrypt(_plaintext: String, blockSize: String, _iv: String): Buffer = js.native
    def encrypt(_plaintext: String, blockSize: String, _iv: Buffer): Buffer = js.native
    def encrypt(_plaintext: Buffer, blockSize: String, _iv: String): Buffer = js.native
    def encrypt(_plaintext: Buffer, blockSize: String, _iv: Buffer): Buffer = js.native
  }
}
