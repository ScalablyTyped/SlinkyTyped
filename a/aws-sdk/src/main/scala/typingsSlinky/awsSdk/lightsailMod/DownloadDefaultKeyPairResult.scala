package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadDefaultKeyPairResult extends StObject {
  
  /**
    * A base64-encoded RSA private key.
    */
  var privateKeyBase64: js.UndefOr[Base64] = js.native
  
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: js.UndefOr[Base64] = js.native
}
object DownloadDefaultKeyPairResult {
  
  @scala.inline
  def apply(): DownloadDefaultKeyPairResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadDefaultKeyPairResult]
  }
  
  @scala.inline
  implicit class DownloadDefaultKeyPairResultMutableBuilder[Self <: DownloadDefaultKeyPairResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateKeyBase64(value: Base64): Self = StObject.set(x, "privateKeyBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyBase64Undefined: Self = StObject.set(x, "privateKeyBase64", js.undefined)
    
    @scala.inline
    def setPublicKeyBase64(value: Base64): Self = StObject.set(x, "publicKeyBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyBase64Undefined: Self = StObject.set(x, "publicKeyBase64", js.undefined)
  }
}
