package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentProxyInfo extends StObject {
  
  var accountName: String = js.native
  
  var credentialId: Double = js.native
  
  var credentialIdentity: String = js.native
  
  var credentialName: String = js.native
  
  var description: String = js.native
  
  var id: Double = js.native
  
  var isEnabled: Boolean = js.native
}
object AgentProxyInfo {
  
  @scala.inline
  def apply(
    accountName: String,
    credentialId: Double,
    credentialIdentity: String,
    credentialName: String,
    description: String,
    id: Double,
    isEnabled: Boolean
  ): AgentProxyInfo = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], credentialId = credentialId.asInstanceOf[js.Any], credentialIdentity = credentialIdentity.asInstanceOf[js.Any], credentialName = credentialName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentProxyInfo]
  }
  
  @scala.inline
  implicit class AgentProxyInfoMutableBuilder[Self <: AgentProxyInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialId(value: Double): Self = StObject.set(x, "credentialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialIdentity(value: String): Self = StObject.set(x, "credentialIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialName(value: String): Self = StObject.set(x, "credentialName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
  }
}
