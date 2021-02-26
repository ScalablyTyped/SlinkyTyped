package typingsSlinky.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1GenerateDefaultIdentityResponse extends StObject {
  
  /** Status of the role attachment. Under development (go/si-attach-role), currently always return ATTACH_STATUS_UNSPECIFIED) */
  var attachStatus: js.UndefOr[String] = js.native
  
  /** DefaultIdentity that was created or retrieved. */
  var identity: js.UndefOr[V1DefaultIdentity] = js.native
  
  /** Role attached to consumer project. Empty if not attached in this request. (Under development, currently always return empty.) */
  var role: js.UndefOr[String] = js.native
}
object V1GenerateDefaultIdentityResponse {
  
  @scala.inline
  def apply(): V1GenerateDefaultIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1GenerateDefaultIdentityResponse]
  }
  
  @scala.inline
  implicit class V1GenerateDefaultIdentityResponseMutableBuilder[Self <: V1GenerateDefaultIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachStatus(value: String): Self = StObject.set(x, "attachStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachStatusUndefined: Self = StObject.set(x, "attachStatus", js.undefined)
    
    @scala.inline
    def setIdentity(value: V1DefaultIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
