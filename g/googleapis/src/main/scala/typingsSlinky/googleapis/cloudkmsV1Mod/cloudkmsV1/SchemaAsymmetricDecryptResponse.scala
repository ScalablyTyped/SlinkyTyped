package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.AsymmetricDecrypt.
  */
@js.native
trait SchemaAsymmetricDecryptResponse extends js.Object {
  
  /**
    * The decrypted data originally encrypted with the matching public key.
    */
  var plaintext: js.UndefOr[String] = js.native
}
object SchemaAsymmetricDecryptResponse {
  
  @scala.inline
  def apply(): SchemaAsymmetricDecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricDecryptResponse]
  }
  
  @scala.inline
  implicit class SchemaAsymmetricDecryptResponseOps[Self <: SchemaAsymmetricDecryptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlaintext(value: String): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaintext: Self = this.set("plaintext", js.undefined)
  }
}
