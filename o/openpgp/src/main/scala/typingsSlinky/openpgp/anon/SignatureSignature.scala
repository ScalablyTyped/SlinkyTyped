package typingsSlinky.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureSignature extends StObject {
  
  var signature: typingsSlinky.openpgp.mod.signature.Signature = js.native
}
object SignatureSignature {
  
  @scala.inline
  def apply(signature: typingsSlinky.openpgp.mod.signature.Signature): SignatureSignature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureSignature]
  }
  
  @scala.inline
  implicit class SignatureSignatureMutableBuilder[Self <: SignatureSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignature(value: typingsSlinky.openpgp.mod.signature.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
