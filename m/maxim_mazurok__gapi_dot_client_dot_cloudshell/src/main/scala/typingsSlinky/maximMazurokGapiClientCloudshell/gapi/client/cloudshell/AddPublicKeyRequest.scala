package typingsSlinky.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPublicKeyRequest extends StObject {
  
  /**
    * Key that should be added to the environment. Supported formats are `ssh-dss` (see RFC4253), `ssh-rsa` (see RFC4253), `ecdsa-sha2-nistp256` (see RFC5656), `ecdsa-sha2-nistp384` (see
    * RFC5656) and `ecdsa-sha2-nistp521` (see RFC5656). It should be structured as , where part is encoded with Base64.
    */
  var key: js.UndefOr[String] = js.native
}
object AddPublicKeyRequest {
  
  @scala.inline
  def apply(): AddPublicKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPublicKeyRequest]
  }
  
  @scala.inline
  implicit class AddPublicKeyRequestMutableBuilder[Self <: AddPublicKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
