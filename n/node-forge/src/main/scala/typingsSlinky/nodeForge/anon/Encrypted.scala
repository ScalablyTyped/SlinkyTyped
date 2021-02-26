package typingsSlinky.nodeForge.anon

import typingsSlinky.nodeForge.mod.pkcs12.Bag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encrypted extends StObject {
  
  var encrypted: Boolean = js.native
  
  var safeBags: js.Array[Bag] = js.native
}
object Encrypted {
  
  @scala.inline
  def apply(encrypted: Boolean, safeBags: js.Array[Bag]): Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], safeBags = safeBags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encrypted]
  }
  
  @scala.inline
  implicit class EncryptedMutableBuilder[Self <: Encrypted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeBags(value: js.Array[Bag]): Self = StObject.set(x, "safeBags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeBagsVarargs(value: Bag*): Self = StObject.set(x, "safeBags", js.Array(value :_*))
  }
}
