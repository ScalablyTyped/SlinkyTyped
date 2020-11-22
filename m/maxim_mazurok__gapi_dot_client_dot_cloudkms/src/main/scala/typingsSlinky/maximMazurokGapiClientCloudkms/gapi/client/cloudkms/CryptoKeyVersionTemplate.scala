package typingsSlinky.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyVersionTemplate extends js.Object {
  
  /**
    * Required. Algorithm to use when creating a CryptoKeyVersion based on this template. For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both this field is omitted
    * and CryptoKey.purpose is ENCRYPT_DECRYPT.
    */
  var algorithm: js.UndefOr[String] = js.native
  
  /** ProtectionLevel to use when creating a CryptoKeyVersion based on this template. Immutable. Defaults to SOFTWARE. */
  var protectionLevel: js.UndefOr[String] = js.native
}
object CryptoKeyVersionTemplate {
  
  @scala.inline
  def apply(): CryptoKeyVersionTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKeyVersionTemplate]
  }
  
  @scala.inline
  implicit class CryptoKeyVersionTemplateOps[Self <: CryptoKeyVersionTemplate] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setProtectionLevel(value: String): Self = this.set("protectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectionLevel: Self = this.set("protectionLevel", js.undefined)
  }
}
