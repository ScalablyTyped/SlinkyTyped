package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.Decrypt.
  */
@js.native
trait SchemaDecryptResponse extends StObject {
  
  /**
    * The decrypted data originally supplied in EncryptRequest.plaintext.
    */
  var plaintext: js.UndefOr[String] = js.native
}
object SchemaDecryptResponse {
  
  @scala.inline
  def apply(): SchemaDecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDecryptResponse]
  }
  
  @scala.inline
  implicit class SchemaDecryptResponseMutableBuilder[Self <: SchemaDecryptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
  }
}
