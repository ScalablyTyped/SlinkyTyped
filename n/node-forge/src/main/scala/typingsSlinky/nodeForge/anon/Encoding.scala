package typingsSlinky.nodeForge.anon

import typingsSlinky.nodeForge.mod.pki.ed25519.ToNativeBufferParameters
import typingsSlinky.nodeForge.nodeForgeStrings.binary
import typingsSlinky.nodeForge.nodeForgeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encoding extends ToNativeBufferParameters {
  
  var encoding: binary | utf8 = js.native
  
  var message: String = js.native
}
object Encoding {
  
  @scala.inline
  def apply(encoding: binary | utf8, message: String): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: binary | utf8): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
