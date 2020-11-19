package typingsSlinky.base64url

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("base64url", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var default: Base64Url = js.native
  
  @js.native
  trait Base64Url extends js.Object {
    
    def apply(input: String): String = js.native
    def apply(input: String, encoding: String): String = js.native
    def apply(input: Buffer): String = js.native
    def apply(input: Buffer, encoding: String): String = js.native
    
    def decode(base64url: String): String = js.native
    def decode(base64url: String, encoding: String): String = js.native
    
    def encode(input: String): String = js.native
    def encode(input: String, encoding: String): String = js.native
    def encode(input: Buffer): String = js.native
    def encode(input: Buffer, encoding: String): String = js.native
    
    def fromBase64(base64: String): String = js.native
    
    def toBase64(base64url: String): String = js.native
    def toBase64(base64url: Buffer): String = js.native
    
    def toBuffer(base64url: String): Buffer = js.native
  }
}
