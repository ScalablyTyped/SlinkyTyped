package typingsSlinky.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessSecretVersionResponse extends StObject {
  
  /** The resource name of the SecretVersion in the format `projects/∗/secrets/∗/versions/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Secret payload */
  var payload: js.UndefOr[SecretPayload] = js.native
}
object AccessSecretVersionResponse {
  
  @scala.inline
  def apply(): AccessSecretVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessSecretVersionResponse]
  }
  
  @scala.inline
  implicit class AccessSecretVersionResponseMutableBuilder[Self <: AccessSecretVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPayload(value: SecretPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
