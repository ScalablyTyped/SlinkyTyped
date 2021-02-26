package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationRule extends StObject {
  
  /**
    * Indicates whether the authorization rule grants access to all clients.
    */
  var AccessAll: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the Client VPN endpoint with which the authorization rule is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  
  /**
    * A brief description of the authorization rule.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
    */
  var DestinationCidr: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Active Directory group to which the authorization rule grants access.
    */
  var GroupId: js.UndefOr[String] = js.native
  
  /**
    * The current state of the authorization rule.
    */
  var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus] = js.native
}
object AuthorizationRule {
  
  @scala.inline
  def apply(): AuthorizationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationRule]
  }
  
  @scala.inline
  implicit class AuthorizationRuleMutableBuilder[Self <: AuthorizationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessAll(value: Boolean): Self = StObject.set(x, "AccessAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessAllUndefined: Self = StObject.set(x, "AccessAll", js.undefined)
    
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDestinationCidr(value: String): Self = StObject.set(x, "DestinationCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCidrUndefined: Self = StObject.set(x, "DestinationCidr", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setStatus(value: ClientVpnAuthorizationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
